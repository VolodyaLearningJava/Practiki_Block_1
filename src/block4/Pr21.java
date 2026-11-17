package block4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import static java.lang.Math.min;

public class Pr21 {
    public static void main(String[] args) {

    }
    public static ArrayList<String> Arr2List(String[] initialArr) {
        ArrayList<String> arr = new ArrayList<>();
        for (int i=0; i < initialArr.length; i++)
            arr.add(initialArr[i]);
        return arr;
    }
    public static ArrayList<Integer> Arr2List(Integer[] initialArr) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=0; i < initialArr.length; i++)
            arr.add(initialArr[i]);
        return arr;
    }

    private class MyContainer<T, K, V> {
        private ArrayList<T> list = new ArrayList<>();
        private HashSet<T> set = new HashSet<>();
        private HashMap<K, V> map = new HashMap<>();
        MyContainer() {}
        MyContainer(ArrayList<T> l) { list = l; }

        public T getElementById(int i) { return list.get(i); }
        public void setNewList(ArrayList<T> l) {
            list = l;
            for (int i=0; i<min(5, l.size()); i++)
                System.out.println(l.get(i) + " ");
        }

        public void newArrayList() { list = new ArrayList<>(); }
        public void newArrayList(ArrayList<T> l) { list = l; }
        public void newHashSet() { set = new HashSet<>(); }
        public void newHashSet(HashSet<T> se) { set = se; }
        public void newHashMap() { map = new HashMap<>(); }
        public void newHashMap(HashMap<K, V> ma) { map = ma; }
    }

    private class Calculator<T extends Number, E extends Number> {
        public static enum CalcOperation {Add, Subtract, Multiply, Divide}
        public double calculate(T n, CalcOperation operation, E m) {
            double a = (double)n;
            double b = (double)m;
            switch (operation) {
                case CalcOperation.Add -> { return a + b; }
                case CalcOperation.Subtract -> { return a - b; }
                case CalcOperation.Multiply -> { return a * b; }
                case CalcOperation.Divide -> {
                    try { return a / b; }
                    catch (ArithmeticException e) { System.out.println("Zero division"); }
                }
            }
            return 0;
        }
        public CalcOperation parseOperation(char op) {
            try {

            } catch ()
        }
    }
}
