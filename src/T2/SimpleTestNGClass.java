package T2;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SimpleTestNGClass {

	@Test(groups=("first"))
	public void printhello()
	
	{
		
		System.out.println("hello");
	}
	
	
	@Parameters({"URL, URL1"})
	
	@Test
	
	public void printhis(String URLTest, String URLTest1)
	
	{
		System.out.println("hi");
		System.out.println(URLTest);
		System.out.println(URLTest1);

	}
}
