
import static com.vco.discover.Fibonnaci.fibonnaciFinder;
import static com.vco.discover.Fibonnaci.fibonnaciRecursive;
import org.junit.Assert;
import org.junit.Test;

public class FibonnaciTest {

    @Test
    public void when_negative_rule_returns_0() {
        Assert.assertEquals((Integer) 0, fibonnaciFinder(-1));        
    }

    @Test
    public void when_0_rule_returns_0() {
        Assert.assertEquals((Integer) 0, fibonnaciFinder(0));
    }

    @Test
    public void when_n_is_1_rule_returns_1() {
        Assert.assertEquals((Integer) 1, fibonnaciFinder(1));
    }

    @Test
    public void when_n_is_2_rule_returns_1() {
        Assert.assertEquals((Integer) 1, fibonnaciFinder(2));
    }

    @Test
    public void when_n_is_3_rule_returns_2() {
        Assert.assertEquals((Integer) 2, fibonnaciFinder(3));
    }

    @Test
    public void when_n_is_4_rule_returns_3() {
        Assert.assertEquals((Integer) 3, fibonnaciFinder(4));
    }

    @Test
    public void when_n_is_5_rule_returns_5() {
        Assert.assertEquals((Integer) 5, fibonnaciFinder(5));
    }

    @Test
    public void when_n_is_6_rule_returns_8() {
        Assert.assertEquals((Integer) 8, fibonnaciFinder(6));
    }

    @Test
    public void when_n_is_7_rule_returns_13() {
        Assert.assertEquals((Integer) 13, fibonnaciFinder(7));
    }

    @Test
    public void when_n_is_8_rule_returns_21() {
        Assert.assertEquals((Integer) 21, fibonnaciFinder(8));
    }

    @Test
    public void when_n_is_9_rule_returns_34() {
        Assert.assertEquals((Integer) 34, fibonnaciFinder(9));
    }

    @Test
    public void when_n_is_10_rule_returns_55() {
        Assert.assertEquals((Integer) 55, fibonnaciFinder(10));
    }
    
    @Test
    public void fibonnaciRecursive_returns_the_correct_value_of_the_first_10_numbers(){
        Assert.assertEquals((Integer) 0, fibonnaciRecursive(-1));
        Assert.assertEquals((Integer) 0, fibonnaciRecursive(0));
        Assert.assertEquals((Integer) 1, fibonnaciRecursive(1));
        Assert.assertEquals((Integer) 1, fibonnaciRecursive(2));
        Assert.assertEquals((Integer) 2, fibonnaciRecursive(3));
        Assert.assertEquals((Integer) 3, fibonnaciRecursive(4));
        Assert.assertEquals((Integer) 5, fibonnaciRecursive(5));
        Assert.assertEquals((Integer) 8, fibonnaciRecursive(6));
        Assert.assertEquals((Integer) 13, fibonnaciRecursive(7));
        Assert.assertEquals((Integer) 21, fibonnaciRecursive(8));
        Assert.assertEquals((Integer) 34, fibonnaciRecursive(9));
        Assert.assertEquals((Integer) 55, fibonnaciRecursive(10));
    }
}
