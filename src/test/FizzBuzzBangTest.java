package test;

import org.junit.Test;
import src.FizzBuzzBang;

import static org.junit.Assert.*;

public class FizzBuzzBangTest {

    @Test
    public void testFizz() {
        FizzBuzzBang fizzBuzzBang = new FizzBuzzBang();
        assertEquals("Fizz", fizzBuzzBang.printFizzy(3, false));
    }

    @Test
    public void testBuzz() {
        FizzBuzzBang fizzBuzzBang = new FizzBuzzBang();
        assertEquals("Buzz", fizzBuzzBang.printFizzy(5, false));
    }

    @Test
    public void testBang() {
        FizzBuzzBang fizzBuzzBang = new FizzBuzzBang();
        assertEquals("Bang", fizzBuzzBang.printFizzy(7, false));
    }

    @Test
    public void testFizzbuzz() {
        FizzBuzzBang fizzBuzzBang = new FizzBuzzBang();
        assertEquals("Fizzbuzz", fizzBuzzBang.printFizzy(15, false));
    }

    @Test
    public void testFizzbuzzbang() {
        FizzBuzzBang fizzBuzzBang = new FizzBuzzBang();
        assertEquals("Fizzbuzzbang", fizzBuzzBang.printFizzy(105, false));
    }

    @Test
    public void testBoom() {
        FizzBuzzBang fizzBuzzBang = new FizzBuzzBang();
        assertEquals("Boom", fizzBuzzBang.printFizzy(4, false));
    }

    @Test
    public void testUppercaseFizz() {
        FizzBuzzBang fizzBuzzBang = new FizzBuzzBang();
        assertEquals("FIZZ", fizzBuzzBang.printFizzy(3, true));
    }

    @Test
    public void testUppercaseFizzbuzzbang() {
        FizzBuzzBang fizzBuzzBang = new FizzBuzzBang();
        assertEquals("FIZZBUZZBANG", fizzBuzzBang.printFizzy(105, true));
    }
}