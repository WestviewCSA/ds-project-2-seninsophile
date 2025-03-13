import java.util.Arrays;

public class Map {
	
	private Tile[][] data;

	public Tile[][] getData() {
		return data;
	}

	public void setData(Tile[][] data) {
		this.data = data;
	}			
			
	public String toString() {
		return Arrays.deepToString(getData()) + "";
	}
}