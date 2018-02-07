
public class D3Size {
	protected int x,y,z;
	
	public D3Size(int x, int y, int z) {
		this.x = x;
		this.y =y;
		this.z = z;
	}
	
	public D3Size() {
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public String toString() {
		return x + "x" + y + "x" + z;
	}
	
	
}
