public class Conversiones {

    /**
     * Funcion para convertir una temperatura en grados Celsius a Fahrenheit
     * @param c Temperatura en grados Celsius
     * @return  Temperatura en grados Fahrenheit
     */
    double celsiusToFahrenheit(double c) {
        return c * 1.8 + 32;
    }

    /**
     * Funcion para convertir una temperatura en grados Fahrenheti a Celsius
     * @param f Temperatura en grados Fahrenheit
     * @return  Temperatura en grados Celsius
     */
    double fahrenheitToCelsius(double f) {
        return (f - 32)/1.8;
    }

    /**
     * Funcion para convertir segundos a minutos
     * @param m Tiempo en minutos
     * @return  Tiempo en segundos
     */
    int minutesToSeconds(int m) {
        return m * 60;
    }

    /**
     *  Convierte un tiempo proporcionado en segundos a formato de hora:minutos:segundos.
     * @param s Tiempo en segundos
     * @return Tiempo en formato h:min:s
     */
    String secondsToHours(int s) {
        int h, min;
        h = s/3600;
        s = s % 3600;
        min = s / 60;
        s = s % 60;

        return h + ":" + min + ":" + s;

    }

    /**
     * Devuelve que % es un valor sobre otro.
     * @param total Valor total
     * @param value Valor a medir
     * @return      Porcentaje en %
     */
    double percent(double total, double value) {
        return value * 100.0 / total;
    }

    /**
     * Incrementa un valor en un porcentaje establecido
     * @param value Valor a incrementar
     * @param increment Cantidad del incremento porcentual
     * @return Devuelve el valor final tras aplicarle el porcentaje establecido
     */
    double addPercentage(double value, double increment) {
        return value + value * (increment/100);
    }
}
