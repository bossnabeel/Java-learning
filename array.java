import java.util.Scanner;

public class array{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for ( int i=0; i<n; i++){
            System.out.println("Enter ur element no "+(i+1)+" : ");
            arr[i]=scanner.nextInt();
        }
        int sum=0;
        for (int i:arr){
            sum+=i;
        }
        int max=arr[0], min=arr[0];
        for(int i:arr){
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
        }
        System.out.println("sum of array : "+sum+" max : "+max+" min : "+min);
        scanner.close();
    }
}