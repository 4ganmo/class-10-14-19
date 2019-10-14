
public abstract class NameHolder {
	protected String firstName;
	
	public abstract String describeSelf();{
		
	}
	//@override
	public String toString() {
	}{
		String person =( "this is a persom" + firstName);
		return firstName;
	}
	
	public void setFirstName(String name) {
	
		this.firstName = name;
		
	}
	
}
