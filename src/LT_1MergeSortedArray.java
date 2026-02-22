import java.util.Arrays;

public class LT_1MergeSortedArray {
    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0},nums2[] = {1,5,6};
        int m = 3, n = 3;
        merge(nums1,m,nums2,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int res[]=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                res[k++]=nums1[i++];
            }else if(nums2[j]<nums1[i]){
                res[k++]=nums2[j++];
            }
        }
        while (j<n){
            res[k++]=nums2[j++];
        }
        while (i<m){
            res[k++]=nums1[i++];
        }
        for (int l = 0; l < res.length; l++) {
            nums1[l]=res[l];
        }
    }
}