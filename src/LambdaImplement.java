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
}


