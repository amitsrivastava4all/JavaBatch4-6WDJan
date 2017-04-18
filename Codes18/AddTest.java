import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class AddTest {
	AddFunctionality addFunctionality = new AddFunctionality();
@Test(timeout=1000)	
public void testAddTwoNumbers(){
	int expectedResult = 30;
	int result = addFunctionality.add(10, 20);
	Assert.assertEquals(expectedResult, result);
}
@Ignore
@Test	
public void testAddTwoNegativeNumbers(){
	int expectedResult = 0;
	int result = addFunctionality.add(-1000, -2000);
	Assert.assertEquals(expectedResult, result);
}
@Test	
public void testAddOneNegativeNumberAndOnePositiveNumber(){
	int expectedResult = 0;
	int result = addFunctionality.add(-1000, 2000);
	Assert.assertEquals(expectedResult, result);
}

@Test(expected=java.lang.ArithmeticException.class)
public void testNegative(){
	addFunctionality.result(10);
}

}
