package OOP.Lesson6.Three;
/*
Created by matua on 22.07.2018 at 13:17
*/

public class SortingThread implements Runnable{
    int h;
    int inner, outer;
    int temp;
    int[] array;

    public SortingThread(int h, int[] array) {
        this.h = h;
        this.array = array;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (outer = h; outer < array.length; outer++) {
            temp = array[outer];
            inner = outer;
            //сортируем массив с шагом h
            while (inner > h - 1 && array[inner - h] >= temp) {
                array[inner] = array[inner - h];
                inner -= h;
            }
            array[inner] = temp;
        }
    }
}
