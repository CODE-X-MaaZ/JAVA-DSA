public class ARR_P1 {

    // FIND THE AVG OF ARRAY ELEMENTS

//    static double getAvg(int[] arr){
//        double sum=0;
//        for(int val:arr){
//            sum+=val;
//        }
//        int len=arr.length;
//        double avg=sum/len;
//
//        return avg;
//    }

    // MULTIPLY EACH ELEMENT OF ARRAY BY 10

//    static int[] mulByTen(int [] arr){
//
//        int n=arr.length;
//        int brr[] = new int[n];
//
//        for (int i=0;i<n;i++){
//
//            int ele=arr[i];
//            int newEle=ele*10;
//            brr[i]=newEle;
//
//        }
//        return brr;
//    }

    // FIND THE TARGET ELEMENT INSIDE THE ARRAY (LINEAR SEARCH)

//    static boolean target(int n,int arr[]) {
//        for (int value : arr) {
//            if (value == n) {
//                return true;
//            }
//        }
//        return false;
//    }

    // MAX ELEMENT INSIDE THE ARRAY

              // METHOD 1

//    static int max(int arr[]){
//        int max=arr[0];
//        for (int val:arr){
//            if (val>max){
//                max=val;
//            }
//
//        }
//        return max;
//    }

              // METHOD 2 (using Math.max())

//    static int max(int arr[]){
//        int max=arr[0];
//
//        for(int i=1;i<arr.length;i++){
//             max=Math.max(max,arr[i]);
//        }
//        return max;
//
//    }

    // RETURN THE SUM OF POSITIVE AND NEGATIVE NUMBERS


//    static int[] sumPN(int []arr){
//        int positiveNum=0;
//        int negativeNum=0;
//
//        for(int val:arr){
//
//            if (val>0){
//                positiveNum+=val;
//            }
//            else {
//                negativeNum+=val;
//            }
//        }
//        int ans[]={positiveNum,negativeNum};
//        return ans;
//    }

    // RETURN THE COUNT OF NUMBER OF ZEROS AND ONES

//    static int[] zerosNones(int []arr) {
//        int zeros = 0;
//        int ones = 0;
//
//        for (int val : arr) {
//            if (val == 0) {
//                zeros += 1;
//            } else if (val == 1) {
//
//                ones += 1;
//            }
//        }
//        int []ans={ones,zeros};
//        return ans;
//
//
//    }

    // FIND THE UNSORTED ELEMENT IN THE ARRAY

//    static int unsorted(int []arr){
//
//        int n=arr.length;
//        for(int i=0;i<n; ++i){
//            if(arr[i+1]<=arr[i]){
//                return arr[i+1];
//            }
//        }
//        return -1;
//    }


            // HW

    // SWAP ALTERNATE ELEMENTS IN THE ARRAY

//    static int [] swapAlternate(int[]arr){
//
//        int n=arr.length;
//
//
//        for (int i=0;i<n;i+=2){
//           int temp=arr[i];
//           arr[i]=arr[i+1];
//           arr[i+1]=temp;
//        }
//        return arr;
//
//    }

    // PRINT  COMMON ARRAY INTERSECTION ELEMENT

//    static void ArrayIntersection(int[]arr, int[]brr){
//        for (int i=0;i<arr.length;i++){
//
//            for (int j=0;j<brr.length;j++){
//
//                if(arr[i]==brr[j]){
//                    System.out.println(arr[i]);
//
//                }
//            }
//
//        }
//
//
//    }

    // PRINT ALTERNATE EXTREME ELEMENTS OF AN ARRAY

    static void alternateExtreme(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i<=n){
            if(i==j){
                System.out.println(arr[i]);
                return;
            }
            else {
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }
        }




    }




    static void main() {

        // Q1

        //int [] arr={1,2,3,4};
       // System.out.println(getAvg(arr));

        // Q2

//        int [] arr={1,2,3,4};
//        int[] ans=mulByTen(arr);
//        System.out.println();
//        for (int val:ans){
//            System.out.println(val);
//        }

        //Q3

//        int [] arr={11,233,3,42};
//        System.out.println(target(4,arr));

        //Q4

//        int [] arr={1188,233,3,42};
//        System.out.println(max(arr));

//        int [] arr={1,-2,3,1,-5,3,-5};
//        int [] ans=sumPN(arr);
//        System.out.println("The positive sum ="+ans[0]);
//        System.out.println("The negative sum ="+ans[1]);


//        int [] arr={1,0,0,1,0,54,77,1,0,0};
//        int[]ans=zerosNones(arr);
//
//        System.out.println("THE NUMBER OF ONE'S PRESENT ="+ans[0]);
//        System.out.println("THE NUMBER OF ZERO'S PRESENT ="+ans[1]);

//        int []arr={1,2,3,4,5,6,8,2,3,9,10};
//
//        System.out.println("THE UNSORTED ELEMENT IS :"+unsorted(arr));


        // HW

//        int [] arr ={1,2,3,4,5,6};
//        int []ans =swapAlternate(arr);
//        for (int val:ans){
//            System.out.println(val);
//        }


//        int []arr={1,2,3,4,5,6,7};
//        int[]brr={10,20,30,40,50,4,5,};
//
//         ArrayIntersection(arr,brr);


        int []arr={1,2,3,4,5,6,7};
        alternateExtreme(arr);






    }
}
