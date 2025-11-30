import static org.junit.jupiter.api.Assertions.*;

class ConversionesTest {

    Conversiones c = new Conversiones();
    @org.junit.jupiter.api.Test
    void celsiusToFahrenheit() {
        assertEquals(33.80d, c.celsiusToFahrenheit(1), 0.01);
    }

    @org.junit.jupiter.api.Test
    void fahrenheitToCelsius() {
        assertEquals(1d, c.fahrenheitToCelsius(33.8d), 0.01);
    }

    @org.junit.jupiter.api.Test
    void minutesToSeconds() {
        assertEquals(60, c.minutesToSeconds(1));
    }

    @org.junit.jupiter.api.Test
    void secondsToHours() {
        assertEquals("01:00:00",c.secondsToHours(3600));
    }

    @org.junit.jupiter.api.Test
    void percent() {
        assertEquals(25.00,c.percent(100,25));
        assertEquals(0,c.percent(100,0));
        assertEquals(0,c.percent(0,100));
        assertEquals(0,c.percent(0,0));
        assertEquals(100,c.percent(100,100));

    }

    @org.junit.jupiter.api.Test
    void addPercentage() {
        assertEquals(125.00,c.addPercentage(100,25));
    }
}