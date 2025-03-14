import java.util.Arrays;

public class Map {
	
	private Tile[][][] data; // [numRows][numCols][numRoom ("Slices")]
	
	
	public Map(Tile[][][] data) {
		super();
		this.data = data;
	}

	public Tile[][][] getData() {
		return data;
	}

	public void setData(Tile[][][] data) {
		this.data = data;
	}
			
	public String toString() {
		return Arrays.deepToString(getData()) + "";
	}
}