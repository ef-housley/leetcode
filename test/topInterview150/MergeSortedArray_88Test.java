package topInterview150;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortedArray_88Test {
    MergeSortedArray_88 merger = new MergeSortedArray_88();
    @Test
    public void merge1() {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n =3;
        int[] expected ={1,2,2,3,5,6};

        merger.merge(nums1,m, nums2, n);

        for (int i = 0; i < m+n; i++) {
            Assert.assertEquals(expected[i], nums1[i]);
        }
    }

    @Test
    public void merge2() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n =0;
        int[] expected ={1};

        merger.merge(nums1,m, nums2, n);

        for (int i = 0; i < m+n; i++) {
            Assert.assertEquals(expected[i], nums1[i]);
        }
    }

    @Test
    public void merge3() {
        int[] nums1 = {};
        int m = 0;
        int[] nums2 = {1};
        int n =1;
        int[] expected ={1};

        merger.merge(nums1,m, nums2, n);

        Assert.assertEquals(expected[0], nums1[0]);
    }
}