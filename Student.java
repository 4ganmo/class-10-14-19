//imports
public class Student extends Person implements Comparable<Student> {
	private static final int INITIAL_RATING = 5;
	
	private String className;
	private Integer rating;
	
	
	public Student() throws NameException{
		super();
		rating = INITIAL_RATING;
		
	}
	
	
	
	public Student(String firstName, String lastName, Integer rating) throws NameException {
		super(firstName, lastName);
		this.rating = rating;
		// TODO Auto-generated constructor stub
	}



	@Override
	public int compareTo(Student o) {
		return rating - o.getRating();
		// TODO Auto-generated method stub
		return 0;
	}
	
	public Integer getRating() {
		return new Integer (rating);
		
	}

}
