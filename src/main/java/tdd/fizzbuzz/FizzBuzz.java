package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int number){
        String output;

        if(number % 3 == 0){
            output = "Fizz";
        }
        else if(number % 5 == 0){
            output = "Buzz";
        }
        else if(number % 7 == 0){
            output = "Whizz";
        }
        else{
            output = String.valueOf(number);
        }
        return output;
    }
}
