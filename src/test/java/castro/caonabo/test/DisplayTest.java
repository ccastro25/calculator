package castro.caonabo.test;

import castro.caonabo.calc.Display;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by castro on 9/13/16.
 */
public class DisplayTest {
    Display display = new Display();


    @Test
    public void displayModeTest(){

        String expected = "1001";
        String actaul =display.displayModes("binary",9);

        Assert.assertEquals("should print 9",expected,actaul);
    }
}
