import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		
		int first,second,third;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("FINDING LARGEST NUMBER");
		
		System.out.println("\nEnter First Number : ");
		first=sc.nextInt();
		System.out.println("Enter Second Number : ");
		second=sc.nextInt();
		System.out.println("Enter Third Number : ");
		third=sc.nextInt();
		
		if(first>second && first>third)
		{
			System.out.println("\nFirst number ("+first+") is largest");
		}
		else if(second>first && second>third)
		{
			System.out.println("\nSecond number ("+second+") is largest");
		}
		else
		{
			System.out.println("\nThird number ("+third+") is largest");
		}

	}

}
