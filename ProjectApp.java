
import java.util.ArrayList;
import java.util.Scanner;

public class ProjectApp {
	
	public void run() {
		
		Database d = new Database();
		System.out.println("Hello! Welcome!");
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Would you like to (1) add, (2) remove, (3) show, or (4) see number of IDs?: ");
			int answer = scan.nextInt();
		
			//ADD IDS		
			if (answer == 1) {
				
				System.out.println("Would you like to (1) add multiple IDs or (2) add a single ID? (1/2): ");
				int answer2 = scan.nextInt();
				if(answer2 == 1) {
					
					//LOAD ID
					
						System.out.println("What is the name of the file you are trying to add?: ");
						String fileName = scan.next();
						String path = "/Users/lucaswaunn/eclipse-workspace/CS116 Final Project/src/" + fileName;
						d.load(path);
						d.showDatabase();
					
				}
			
				//ADD INDIVIDUAL IDS
				
				else {
					System.out.println("What type of ID is the ID you're trying to add? (S/F/T): ");
					char userIDType = scan.next().charAt(0);
					System.out.println("What is the A-number of the ID?: ");
					String userANumber = scan.next();
					userANumber += scan.nextLine();
					System.out.println("What is the first name on the ID?: ");
					String userFirstName = scan.next();
					System.out.println("What is the last name on the ID?: ");
					String userLastName = scan.next();
					System.out.println("What is the age of the ID holder?: ");
					int userAge = scan.nextInt();
					if(userIDType == 'S' || userIDType == 's') {
						System.out.println("What is the degree of the ID-holder?: ");
						String userDegree = scan.next();
						ID userID = new ID(userIDType, userANumber, userFirstName, userLastName, userAge, userDegree);
						d.add(userID);
						d.showDatabase();
						System.out.println("Added.");
					}
					else if(userIDType == 'f' || userIDType == 'F') {
						System.out.println("What is the department of the ID-holder?: ");
						String userDepartment = scan.next();
						ID userID = new ID(userIDType, userANumber, userFirstName, userLastName, userAge, userDepartment);
						d.add(userID);
						d.showDatabase();
						System.out.println("Added.");
					}
					else if(userIDType == 't' || userIDType == 'T') {
						System.out.println("What is the salary of the ID-holder?: ");
						int userSalary = scan.nextInt();
						String userSalaryString = Integer.toString(userSalary);
						ID userID = new ID(userIDType, userANumber, userFirstName, userLastName, userAge, userSalaryString);
						d.add(userID);
						d.showDatabase();
						System.out.println("Added.");
					}
					
				}
			}
			
			
			//REMOVE IDS
			
			
			else if(answer == 2) {
				System.out.println("Would you like to remove and ID based on (1) A number or (2) last name?: ");
				int userNumber = scan.nextInt();
				if (userNumber == 1) {
					System.out.println("What is the A number of the ID you want to remove?: ");
					int userAnswer = scan.nextInt();
					String aNumber = "A" + Integer.toString(userAnswer);
					System.out.println("Removing IDs with A number: " + aNumber);
					for (int i = 0; i < d.size(); i++) {
						if (aNumber.equalsIgnoreCase((d.getIndexObject(i)).getA())) {
							d.remove(d.getIndexObject(i));
						}
					}
					d.showDatabase();
					System.out.println("Removed.");
				}
				else {
					System.out.println("What is the last name of the ID you want to remove?: ");
					String userLastName = scan.next();
					System.out.println("Removing IDs with the last name: " + userLastName);
					for (int i = 0; i < d.size(); i++) {
						if (userLastName.equalsIgnoreCase((d.getIndexObject(i)).getLastName())) {
							d.remove(d.getIndexObject(i));
						}
					}
					d.showDatabase();
					System.out.println("Removed.");
				}
				
			}
			
			
			//SHOW IDS
			
			
			else if(answer == 3) {
				System.out.println("Would you like to see (1) all IDs or (2) certain IDs?: ");
				int number = scan.nextInt();
				if (number == 1) {
					System.out.println("Showing full database: ");
					d.showDatabase();
				}
				else if(number == 2) {
					System.out.println("Would you like to see IDs of (1) a certain type or (2) an age over a certain number? :");
					int number2 = scan.nextInt();
					if (number2 == 1) {
						System.out.println("What type of ID do you want to see? (S/T/F): ");
						char c = scan.next().charAt(0);
						ArrayList<ID> newDatabase = new ArrayList<>();
						for(int i = 0; i < d.size(); i++) {
							if (d.getIndexObject(i).getIDType() == c) {
								newDatabase.add(d.getIndexObject(i));
							}
						}
						System.out.println("Showing database for type " + c + "IDs: ");
						System.out.println(newDatabase);
					}
					else {
						System.out.println("What number do you want ages above?: ");
						int choice = scan.nextInt();
						ArrayList<ID> newDatabase = new ArrayList<>();
						for(int i = 0; i < d.size(); i++) {
							if (d.getIndexObject(i).getAge() > choice) {
								newDatabase.add(d.getIndexObject(i));
							}
						}
						System.out.println("Showing database for ages above " + choice + ": ");
						System.out.println(newDatabase);
						}
					}
				}
			else if (answer == 4) {
				System.out.println("The number of IDs in the database is: " + d.numberOfIDs());
			}
		}
	}
		

	
	public static void main(String[] args) {
		ProjectApp app = new ProjectApp();
			app.run();
			
		
	}
}
