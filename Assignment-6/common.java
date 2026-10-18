import java.util.*;
class common {
    static void display(String arr[],int size){
        for(int i=0;i<size;i++){
			System.out.print(arr[i]+",");
		}
    }
    public static void main(String[] args) {
        int size1,size2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array 1 :");
        size1=sc.nextInt();
        String arr1[]=new String[size1];
        for(int i=0;i<size1;i++){
			System.out.printf("Enter the element at index %d : ",i);
			arr1[i]=sc.next();
		}
        System.out.print("Enter the size of Array 2 :");
        size2=sc.nextInt();
        String arr2[]=new String[size2];
        for(int i=0;i<size2;i++){
			System.out.printf("Enter the element at index %d : ",i);
			arr2[i]=sc.next();
		}
        String arr3[]=new String[size1];
        int k=0;
        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                if(arr1[i].equals(arr2[j])){
                    arr3[k++]=arr1[i];
                }
            }
        }

        System.out.print("Array 1: [");
        display(arr1,size1);
        System.out.println("]");

        System.out.print("Array 2: [");
        display(arr2,size2);
        System.out.println("]");
        
        System.out.print("Common element is: [");
        display(arr3,k);
        System.out.println("]");
    }
}
