import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

//start of code
class Student extends Person{
	private int[] testScores;

    Student(String firstName, String lastName, int identification,int[] testScores ){
        super(firstName,lastName,identification);
        this.testScores = testScores;
    }
    public void printPerson(){
        super.printPerson();
    }
    public char calculate(){
        int sum = 0;
       for(int i = 0;i < testScores.length;i++){
           sum = sum + testScores[i];
       }
    int av = sum /testScores.length;
        if(av>=90){
            return 'O';
        }else if(av>=80){
            return 'E';
        }else if(av>=70){
            return 'A';       
        }else if(av>=55){
            return 'P';
        }else if(av>=40){
            return 'D';
        }else{
            return 'T';
        }
    }
}

//end of code
class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}