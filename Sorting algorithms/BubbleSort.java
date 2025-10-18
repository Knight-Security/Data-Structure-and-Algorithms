public class BubbleSort{
     public static int []bubble_sort(int []arr){
        if(arr==null || arr.length<1){
            return arr;
        }
        for(int i=0;i<arr.length-1;i++){
            int flag=0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }
        return arr;
    }
}