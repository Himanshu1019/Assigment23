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
		System.out.println("enter the emailid  to check ");
		LambdaInter obj2=new LambdaImplement();
		String message2 = s.next();	
		obj.calculate2(message2);
		System.out.println("enter the mobile number  to check ");
		LambdaInter obj3=new LambdaImplement();
		String message3 = s.next();	
		obj.calculate3(message3);
		System.out.println("enter the mobile number  to check ");
		LambdaInter obj4=new LambdaImplement();
		String message4 = s.next();	
		obj.calculate4(message4);
		
			
		
		

	}

}
