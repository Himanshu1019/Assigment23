import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LambdaImplement implements LambdaInter
{

@Override
public void calculate(String message) 
{
	// TODO Auto-generated method stub

	String regex="[A-Z ][a-z]*";
	Pattern p=Pattern.compile(regex);
	Matcher m=p.matcher(message);
	if(m.find())
	{
		System.out.println("yes valid firstname ");
	}
	else 
	{
		System.out.println("no not a valid firstname ");
	}
	
	
}

public   void calculate1(String message1)
{
	String regex="[A-Z ][a-z]*";
	Pattern p=Pattern.compile(regex);
	Matcher m=p.matcher(message1);
	if(m.find())
	{
		System.out.println("yes valid lastname ");
	}
	else 
	{
		System.out.println("no not a valid lastname ");
	}
	

}

public void calculate2(String str1)
{
	String regex="[a-zA-Z0-9.][a-zA-Z0-Hi9]@[a-zA-Z]+([.][a-zA-Z0-9]+)+";
	Pattern p=Pattern.compile(regex);
	Matcher m=p.matcher(str1);
	if(m.find())
	{
		System.out.println("yes valid emailid ");
	}
	else 
	{
		System.out.println(" no not a valid mailid ");
	}
	

}
}


