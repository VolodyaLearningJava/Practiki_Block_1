import java.util.*;
public class Pr3 {
    public void mr1(){
        double[] arr = new double[10];
        Random rnd = new Random();
        for (int i=0; i<arr.length; i++){
            arr[i] = Math.random() * rnd.nextDouble(1, 1001);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public void mr2(){
        Tester tester = new Tester(new Circle[5]);
        for (int i = 0; i < tester.circles.length; i++){ tester.circles[i] = new Circle(); }
        tester.printCircles();
        tester.orderCircles();
        tester.printCircles();
    }

    private class Point {
        public double x = 0.0, y = 0.0;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public Point() {
            this.x = 0;
            this.y = 0;
        }

        public void setXY(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
    private class Circle {
        private Pr3.Point centre;
        private double radius;

        public Circle(double x, double y) {
            this.centre = new Pr3.Point(x, y);
            this.radius = Math.random();
        }
        public Circle() {
            this.centre = new Pr3.Point();
            this.radius = Math.random();
        }
    }
    private class Tester {
        private Pr3.Circle[] circles;
        private int ln;

        public Tester(Pr3.Circle[] circles) {
            this.circles = circles;
            this.ln = circles.length;
        }
        public int getLn() {
            return ln; }

        public Pr3.Circle minCircle(){
            if (circles.length == 0){
                System.out.println("ошибка! нет элементов");
                return new Circle();
            }
            double minRad = circles[0].radius;
            int minId=0;
            for (int i=1; i<circles.length; i++){
                if (circles[i].radius < minRad){
                    minRad = circles[i].radius;
                    minId = i;
                }
            }
            return circles[minId];
        }
        public Pr3.Circle maxCircle(){
            if (circles.length == 0){
                System.out.println("ошибка! нет элементов");
                return new Circle();
            }
            double maxRad = circles[0].radius;
            int maxId=0;
            for (int i=1; i<circles.length; i++){
                if (circles[i].radius > maxRad){
                    maxRad = circles[i].radius;
                    maxId = i;
                }
            }
            return circles[maxId];
        }
        public void orderCircles(){
            for (int i=0; i<circles.length-1; i++){
                if (circles[i].radius > circles[i+1].radius){
                    Pr3.Circle temp = circles[i+1];
                    circles[i+1] = circles[i];
                    circles[i] = temp;
                    i=-1;
                }
            }
        }
        public void printCircles(){
            for (int i=0; i < circles.length; i++){
                System.out.print("x, y: " + circles[i].centre.x + " " + circles[i].centre.y + " r: " + circles[i].radius + "|");
            }
            System.out.println();
        }
    }
}
