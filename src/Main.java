//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conversiones c = new Conversiones();

        System.out.println( c.celsiusToFahrenheit(32));
        System.out.println( c.fahrenheitToCelsius(89.6));
        System.out.println( c.minutesToSeconds(10));
        System.out.println( c.secondsToHours(3600));
        System.out.println( c.secondsToHours(5896));
        System.out.println( c.secondsToHours(145896));

        System.out.println( c.percent(480, 1200));
        System.out.println( c.addPercentage(100,50));
        System.out.println( c.addPercentage(78,20));
        System.out.println( c.addPercentage(432,200));
    }
}

