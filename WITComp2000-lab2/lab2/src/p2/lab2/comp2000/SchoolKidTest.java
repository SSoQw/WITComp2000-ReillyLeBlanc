package p2.lab2.comp2000;

public class SchoolKidTest {
	
    public static void main(String[] args) {
    	
    	System.out.println("Create a kid: name = \"Ken\", age = 5, teacher = \"Mrs. Jones\", greeting = \"Hiyas\"");
        SchoolKid ken = new SchoolKid("Ken", 5, "Mrs. Jones", "Hiyas.");
        
        System.out.println("");
        
        System.out.println(ken);
        
        System.out.println("");
        
        System.out.println("Changing age by 1, teacher to \"Mr. Roberson\", greeting to \"Aloha\"");
        
        System.out.println("");
        
        ken.haveBirthday();
        ken.changeTeacher("Mr. Roberson");
        ken.changeGreeting("Aloha");
        
        System.out.println("State of ken now...");
        System.out.println(ken);
    }
    
}
