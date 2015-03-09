package selectionsort;

import java.util.Random;

public class selectionsort {
	static int comparation;
	static int swap;
	public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] dizi = new int[500];
        Random randomGenerator = new Random();
        int sayi = 0;
        for (int i = 0; i < 500; i++) {
            sayi = randomGenerator.nextInt(100);
            dizi[i] = sayi;
        }
        selectionSort(dizi);
        for (int i = 1; i < 500; i++) {
            System.out.println(dizi[i]);
        }
        long endTime = System.currentTimeMillis();
        long estimatedTime = endTime - startTime; // Geçen süreyi milisaniye cinsinden elde ediyoruz
        double seconds = (double) estimatedTime / 1000; //
        System.out.println(seconds);
        System.out.println("karsilastirma :" + comparation);
        System.out.println("swap :" + swap);

    }

    public static void  selectionSort(int[] arr) {
        int i, j, minIndex, tmp;
        int n = arr.length;
        for (i = 0; i < n - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < n; j++) {
            	comparation++;
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
                swap++;
            }
           
        }

    }

}

