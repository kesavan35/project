package abstraction;
import java.util.Scanner;
public class abstraction_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String:");
		String a=s.nextLine();
		int b=a.length();
		for(int i=0;i<=(b-1);i++)
		{
			if(Character.isDigit(a.charAt(i)))
			{
				char c=a.charAt(i);
				int d=Character.getNumericValue(c);
				char e=a.charAt(i-1);
				for(int j=0;j<=(d-1);j++)
				{
					System.out.print(e);
				}
				
			}
		}
		
	}

}
