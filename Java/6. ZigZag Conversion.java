class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        StringBuffer sb = new StringBuffer(s);
        StringBuffer[] sbRes = new StringBuffer[numRows];
        for(int i = 0; i < numRows; i++){
            sbRes[i] = new StringBuffer("");
        }
        int cnt = 0;
        boolean down = true;
        for(int i=0;i<s.length();i++){
            sbRes[cnt].append(sb.charAt(i));
            if(down){
                cnt ++;
                if(cnt == numRows) {
                    down = false;
                    cnt = cnt - 2;
                }
            } else {
                cnt --;
                if(cnt == -1) {
                    down = true;
                    cnt = 1;
                }
            }
        }
        StringBuffer sr = new StringBuffer("");
        for(int i = 0; i < numRows; i++){
            sr.append(sbRes[i].toString());
        }
        return sr.toString();
    }
}