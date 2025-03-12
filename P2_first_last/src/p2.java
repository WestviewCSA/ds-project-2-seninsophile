import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class p2 {
	
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
			
			Tile[][] map = new Tile[numRows][numCols];
			
			while(scanner.hasNextLine()) {
				String row = scanner.nextLine();	
				if(row.length()>0) {	
					for(int i = 0 ; i < numCols && i < row.length(); i++) {
						char el = row.charAt(i);
						Tile obj = new Tile(r, i, el);
						map[r][i] = obj;
					}
					System.out.println(Arrays.deepToString(map));
				}
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		
	}
	
	
	
	
	
	
	

}
