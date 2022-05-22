package p2.lab2.comp2000;

public class ExaggeratingKidTest {
    
	public static void main(String[] args) {
		
		System.out.println("Create a kid: name = \"Ken\", age = 5, teacher = \"Mrs. Jones\", greeting = \"Hiyas\"");
        System.out.println("");
        
        SchoolKid ken = new ExaggeratingKid("Ken", 5, "Mrs. Jones", "Hiyas.");
        System.out.println("State of ken");        
        System.out.println(ken);
        
        System.out.println("");
        
        System.out.println("But ken should exaggerate his age by 2: " + ken.getAge());
        System.out.println("and should add to the greeting: " + ken.getGreeting());
        
        System.out.println("");
        
        System.out.println("Changing age by 1, teacher to \"Mr. Roberson\", greeting to \"Aloha\"");
        
        ken.haveBirthday();
        ken.changeTeacher("Mr. Roberson");
        ken.changeGreeting("Aloha");
        
        System.out.println("");
        
        System.out.println("State of ken now...");
        System.out.println(ken);
        
        System.out.println("");
        
        System.out.println("But ken should exaggerate his age by 2: " + ken.getAge());
        System.out.println("and should add to the greeting: " + ken.getGreeting());
        
    }
    
}
