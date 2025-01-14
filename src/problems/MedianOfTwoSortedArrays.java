package problems;

public class MedianOfTwoSortedArrays {

    private MedianOfTwoSortedArrays() {
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length == 0) {
            if (nums2.length % 2 != 0) {
                return nums2[nums2.length / 2];
            } else {
                return ((double) (nums2[nums2.length / 2 - 1] + nums2[nums2.length / 2]) / 2);
            }
        }
        if (nums2.length == 0) {
            if (nums1.length % 2 != 0) {
                return nums1[nums1.length / 2];
            } else {
                return ((double) (nums1[nums1.length / 2 - 1] + nums1[nums1.length / 2]) / 2);
            }
        }
        int[] arr = new int[nums1.length + nums2.length];

        int index = 0;
        int index1 = 0;
        int index2 = 0;
        int length = arr.length;
        boolean active1 = true;
        boolean active2 = true;
        while (index < length) {
            if ((nums1[index1] <= nums2[index2]) && active1) {
                arr[index] = nums1[index1];
                if (index1 < nums1.length - 1) {
                    index1++;
                } else {
                    active1 = false;
                }
            } else if ((nums1[index1] > nums2[index2]) && active2) {
                arr[index] = nums2[index2];
                if (index2 < nums2.length - 1) {
                    index2++;
                } else {
                    active2 = false;
                }
            } else if (!active1) {
                arr[index] = nums2[index2];
                if (index2 < nums2.length - 1) {
                    index2++;
                }
            } else if (!active2) {
                arr[index] = nums1[index1];
                if (index1 < nums1.length - 1) {
                    index1++;
                }
            }
            index ++;
        }
        if (length % 2 != 0) {
            return arr[length / 2];
        } else {
            return (double) (arr[length / 2 - 1] + arr[length / 2 ]) / 2;
        }
    }
}
