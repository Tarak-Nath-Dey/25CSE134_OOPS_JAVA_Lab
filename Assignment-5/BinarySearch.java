import java.util.*;
class BinarySearch {
	public static void main(String[] args){
		int size,ele;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.printf("Enter the element at index %d : ",i);
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.print("Enter the element to search: ");
		ele=sc.nextInt();
		int low=0,high=size-1,mid,pos=-1;
		
		while(low<=high){
			mid=(low+high)/2;
			if(ele<a[mid]){
				high=mid-1;
			}else if(ele>a[mid]){
				low=mid+1;
			}else if(ele==a[mid]){
				pos=mid;
				break;
			}
		}
		if(pos==-1){
			System.out.printf("%d not found in the array",ele);
		}else{
			System.out.printf("%d was found in the array",ele);
		}
	}
}
