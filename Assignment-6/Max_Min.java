import java.util.*;
class Max_Min {
	public static void main(String args[]){
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.printf("Enter the element at index %d : ",i);
			arr[i]=sc.nextInt();
		}
		int max=arr[0],min=arr[0];
		for(int i=1;i<size;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.print("Input Array: [");
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println("]");
		System.out.println("Maximum value for the above array="+max);
		System.out.println("Minimum value for the above array="+min);
        sc.close();
	}
}
