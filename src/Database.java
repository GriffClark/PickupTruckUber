import java.util.ArrayList;
//XXX note that this does not account for location
public class Database {
	
	protected ArrayList<User> users = new ArrayList<User>(); //this should never be zero as long as there are active users
	//FIXME make sure that the only users that come up are the users that have selected to be service providers
	public void addUser(User u) {
		users.add(u);
	}
	
	//search by model
	public ArrayList<User> findByModel(String name) {
		ArrayList<User> returnMe = new ArrayList<User>();
		for(int i = 0; i < users.size(); i++) {
			if(users.get(i).getMyVehicle().getName().equals(name)) {
				returnMe.add(users.get(i));
			}
			
		}
		if(returnMe.size() == 0) {
			System.out.println("nothing found");
		}
		return returnMe;
	}
	//search by 2d size
	public ArrayList<User> findBy2Dimension(D2Size payload){
		ArrayList<User> returnMe = new ArrayList<User>();
		for(int i = 0; i < users.size(); i++) {
			int userX = users.get(i).getMyVehicle().getD2Size().getX();
			int userY = users.get(i).getMyVehicle().getD2Size().getY();
			if(userX >= payload.getX() && userY >= payload.getY()) {
				returnMe.add(users.get(i));
			}
		}
		if(returnMe.size() == 0) {
			System.out.println("payload is too large");
		}
		return returnMe;
	}
	//search by 3d size
	public ArrayList<User> findBy3Dimension(D3Size payload){
		ArrayList<User> returnMe = new ArrayList<User>();
		for(int i = 0; i < users.size(); i++) {
			int userX = users.get(i).getMyVehicle().getD3Size().getX();
			int userY = users.get(i).getMyVehicle().getD3Size().getY();
			int userZ = users.get(i).getMyVehicle().getD3Size().getZ();
			if(userX >= payload.getX() && userY >= payload.getY()&& userZ >= payload.getZ() ) {
				returnMe.add(users.get(i));
			}
		}
		if(returnMe.size() == 0) {
			System.out.println("payload is too large");
		}
		return returnMe;
	}
	}
	//TODO figure out if a check is needed to find if there is labor included or not
