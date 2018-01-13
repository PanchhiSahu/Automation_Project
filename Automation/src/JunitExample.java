import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitExample {
	
@Test	
public void a()
{
	System.out.println("MethodA");
}
@Before
public void beforea()
{
	System.out.println("Before A");
}

@After
public void aftera()
{
	System.out.println("Before B");
}


}
