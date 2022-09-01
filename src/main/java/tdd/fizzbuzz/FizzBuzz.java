package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int number){
        StringBuilder output = new StringBuilder();

        if(number % 3 == 0){
            output.append("Fizz");
        }
        if(number % 5 == 0){
            output.append("Buzz");
        }
        if(number % 7 == 0){
            output.append("Whizz");
        }
        else if(output.toString().length() == 0){
            output.append(number);
        }

        return output.toString();
    }
}
