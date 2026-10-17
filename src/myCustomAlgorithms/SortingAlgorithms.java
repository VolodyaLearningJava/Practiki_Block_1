package myCustomAlgorithms;

import java.util.ArrayList;

public class SortingAlgorithms<T extends Comparable<T>> {
    public ArrayList<T> insertionSort(ArrayList<T> arr) {
        if (arr.size() == 1)
            return arr;
        ArrayList<T> newArr = new ArrayList<>();
        for (int i=0; i < arr.size()-1; i++) { newArr.add(arr.get(i)); }
        newArr = insertionSort(newArr);

        if (arr.getLast().compareTo(newArr.getLast()) < 0) {//((arr[arr.length-1] < newArr[newArr.length-1])) {
            T c = arr.getLast();
            arr.set(arr.size()-1, newArr.getLast());
            newArr.set(newArr.size()-1, c);

            //System.out.println("Element " + (newArr.length) + ", bring back " + c);
            newArr = insertionSort(newArr);
        }
        for (int i=0; i < newArr.size(); i++) { arr.set(i, newArr.get(i)); }
        //System.out.println("Go fwd");
        return arr;
    }
}
