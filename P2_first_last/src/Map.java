import java.util.Arrays;

public class Map {
	
	// i have 0 idea what im doing
	// at all
	// with this project
	
	private Tile[][][] data; // [numRows][numCols][numRoom ("Slices")]
	private int r1, c, r2;
	
	public Map(int r1, int c, int r2) {
		this.r1 = r1;
		this.c = c;
		this.r2 = r2;
		data = new Tile[r1][c][r2];
	}

	public Tile getBeginning() {
		return null;
	}
	
	public Tile getData(int r, int c, int r1) {
			return data[r][c][r1];
	}
	
	public Tile[] getRow(int n) {
		Tile[] a = new Tile[r1];
		for(int i = 0 ; i < c ; i++) {
			a[i] = data[n][i][1];
		}
		return a;
	}

	public void setData(int r, int c, int r1, Tile obj) {
		data[r][c][r1] = obj;
	}
			
	public String toString() {
		String res = "";
		for(int i = 0; i < data.length; i++) {
			res += "\n";
			for(int j = 0; j < data[0].length; j++) {
				res += data[i][j][0];
			}
		}
		return res;
	}
}