package inheritance;
import java.util.*;

public class BookDemo {
public static void main(String[] args) {
		
		Book []arr = new Book[5];
		Scanner input = new Scanner(System.in);
		

		
		for(int i=0; i<5; i++) {
			
			System.out.println("Enter bookid, name and price ");
			int temp1 = input.nextInt();
			String temp2 = input.next();
			double temp3 = input.nextDouble();
			
			System.out.println("Choose 1: Ebook or 2: Pbook ");
			int choice = input.nextInt();
			
			switch(choice) {
			
			case 1:
				arr[i] = new Ebook(temp1,temp2,temp3);
				break;
			
			case 2:
				arr[i] = new Pbook(temp1,temp2,temp3);
				break;
			
			default:
				System.out.println("Enter valid choice pls");
			}
	
		}
		input.close();
		
		for(int i=0; i<5; i++) {
			System.out.println(arr[i].calCost());
		}

	}

}
