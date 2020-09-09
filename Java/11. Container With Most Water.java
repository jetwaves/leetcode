class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int width = 0;
        int haut = 0;
        int vol = 0;
        // int maxL = 0, maxR = 0;
        for( int i = 0; i < height.length; i++){
            for( int j = 1; j < height.length; j++){
                width = j - i;
                haut = (height[i] < height[j])?height[i]:height[j];
                vol = width * haut;
                // System.out.println(String.format(" i = %s,  j = %s, vol = %s", i, j, vol));
                if( vol > max) {
                    max = vol;
                    // maxL = i;
                    // maxR = j;
                }
            }
        }
        // System.out.println(String.format(" L = %s,  R = %s", maxL, maxR));
        return max;
    }
}