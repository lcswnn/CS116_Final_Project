
public abstract class GeneralID implements Printable {
	
	//attributres
	final private String institutionName = "Illinois Institute of Technology";
	private char idType;
	private String ANumber;
	private String FirstName;
	private String LastName;
	private int age;
	private String extraParam;
	
	//methods
	public abstract void setIDType(char idType);
	public abstract void setANumber(String aNumber);
	public abstract void setFirstName(String firstName);
	public abstract void setLastName(String lastName);
	public abstract void setAge(int age);
	public abstract void setAddParameter(String extraParameter);
	public abstract char getIDType();
	public abstract String getA();
	public abstract String getFirstName();
	public abstract String getLastName();
	public abstract int getAge();
	public abstract String getAddParameter();
	public abstract String getInstitutionName();
	
}
