
package as;


public class sorting {
 public static void selectionsort(int[]arr){
     int n=arr.length;
     for (int i=0;i<n;i++){
         int minindex=i;
         for(int j=0;j<n;j++){
               if (arr[j] < arr[minindex]){
                 minindex = j ;
             }
         }
         int temp=arr[minindex];
         arr[minindex]=arr[i];
         arr[i]=temp;
         
     }
 }
 
  public static void quicksort(int[]arr ,int low ,int high){
      if (low < high){
          int pi=partition(arr,low,high);
          quicksort (arr,low,pi-1);
           quicksort (arr,pi+1,high);
           
      }
  }
     
    
  
  
  
  
     private static int partition(int[]arr,int low,int high){
         int pivot=arr[high];
         int i=(low-1);
         for(int j=low;j<high;j++){
          if(arr[j]<=pivot){
              i++;
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
              
          }   
         }
         int temp=arr[i+1];
         arr[i+1]=arr[high];
         arr[high]=temp;
         return i+1;
         
         
         
         
         
         
         
        
     }

   
     
    
 
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
