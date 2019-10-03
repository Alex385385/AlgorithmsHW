import java.util.Random;

public class Main {

    public static void main(String[] args) {
        AlgorithmsProject bg = new AlgorithmsProject();
        Random rand = new Random();

        int arraySize = 65536;

        int printAmount = 32;

        int[] originalArray = new int[arraySize];
        int[] insertion = new int[arraySize];
        int[] mergeArray= new int[arraySize];
        int[] quick1= new int[arraySize];
        int[] quick2= new int[arraySize];
        int[] quick3= new int[arraySize];

        for(int i = 0; i < originalArray.length; i++){
            originalArray[i] = 1 + i;
        }

        System.out.println("Array size is: " + originalArray.length);

        System.out.println("Original 32 element array is: ");

        for(int i = 0; i < printAmount; i++) {
            System.out.print(originalArray[i] + ", ");
        }

        System.out.println();



        long startTime = System.nanoTime();

        for(int z = 0; z < 10; z++) {
            System.arraycopy(originalArray, 0, insertion,0, insertion.length);

            bg.insertionSort(0,insertion.length-1, insertion);
        }


        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;


        System.out.println("InsertionSort run 1: " + totalTime/10);

        startTime = System.nanoTime();

        for(int z = 0; z < 10; z++) {
            System.arraycopy(originalArray, 0, mergeArray,0, mergeArray.length);
            bg.mergeSort(0,mergeArray.length-1, mergeArray);
        }

        endTime = System.nanoTime();
        totalTime = endTime - startTime;

        System.out.println("MergeSort run 1: " + totalTime/10);


        startTime = System.nanoTime();

        for(int z = 0; z < 10; z++) {
            System.arraycopy(originalArray, 0, quick3,0, quick3.length);
            bg.quickSort3(0,quick3.length-1, quick3);
        }


        endTime = System.nanoTime();
        totalTime = endTime - startTime;


        System.out.println("QuickSort3 run 1: " + totalTime/10);

        startTime = System.nanoTime();



        for(int z = 0; z < 10; z++) {
            System.arraycopy(originalArray, 0, insertion,0, insertion.length);

            bg.insertionSort(0,insertion.length-1, insertion);
        }


        endTime   = System.nanoTime();
        totalTime = endTime - startTime;


        System.out.println("InsertionSort run 2: " + totalTime/10);

        startTime = System.nanoTime();

        for(int z = 0; z < 10; z++) {
            System.arraycopy(originalArray, 0, mergeArray,0, mergeArray.length);
            bg.mergeSort(0,mergeArray.length-1, mergeArray);
        }


        endTime = System.nanoTime();
        totalTime = endTime - startTime;


        System.out.println("MergeSort run 2: " + totalTime/10);


        startTime = System.nanoTime();

        for(int z = 0; z < 10; z++) {
            System.arraycopy(originalArray, 0, quick3,0, quick3.length);
            bg.quickSort3(0,quick3.length-1, quick3);
        }


        endTime = System.nanoTime();
        totalTime = endTime - startTime;


        System.out.println("QuickSort3 run 2: " + totalTime/10);

        System.out.println("InsertionSort 32 element array is: ");

        for(int i = 0; i < printAmount; i++) {
            System.out.print(insertion[i] + ", ");
        }

        System.out.println();

        System.out.println("MergeSort 32 element array is: ");

        for(int i = 0; i < printAmount; i++) {
            System.out.print(mergeArray[i] + ", ");
        }

        System.out.println();


        System.out.println("QuickSort3 32 element array is: ");

        for(int i = 0; i < printAmount; i++) {
            System.out.print(quick3[i] + ", ");
        }

        System.out.println();

    }
}
