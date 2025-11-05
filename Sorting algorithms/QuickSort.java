public class QuickSort{
    public static int partition(int []a,int lb,int ub){
        int start=lb;
        int end=ub;
        int pivot=a[lb];
        while(start<end){
            while(a[start]<=pivot){
                start++;
            }
            while(a[end]>pivot){
                end--;
            }
            if(start<end){
                int temp=a[start];
                a[start]=a[end];
                a[end]=temp;
            }
        }
        int temp=a[lb];
        a[lb]=a[end];
        a[end]=temp;
        return end;
    }
    public static int []quicksort(int []a,int lb,int ub){
        if(lb<ub){
        int bound=partition(a,lb,ub);
        quicksort(a,lb,bound-1);
        quicksort(a,bound+1,ub);
        }
        return a;
        
    }
}