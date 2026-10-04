import java.lang.Math;
public class Pr7 {
    public void task4() {
        System.out.println("Пример математики: " + MathFunc.calculateCircleLength(1));
    }
    interface MathCalculable {
        public static final float PI = 3.14f;
        public static float power(float n, int j) { // n - число, j - степень
            float c = 1;

            for (int i=0; i < j; i++)
                c *= n;
            if (c != 1) return c;

            for (int i=0; i > j; i--)
                c /= n;
            return c;
        }
        public static float complAbs(float a, float b) {
            return (float)Math.sqrt(a*a + b*b);
        }
    }
    private class MathFunc implements MathCalculable {
        public static float calculateCircleLength(float radius) {
            return 2 * PI * radius;
        }
    }
}
