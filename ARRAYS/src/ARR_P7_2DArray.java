import java.util.ArrayList;
import java.util.List;

public class ARR_P7_2DArray {

    // Q1) Print the sum of 2D array cols wise

//    static List<Integer> Sum2D(int[][]arr){
//        List<Integer> result=new ArrayList<>();
//        int m=arr.length;
//        int n=arr[0].length;
//        for (int row=0;row<m;row++){
//            int sum=0;
//            for (int col=0;col<n;col++){
//                sum=sum+arr[row][col];
//            }
//            result.add(sum);
//
//        }
//    return result;
//    }

    // Q2) Print the sum of 2D array row wise

//    static List<Integer> Sum2D_row(int[][]arr){
//        List<Integer> result=new ArrayList<>();
//        int m=arr.length;
//        int n=arr[0].length;
//        for (int col=0;col<m;col++){
//            int sum=0;
//            for (int row=0;row<n;row++){
//                sum=sum+arr[row][col];
//            }
//            result.add(sum);
//
//        }
//        return result;
//    }

    // Q3) wave sum of 2D array

    static List<Integer> wavePrinting(int [][]arr, int m, int n){
        List<Integer> result =new ArrayList<>();
        for (int col=0;col<n;col++){
            if((col & 1)==0){
                for (int row=0;row<m;row++){
                    result.add(arr[row][col]);
                }
            }
            else {
                for (int row=m-1;row<=0;row--){
                    result.add(arr[row][col]);
                }
            }
        }
        return result;
    }

    // Transpose of a matrix

    static int [][] transpose(int [][] arr){

        // original matrix
        int totalRows=arr.length;
        int totalCols=arr[0].length;

        // transpose
        int newTotalRows=totalCols;
        int newTotalCols=totalRows;

        int ans[][]=new int[newTotalRows][newTotalCols];

        if(arr==null || arr.length==0){
            return new int[0][0];
        }

        for (int i=0;i<totalRows;i++){
            for (int j=0;j<totalCols;j++){
                ans[j][i]=arr[i][j];
            }
        }
        return ans;
    }

    static void main() {
        // Q1

//        int [][] arr={
//                    {12,3,4},
//                    {2,3,4},
//                    {2,4,7}
//        };
//        System.out.println(Sum2D(arr));

        //Q2

//        int [][] arr={
//                {12,3,4},
//                {2,3,4},
//                {2,4,7}
//        };
//        System.out.println(Sum2D_row(arr));

        //Q3

//        int [][] arr={
//                {12,3,4},
//                {2,3,4},
//                {2,4,7}
//        };
//        System.out.println(wavePrinting(arr ,3,3));

        //Q4

        int [][] arr={
                {12,3,4},
                {2,3,4},

        };

        int ans[][]=transpose(arr);

        for (int i=0;i<ans.length;i++){
            for (int j=0;j<ans[0].length;j++){
                System.out.print(" "+ans[i][j]);
            }
            System.out.println();

        }

    }
}
