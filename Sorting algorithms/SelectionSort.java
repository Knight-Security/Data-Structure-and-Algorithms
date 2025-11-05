public class SelectionSort{
     public static int []selection_sort(int []array){
         for(int i=0;i<array.length-1;i++){
             int min =i;
             for(int j=i;j<array.length;j++){
                if(array[j]<array[min]){
                    min=j;
            }
         }
            if(i!=min){
                int temp=array[i];
                array[i]=array[min];
                array[min]=temp;
            }
             
         }
         return array;

    }
}