package block2;

import myCustomAlgorithms.SortingAlgorithms;

import java.util.ArrayList;
import java.util.Comparator;

public class Pr10 implements Comparator<Student> { // Он же SortingStudentsByGPA
    public static SortingAlgorithms<Student> sort = new SortingAlgorithms<>();

    ArrayList<Student> studs = new ArrayList<>();
    public void setArray(int[] ids, int[] points) {
        for (int i=0; i < Math.min(ids.length, points.length); i++)
            studs.add(new Student(ids[i], points[i]));
    }
    public Pr10(int[] arr) {
        setArray(arr, arr);
    }
    public void outArray() {
        for (int i=0; i<studs.size(); i++)
            System.out.print(studs.get(i).getPoints());
        System.out.println();
    }

    public ArrayList<Student> combineAndSort(ArrayList<Student> arr) {
        studs.addAll(arr);
        return sort.quickSort(studs);
    }

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getPoints(), o2.getPoints());
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 7, 1, 3, 2, 10, 5, 9, 4, 8, 6},
                arr2 = {0, 1, 4, 3, 2};
        Pr10 p10_1 = new Pr10(arr1), p10_2 = new Pr10(arr2);
        p10_1.combineAndSort(p10_2.studs);
    }
}
