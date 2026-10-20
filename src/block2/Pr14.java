package block2;

import java.util.Scanner;

public class Pr14 {
    public static void main(String[] args) {
        task4();
    }

    public static void task4() {
        System.out.print("Введите урпвнение: ");
        String st = new Scanner(System.in).nextLine();
        for (int i=0; i<st.length()-1; i++) {
            if (st.charAt(i) != '+')
                continue;
            if (!processEquation(st, i+1))
                continue;
            System.out.println("Уравнение правильное");
            return;
        }
        System.out.println("Уравнение НЕправильное");
    }
    private static boolean processEquation(String str, int stPoint) {
        for (int i=stPoint; i<str.length()-1; i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch))
                return false;
            if (ch=='-'||ch=='+'||ch=='*'||ch=='/')
                return true;
        }
        return Character.isDigit(str.charAt(str.length()-1));
    }
    public static void task7() {
        System.out.print("Enter password: ");
        processPassword(new Scanner(System.in).nextLine());
    }
    private static boolean processPassword(String pass) {
        if (pass.length() < 8) {
            System.out.println("Your password is too short");
            return false;
        }
        int digits=0, capitals=0, lowercase=0;
        for (int i=0; i < pass.length(); i++) {
            char ch = pass.charAt(i);
            if (Character.isDigit(ch)) {
                digits++;
                continue;
            }
            if (Character.isLowerCase(ch)) {
                lowercase++;
                continue;
            }
            if (Character.isUpperCase(ch))
                capitals++;
        }
        if (digits==0 || capitals==0 || lowercase==0) {
            System.out.println("Bad password");
            return false;
        }

        System.out.println("Password accepted");
        return true;
    }
    // С заданием 8 не справился, спросить у преподавателя
    /*public static void task8() {
        Integer[] arr = {0, 1, 0, 3, 2, 1, 10, 9, 8};
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));

        FilerCriteria greaterThen3 = (x) -> x.compareTo(3) > 0;
        ArrayList<Integer> listGreaterThen3 = filter(list, greaterThen3);

    }
    private interface FilerCriteria {
        boolean singleCriteria(Comparable<Object> obj);
    }
    private static ArrayList<Object> filter(ArrayList<Comparable<Object>> obj, FilerCriteria criteria) {
        ArrayList<Object> arr = new ArrayList<>();
        for (int i=0; i<obj.size(); i++) {
            if (criteria.singleCriteria(obj.get(i)))
                arr.add(obj.get(i));
        }
        return arr;
    }*/
}
