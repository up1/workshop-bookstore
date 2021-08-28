package solid;

import java.util.Random;

public class MyService {

    Random random;

    public void setRandom(Random random) {
        this.random = random;
    }

    public String generateUUID() {
        String data = "DEMO";
        int number = random.nextInt(10);
        return data + number;
    }
}
