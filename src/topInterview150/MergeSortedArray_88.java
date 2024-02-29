package topInterview150;

public class MergeSortedArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int fullSize = m+n;
        int i =0;
        while(n!= 0 ){
            if(m==0){
                nums1= new int[n];
                nums1[0]=nums2[0];
                n=0;
            }
            else if (nums2[n-1]>=nums1[m-1]){
                nums1[fullSize-1-i]=nums2[n-1];
                n--;
            }else {
                nums1[fullSize-1-i]=nums1[m-1];
                m--;
            }
            i++;
        }
        //we still have a problem and test
    }
}
