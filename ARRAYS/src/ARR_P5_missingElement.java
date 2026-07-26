import java.util.ArrayList;
import java.util.List;
//
//
//Given an array nums containing n integers where some elements may be duplicated and the
//integers are supposed to be in the range 1 to n , your task is to return the list of integers that are
//missing from the array.
//
//the size of the array is n , and each integer in the array is between 1 and n inclusive.

public class ARR_P5_missingElement {

    static List<Integer> missingElement(int []nums){

        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        for (int index=0;index<n;index++){
            int value=Math.abs(nums[index]);
            int posi=value-1;
            if(nums[posi]>0){
                nums[posi]=-nums[posi];
            }
        }
        for (int i=0;i<n;i++){
            if (nums[i]>0){
              int th= i+1;
              ans.add(th);
            }
        }
        return ans;

    }

    static void main() {

        int ans[]={1,1,1,2,5};
        List<Integer> an=missingElement(ans);
        System.out.println(an);

    }
}
