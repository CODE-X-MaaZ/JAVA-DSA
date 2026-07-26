import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ARR_P2 {

    // REVERSING AN ARRAY

//    static void reversing (int[]arr){
//        int n= arr.length;
//        int i=0;
//        int j=n-1; // j ki value equal ho gai lst element in the array
//        while (i<=j){
//
//            // swap
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//
//            //increment i
//            i++;
//
//            // decrement j
//
//            j--; // last se ek ek piche aata jayega
//
//
//        }
//        for (int val:arr){
//            System.out.println(val);
//        }
    // }


    // SHIFT THE POSITION BY ONE

//    static int[] shiftBy1(int [] arr){
//        int n=arr.length;
//        int temp=arr[n-1];
//
//        for (int i=n-1;i>0;i--){
//            arr[i]=arr[i-1];
//        }
//        arr[0]=temp;
//
//        return arr;
//    }

    // GET MOD

//    static int getMod(int[]arr) {
//        HashMap<Integer, Integer> freq = new HashMap<>();
//        for (int num : arr) {
//            freq.put(num, freq.getOrDefault(num, 0) + 1); // agar num ki value hai hashmap to vo value ko plus one karega ya to zero plus one karega
//        }
////
////            for (int f:freq.keySet()){
////               System.out.println(f+" -> "+freq.get(f));
////           }
//
//        int maxFreq = -1; // it can  store the highest int value
//        int maxFreqKiKey = -1;
//        for (int key : freq.keySet()) {
//            int currentKey = key;
//            int currentKeyKiFreq = freq.get(key);
//            if (currentKeyKiFreq > maxFreq) {
//                maxFreq = currentKeyKiFreq;
//                maxFreqKiKey = currentKey;
//            }
//
//        }
//        return maxFreqKiKey;
//    }


    // GET HIGHEST AND LOWEST FREQUENCY

//    static int[] getHighestAndLowest(int[]arr){
//
//        HashMap<Integer,Integer> freq=new HashMap<>();
//        for (int v:arr){
//            freq.put(v, freq.getOrDefault(v,0)+1);
//        }
//                // highest value
//        int HighestF=Integer.MIN_VALUE;
//        int HighestK=-1;
//        for (int key:freq.keySet()){
//            int currentKey =key;
//            int currentF=freq.get(key);
//
//            if(currentF>HighestF){
//                HighestF=currentF;
//                HighestK=currentKey;
//            }
//        }
            // lowest value
//        int LowestF=Integer.MAX_VALUE;
//        int LowestK=-1;
//        for (int key:freq.keySet()){
//            int currentK=key;
//            int currentF=freq.get(key);
//            if(currentF<LowestF){
//                LowestF=currentF;
//                LowestK=currentK;
//            }
//        }
//        int ans[]={HighestK,LowestK};
//        return ans;
//
//
//
//    }


            // HW QUESTIONS

//    static void shiftByK(int[]arr,int k) {
//
//    // store the last k number of elements in array
//        int n=arr.length;
//        int[] brr = new int[k];
//        int j=0;
//        for (int i=n-k;i<n;i++){
//            brr[j++]=arr[i];
//        }
////        for (int v:brr){
////            System.out.println(v);
////        }
//
//        // shift the array elements by k position
//
//        for (int i=n-k;i<n;i++){
//
//        }
//
//
//
//    }

        // UNION OF THE ARRAY

    static void union(int arr[], int brr[]){

        HashSet<Integer> set=new HashSet<>();
        for (int v:arr){
            set.add(v);
        }
        for (int v:brr){
            set.add(v);
        }
        System.out.println(set);



    }



    static void main() {

        int[] arr = {1,1,1, 2, 3};
        int[] brr={1,34,5,};

        // q1
        // reversing(arr);

        //Q2

//        int ans[]=shiftBy1(arr);
//        for (int a:ans){
//            System.out.println(a);
//        }

        //  QUESTION 3 IS PART ONES LAST QUESTION

        // Q4

       // System.out.println( getMod(arr));

        // Q5

//        int ans[]=getHighestAndLowest(arr);
//        System.out.println("HIGHEST "+ans[0]);
//        System.out.println("LOWEST "+ans[1]);

        // Q1(hw)

      // shiftByK(arr,2);


        // q2

        union(arr,brr);




    }
}


