public class ARR_P9_sortingAlgos {

    // BUBBLE SORT

    static void bubbleSort(int arr[]){
        for(int i=0;i< arr.length-1;i++){  // rounds
            for (int j=0;j< arr.length-1-i;j++){// to sort neighboring elements
                if(arr[j]>=arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
    }

    // SELECTION SORT

    static void selectionSort(int arr[]){
        int n= arr.length;
        for (int i=0;i <n-1;i++){ // rounds
            int minval=i; // each round min val is set to be i
            for (int j=i+1;j<n;j++ ){ // j will reach end of array in each round
                if(arr[minval]>arr[j]){
                    minval=j; // updating the min value

                }
            }
            int temp=arr[i]; // swaping the min value with the i index value
            arr[i]=arr[minval];
            arr[minval]=temp;
        }
    }

    // INSERTION SORT

    static void insertionSort(int arr[]){

        int n= arr.length;
        for (int i=1;i<n;i++){
            int current=i;
            int prev=i-1;
            int currentVal=arr[i];
            while (prev>=0 && currentVal<arr[prev]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=currentVal;
        }
    }



    static void main() {

        // BUBBLE SORT
//        int arr[]={6,4,2,1,7,8,2};
//        bubbleSort(arr);
//        for (int v:arr){
//            System.out.println(v);

        // SELECTION SORT
//        int arr[]={6,4,2,1,7,8,2};
//        selectionSort(arr);
//        for (int v:arr){
//            System.out.println(v);
//        }

        //INSERTION SORT

        int arr[]={6,4,2,1,7,8,2};
        insertionSort(arr);
        for (int v:arr){
            System.out.println(v);
        }
    }
}
