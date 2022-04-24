import java.util.Scanner;

public class LambdaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("starting the registeration program ");
		Scanner s=new Scanner(System.in);
		System.out.println("enter the firstname to check ");
			String messager = s.next();	
		LambdaInter obj=new LambdaImplement();
		obj.calculate(messager);
		System.out.println("enter the lastname  to check ");
		LambdaInter obj1=new LambdaImplement();
		String message1 = s.next();	
		obj.calculate1(message1);
		{
			
		}
		

	}

}
