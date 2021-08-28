package solid;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class Random7 extends Random {
    @Override
    public int nextInt(int bound) {
        return 7;
    }
}

class MyServiceTest {

    @Test
    void generateUUID() {
        Random random = new Random7();
        // Constructor Injection
        MyService myService = new MyService();
        // Setter/Property/Field Injection
        myService.setRandom(random);
        // Method Injection
        assertEquals("DEMO7", myService.generateUUID());
    }
}