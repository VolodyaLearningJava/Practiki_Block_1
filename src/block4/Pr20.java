package block4;

public class Pr20 {
    public static void main(String[] args) {
        MyGenericClass<Integer, Integer, Integer> ints = new MyGenericClass<>(1, 2, 3);
        System.out.println(ints.getTName());
    }

    private static class MyGenericClass<T, V, K> {
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
}
