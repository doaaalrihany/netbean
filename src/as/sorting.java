
package as;


public class sorting {
    //selsction sort
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
 
     //insertion sort
  public static void insertionsort(int[]arr){
      int n=arr.length;
      for (int i=1;i<n;++i){
          int kay=arr[i];
          int j = i-1;
          while (j>=0&&arr[j]>kay){
              arr[j+1]=arr[j];
              j=j-1;
              
          }
          arr[j+1]=kay;
          
      }
  }
 
   //Bubble sort
  public static void bubblesort(int[]arr){
      int n=arr.length;
      for (int i=0;i<n-1;i++){
          for(int j=0;j<n-i-1;j++){
              if(arr[j]>arr[i]+1){
                  int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                  
              }
          }
      }
          
  }
 
   //merge sort
  public static void mergesort(int []arr, int l,int r){
      if(l<r){
          int m = l+(r-l)/2;
          mergesort(arr,l,m);
          mergesort(arr,m+1,r);
          merge(arr,l,m,r);
          
      }
      
  }
   
  public static void merge(int[]arr,int l, int m, int r){
      int n1=m-l+1;
      int n2=r-m;
      int[]L=new int[n1];
      int[]R=new int[n2];
      
      for(int i=0;i<n1;++i)  L[i]=arr[l+i];
       for(int j=0;j<n2;++j) R[j]=arr[m+1+j];
       
       int i=0,j=0,k=l;
       while(i<n1&&j<n2){
           if(L[i]<=R[j]){
            arr[k]=L[i]; 
            i++;
           }
           else {
               arr[k]=R[j];
               j++;   
       }
           k++;
    }        
      while (i<n1){
          arr[k]=L[i];
          i++;
          k++;
      } 
      while (j<n2){
          arr[k]=R[j];
          j++;
          k++;
          
                  
      }
  }

//     //Quick sort
//  public static void quicksort(int[]arr ,int low ,int high){
//      if (low < high){
//          int pi=partition(arr,low,high);
//          quicksort (arr,low,pi-1);
//           quicksort (arr,pi+1,high);
//           
//      }
//  }
     
    
  
  
  
  
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
