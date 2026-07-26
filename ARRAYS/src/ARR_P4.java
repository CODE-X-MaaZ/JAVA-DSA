import java.util.HashMap;

public class ARR_P4 {

    // TWO SUM

//     static int[] twoSum(int arr[],int target){
//
//        int n=arr.length;
//        for (int i=0;i<=n-2;i++){
//            for (int j=1;j<n-1;j++){
//                if (arr[i]+arr[j]==target){
//                    int ans[]={i,j};
//                    return ans;
//                }
//            }
//        }
//        int ans[]={};
//        return ans;
//
//    }

    // THREE SUM
//
//    static int[] threeSum(int arr[],int target){
//         int n=arr.length;
//         for (int i=0;i<=n-3;i++){
//             for (int j=1;j<=n-2;j++){
//                 for (int z=2;z<=n-1;z++){
//                     if (arr[i] + arr[j]+arr[z]==target) {
//                         int ans[]={i,j,z};
//                         return ans;
//
//                     }
//                 }
//             }
//         }
//         int ans[]={};
//        return ans;
//    }

    // REMOVE DUPLICATES

            // METHOD 1


//    static ArrayList<Integer> removeDuplicates(int arr[]){
//        HashMap<Integer,Integer> mp=new HashMap<>();
//        for (int v:arr){
//            mp.put(v,mp.getOrDefault(v,0)+1);
//        }
//        ArrayList<Integer> a=new ArrayList<>();
//        for (int v:mp.keySet()){
//            a.add(v);
//        }
//        return a;
//
//    }

    // METHOD 2

    // return the length of the array which is not duplicated
//
//    static int removeDuplicates(int[]ar){
//         int i=0;
//         int j=1;
//         int n=ar.length;
//         while (j<n){
//             //match value
//             if(ar[i]==ar[j]){
//                 j++;
//             }
//             //no match
//             else {
//                 i++;
//                 ar[i]=ar[j];
//                 j++;
//             }
//
//         }
//         return i+1;
//    }

    // FIND THE FIRST REPEATING ELEMENT

                // method 1
//
//    static int repeatingElement(int arr []){
//
//         int n=arr.length;
//         for (int i=0;i<n-1;i++){
//             for (int j=1;j<n;j++){
//                 if(arr[i]==arr[j]){
//                     return arr[i];
//                 }
//             }
//         }
//         return 0;
//     }


            // method 2

//    static int repeatingElement(int[]arr){
//         HashMap<Integer,Integer> freq=new HashMap<>();
//         for (int v:arr){
//             freq.put(v,freq.getOrDefault(v,0)+1);
//         }
//         for (int j:arr){
//             if (freq.get(j)>1){
//                 return j;
//             }
//         }
//
//         return -1;
//    }

    // PIVOT INDEX

    static int pivotIndex(int arr[]){
        int n=arr.length;
        int leftSum[]=new int[n];
        int rightSum[]=new int[n];

        leftSum[0]=arr[0];
        for (int i=1;i<n;i++){
            leftSum[i]=leftSum[i-1]+arr[i];
        }


        rightSum[n-1]=arr[n-1];
        for (int i=n-2;i>=0;i--){
            rightSum[i]=rightSum[i+1]+arr[i];
        }
        for (int i=0;i<n;i++){
            if(leftSum[i]==rightSum[i]){
                return i;
            }
        }
        return -1;
    }

   static void main() {

         // TWO SUM Q1 // T.C =O(n^2) S.C=O(1)

//        int arr[]={1,4,5,7,8,6,4};
//        int ans[]=twoSum(arr,10);
//       System.out.println("THE INDEX IS  :"+ans[0]);
//       System.out.println("THE INDEX IS  :"+ans[1]);

       // THREE SUM Q2   // T.C =O(n^3) S.C=O(1)

      // int arr[]={1,4,5,7,8,6,4,4,4,5,5,6,6,7,7,8,8,};
//       int ans[]=threeSum(arr,16);
//       System.out.println("THE INDEX IS  :"+ans[0]);
//       System.out.println("THE INDEX IS  :"+ans[1]);
//       System.out.println("THE INDEX IS  :"+ans[2]);

       // REMOVE DUPLICATES FROM THE ARRAY

                // METHOD 1


//       ArrayList<Integer> ans1 =removeDuplicates(arr);
//       System.out.println(ans1);

              // METHOD 2

      // int arr[]={-20,-20,1,2,2,2,3,4,4}; // expected ans 5

     //  System.out.println(removeDuplicates(arr));
        // FIND THE FIRST REPEATING ELEMENT IN AN ARRAY



       // FIRST REPEATING ELEMENT

            // method 1  T.C =O(n^2) S.C=O(1)

//       int []ans={1,2,3,4,2,3};
//       System.out.println(repeatingElement(ans));

            // method 2

//       int []ans={1,2,3,4,2,3};
//      System.out.println(repeatingElement(ans));



       // PIVOT INDEX

       int[]ans={1,7,3,6,5,6};
       System.out.println(pivotIndex(ans));




    }
 }


