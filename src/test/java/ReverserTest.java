
import static com.vco.discover.Reverser.reverseStringRecursively;
import static com.vco.discover.Reverser.stringReverser;
import org.junit.Assert;
import org.junit.Test;

public class ReverserTest {

    @Test
    public void when_forward_rule_returns_drawrof() {
        Assert.assertEquals("drawrof", stringReverser("forward"));
    }

    @Test
    public void when_t_rule_returns_t() {
        Assert.assertEquals("t", stringReverser("t"));
    }
    
        @Test
    public void when_empty_rule_returns_empty() {
        Assert.assertEquals("", stringReverser(""));
    }
    
    @Test
    public void when_forward_recursive_rule_returns_drawrof() {
        Assert.assertEquals("drawrof", reverseStringRecursively("forward"));
    }

    @Test
    public void when_t_recursive_rule_returns_t() {
        Assert.assertEquals("t", reverseStringRecursively("t"));
    }
    
        @Test
    public void when_empty_recursive_rule_returns_empty() {
        Assert.assertEquals("", reverseStringRecursively(""));
    }     
}
