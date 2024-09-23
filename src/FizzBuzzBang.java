public class FizzBuzzBang {
    private int number;

    FizzBuzzBang(int number){
        this.number = number;
    }

    void printFizzy(int number){
        if(number % 3 == 0 && number % 5 != 0){
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        }
        else if(number % 7 == 0){
            System.out.println("Bang");
        }
    }
}
