package block2;

import java.text.SimpleDateFormat;
import java.util.*;

public class Pr11 {
    public static void main(String[] args) {
        task3();
    }

    static void task1() {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        Calendar taskGetTime = Calendar.getInstance();
        taskGetTime.set(Calendar.YEAR, 2026);
        taskGetTime.set(Calendar.MONTH, 9);
        taskGetTime.set(Calendar.DATE, 13);

        System.out.println("Maksimov");
        System.out.println("Получение задания: " + sdf.format(taskGetTime.getTime()));
        System.out.println("Время сдачи: " + now);
    }

    static void task2() {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        Scanner scan = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        System.out.print("Введите год: ");
        cal.set(Calendar.YEAR, scan.nextInt());
        System.out.print("Введите номер месяца: ");
        cal.set(Calendar.MONTH, scan.nextInt() - 1);
        System.out.print("Введите номер дня: ");
        cal.set(Calendar.DATE, scan.nextInt());

        System.out.println();
        System.out.println("Введённые данные: " + sdf.format(cal.getTime()));
        System.out.println("Сегодня: " + sdf.format(now));
    }

    static void task3() {
        StudentDate stud = new StudentDate(2007, 2, 8);

        System.out.println("Short: " + stud.toString("dd.MM.yy"));
        System.out.println("Mid: " + stud.toString("dd MM yyyy"));
        System.out.println("Long: " + stud.toString("dd MMMM yyyy года"));
    }

    static void task4() {
        Scanner scan = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();

        System.out.print("Введите год: ");
        int year = scan.nextInt();
        System.out.print("Введите номер месяца: ");
        int month = scan.nextInt();
        System.out.print("Введите число: ");
        int day = scan.nextInt();
        System.out.print("Введите часы: ");
        int hour = scan.nextInt();
        System.out.print("Введите минуты: ");
        int minute = scan.nextInt();

        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DATE, day);
        cal.set(Calendar.HOUR_OF_DAY, hour);
        cal.set(Calendar.MINUTE, minute);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);

        Date date = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        System.out.println();
        System.out.println("Объект Calendar: " + sdf.format(cal.getTime()));
        System.out.println("Объект Date: " + sdf.format(date));
    }

    static void task5() {
        int size = 10000;
        int count = 1000;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long startTime;
        long endTime;


        startTime = System.nanoTime();
        for (int i = 0; i < count; i++)
            arrayList.add(i);
        endTime = System.nanoTime();
        System.out.println("ArrayList, добавление: " + (endTime - startTime) + " нс");

        startTime = System.nanoTime();
        for (int i = 0; i < count; i++)
            linkedList.add(i);
        endTime = System.nanoTime();
        System.out.println("LinkedList, добавление: " + (endTime - startTime) + " нс");


        startTime = System.nanoTime();
        for (int i = 0; i < count; i++)
            arrayList.add(arrayList.size() / 2, -1);
        endTime = System.nanoTime();
        System.out.println("ArrayList, вставка: " + (endTime - startTime) + " нс");

        startTime = System.nanoTime();
        for (int i = 0; i < count; i++)
            linkedList.add(linkedList.size() / 2, -1);
        endTime = System.nanoTime();
        System.out.println("LinkedList, вставка: " + (endTime - startTime) + " нс");

        startTime = System.nanoTime();
        for (int i = 0; i < count; i++)
            arrayList.remove(arrayList.size() / 2);
        endTime = System.nanoTime();
        System.out.println("ArrayList, удаление: " + (endTime - startTime) + " нс");

        startTime = System.nanoTime();
        for (int i = 0; i < count; i++)
            linkedList.remove(linkedList.size() / 2);
        endTime = System.nanoTime();
        System.out.println("LinkedList, удаление: " + (endTime - startTime) + " нс");


        int value = size / 2;
        startTime = System.nanoTime();
        for (int i = 0; i < count; i++)
            arrayList.contains(value);
        endTime = System.nanoTime();
        System.out.println("ArrayList, поиск: " + (endTime - startTime) + " нс");

        startTime = System.nanoTime();
        for (int i = 0; i < count; i++)
            linkedList.contains(value);
        endTime = System.nanoTime();
        System.out.println("LinkedList, поиск: " + (endTime - startTime) + " нс");
    }

    static class StudentDate {
        Calendar birthDate = Calendar.getInstance();
        public StudentDate(int year, int month, int day) {
            birthDate.set(Calendar.YEAR, year);
            birthDate.set(Calendar.MONTH, month - 1);
            birthDate.set(Calendar.DATE, day);
        }
        public void setBirthDate(int year, int month, int day) {
            birthDate.set(Calendar.YEAR, year);
            birthDate.set(Calendar.MONTH, month - 1);
            birthDate.set(Calendar.DATE, day);
        }
        public String toString(String pattern) {
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            return sdf.format(birthDate.getTime());
        }
    }
}
