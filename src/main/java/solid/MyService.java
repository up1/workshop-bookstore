package solid;

import java.util.Random;

public class MyService {

    public String generateUUID() {
        String data = "DEMO";
        Random random = new Random();
        int number = random.nextInt(10);
        return data + number;
    }
}
