import java.util.ArrayList;

public class Library {
	
	private ArrayList<IndexVehicle> vList = new ArrayList<IndexVehicle>();
	
	public void init() {
		vList.add(new IndexVehicle("Ford F150", "Flatbed Truck", 19, 2016, new D2Size(30, 70), new D3Size (30,70,100))); //chose random values
		vList.add(new IndexVehicle ("Toyota Tacoma", "Flatbed Truck", 17, 2003, new D2Size (30, 50), new D3Size (30, 50, 85))); //again just picked random numbers
	}
	
	public int getSize() {
		return vList.size();
	}
	
	public IndexVehicle getIndexVehicle(String name, int year) {
		String check = name + " " + year;
		int vListSize = vList.size();
		for(int i = 0; i < vListSize; i++) {
			if(vList.get(i).toString().equals(check)) { //TODO test this
				return vList.get(i);
			}
		}
		System.out.println("no vehicle matching '" + check + "' was found");
		return null;
	}
}
