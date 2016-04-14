import java.util.*;
public class StudentSearch {
	static Scanner sc = new Scanner(System.in);
	
	static String [] studentName = {" ", "Jamillah", "Tim", "Andy", "Alex", "Bob", "Jenny", "Kim", "Florida", "Chris"};
	static String [] hometown= {" ", "Detroit","Chicago","Philly","Lansing","NYC","DC","Florida", "Detroit"};
	static String [] food= {" ", "pizza", "pizza","pizza","pizza","pizza","pizza", "pizza", "tacos"};
	static String otherinfo;
	static int studentnum;
	public static void main(String[] args) {
	
	System.out.println("Welcome to our Java Class. Which student do you want stalk?");
	
	
	try {
		 int studentnum =getValidNumberInRange(1,10);
		 System.out.println("Student" + " " + studentnum + " is " + " " + studentName[studentnum]); 
		 
		 studentnum = sc.nextInt();sc.nextLine();
		 
		      }
	 catch (NumberFormatException e) {
	    	 	System.out.println("That is not a valid number, please try again and enter # between 1-10:");
	    	 	
	          }	
	
	
	
	
  
    }
     	
		
				 
    
public static int getValidNumberInRange(int min, int max)

   {
	int input=sc.nextInt();sc.nextLine();                
	while(input < min || input>max){
	System.out.println("Please put a number within a range!");
		 }
	return input;
    }
}
/*public static String getValidInfo(hometown, food)
 * try {
		String otherinfo = getValidInfo(hometown, food);
		System.out.print("What other info would you like to know aout this student?" + " Please enter 'hometown' or 'fav food'" );otherinfo =sc.nextLine();
	}
	
if (!otherinfo.equalsIgnoreCase("hometown")){
	System.out.println("That data doesnt exist, please enter hometown or fav food");
} 
else {
	System.out.println("This student is from" + hometown[studentnum]);
}
if(!otherinfo.equalsIgnoreCase("food")){
	System.out.println("That data doesnt exist, please enter hometown or fav food");
}
else {
	System.out.println("This student is from" + food[studentnum]);

}
*/
	

   

