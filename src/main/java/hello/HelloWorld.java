package hello;

import org.joda.time.LocalTime;

public class HelloWorld{
   
    public static void main(String[] args){
        Greetings greeter = new Greetings();
		LocalTime currentTime = new LocalTime();
		System.out.println("current time is: "+currentTime);
        System.out.println(greeter.sayHello());
    }
}