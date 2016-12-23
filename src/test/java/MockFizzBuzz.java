/**
 * Created by Kiview on 23.12.2016.
 */
public class MockFizzBuzz implements FizzBuzz {
    private int invocationCount;

    public String giveNumberForInt(int i) {
        invocationCount++;
        return "";
    }

    public int getInvocationCount() {
        return invocationCount;
    }
}
