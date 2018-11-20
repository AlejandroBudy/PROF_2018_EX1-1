
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class MyStringTest {

    MyString myString;
    @Before
    public void setUp(){
        myString = new MyString("prueba");
    }

    @Test
    public void shouldReturnGTZero(){
        int result = this.myString.compareTo("pru");
        assertEquals(result, 1);
    }

    @Test
    public void shouldReturnLTZero(){
        int result = this.myString.compareTo("prueba1");
        assertEquals(result, -1);
    }

    @Test
    public void shouldReturnZero(){
        int result = this.myString.compareTo("prueba");
        assertEquals(result, 0);
    }

    @Test
    public void shouldReturnOtherThanZero(){
        int result = this.myString.compareTo("prheba");
        assertFalse(result == 0);
    }
}
