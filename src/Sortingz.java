public class Sortingz {
    public static void main(String[] args) {

        //---Bubble sort---// Ascending Order

        int arr[] = {2, 9, 7, 5, 4};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                // Condition Check
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // Printing the array
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        //---Bubble sort---// Descending Order

//        int arr[] = {1, 2, 9, 7, 5, 4};
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                // Condition Check Changed for Descending order
//                if (arr[j] < arr[j + 1]) {
//                    // swap
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        // Printing the array
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        //---Selection Sort---//

//        int arr[]={2,5,3,9,8};
//        for(int i=0; i< arr.length-1; i++){
//            int smallest=i;
//            for(int j=i+1; j< arr.length;j++){
//                if(arr[smallest] > arr[j]){
//                    smallest=j;
//                }
//            }
//            int temp= arr[smallest];
//            arr[smallest]=arr[i];
//            arr[i]=temp;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        int arr[] = {2, 5, 3, 9, 8};
//
//        for (int i = 1; i < arr.length; i++) {
//            int current = arr[i];
//            int j = i - 1;
//            while (j >= 0 && arr[j] > current) {
//                //Keep swapping
//                arr[j + 1] = arr[j];
//                j--;
//            }
//            arr[j + 1] = current;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
        }
    }
