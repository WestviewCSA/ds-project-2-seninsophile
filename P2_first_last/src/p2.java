import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class p2 {
	
	public static void main(String[] args) {
		readMap("Example 2");
	}
	
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
					for(int i = 0 ; i < numCols && i < row.length(); i++) {
						char el = row.charAt(i);
						Tile obj = new Tile(r, i, el);
					}
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		
	}
	
	public void Queue() {
		
		
		
	}
	
	
	
	
	
	
	

}
