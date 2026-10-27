/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package projectsiddik;

import java.util.Arrays;

public class projectsiddik {

    public static void bubly_sort(int a[], int n) {
        int i, j;
        int temp;
        boolean swap = true;

        if (n < 2)
            return;

        for (i = 0; swap && i < n - 1; ++i) {
            swap = false;
            for (j = 0; j < n - 1; ++j) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swap = true;
                }
            }
        }
    }

    public static void main(String[] args) {

        int [] array1 = java.util.concurrent.ThreadLocalRandom.current().ints(1000, 0, 5000).toArray();
        int [] ax = array1.clone();
        Arrays.sort(ax);
        
        long tnt1 = System.nanoTime();
        bubly_sort(array1, 1000);
        long ending1 = System.nanoTime();
        long ttime1 = ending1 - tnt1;

        long tnt2 = System.nanoTime();
        bubly_sort(array1, 1000);
        long ending2 = System.nanoTime();
        long ttime2 = ending2 - tnt2;

        long timedif = ttime1 - ttime2;

        System.out.println(tnt1);
        System.out.println(tnt2);
        System.out.println(timedif);

        // second scenario

        long tnt3 = System.nanoTime();
        bubly_sort(ax, 1000);
        long ending3 = System.nanoTime();
        long ttime3 = ending3 - tnt3;

        long tnt4 = System.nanoTime();
        bubly_sort(array1, 1000);
        long ending4 = System.nanoTime();
        long ttime4 = ending4 - tnt4;
        long timedif2 = ttime3 - ttime4;
        System.out.println(tnt3);
        System.out.println(tnt4);
        System.out.println(timedif2);

    }
    
}
