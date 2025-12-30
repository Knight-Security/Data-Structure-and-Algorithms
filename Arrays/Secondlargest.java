
import java.util.*;
public class Secondlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraysize=sc.nextInt();
        int maxelement=0;
        int second_max_element=0;
        int []a=new int[arraysize];
        System.out.println("Enter the elements of array:- ");
        for(int i=0;i<arraysize;i++){
            a[i]= sc.nextInt();
        }
        for(int i=0;i<arraysize;i++){
            if(a[maxelement]<a[i]){
                second_max_element=maxelement;
                maxelement=i;
            }
            else if(a[second_max_element]<a[i] && a[i] != a[maxelement]){
                second_max_element=i;
            }
        }
        System.out.println(a[second_max_element]);

    }
}