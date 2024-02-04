package topInterview150;

import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;

public class RemoveElementTest_27 {
    RemoveElement_27 remover = new RemoveElement_27();
    @Test
    public void testRemoveElement1() {
        int[] input = {3, 2, 2, 3};
        int inputNum = 3;
        int[] expected = {2, 2};

        int actual = remover.removeElement(input, inputNum);

        Assert.assertEquals(expected.length, actual);

        Arrays.sort(input,0,actual);
        Arrays.sort(expected,0,expected.length);
        for (int i = 0; i < actual; i++) {
            Assert.assertEquals(expected[i], input[i]);
        }
    }

    @Test
    public void testRemoveElement2() {
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int[] expectedNums2 = {0, 1, 4, 0, 3};


        int k2 = remover.removeElement(nums2, val2);

        Assert.assertEquals(expectedNums2.length, k2);
        Arrays.sort(nums2,0,k2);
        Arrays.sort(expectedNums2,0,expectedNums2.length);
        for (int i = 0; i < k2; i++) {
            Assert.assertEquals(expectedNums2[i], nums2[i]);
        }
    }

    @Test
    public void testRemoveElement3() {
        int[] input = {1};
        int inputNum = 1;
        int[] expected = {};

        int actual = remover.removeElement(input, inputNum);

        Assert.assertEquals(expected.length, actual);
        Arrays.sort(input,0,actual);
        for (int i = 0; i < actual; i++) {
            Assert.assertEquals(expected[i], input[i]);
        }
    }

    @Test
    public void testRemoveElement4() {
        int[] input = {4,4,0,1,0,2};
        int inputNum = 0;
        int[] expected = {4,4,1,2};

        int actual = remover.removeElement(input, inputNum);

        Assert.assertEquals(expected.length, actual);

        Arrays.sort(input,0,actual);
        Arrays.sort(expected,0,expected.length);
        for (int i = 0; i < actual; i++) {
            Assert.assertEquals(expected[i], input[i]);
        }
    }

}
