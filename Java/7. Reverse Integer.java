class Solution {
    public int reverse(int x) {
        try{
            boolean positive = x>0?true:false;
            x = Math.abs(x);
            StringBuffer sb = new StringBuffer(String.valueOf(x));
            sb.reverse();
            x = Integer.parseInt(sb.toString());
            x = positive?x:(x*-1);
            return x;
        }catch(Exception e){ 
            return 0;
        }
        
    }
}