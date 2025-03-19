import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class p2 {	
	public static Queue<Tile> qMaze;
	public static Stack<Tile> sMaze;
	public static Map maze;
	
	public static void main(String[] args) {
		qMaze = new Queue<Tile>();
		sMaze = new Stack<Tile>();
		readMap("Example 2");
	}
	
	/*
	 * Take a given file and read through it
	 */
	public static void readMap(String filename) {
		try {
			File file = new File(filename);
			Scanner scanner = new Scanner(file);
		
			int numRows 	= scanner.nextInt();
			int numCols 	= scanner.nextInt();
			int numRooms 	= scanner.nextInt();
			
			maze = new Map(numRows, numCols, numRooms);
			
			int r = 0;
			
			while(scanner.hasNextLine()) {
				String row = scanner.nextLine();	
				if(row.length()>0) {	
					for(int i = 0 ; i < row.length() && i < numCols; i++) {
						char el = row.charAt(i);
						Tile tile = new Tile(r, i, el);
						maze.setData(r, i, 1, tile);
						qMaze.enqueue(maze.getBeginning());
					}
					r++;
				}
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}	
	}
	
	public static void readCoordMap(String filename) {
		return;
	}
}
