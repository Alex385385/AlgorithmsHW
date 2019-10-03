import java.util.Random;

public class AlgorithmsProject {
    private Random rand = new Random();

    public void insertionSort(int low, int high, int[] array) {
        int target, j;
        for(int i = low; i <= high; i++) {
            target = array[i];
            j = i - 1;
            while(j >= 0 && target < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = target;
        }
    }

    public void mergeSort(int low, int high, int[] array) {
        int mid;
        if(low < high) {
            mid = (low + high) / 2;
            mergeSort(low, mid, array);
            mergeSort(mid + 1, high, array);
            merge(low, mid, high, array);
        }
    }

    private void merge(int low, int mid, int high, int[] array) {
        int i = low;
        int j = mid + 1;
        int k = 0;
        int[] temp = new int[(high - low) + 1];
        if(temp.length <= 1) {
            return;
        }
        while(i <= mid && j <= high) {
            if(array[i] < array[j]) {
                temp[k] = array[i];
                i++;
            }
            else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }
        if(i > mid) {
            for(int l = j; l<= high; l++) {
                temp[k++] = array[l];
            }
        }
        else {
            for(int m = i; m < mid + 1; m++) {
                temp[k++] = array[m];
            }
        }
        k = 0;
        for(int n = low; n <= high; n++) {
            array[n] = temp[k++];
        }
    }

    public void quickSort1(int low, int high, int[] array1) {
        int pivotpoint;
        if(high > low) {
            pivotpoint = partition(low, high, array1);
            quickSort1(low, pivotpoint - 1, array1);
            quickSort1(pivotpoint + 1, high, array1);
        }
    }

    private int partition(int low, int high, int[] array1) {
        int pivotitem;
        int pivotpoint;

        pivotitem = array1[low];
        int j = low;
        for(int i = low + 1; i <= high; i++) {
            if(array1[i] < pivotitem) {
                j++;
                int temp = array1[j];
                array1[j] = array1[i];
                array1[i] = temp;
            }
        }
        pivotpoint = j;
        int temp = array1[low];
        array1[low] = array1[pivotpoint];
        array1[pivotpoint] = temp;
        return pivotpoint;
    }

    public void quickSort2(int low, int high, int[] array1) {
        int size = (high - low);
        int pivotpoint;
        if(size <= 16) {
            insertionSort(low, high, array1);
        }
        else if(high > low) {
            pivotpoint = partition(low, high, array1);
            quickSort2(low, pivotpoint - 1, array1);
            quickSort2(pivotpoint + 1, high, array1);
        }
    }

    public void quickSort3(int low, int high, int[] array1) {
        int pivotpoint;
        int randomer;
        if((high - low) > 16) {
            randomer = low + (rand.nextInt(high - low));
            int temp = array1[low];
            array1[low] = array1[randomer];
            array1[randomer] = temp;
        }
        if(high > low) {
            pivotpoint = partition(low, high, array1);
            quickSort3(low, pivotpoint - 1, array1);
            quickSort3(pivotpoint + 1, high, array1);
        }
    }
}