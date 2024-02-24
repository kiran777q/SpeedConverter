
public class Practice {
	
	int x = 5;
	public static void firstMethod(String Name, int age) {
		
		System.out.println("His Name is : "+ Name +" " + "His Name is : "  +age ); 
		
	}
	
	static int secondMethod(int x, int y) {
		
		return(x + y);
	}
	String fname = "John";
	String lname = "Smith";
	
	int modelYear;
	String carMaker;
	//constructor example
	public Practice(int year, String name){
		modelYear = year;
		carMaker = name; 
		int x = 10;
	}
	
public static void main(String[] args) {
	
	firstMethod("Sam", 25);
	firstMethod("Anwar", 29);
	int z = secondMethod(20,  40);
	System.out.println("z value is : " +z);
	System.out.println(secondMethod(100, 100));
	System.out.println(secondMethod(150, 250));
	
	Practice myObj = new Practice();
	System.out.println(myObj.x);
	
	Practice perObj = new Practice();
	System.out.println("My first name Is " +perObj.fname+ " " + "Last Name Is " +perObj.lname);
	
	Practice carObj = new Practice(1969, "Audi");
	System.out.println(carObj.modelYear+" "+carObj.carMaker);
}

}

