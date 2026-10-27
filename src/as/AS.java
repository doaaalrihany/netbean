
package as;
import java.util.Random;
import java .util.Arrays;

public class AS {

    
    public static void main(String[] args) {
        int n=100000;
        int[]randomarray=new int[n];
        Random rand=new Random();
        for(int i=0;i<n;i++){
            randomarray[i]=rand.nextInt(100000);           
        }
            //===========================================================
            int[]arrselrandom=Arrays.copyOf(randomarray, randomarray.length);
            long starttime=System.nanoTime();
            
            sorting.selectionsort(arrselrandom);
            long endtime=System.nanoTime();
            long selrandomtime=(endtime - starttime)/1000;
            //=========================================
            int[]arrquickrandom=Arrays.copyOf(randomarray, randomarray.length);
            starttime=System.nanoTime();
            
             sorting.quicksort(arrquickrandom,0, arrquickrandom.length-1);
            endtime=System.nanoTime();
            long quickrandomtime=(endtime-starttime)/1000;
            
            //=========================================
            
             starttime=System.nanoTime();
            
            sorting.selectionsort(arrselrandom);
             endtime=System.nanoTime();
           long  selsortedtime=(endtime - starttime)/1000;
                  
            //=============================
             starttime=System.nanoTime();
            
//             sorting.quicksort(arrquickrandom,0, arrquickrandom.length-1);
//            endtime=System.nanoTime();
//            long quicksortedtime=(endtime-starttime)/1000;
            
            //=================================
           System.out.println("selection sort :");
            System.out.println("الزمن لمصفوفة عشوائية:"+selrandomtime);
            System.out.println("الزمن مع مصفوفة مرتبة:"+selsortedtime);
            //==================================================
            System.out.println("quick sort :");
               System.out.println("الزمن لمصفوفة عشوائية:"+quickrandomtime);         
//            System.out.println("الزمن مع مصفوفة مرتبة:"+quicksortedtime);
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
