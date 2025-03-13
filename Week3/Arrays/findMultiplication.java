class Solution {
    public long findMultiplication(int[] arr1, int[] arr2) {
        int max1 = Integer.MIN_VALUE;
        int num;
        for (num=0;num<arr1.length;num++) {
            if (arr1[num] > max1) {
                max1 = arr1[num];
            }
        }

        int min2 = Integer.MAX_VALUE;
        for (num=0;num<arr2.length;num++) {
            if (arr2[num] < min2) {
                min2 = arr2[num];
            }
        }

        return max1 * min2;
    }

    }
