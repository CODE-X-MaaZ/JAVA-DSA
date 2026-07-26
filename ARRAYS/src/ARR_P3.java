public class ARR_P3 {

    // Q1) SORT THE ARRAY OF 0S AND ONE'S (using 2 pointer)

    static int[] sort(int[] arr){

        int n=arr.length;
        int i=0;
        int j=n-1;

        while (i<j){

            // agar i ki value 1 hai aur j ki value 0 hai to swap
            if(arr[i]==1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
            }

            // agar i ki value 0 hai to

            if(arr[i]==0){
                i++;
            }

            if(arr[j]==1){
                j--;
            }
        }
            return arr;
    }

    static int missingElement(int []arr){
        // xorsum with all array elements
        int xorSum=0;
        for (int v:arr){
            xorSum=xorSum ^ v;
        }
        // xor each element in range with xor
        int n=arr.length;
        for (int i=0;i<=n;i++){
            xorSum=xorSum ^ i;

        }
        return xorSum;
    }

    // find the single coming element in an array

    static int single(int []arr){
        int xorSum=0;

        for (int v:arr){
            xorSum ^=v;
        }
        return xorSum;

    }

    static void main() {

        //q1

//        int []arr={1,1,1,0,0,1,0};
//        int []ans=sort(arr);
//        for(int i:ans){
//            System.out.println(i);
//        }

        //q2

//        int []arr={0,1,2,3,4,5,7};
//        System.out.println(missingElement(arr));

        //q3

        int []arr={1,1,2,2,3,3,4,5,5,6,6,7,7,};

        System.out.println(single(arr));






    }


}
