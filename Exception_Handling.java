package lab12;
import java.util.Scanner;

public class Exception_Handling {
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		
		int[] array = getArray();

		
		System.out.print("Enter the index of  array: ");
		try {
			
			System.out.println("The corresponding element  is " + 
				array[input.nextInt()]);
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Index is Out of Bound.");
		}
	}

	
	public static int[] getArray() {
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100) + 1;
		}
		return array;
	}
}


