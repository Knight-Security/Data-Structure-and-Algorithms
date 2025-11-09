public class BinarySearch{
    public static int binary_search(int []array,int target){
        int low=0;
        int high=array.length-1;
        int mid=-1;
        while(low<=high){
            mid=(low+high)/2;
            if(array[mid]==target){
                return mid;
            }
            if(array[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return mid;
    }
}