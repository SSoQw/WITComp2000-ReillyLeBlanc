package p2.lab2.comp2000;

public class SchoolKid {
	
	public String name, teacher, greeting;
	public int age;
	
	public SchoolKid(String givenName, int givenAge, String givenTeacher, String givenGreeting) {
		this.name     = givenName;
		this.age      = givenAge;
		this.teacher  = givenTeacher;
		this.greeting = givenGreeting;
	}
	
	public void haveBirthday() {
		this.age += 1;
	}
	
	public void changeTeacher(String newTeacher) {
		this.teacher = newTeacher;
	}
	
	public void changeGreeting(String newGreeting) {
		this.greeting = newGreeting;
	}
	
	public String getAge() {
		return (Integer.toString(this.age));
	}
	
	public String getGreeting() {
		return (this.greeting);
	}
	
	public String toString() {
		return String.format("Data on queired child: \n\t Name: %s \n\t Age: %d \n\t Teacher: %s \n\t Greeting: %s", this.name, this.age, this.teacher, this.greeting);
	}
}

class ExaggeratingKid extends SchoolKid{

	public ExaggeratingKid(String givenName, int givenAge, String givenTeacher, String givenGreeting) {
		super(givenName, givenAge+2, givenTeacher, givenGreeting + " I am the best.");
	}
	
	public void changeGreeting(String newGreeting) {
		this.greeting = newGreeting + " I am the best.";
	}
}