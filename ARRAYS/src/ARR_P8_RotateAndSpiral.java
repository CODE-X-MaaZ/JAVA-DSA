import java.util.ArrayList;
import java.util.List;

public class ARR_P8_RotateAndSpiral {

    // Q1> rotate a matrix to 90 degree // arr is given array // n is number of rows and columns
    static int[][] rotateClockWise(int [][]arr,int n){
        // step1 : transpose of a matrix
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        // step reverse an array
        for (int i=0;i<n;i++){
            // entered in new row
            int startCol=0;
            int endCol=n-1;
            while (startCol<=endCol){
                int temp=arr[i][startCol];
                arr[i][startCol]=arr[i][endCol];
                arr[i][endCol]=temp;
                endCol--;
                startCol++;
            }
        }
        return arr;

    }

    // q2 ) printing a spiral matrix of an array

    static List<Integer> spiralMatrixPrinting(int arr [][]){

        int m=arr.length;
        int n=arr[0].length;
        List<Integer> result=new ArrayList<>();

        int startingRow=0;
        int endingRow=m-1;
        int startingCol=0;
        int endingCol=n-1;

        while(startingRow<=endingRow && startingCol<=endingCol){

            // row wise left to right -> starting row print karni hai , form stating col to ending col
            for (int col = startingCol; col <=endingCol; col++){
                result.add(arr[startingRow][col]);
            }
            startingRow++;

            // col wise top to bottom -> ending col print karna hai -> from starting row to ending row

            for (int row=startingRow;row<=endingRow;row++){
                result.add(arr[row][endingCol]);
            }
            endingCol--;

            // row wise right to left -> ending row print karna hai -> from ending col to starting col
            if(startingRow<=endingRow) { // in case of only one row
                for (int col = endingCol; col >= startingCol; col--) {
                    result.add(arr[endingRow][col]);
                }
                endingRow--;
            }


            if(startingCol<=endingCol){
                for (int row=endingRow;row>=startingRow;row--){
                    result.add(arr[row][startingCol]);

                }
                startingCol++;
            }
        }
        return result;

    }

    static void main() {

        // Q1
//        int [][]arr={{1,2,3}
//                    ,{2,3,4},
//                    {5,6,7}};
//        int [][] ans=rotateClockWise(arr,3);
//        int n=ans.length;
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                System.out.print(" "+ans[i][j]);
//            }
//            System.out.println();
//        }
        // o/p
//        5 2 1
//        6 3 2
//        7 4 3

        // Q2

        int [][]arr={{1,2,3}
                ,{2,3,4},
                {5,6,7}};

        System.out.println(spiralMatrixPrinting(arr));

        // o/p
        // [1, 2, 3, 4, 7, 6, 5, 2, 3]


    }
}
