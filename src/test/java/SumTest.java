import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;


class SumTest {

//1,5
//-2,-4
//-3,7
//4,-9
//0, 0
//0,-7
//4, 0

    @ParameterizedTest
    @MethodSource("validData")
    void sumOfTwoNumbersBothPositive(int a, int b, int expected) {
        Sum sum = new Sum();
        int actualSumValue = sum.sumOfTwoNumbers(a,b);
        int expectedSumValue = expected;
        assertEquals(expectedSumValue,actualSumValue);
    }

    static Stream<Arguments> validData(){
        return Stream.of(
                arguments(1, 5, 6),
                arguments(-2, -4, -6),
                arguments(-3, 7, 4),
                arguments(4,-9,-5),
                arguments(0,0,0),
                arguments(0,-7,-7),
                arguments(4,0,4)
        );
    }






/*    @Test
    void sumOfTwoNumbersBothNegative() {
        Sum sum = new Sum();
        int actualSumValue = sum.sumOfTwoNumbers(-2,-4);
        int expectedSumValue = -6;
        assertEquals(expectedSumValue,actualSumValue);
    }*/

/*    @Test
    void sumOfTwoNumbersNegativePositive() {
        Sum sum = new Sum();
        int actualSumValue = sum.sumOfTwoNumbers(-3,7);
        int expectedSumValue = 4;
        assertEquals(expectedSumValue,actualSumValue);
    }*/

/*    @Test
    void sumOfTwoNumbersPositiveNegative() {
        Sum sum = new Sum();
        int actualSumValue = sum.sumOfTwoNumbers(4,-9);
        int expectedSumValue = -5;
        assertEquals(expectedSumValue,actualSumValue);
    }*/
/*    @Test
    void sumOfTwoNumbersBothZeroes() {
        Sum sum = new Sum();
        int actualSumValue = sum.sumOfTwoNumbers(0,0);
        int expectedSumValue = 0;
        assertEquals(expectedSumValue,actualSumValue);
    }*/
/*    @Test
    void sumOfTwoNumbersZeroNegative() {
        Sum sum = new Sum();
        int actualSumValue = sum.sumOfTwoNumbers(0,-7);
        int expectedSumValue = -7;
        assertEquals(expectedSumValue,actualSumValue);
    }*/

/*    @Test
    void sumOfTwoNumbersPositiveZero() {
        Sum sum = new Sum();
        int actualSumValue = sum.sumOfTwoNumbers(4,0);
        int expectedSumValue = 4;
        assertEquals(expectedSumValue,actualSumValue);
    }*/
}