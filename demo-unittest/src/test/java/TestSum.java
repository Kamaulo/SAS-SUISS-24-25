import static org.junit.Assert.assertEquals;
import com.example.sasproject.Sum;

import org.junit.*;

public class TestSum {

    @Test
    public void testSuccess() throws Exception {
        assertEquals(2, Sum.sum(1, 1));
    }

    @Test
    public void testFail() throws Exception {
        assertEquals(10, Sum.sum(2, 3));
    }

}