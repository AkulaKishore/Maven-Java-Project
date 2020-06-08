package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class GreeterTest{
    Greetings greetings = new Greetings();
    @Test
    public void greetingsSayHello(){
        assertThat(greetings.sayHello(),containsString("Hello,World"));
    }

}