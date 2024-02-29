import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int l[] = new int[m];
        for(int cont=0; cont<m; cont++)
            l[cont] = nums1[cont];

        int index1 = 0, index2 = 0;

        Boolean finished1=false, finished2=false;

        while(true) {

            if(index1==m)
            {
                finished1 = true;
                break;
            }

            if(index2==n)
            {
                finished2 = true;
                break;
            }

            if(l[index1] <= nums2[index2]) {
                nums1[index1+index2] = l[index1];
                index1++;
            } else {
                nums1[index1+index2] = nums2[index2];
                index2++;
            }
        }

        if(!finished1)
            while(index1 < m) {
                nums1[index1+index2] = l[index1];
                index1++;
            }

        if(!finished2)
            while(index2 < n) {
                nums1[index1+index2] = nums2[index2];
                index2++;
            }


    }
}


public class Main {
    public static void main(String[] args) {

        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n=3;

        Solution s = new Solution();
        s.merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));

    }
}