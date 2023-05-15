public class Rekurshion {
    //    public static void numSum(int i,int n, int sum){
//        if(i==n){
//            sum=sum+i;
//            System.out.println(sum);
//            return;
//        }
//        sum = sum+i;
//        numSum(i+1,n, sum);
//    }
//    public static int xPower(int x,int n){
//        if(n==0){
//            return 1;
//        }
//        if (x==0){
//            return 0;
//        }
//        int xPow_nm1=xPower(x, n-1);
//        int xPow=x * xPow_nm1;
//        return xPow;
//    }
//    public static void revString(String str, int x){
//        if (x==str.length()+1){
//            return;
//        }
//        System.out.print(str.charAt(str.length()-x));
//        revString(str, x+1);
//    }
//    public static int first = -1;
//    public static int last = -1;
//
//    public static void getIndices(String str, char el, int idx) {
//        if (idx == str.length()) {
//            System.out.println("First occurence : " + first);
//            System.out.println("Last occurence : " + last);
//            return;
//        }
//        if (str.charAt(idx) == el) {
//            if (first == -1) {
//                first = idx;
//            } else {
//                last = idx;
//            }
//        }
//        getIndices(str, el, idx + 1);
//}
    public static void checkArr(int[] arr, int i){
        if(arr.length == i+1){
            System.out.println("Sorted");
            return;
        }
        if(arr[i]>=arr[i+1]){
            System.out.println("Not sorted");
            return;
        }
        checkArr(arr, i+1);
    }
        public static void main (String[] args){
            int[] arr = {1,2,3,4,4};
            int i=0;
            checkArr(arr,i);
        }
    }