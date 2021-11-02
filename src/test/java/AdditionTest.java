import static org.junit.Assert.*;

public class AdditionTest {

    @org.junit.Test
    public void add() {
        int result = Addition.add(4,6);
        int correct = 10;
        assertEquals(correct,result);
    }
}