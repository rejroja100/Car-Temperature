import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RangeInputTest {

    @Test
    void temperature1() {
        RangeInput passenger1 = new RangeInput();
        passenger1.up();
        passenger1.up();
        passenger1.up();
        passenger1.up();
        assertEquals(49, passenger1.getCurrentTemperature());
    }

    @Test
    void temperature2() {
        RangeInput passenger2 = new RangeInput(60, 70);
        passenger2.up();
        passenger2.up();
        passenger2.down();
        passenger2.down();
        assertEquals(65, passenger2.getCurrentTemperature());
    }

    @Test
    void temperature3() {
        RangeInput driver1 = new RangeInput(30, 40);
        driver1.up();
        driver1.up();
        driver1.up();
        driver1.down();
        assertEquals(37, driver1.getCurrentTemperature());
    }

    @Test
    void temperature4() {
        RangeInput driver2 = new RangeInput(20, 40);
        driver2.up();
        driver2.up();
        driver2.down();
        driver2.down();
        assertEquals(30, driver2.getCurrentTemperature());
    }
}


