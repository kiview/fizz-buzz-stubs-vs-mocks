import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Kiview on 23.12.2016.
 */
public class FizzBuzzerTests {

    @Test
    public void shouldReturnValuesFromFrizzBuzz() {
        // given
        StubFizzBuzz stubFizzBuzz = new StubFizzBuzz();
        String expectedValue = "x";
        stubFizzBuzz.willReturn(expectedValue);

        FizzBuzzer buzzer = new FizzBuzzer(stubFizzBuzz);

        // when
        String returnedValue = buzzer.buzz();

        // then
        assertEquals(expectedValue, returnedValue);
    }

    @Test
    public void shouldInteractWithFizzBuzz100Times() {
        // given
        MockFizzBuzz mockFizzBuzz = new MockFizzBuzz();
        FizzBuzzer buzzer = new FizzBuzzer(mockFizzBuzz);

        // when
        buzzer.buzz100();

        // then
        assertEquals(mockFizzBuzz.getInvocationCount(), 100);


    }

}
