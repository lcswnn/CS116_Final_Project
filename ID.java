
public class ID extends GeneralID implements Printable {
	
	//ID attributes
	private final String institutionName = "Illinois Institute of Technology";
	private char idType;
	private String ANumber;
	private String FirstName;
	private String LastName;
	private int age;
	private String extraParam;
	
	
	//non-default constructor
	public ID() {
		setIDType('I');
		setANumber("INVALID");
		setFirstName("INVALID");
		setLastName("INVALID");
		setAge(0);
		setAddParameter("INVALID");
	}
	
	
	//non-defualt parameterized Constructor
	String string = new String();
	public ID(char idType1, String ANumber1, String FirstName1, String LastName1, int age1, String addParameter1) {
		if (ANumber1.equalsIgnoreCase(null) || FirstName1.equals(null) || LastName1.equals(null)|| addParameter1.equals(null) || ANumber1.equalsIgnoreCase("") || FirstName1.equalsIgnoreCase("") || LastName1.equalsIgnoreCase("") || addParameter1.equals("") || age1 < 0) {
			setIDType('I');
			setANumber("INVALID");
			setFirstName("INVALID");
			setLastName("INVALID");
			setAge(0);
			setAddParameter("INVALID");
		}
		else {
			setIDType(idType1);
			setANumber(ANumber1);
			setFirstName(FirstName1);
			setLastName(LastName1);
			setAge(age1);
			setAddParameter(addParameter1);
		}

	}

	
	//setters
	public void setAddParameter(String extraParam) {
		this.extraParam = extraParam;
	}
	
	public void setAge(int i) {
		this.age = i;
		
	}

	public void setLastName(String lastName) {
		this.LastName = lastName;
		
	}

	public void setFirstName(String firstName) {
		this.FirstName = firstName;
		
	}

	public void setANumber(String aNumber) {
		this.ANumber = aNumber;
		
	}

	public void setIDType(char idType1) {
		this.idType = idType1;
		
	}
	
	
	//getters
	public String getInstitutionName() {
		return this.institutionName;
	}
	
	public char getIDType() {
		return this.idType;
	}
	
	public String getA() {
		return this.ANumber;
	}
	
	public String getFirstName() {
		return this.FirstName;
	}
	
	public String getLastName() {
		return this.LastName;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getAddParameter() {
		return this.extraParam;
	}
	
	
	//toString
		public String toString() {
			String c =  idType + ", " +  ANumber + ", " + FirstName + ", " + LastName + ", " + age + ", " + extraParam + "\n";
			return c;
		}

	//print method
		@Override
		public void print() {
			ID id = new ID();
			System.out.println(id.toString());
			
		}
	
	
	

}
