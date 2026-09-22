import java.util.Scanner;

public class Pr2 {
    private Author TestAuthor = new Author("Vladimir", "p04ta@edu.mirea.ru", 'm');
    private Ball TestBall = new Ball();

    public void punkt4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество компьютеров в магазине: ");
        int amount = scanner.nextInt();
    }

    private class Author {
        private String name, email;
        private char gender;

        public Author(String name, String email, char gender) {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }

        public String getName() {
            return name; }
        public String getEmale() {
            return email; }
        public char getGender() {
            return gender; }
        public String toString() {
            return name + " " + email + " " + gender;
        }
    }

    private class Ball {
        private double x = 0.0, y = 0.0;

        public Ball(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public Ball() {
            this.x = 0;
            this.y = 0;
        }

        public double getX() {
            return x; }
        public void setX(double x) {
            this.x = x; }
        public double getY() {
            return y; }
        public void setY(double y) {
            this.y = y; }
        public void setXY(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public void move(double xDisp, double yDisp) {
            this.x += xDisp;
            this.y += yDisp;
        }
        public String ToString() {
            return Double.toString(x) + " " + Double.toString(y);
        }
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
        private Point centre;
        private double radius;

        public Circle(double x, double y, double radius) {
            this.centre = new Point(x, y);
            this.radius = radius;
        }
        public Circle() {
            this.centre = new Point();
            this.radius = 1;
        }
    }
    private class Tester {
        private Circle[] circles;
        private int ln;

        public Tester(Circle[] circles) {
            this.circles = circles;
            ln = circles.length;
        }

        public int getLn() {
            return ln; }
    }

    private class Computer {
        public String name, cpu, gpu, motherboard, powerSupply, kropus;
        public int ram, price;

        public Computer(String name, String cpu, String gpu, String motherboard, String powerSupply, String kropus, int ram, int price) {
            this.name = name;
            this.cpu = cpu;
            this.gpu = gpu;
            this.motherboard = motherboard;
            this.powerSupply = powerSupply;
            this.kropus = kropus;
            this.ram = ram;
            this.price = price;
        }
    }
    private class ComputerShop {
        private Computer[] computers;

        public ComputerShop(Computer[] computers) {
            this.computers = computers;
        }
        public ComputerShop(int amount) {
            Computer[] comps = {};

            for (int i = 0; i < amount; i++) {
                String name, cpu, gpu, motherboard, powerSupply, kropus;
                int ram, price;
                Scanner scanner = new Scanner(System.in);
                System.out.print("название: ");
                name = scanner.next();
                System.out.print("процессор: ");
                cpu = scanner.next();
                System.out.print("видеокарта: ");
                gpu = scanner.next();
                System.out.print("материнская плата: ");
                motherboard = scanner.next();
                System.out.print("блок питания: ");
                powerSupply = scanner.next();
                System.out.print("корпус: ");
                kropus = scanner.next();
                System.out.print("ОЗУ: ");
                ram = scanner.nextInt();
                System.out.print("цена: ");
                price = scanner.nextInt();

                Computer comp = new Computer(name, cpu, gpu, motherboard, powerSupply, kropus, ram, price);
                comps = addComputerToArray(comps, comp);
            }
            this.computers = comps;
        }

        public Computer[] searchComputer(String cpu, String gpu, String motherboard, String powerSupply, String kropus, int ram){
            Computer[] searchResults = {};
            for (int i = 0; i < computers.length; i++){
                if ((computers[i].cpu == cpu || cpu == "") &&
                        (computers[i].gpu == gpu || gpu == "") &&
                        (computers[i].motherboard == motherboard || motherboard == "") &&
                        (computers[i].powerSupply == powerSupply || powerSupply == "") &&
                        (computers[i].kropus == kropus || kropus == "") &&
                        (computers[i].ram == ram || ram == 0)){
                    searchResults = addComputerToArray(searchResults, computers[i]);
                    System.out.println("Вам подходит компьютер: " + computers[i].name + "\nОн стоит " + computers[i].price);
                }
            }
            return searchResults;
        }
        private static Computer[] addComputerToArray(Computer[] arr, Computer x) {
            Computer[] newarr = new Computer[arr.length + 1];
            for (int i = 0; i < arr.length; i++)
                newarr[i] = arr[i];

            newarr[arr.length] = x;
            return newarr;
        }
    }
}
