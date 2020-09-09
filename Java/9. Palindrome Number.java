class Solution {
    public boolean isPalindrome(int x) {
        StringBuffer sb = new StringBuffer( Integer.toString(x) );
        for(int i = 0; i < sb.length() / 2; i++){
            if(sb.charAt(i) != sb.charAt(sb.length() - i - 1)) return false;
        }
        return true;
    }
}