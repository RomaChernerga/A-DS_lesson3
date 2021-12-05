package CW_les3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        MyArray.isRepeat = false;  // повторяющиеся значения
        MyArray.isShuffle = false;  // перемешивание
        final int SIZE = 20000;  //Размер массива
        Integer[] arr = MyArray.getArray(SIZE,2); // шаг не более 5

//        System.out.println(Arrays.toString(arr));  //вывод изначального массива

        SpeedTest.startTime();

//        Bubble_sort.sort(arr);  // сортировка пузырьковая, при 50к = 6260 мс
//        Coctail_sort.sort(arr); //   сортировка коктейльная, при 50к = 7000 мс
//        Comb_sort.sort(arr); //   сортировка расщеской, при 50к = 17 мс

//        SelectionSort.sort(arr); // сортировка выбором, при 50к = 1841 мс
//        InsertionSort.sort(arr);  // сортировка вставками, при 50к = 1397 мс

//        PigeonholeSort.sort(arr);  // сортировка подсчетом, при 50к = 11 мс
//        Arrays.sort(arr);           //  родная сортировка, при 50к = 20мс



        SpeedTest.endTime();    //вывод времени

        System.out.println(Arrays.toString(arr));  //вывод массива после сортировки

        System.out.println(BinarySearch.search(arr,30000 ));
        System.out.println(InterpolationSearch.search(arr,30000 ));


    }
}
