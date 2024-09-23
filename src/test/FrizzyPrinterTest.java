package test;
import org.junit.Test;
import src.FizzBuzzBang;

import static org.junit.Assert.*;
public class FrizzyPrinterTest {
@Test
       public void testfizzbuzz01(){
    FizzBuzzBang fizzBuzzBang = new FizzBuzzBang();
    assertEquals("Fizz", fizzBuzzBang.printFizzy(3));
}
@Test
    public void testfizzbuzz02(){
        FizzBuzzBang fizzBuzzBang = new FizzBuzzBang();
        assertEquals("Boom", fizzBuzzBang.printFizzy(4));
    }
@Test
    public void testfizzbuzz03(){
        FizzBuzzBang fizzBuzzBang = new FizzBuzzBang();
        assertEquals("Fizzbuzzbang", fizzBuzzBang.printFizzy(105));
    }
}
