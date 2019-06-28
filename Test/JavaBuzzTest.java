import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class JavaBuzzTest {
    @Test
    public void NotDivisible() {
        JavaBuzz javaBuzz = new JavaBuzz();
        Assert.assertEquals("1", javaBuzz.convertFizzBuzz(1));
    }

    @Test
    public void primeNumber() {
        JavaBuzz javaBuzz = new JavaBuzz();
        Assert.assertEquals("29", javaBuzz.convertFizzBuzz(29));
    }

    @Test
    public void returnsFizz() {
        JavaBuzz javaBuzz = new JavaBuzz();
        Assert.assertEquals("fizz", javaBuzz.convertFizzBuzz(3));
    }

    @Test
    public void returnsBuzz() {
        JavaBuzz javaBuzz = new JavaBuzz();
        Assert.assertEquals("buzz", javaBuzz.convertFizzBuzz(5));
    }

    @Test
    public void returnsBuzzForNumber25() {
        JavaBuzz javaBuzz = new JavaBuzz();
        Assert.assertEquals("buzz", javaBuzz.convertFizzBuzz(25));
    }


    @Test
    public void returnsFizzBuzz() {
        JavaBuzz javaBuzz = new JavaBuzz();
        Assert.assertEquals("fizzbuzz", javaBuzz.convertFizzBuzz(15));
    }

    @Test
    public void returnsFizzForNumberThirty() {
        JavaBuzz javaBuzz = new JavaBuzz();
        Assert.assertEquals("fizzbuzz", javaBuzz.convertFizzBuzz(30));
    }
}
