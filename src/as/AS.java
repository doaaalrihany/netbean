
package as;
import java.util.Random;
import java .util.Arrays;

public class AS {

    //دعاء علي الريحاني ....3168014
    public static void main(String[] args) {
       
        int n = 100000; // حجم المصفوفة
        
       
        
        // 1. عشوائية 
        int[] randomArr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            randomArr[i] = rand.nextInt(100000);
        }

        // 2. مرتبة عكسياً 
        int[] revArr = Arrays.copyOf(randomArr, n);
        Arrays.sort(revArr);
        for (int i = 0; i < n / 2; i++) {
            int temp = revArr[i];
            revArr[i] = revArr[n - 1 - i];
            revArr[n - 1 - i] = temp;
        }

        // 3. مرتبة جزئياً 
        int[] partialArr = Arrays.copyOf(randomArr, n);
        Arrays.sort(partialArr);
        for (int i = (int)(n * 0.8); i < n; i++) {
            int idx = rand.nextInt(n);
            int temp = partialArr[i];
            partialArr[i] = partialArr[idx];
            partialArr[idx] = temp;
        }

        // 4. مرتبة تماماً 
        int[] sortedArr = Arrays.copyOf(randomArr, n);
        Arrays.sort(sortedArr);


        //قياس الازمان

        // Selection Sort
        long selRand = measureSelection(Arrays.copyOf(randomArr, n));
        long selRev  = measureSelection(Arrays.copyOf(revArr, n));
        long selPart = measureSelection(Arrays.copyOf(partialArr, n));
        long selFull = measureSelection(Arrays.copyOf(sortedArr, n));

        // Insertion Sort
        long insRand = measureInsertion(Arrays.copyOf(randomArr, n));
        long insRev  = measureInsertion(Arrays.copyOf(revArr, n));
        long insPart = measureInsertion(Arrays.copyOf(partialArr, n));
        long insFull = measureInsertion(Arrays.copyOf(sortedArr, n));

        // Bubble Sort
        long bubRand = measureBubble(Arrays.copyOf(randomArr, n));
        long bubRev  = measureBubble(Arrays.copyOf(revArr, n));
        long bubPart = measureBubble(Arrays.copyOf(partialArr, n));
        long bubFull = measureBubble(Arrays.copyOf(sortedArr, n));

        // Merge Sort 
        long merRand = measureMerge(Arrays.copyOf(randomArr, n));
        long merRev  = measureMerge(Arrays.copyOf(revArr, n));
        long merPart = measureMerge(Arrays.copyOf(partialArr, n));
        long merFull = measureMerge(Arrays.copyOf(sortedArr, n));

        // Quick Sort
//        long quiRand = measureQuick(Arrays.copyOf(randomArr, n));
//        long quiRev  = measureQuick(Arrays.copyOf(revArr, n));
//        long quiPart = measureQuick(Arrays.copyOf(partialArr, n));
//        long quiFull = measureQuick(Arrays.copyOf(sortedArr, n));


        // ====================================================
        // طباعة النتائج
        
        
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.printf("%-15s | %-20s | %-20s | %-20s | %-20s%n", "الخوارزمية", " عشوائية (Random)", "مرتبة عكسياً", "مرتبة جزئياً", "مرتبة تماماً");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        
        System.out.printf("%-15s | %-17d us | %-17d us | %-17d us | %-17d us%n", "Selection Sort", selRand, selRev, selPart, selFull);
        System.out.printf("%-15s | %-17d us | %-17d us | %-17d us | %-17d us%n", "Insertion Sort", insRand, insRev, insPart, insFull);
        System.out.printf("%-15s | %-17d us | %-17d us | %-17d us | %-17d us%n", "Bubble Sort", bubRand, bubRev, bubPart, bubFull);
        System.out.printf("%-15s | %-17d us | %-17d us | %-17d us | %-17d us%n", "Merge Sort", merRand, merRev, merPart, merFull);
       // System.out.printf("%-15s | %-17d us | %-17d us | %-17d us | %-17d us%n", "Quick Sort", quiRand, quiRev, quiPart, quiFull);
        
        System.out.println("---------------------------------------------------------------------------------------------------------");
    }
    
    // ====================================================
    // دوال قياس الوقت بالميكروثانية
    public static long measureSelection(int[] arr) {
        long start = System.nanoTime();
        sorting.selectionsort(arr);
        long end = System.nanoTime();
        return (end - start) / 1000;
    }

    public static long measureInsertion(int[] arr) {
        long start = System.nanoTime();
        sorting.insertionsort(arr);
        long end = System.nanoTime();
        return (end - start) / 1000;
    }

    public static long measureBubble(int[] arr) {
        long start = System.nanoTime();
        sorting.bubblesort(arr);
        long end = System.nanoTime();
        return (end - start) / 1000;
    }

    public static long measureMerge(int[] arr) {
        long start = System.nanoTime();
        sorting. mergesort(arr, 0, arr.length - 1);
        long end = System.nanoTime();
        return (end - start) / 1000;
    }

//    public static long measureQuick(int[] arr) {
//        long start = System.nanoTime();
//        sorting.quicksort(arr, 0, arr.length - 1);
//        long end = System.nanoTime();
//        return (end - start) / 1000;
//        
        
        
        
    //}
}