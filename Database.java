import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Database {
	
	protected ArrayList<ID> database = new ArrayList<>();
	
	//print out database
	public void showDatabase() {
		System.out.println(database);
	}
	
	//add items in the database
	public void add(ID id) {
		database.add(id);
	}
	
	//remove items in the database
	public void remove(ID id) {
		database.remove(id);
	}
	
	//show one ID in the database
	public void showID(ID id) {
		System.out.println(database.get(database.indexOf(id)).toString());
	}
	
	
	//arraylist size
	public int size() {
		return database.size();
	}
	
	//arraylist
	public ID getIndexObject(int index) {
		return database.get(index);
	}
	
	public void load(String fileName) {
			String line = "";
			//read file
			try {
				BufferedReader br = new BufferedReader(new FileReader(fileName));
				while ((line=br.readLine()) != null) {
					try {
						String[] values = line.split(",");
						//remove IDS if condtion is met
						if (values[4].contains(".") || values[5].contains(".")) {
							ID defaultID = new ID();
							database.remove(defaultID);
							throw new Unusable();			
						}
						else if (values[0].charAt(0) != 'S' && values[0].charAt(0) != 'T' && values[0].charAt(0) != 'F') {
							ID defaultID = new ID();
							database.remove(defaultID);
							throw new Unusable();
						}
						else if (values[2].equalsIgnoreCase("") || values[3].equalsIgnoreCase("")) {
							ID defaultID = new ID();
							database.remove(defaultID);
							throw new Unusable();
						}
						else {
							ID newID = new ID(values[0].charAt(0), values[1], values[2], values[3], Integer.parseInt(values[4]), values[5]);
							database.add(newID);
						}					
					}
					catch (Unusable e) {
						System.out.println(e.getMessage());
					}
				}
			}
			catch(FileNotFoundException e) {
				System.out.println("Cannot use file.");
			}
			catch (IOException e) {
				e.printStackTrace();
			}					
		}
	
	
	public int numberOfIDs() {
		return database.size();
	}
	

}
