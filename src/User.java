import java.util.ArrayList;
import java.util.Scanner;

public class User {
	protected String name;
	protected UserLocation location; //this will be a dynamic location
	protected int averageRating, tasksComplete, laborCost;
	protected boolean doesLabor;
	protected Vehicle myVehicle;
	protected ArrayList<Integer> ratings = new ArrayList<Integer>();
	protected ArrayList<String> comments = new ArrayList<String>();
	
	public User(String name, boolean doesLabor, int laborCost) {
		this.name = name;
		this. doesLabor = doesLabor;
		if(doesLabor == true) {
			this.laborCost = laborCost;
		}
		else
			laborCost = -1;
	}
	
	public void addRating (int rating) {
		if(rating < 0 || rating > 10) {
			System.out.println("invalid rating. Would you like to try again?");
			Scanner s = new Scanner(System.in);
			String input = s.nextLine();
			if(input.equals("yes")) {
				System.out.println("input new rating");
				int newRating = s.nextInt();
				addRating(newRating);
			}
		}
		ratings.add(rating);
		int ratingsSize = ratings.size();
		int sum = 0;
		for(int i = 0; i < ratingsSize; i++) {
			sum+= ratings.get(i);
		}
		averageRating = sum/ratingsSize;
		//adds a new rating then resets averageRating 
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserLocation getLocation() {
		return location;
	}

	public void setLocation(UserLocation location) {
		this.location = location;
	}

	public int getLaborCost() {
		return laborCost;
	}

	public void setLaborCost(int laborCost) {
		this.laborCost = laborCost;
	}

	public ArrayList<Integer> getRatings() {
		return ratings;
	}

	public void addComment() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter comment 140 characters or less");
		String newComment = s.nextLine();
		if(newComment.length() > 140) {
			System.out.println("would you like to enter a new comment?");
			String input = s.nextLine();
			if (input.equals("yes")) {
				addComment();
				//is this the correct recursive call
			}
		}
	}
	
	public void doesLabor() {
		System.out.println("do you do labor? " + doesLabor);
		System.out.println("would you like to change this?");
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		if(input.equals("yes")) {
			if(doesLabor == true) {
				doesLabor = false;
			}
			else {
				System.out.println("how much would you like to charge for labor? Standard price is $X");
				laborCost = s.nextInt();
				doesLabor = true;
			}
		}
	}
	
	public void addVehicle() {
		Library library = new Library();
		library.init();
		Scanner s = new Scanner(System.in);
		Vehicle newVehicle = new Vehicle();
		System.out.println("enter name of vehicle");
		String checkName = s.nextLine();
		System.out.println("enter year");
		int checkYear = s.nextInt();
		IndexVehicle myIndexVehicle = library.getIndexVehicle(checkName, checkYear);
		newVehicle.setMpg(myIndexVehicle.getMpg());
		newVehicle.setType(myIndexVehicle.getType());
		switch(myVehicle.getType()) {
			case "Flatbed Truck": 
			System.out.println("enter the two-dimensional space of your truck's bed 'x''y'");
			int x = s.nextInt();
			int y = s.nextInt();
			newVehicle.setD2Size(new D2Size(x,y));
			//TODO find a way to calculate 3d space by getting 2d space
			break;
		case "Minivan" :
			System.out.println("I'm a Minivan!"); //idk why I did this
			break;
		default:
			System.out.println("nothing in the switch for autofill");
			
		
		}
		myVehicle = newVehicle;
	}
}
