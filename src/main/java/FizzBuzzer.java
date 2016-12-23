/**
 * Created by Kiview on 23.12.2016.
 */
public class FizzBuzzer {
    private final FizzBuzz fizzBuzz;

    public FizzBuzzer(FizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
    }

    public String buzz() {
        return fizzBuzz.giveNumberForInt(5);
    }

    public void buzz100() {

        for (int i = 0; i < 100; i++) {
            fizzBuzz.giveNumberForInt(i);
        }

    }
}
