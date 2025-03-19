import java.util.Arrays;

public class Map {
	
	// i have 0 idea what im doing
	// at all
	// with this project
	
	private Tile[][][] data; // [numRows][numCols][numRoom ("Slices")]
	private int r1, c, r2;
	private char wolf = 'W';
	private char wall = '@';
	private char tile = '.';
	private char coin = '$';
	private char walk = '|';
	
	public Map(int r1, int c, int r2) {
		this.r1 = r1;
		this.c = c;
		this.r2 = r2;
		data = new Tile[r1][c][r2];
	}
	
	public Tile getBeginning() {
		for(int i = 0 ; i < data.length ; i++) {
			for(int j = 0; j < data[0].length; j++) {
				for(int k = 0; k < data[0][0].length; k++) {
					if(data[i][j][k].getType()==(wolf)) {
						Tile tile = new Tile(i, j, 'W');
						return tile;
					}
				}
			}
		}
		return null;
	}
	
	public boolean isWalkable() {
		for(int b = 0; b < r2; b++) {
			for(int a = 0; a < r1; a++) {
				for(int i = 0; i < c; i++) {
					Tile tile = new Tile('.');
					if(getData(b, a, i).equals(tile)){
						return true;
					}
				}
			}
		}
		return false;
	}

	public Tile[][][] getData() {
		return data;
	}
	
	public Tile getData(int r, int c, int r1) {
		return data[r][c][r1];
	}

	public void setData(int r, int c, int r1, Tile obj) {
		data[r][c][r1] = obj;
	}
			
	public String toString() {
		String res = "";
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[0].length; j++) {
				res += data[i][j][1];
			}
		}
		return res;
	}
}