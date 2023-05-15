public class Main {
    public static int stringNum( String datas){
        int answer=0;
        String newString = "";
        for (int i=datas.length()-1; i>=0; i--){
            newString += datas.charAt(i);
        }
        for(int i=0; i<datas.length(); i++){
            if (datas.charAt(i)==newString.charAt(i)){
                answer++;
            }
        }
        return answer/2;
    }
    public static void main(String[] args) {

        /// ParseInt Method

//        String a = "12";
//        String b = "13";
//        String sum = a+b;
//        System.out.println(sum);
//        int a1 = Integer.parseInt(a);
//        int a2 = Integer.parseInt(b);
//        int summ= a1+a2;
//        System.out.println(summ);

        /// toString Method

//        int number = 123;
//        String str = Integer.toString(number);
//        System.out.println(str.length());
//        System.out.println(2+0+1+6+2+0+1+6+"Jan"+(8+2));

        String datas = "ApPidpodPea";
        int ret=stringNum(datas);
        System.out.println(ret);
    }
}