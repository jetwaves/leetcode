class Solution {
    public String intToRoman(int num) {
        int rest = num;
        int cut = 0;
        StringBuffer sb = new StringBuffer("");
        while(rest > 0){
            if(rest >= 1000) {
                sb.append('M');
                rest = rest - 1000;
                continue;
            }
            if(rest >= 900) {
                sb.append('C');sb.append('M');
                rest = rest - 900;
            }
            if(rest >= 500) {
                sb.append('D');
                rest = rest - 500;
                continue;
            }
            if(rest >= 400) {
                sb.append('C');sb.append('D');
                rest = rest - 400;
                continue;
            }
            if(rest >= 100) {
                sb.append('C');
                rest = rest - 100;
                continue;
            }
            if(rest >= 90) {
                sb.append('X');sb.append('C');
                rest = rest - 90;
                continue;
            }
            if(rest >= 50) {
                sb.append('L');
                rest = rest - 50;
                continue;
            }
            if(rest >= 40) {
                sb.append('X');sb.append('L');
                rest = rest - 40;
                continue;
            }
            if(rest >= 10) {
                sb.append('X');
                rest = rest - 10;
                continue;
            }
            if(rest >= 9) {
                sb.append('I');sb.append('X');
                rest = rest - 9;
                continue;
            }
            if(rest >= 5) {
                sb.append('V');
                rest = rest - 5;
                continue;
            }
            if(rest >= 4) {
                sb.append('I');sb.append('V');
                rest = rest - 4;
                continue;
            }
            if(rest >= 1) {
                sb.append('I');
                rest = rest - 1;
                continue;
            }   
            // System.out.println(rest);
            // System.out.println(sb.toString());
        }
        return sb.toString();
    }
}