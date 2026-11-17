package block4;

import java.util.HashMap;

public class Pr19 {
    public static void main(String[] args) {
        innChecker checker = new innChecker();
        checker.checkInn("11111");
    }

    private static class innChecker {
        HashMap<String, Boolean> innMap = new HashMap<>();
        public innChecker() {
            for (int a=0; a<10; a++) {
                for (int b=0; b<10; b++) {
                    for (int c=0; c<10; c++) {
                        for (int d=0; d<10; d++) {
                            innMap.put(Integer.toString(a)+Integer.toString(b)+Integer.toString(c)+Integer.toString(d), true);
                        }
                    }
                }
            }
        }

        public void checkInn(String key) {
            try {
                if (innMap.get(key)) {
                    System.out.println("yes");
                    return;
                }
                System.out.println("no");
            }
            catch (NullPointerException e) {
                System.out.println("Can't find inn");
            }
        }
    }
}
