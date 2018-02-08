//TODO do we want 2d and 3d size or just 3d size?
public class Vehicle {
	protected String name, type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	protected User owner;
	protected int mpg, costPerMile;
	protected D2Size d2Size;
	protected D3Size d3Size;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public int getMpg() {
		return mpg;
	}
	public void setMpg(int mpg) {
		this.mpg = mpg;
	}
	public int getCostPerMile() {
		return costPerMile;
	}
	public void setCostPerMile(int costPerMile) {
		this.costPerMile = costPerMile;
	}
}
