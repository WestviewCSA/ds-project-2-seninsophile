import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class p2 {	
	public static Queue<Tile> maze;
	
	public p2 () {
		 maze = new Queue<Tile>();
	}
	
	public static void main(String[] args) {
		
		readMap("Example 2");
	}
	
	/*
	 * Take a given file and read through it
	 */
	public static void readMap(String filename) {
		try {
			File file = new File(filename);
			Scanner scanner = new Scanner(file);
			Queue<Tile> maze = new Queue<Tile>();
			
			int numRows 	= scanner.nextInt();
			int numCols 	= scanner.nextInt();
			int numRooms 	= scanner.nextInt();
			
			int r = 0;
			
			while(scanner.hasNextLine()) {
				String row = scanner.nextLine();	
				if(row.length()>0) {	
					for(int i = 0 ; i < row.length() && i < numCols; i++) {
						char el = row.charAt(i);
						Tile tile = new Tile(r, i, el);
						
						if(tile.toString().equals("W")) {
							maze.enqueue(tile);
						} else {
							maze.dequeue();
						}
						System.out.print(maze.toString());
					}
				}
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		
		
	}
	
	
	
	
	
	
	

}
