import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class p2 {	
	public static Queue<Tile> maze;
	
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
			
			int numRows 	= scanner.nextInt();
			int numCols 	= scanner.nextInt();
			int numRooms 	= scanner.nextInt();
			
			int r = 0;
			
			while(scanner.hasNextLine()) {
				String row = scanner.nextLine();	
				if(row.length()>0) {	
					for(int i = 0 ; i < row.length(); i++) {
						for(int c = 0; c < numCols; c++) {
							char el = row.charAt(i);
							Tile tile = new Tile(i, c, el);
							if() {
								
							}
						}			
					}
				}
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		
	}
	
	
	
	
	
	
	

}
