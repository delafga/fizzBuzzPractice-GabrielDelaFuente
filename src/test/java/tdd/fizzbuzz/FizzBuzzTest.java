package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_return_1_when_count_off_input_1_is_given_(){
        //Given
        FizzBuzz fb = new FizzBuzz();
        int input = 1;
        String expected = "1";

        //When
        String actual = fb.countOff(input);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_Fizz_when_count_off_input_3_is_given_(){
        //Given
        FizzBuzz fb = new FizzBuzz();
        int input = 3;
        String expected = "Fizz";

        //When
        String actual = fb.countOff(input);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_Buzz_when_count_off_input_5_is_given_(){
        //Given
        FizzBuzz fb = new FizzBuzz();
        int input = 5;
        String expected = "Buzz";

        //When
        String actual = fb.countOff(input);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_Whizz_when_count_off_input_7_is_given_(){
        //Given
        FizzBuzz fb = new FizzBuzz();
        int input = 7;
        String expected = "Whizz";

        //When
        String actual = fb.countOff(input);

        //Then
        assertEquals(expected, actual);
    }
}
