package customer_TestCases;

import com.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;

public class Tc_002_GetSingleCustomer extends TestBase {
	

public String responsebody=null;
@BeforeClass
void Get_All_Customers() throws InterruptedException  {
	logger.info("**************Started TC002_Get_Single_Customer*************");

	RestAssured.baseURI = "https://api.stripe.com";
	// Basic Authentication
	PreemptiveBasicAuthScheme authscheme = new PreemptiveBasicAuthScheme();
	authscheme.setUserName("sk_test_QbRiu7Hnvf9JMlTO1TmLtcoT");
	authscheme.setPassword("");
	RestAssured.authentication = authscheme;

	// Request Object
	httpRequest = RestAssured.given();
	
	// Response Object
	response = httpRequest.request(Method.GET, "/v1/customers/"+custid);
	Thread.sleep(3);
}
@Test
void checkResponseBody()
{
	logger.info("**************Checking Response Body************");
	responsebody=response.getBody().asString();
	Assert.assertEquals(responsebody.contains(custid), true);
}
@Test
void checkStatusCode()
{
	logger.info("**************Checking Status Code************");
	//Status code Validation
	int statusCode=response.statusCode();
	
	Assert.assertEquals(statusCode, 200);
}
@Test
void checkResponseTime()
{
	logger.info("**************Checking Response Time************");
	long responseTime=response.getTime();
	
	Assert.assertTrue(responseTime<2000);
}
@Test
void checkStatusLine() {
	logger.info("**************Checking Status Line************");
	String statusline=response.statusLine();
	
	Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
}

@Test
void checkContentType() {
	logger.info("**************Checking Content Type************");
	String contentType=response.header("Content-Type");
	
	Assert.assertEquals(contentType,"application/json");
	
}
@Test
void checkServerType()
{
	logger.info("**************Checking Server Type************");
	String serverType=response.header("Server");
	
	Assert.assertEquals(serverType,"nginx");
	
}
@Test
void checkContentLength()
{
	logger.info("**************Checking Content Length************");
	String contentLength=response.header("Content-Length");
	
	Assert.assertTrue(Integer.parseInt(contentLength)<15000);
}
@AfterClass
void teardown()
{
	logger.info("**************Finished TC002_Get_Single_Customers*************");
}

}
