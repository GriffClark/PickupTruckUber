//this is to create a library of references "I have a F250 but I don't know if this will fit..."
//similar to vehicles but without a key few instance variables
public class IndexVehicle {
	protected String name, type;
	protected int mpg, year;
	protected D2Size d2Size;
	protected D3Size d3Size;
	
	public IndexVehicle(String name, String type, int mpg, int year, D2Size d2Size, D3Size d3Size) {
		this.name = name;
		this.type = type;
		this.mpg = mpg;
		this.year = year;
		this.d2Size = d2Size;
		this.d3Size = d3Size;
	}
	
	public IndexVehicle() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getMpg() {
		return mpg;
	}

	public void setMpg(int mpg) {
		this.mpg = mpg;
	}

	public D2Size getD2Size() {
		return d2Size;
	}

	public void setD2Size(D2Size d2Size) {
		this.d2Size = d2Size;
	}

	public D3Size getD3Size() {
		return d3Size;
	}

	public void setD3Size(D3Size d3Size) {
		this.d3Size = d3Size;
	}
	
	public String toString() {
		return name + " " + year;
	}
}
