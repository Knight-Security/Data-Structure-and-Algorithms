public class LinearSearch{
    public static int linear_search(int []array,int target){
        int index=-1;
        for(int i=0;i<=array.length-1;i++){
            if(array[i]==target){
                index=i;
            }
            
        }
        return index;
    }
}