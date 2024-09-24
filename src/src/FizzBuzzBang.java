package src;

public class FizzBuzzBang {

    public FizzBuzzBang() {
    }

    public String printFizzy(int number, boolean isUppercase) {
        String result = "";

        if (number % 3 == 0 && number % 5 == 0 && number % 7 == 0) {
            result = "Fizzbuzzbang";
        } else if (number % 3 == 0 && number % 5 == 0) {
            result = "Fizzbuzz";
        } else if (number % 3 == 0) {
            result = "Fizz";
        } else if (number % 5 == 0) {
            result = "Buzz";
        } else if (number % 7 == 0) {
            result = "Bang";
        } else {
            result = "Boom";
        }

        if (isUppercase) {
            return result.toUpperCase();
        } else {
            return result;
        }
    }
}