package block1;

public class Pr6 {
    // В качесмтве задания на 11 практическую работу были реализованы классы и интейфейс из 11 пункта

    private interface Converatble {
        public double convertFromUnits(double units);
        public double convertToUnits(double value);
    }

    private class Celsius implements Converatble {
        public double convertFromUnits(double units) {
            return units + 100;
        }
        public double convertToUnits(double value) {
            return value - 100;
        }
    }
    private class Kelvin implements Converatble { // Градус по кельвину возьмём за эталонный unit
        public double convertFromUnits(double units) {
            return units;
        }
        public double convertToUnits(double value) {
            return value;
        }
    }
    private class Fahrenheit implements Converatble {
        public double convertFromUnits(double units) {
            return units * 9 / (double)5 - 459.67;
        }
        public double convertToUnits(double value) {
            return (value + 459.67) / (double)9 * 5;
        }
    }
}
