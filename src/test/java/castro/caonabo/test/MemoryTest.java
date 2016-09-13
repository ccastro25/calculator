package castro.caonabo.test;

import castro.caonabo.calc.UserMemory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by castro on 9/13/16.
 */
public class MemoryTest {
    UserMemory userMemory = new UserMemory();

    @Test
    public void testMemory(){
        userMemory.setCurrentMemory(9);
        double expected=9;
        double actual = userMemory.getCurrentMemory();

        Assert.assertEquals("expecting 9",expected,actual,0.1);
    }
}
