
public abstract class NameHolder {
	protected String firstName;
	
	public abstract String describeSelf();{
		
	}
	//@override
	public String toString() {
	}{
		String person = "this is a person" + firstName;
		return person;
	}
	

	public String getFirstName() {
		return firstName;
	}
	protected void setFirstName(String firstName) {
	if(firstName.isEmpty())
		this.firstName = firstName;
	else
		throw new NameException("wrong");
		
	}
	
}
