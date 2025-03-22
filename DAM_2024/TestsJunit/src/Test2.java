public class Test2 {
    public double CelsiusToFarenheit(double celsius) {
        double farenheit;
        farenheit = (celsius * 1.8) + 32;
        return farenheit;
    }

    public double FarenheitToCelsius(double farenheit) {
        double celsius;
        celsius = Math.round((farenheit - 32) / 1.8);
        return celsius;
    }
}
