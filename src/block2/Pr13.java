package block2;

public class Pr13 {
    public static void main(String[] args) {
        task1();
    }

    static void task1() {
        String st = "Hello Java!";
        System.out.println("Последний символ: " + st.charAt(st.length()-1));
        if (st.endsWith("!!!"))
            System.out.println("Строка заканчивается \"!!!\"");
        else
            System.out.println("Строка НЕ заканчивается \"!!!\"");

        if (st.startsWith("I like"))
            System.out.println("Строка начинается с \"I like\"");
        else
            System.out.println("Строка НЕ начинается с \"I like\"");

        if (st.contains("Java")) {
            System.out.println("Строка содержит \"Java\"");
            boolean flag = false;
            for (int i=0; i < st.length(); i++) {
                boolean subflag = false;
                for (int j=0; j < 4; j++) {
                    switch (j) {
                        case 0:
                            if (st.charAt(i+j) != 'J') subflag = true;
                            break;
                        case 1:
                            if (st.charAt(i+j) != 'a') subflag = true;
                            break;
                        case 2:
                            if (st.charAt(i+j) != 'v') subflag = true;
                            break;
                        case 3:
                            if (st.charAt(i+j) != 'a') subflag = true;
                            break;
                    }
                    if (subflag) break;
                }
                if (flag) {
                    System.out.println("Подстрока Java начинается с позиции " + i);
                    break;
                }
            }
        }
        else
            System.out.println("Строка НЕ содержит \"Java\"");


    }
}
