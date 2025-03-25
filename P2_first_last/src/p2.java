import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class p2 {	
	
	
	public static Map maze;
	
	
	public static int numRows, numCols, numRooms;
	
	public static void main(String[] args) {
		readMap("Example 2");
		queueRoute();
	}
	
	/*
	 * Take a given file and read through it
	 */
	public static void readMap(String filename) {
		try {
			File file = new File(filename);
			Scanner scanner = new Scanner(file);
		
			numRows 	= scanner.nextInt();
			numCols 	= scanner.nextInt();
			numRooms 	= scanner.nextInt();
			
			maze = new Map(numRows, numCols, numRooms);
			
			int r = 0;
			
			while(scanner.hasNextLine()) {
				String row = scanner.nextLine();	
				if(row.length()>0) {	
					for(int i = 0 ; i < row.length() && i < numCols; i++) {
						for(int a = 0 ; a < numRooms; a++) {
							char el = row.charAt(i);
							Tile tile = new Tile(r, i, el);
							maze.setData(r, i, a, tile);
						}
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
	
	public static void stackRoute() {
		
		return;	
		
	}
	
	public static void queueRoute() {
		
		Queue<Tile> queue = new Queue<Tile>();
		Queue<Tile> visited = new Queue<Tile>();
		
		// get beginning of maze
		
		for(int a = 0 ; a < numRooms; a++) {
			for(int b = 0 ; b < numRows; b++) {
				for(int c = 0 ; c < numCols; c++) {
					char el = maze.getData(b, c, a).getType();
					Tile tile = new Tile(b, c, el);
					if(maze.getData(b, c, a).getType()==('W')) {
						queue.enqueue(tile);
						visited.enqueue(tile);
					}
				}
			}
		}
		
		// until coin is found do this
		
		while(queue.peek().getType()!='$') {

			
			
			
			
			
		}
	}
}
