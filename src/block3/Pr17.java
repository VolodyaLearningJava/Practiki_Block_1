package block3;

public class Pr17 {
    public class SingleList<T> {
        private SingleListElement head;
        public SingleList() {}

        public void addElement(T value) {
            if (head == null) {
                head = new SingleListElement(value);
                return;
            }
            head.addElement(new SingleListElement(value));
        }
        public void removeElement(int id) {
            if (head == null || id < 0) return;
            if (id == 0) {
                head = head.tail;
                return;
            }
            head.removeElement(id, 1);
        }
        public void printElement(int id) {
            if (head == null || id < 0) return;
            System.out.println(head.printElement(id, 0));
        }
        public void clearList() { head = null; }
        public boolean isEmpty() { return head == null; }


        private class SingleListElement {
            private T value;
            private SingleListElement tail;
            public SingleListElement(T value) {
                this.value = value;
            }

            public void addElement(SingleListElement element) {
                if (tail == null) {
                    tail = element;
                    return;
                }
                tail.addElement(element);
            }
            public void removeElement(int id, int cur) {
                if (tail == null) return;
                if (id == cur+1) {
                    tail = tail.tail;
                    return;
                }
                tail.removeElement(id, cur+1);
            }
            public String printElement(int id, int cur) {
                if (id == cur) return value.toString();
                if (tail == null) return "";
                return tail.printElement(id, cur+1);
            }
            public int countMe() { // Использовалось бы для нахождения длины
                if (tail == null) return 1;
                return 1 + tail.countMe();
            }
        }
    }

    public class DualList<T> {
        private DualListElement head;
        public DualList() {}

        public void addElement(T value) {
            if (head == null) {
                head = new DualListElement(value, null);
                return;
            }
            head.addElement(value);
        }
        public void removeElement(int id) {
            if (head == null || id < 0) return;
            if (id == 0) {
                head = head.tail;
                if (head != null) head.head = null;
                return;
            }
            head.removeElement(id, 1);
        }
        public void printElement(int id) {
            if (head == null || id < 0) return;
            System.out.println(head.printElement(id, 0));
        }
        public void clearList() { head = null; }
        public boolean isEmpty() { return head == null; }


        private class DualListElement {
            private T value;
            private DualListElement head;
            private DualListElement tail;
            public DualListElement(T value, DualListElement head) {
                this.value = value;
                this.head = head;
            }

            public void addElement(T value) {
                if (tail == null) {
                    tail = new DualListElement(value, this);
                    return;
                }
                tail.addElement(value);
            }
            public void removeElement(int id, int cur) {
                if (id == cur) {
                    head.tail = tail;
                    return;
                }
                tail.removeElement(id, cur+1);
            }
            public String printElement(int id, int cur) {
                if (id == cur) return value.toString();
                if (tail == null) return "";
                return tail.printElement(id, cur+1);
            }
        }
    }

    public class CycleList<T> {
        private CycleListElement head;
        public CycleList() {}

        public void addElement(T value) {
            if (head == null) {
                head = new CycleListElement(value, null);
                return;
            }
            head.addElement(value);
        }
        public void removeElement(int id) {
            if (head == null || id < 0) return;
            if (id == 0) {
                if (head.tail == head) {
                    head = null;
                    return;
                }
                head = head.tail;
                if (head != null) head.head = null;
                return;
            }
            head.removeElement(id, 1);
        }
        public void printElement(int id) {
            if (head == null || id < 0) return;
            System.out.println(head.printElement(id, 0));
        }
        public void clearList() { head = null; }
        public boolean isEmpty() { return head == null; }


        private class CycleListElement {
            private T value;
            private CycleListElement head;
            private CycleListElement tail;
            public CycleListElement(T value, CycleListElement head) {
                this.value = value;
                this.head = head;

                this.tail = DetermineFrist();
            }

            public void addElement(T value) {
                if (tail.head == null) {
                    tail = new CycleListElement(value, this);
                    return;
                }
                tail.addElement(value);
            }
            public void removeElement(int id, int cur) {
                if (id == cur) {
                    head.tail = tail;
                    return;
                }
                tail.removeElement(id, cur+1);
            }
            public String printElement(int id, int cur) {
                if (id == cur) return value.toString();
                if (tail == null) return "";
                return tail.printElement(id, cur+1);
            }

            private CycleListElement DetermineFrist() {
                if (head != null) return head.DetermineFrist();
                return this;
            }
        }
    }
}
