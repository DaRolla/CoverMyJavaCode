package code.cover.covermyjavacode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddingTest {

    @Test
    public void testAddMethod() {

        Adding a = new Adding();
        int result = a.add(3, 4);

        assertEquals(result, 7);
    }

}