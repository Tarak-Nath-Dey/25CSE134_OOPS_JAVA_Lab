import java.util.*;
class sort {
    static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
    public static void main(String args[]){
        int size,key;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.printf("Enter the element at index %d : ",i);
            arr[i]=sc.nextInt();
        }
        System.out.print("Unsorted array:[");
        display(arr);
        System.out.println("]");
        System.out.println("Sorting the array using Insertion Sort...");
        for(int i=1;i<size;i++){
            key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        System.out.print("Sorted array:[");
        display(arr);
        System.out.println("]");
    }
}
