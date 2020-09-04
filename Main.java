import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//int counter = 0;
		Scanner scanner = new Scanner(System.in);
		ArrayQueue testq = new ArrayQueue();

		for (int i = 0; i < 5; i++) {
			String first, last;
			int age;
			System.out.print("Enter first name of the person : ");
			first = scanner.nextLine();
			System.out.print("Enter last name of the person : ");
			last = scanner.nextLine();
			System.out.print("Enter age of the person : ");
			age = scanner.nextInt();
			scanner.nextLine();
			Person person = new Person(first, last, age);
			testq.enQueue(person);
			//counter++;
			}
		  scanner.close();
		 
		  System.out.println("Here are the current elements in the queue:");
		  testq.displayQ(); System.out.println();
		  
		  System.out.println("Queue sorted descending in last name: ");
		  testq.sortLastName();
		  testq.displayQ();
		  System.out.println();
		  
		  System.out.println("Queue sorted descending in age: ");
		  testq.sortAge();
		  testq.displayQ();
	}
}
