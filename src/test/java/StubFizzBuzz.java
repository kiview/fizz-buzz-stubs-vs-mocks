/**
 * Created by Kiview on 23.12.2016.
 */
public class StubFizzBuzz implements FizzBuzz {

    private String stubValue;

    public void willReturn(String x) {
        this.stubValue = x;
    }

    public String giveNumberForInt(int i) {
        return this.stubValue;
    }
}
