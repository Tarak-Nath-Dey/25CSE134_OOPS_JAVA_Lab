import java.util.*;

public class average {
	public static void main(String[] args){
		int size,sum=0;
		float avg=0.0f;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.printf("Enter the element at index %d : ",i);
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			sum+=arr[i];
		}
		avg=sum*1.0f/size;
		System.out.println("Average value: "+avg);
	}
}
