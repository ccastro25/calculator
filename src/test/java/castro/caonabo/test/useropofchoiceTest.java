package castro.caonabo.test;

import castro.caonabo.calc.BasicOperatrions;
import castro.caonabo.calc.ScienctificOperators;
import castro.caonabo.calc.UserOperatrionOFChoice;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by castro on 9/13/16.
 */
public class useropofchoiceTest {

BasicOperatrions mathOperations= new BasicOperatrions();
    ScienctificOperators scienctificOperators = new ScienctificOperators();
    @Test
public void userMathTest(){

    UserOperatrionOFChoice userOperatrionOFChoice = new UserOperatrionOFChoice();

    String expected = "decimal";

    String actual = userOperatrionOFChoice.usersMath(expected);

        Assert.assertEquals("this method should return decimal",expected,actual);
}


    @Test
    public void addTest() {
        double expected = 8;
        double actual = mathOperations.add("",3, 5);
        Assert.assertEquals("adding 3 +5 ", expected, actual,0.1);
    }

    @Test
    public void substractTest() {
       double expected = 5;

        double actual = mathOperations.substract("",10, 5);
        Assert.assertEquals("subtracting 10-5", expected, actual,0.1);
    }

    @Test
    public void divedTest() {

        int expected = 2;

        double actual = mathOperations.divide("",10, 5);
        Assert.assertEquals("dividing 10/5",expected, actual,0.1);
    }

    @Test
    public void multiply() {

        int expected = 50;

        double actual = mathOperations.multiPly("",10, 5);
        Assert.assertEquals("multiply 10 * 5=50", expected, (int) actual);

    }

   @Test
    public void squaredTest(){
        double expected = 25;
        double actual = scienctificOperators.square(5);

        Assert.assertEquals("should return 4 in ", expected, actual, 0.1);

    }

    @Test
    public void squaredRootTest() {

        double expected = 5;
        double actual = scienctificOperators.squareRoot(25);

        Assert.assertEquals(" should  return 4 ", expected, actual, 0.1);
    }

    @Test
    public void inverseTest() {

        double expected = .25;
        double actual = scienctificOperators.invert(4);

        Assert.assertEquals("should  return .25", expected, actual, 0.1);
    }


    @Test
    public void factorialTest(){


        double expected = 24;
        double actual = scienctificOperators.factorial(4);

        Assert.assertEquals(" should  return .24", expected, actual, 0.1);

    }










}
