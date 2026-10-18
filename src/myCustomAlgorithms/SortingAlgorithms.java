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
            T temp = arr.getLast();
            arr.set(arr.size()-1, newArr.getLast());
            newArr.set(newArr.size()-1, temp);

            //System.out.println("Element " + (newArr.length) + ", bring back " + c);
            newArr = insertionSort(newArr);
        }
        for (int i=0; i < newArr.size(); i++) { arr.set(i, newArr.get(i)); }
        //System.out.println("Go fwd");
        return arr;
    }

    public ArrayList<T> quickSort(ArrayList<T> arr) {
        if (arr.size() <= 1)
            return arr;
        T pivot = arr.getLast();
        ArrayList<T> less = new ArrayList<>(),
                greater = new ArrayList<>(),
                equal = new ArrayList<>(),
                result = new ArrayList<>();
        for (int i=0; i < arr.size(); i++) {
            if (arr.get(i).compareTo(pivot) < 0)
                less.add(arr.get(i));
            else if (arr.get(i).compareTo(pivot) > 0)
                greater.add(arr.get(i));
            else
                equal.add(arr.get(i));
        }
        result.addAll(quickSort(less));
        result.addAll(equal);
        result.addAll(quickSort(greater));
        return result;//quickSort(less) + equal + quickSort(greater);
    }

}
