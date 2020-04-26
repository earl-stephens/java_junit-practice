import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MathTestTest {
    @Test
    public void print_to_console()
    {
        MathTest tester = new MathTest();
        assertEquals(40, tester.adder());
        assertEquals(375, tester.multiplier());
    }
}