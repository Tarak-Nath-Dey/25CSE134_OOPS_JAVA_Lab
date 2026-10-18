import java.util.*;
class DuplicateValues {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter the element at index %d : ", i);
            arr[i] = sc.nextInt();
        }

        System.out.print("Input Array: [");
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+",");
		}
        System.out.println("]");

        for (int i = 0; i < size; i++) {
            boolean alreadyChecked = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    alreadyChecked = true;
                    break;
                }
            }

            if (alreadyChecked) {
                continue;
            }

            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate Element : " + arr[i]);
                    break;
                }
            }
        }
        sc.close();
    }
}