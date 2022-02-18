package utitilities;
import org.apache.commons.lang3.RandomStringUtils;
public class RestUtititlies {
	public static String Custemailid()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(1);
		return("Preeti"+generatedString+"@gmail.com");
	}
	public static String CustName()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(1);
		return generatedString;
	}

}
