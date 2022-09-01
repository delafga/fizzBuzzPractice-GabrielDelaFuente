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

    @Test
    public void should_return_FizzBuzz_when_count_off_input_15_is_given_(){
        //Given
        FizzBuzz fb = new FizzBuzz();
        int input = 15;
        String expected = "FizzBuzz";

        //When
        String actual = fb.countOff(input);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_FizzWhizz_when_count_off_input_21_is_given_(){
        //Given
        FizzBuzz fb = new FizzBuzz();
        int input = 21;
        String expected = "FizzWhizz";

        //When
        String actual = fb.countOff(input);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_BuzzWhizz_when_count_off_input_35_is_given_(){
        //Given
        FizzBuzz fb = new FizzBuzz();
        int input = 35;
        String expected = "BuzzWhizz";

        //When
        String actual = fb.countOff(input);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_count_off_input_105_is_given_(){
        //Given
        FizzBuzz fb = new FizzBuzz();
        int input = 105;
        String expected = "FizzBuzzWhizz";

        //When
        String actual = fb.countOff(input);

        //Then
        assertEquals(expected, actual);
    }
}