
public class Person extends NameHolder {
	private String lastName;
	
	public Person() {
		String temp1 = "bo";
		String temp2 = "smith";
		lastName = temp1;
		
		
	}
	public Person(String firstName, String lastName) {
		this.lastName = lastName;
		super.setFirstName(firstName);
		
		
	
	}
		
		
	@Override
	public String describeSelf() {
		if(!firstName.isEmpty()) {
			this.firstName = firstName; 
		}
		
		return "I am so failing";
		
		
		
	}

}
