package com.sukesh.functional.algorithms;

public class MaxAreaInIntegerArray {

    /**
     * Thread : the main thread
     * Time Complexity : O(n^2)
     * Space Complexity : O(1)
     * @param height
     * @return
     */
    public int maxAreaDoublePass(int[] height) {

        System.out.println(height.length);
        // height = testMaxArea();
        int maxarea = 0;
        for(int i = 0 ; i< height.length ; i++){
            for(int j = i+1 ;j < height.length ; j++) {
                int area = Math.min(height[i] , height[j]) * (j-i);
                maxarea = Math.max(maxarea , area);
                System.out.println(maxarea);
            }
        }
        System.out.println(maxarea);
        return maxarea;
    }


    public int maxAreaSinglePass(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length -1;
        while(left < right) {
            maxArea = Math.max(maxArea , Math.min(height[left] , height[right]) * right - left);
            System.out.println(maxArea);
            if(height[left] > height[right]){
                right--;
            }else {
                left++;
            }
        }
        return maxArea;
    }

}
