package block4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Pr20 {
    public static void main(String[] args) {
        //MyGenericClass<Integer, Integer, Integer> ints = new MyGenericClass<>(1, 2, 3);
        //System.out.println(ints.getTName());
    }

    private abstract static class Animal {
        private static String name;
        private static int age;
        public static void makeSound() {
            System.out.println("SOUND!!!");
        }
    }

    private static class MyGenericClass<T extends Comparable<T>, V extends Serializable, K extends Animal> {
        private T t;
        private V v;
        private K k;

        public T getT() {
            return t;
        }
        public String getTName() { return t.getClass().getName(); }
        public void setT(T t) {
            this.t = t;
        }

        public V getV() {
            return v;
        }
        public String getVName() { return v.getClass().getName(); }
        public void setV(V v) {
            this.v = v;
        }

        public K getK() {
            return k;
        }
        public String getKName() { return k.getClass().getName(); }
        public void setK(K k) {
            this.k = k;
        }

        public MyGenericClass(K k, V v, T t) {
            this.k = k;
            this.v = v;
            this.t = t;
        }
    }

    private class MinMax<T extends Comparable<T>> {
        private ArrayList<T> list;
        private T temp;
        public MinMax(ArrayList<T> arr) { this.list = arr; }

        public T getMin() {
            temp = list.getFirst();
            for (int i=1; i<list.size(); i++) {
                if (list.get(i).compareTo(temp) < 0) temp = list.get(i);
            }
            return temp;
        }
        public T getMax() {
            temp = list.getFirst();
            for (int i=1; i<list.size(); i++) {
                if (list.get(i).compareTo(temp) > 0) temp = list.get(i);
            }
            return temp;
        }
    }
}
