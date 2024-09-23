package src;

public class FizzBuzzBang {

  public  FizzBuzzBang(){
    }

  public String printFizzy(int number){
        if(number % 3 == 0 && number % 5 != 0){
            return "Fizz";
        } else if (number % 5 == 0 && number % 3 != 0) {
            return "Buzz";
        }
        else if(number % 7 == 0 && number % 5 != 0){
            return "Bang";
        }
        else if(number % 7 == 0 && number % 3 ==0 && number % 5 !=0){
            return "Fizzbuzz";
        }
        else if(number % 7 == 0 && number % 3 ==0 && number % 5 ==0){
            return "Fizzbuzzbang";
        }
        else {
            return "Boom";
        }
    }

}
