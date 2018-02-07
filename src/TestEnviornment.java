
public class TestEnviornment {

	public static void main (String[] args) {
		User user1 = new User("User 1", false, 10);
		user1.addVehicle();
		user1.addRating(3);
		user1.addRating(14);
		user1.doesLabor();
		user1.addComment();
		
	}
}
