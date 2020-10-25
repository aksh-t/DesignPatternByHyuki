package Bridge.Exercise1;

import java.util.Random;

public class RandomDisplay extends CountDisplay {

    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        multiDisplay(new Random().nextInt(times));
    }
}
