class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        StringBuffer sb = new StringBuffer(str);
        StringBuffer sbr = new StringBuffer("");
        boolean foundMinus = false;
        boolean foundPlus = false;
        boolean foundPoint = false;
        boolean foundDigit = false;
        
        char c;
        for(int i = 0; i < sb.length(); i++){
            c = sb.charAt(i) ;
            if( c == ' ' || ( !Character.isDigit(c) && ( c != '+' && c != '-' && c != '.') )   ) break;
            sbr.append(c);
        }
        // System.out.println(String.format("===sbr1 = %s ====", sbr.toString()));
        sb = sbr;
        sbr = new StringBuffer("");
        
        for(int i = 0; i < sb.length(); i++){                   // eliminate + or - in the middle of the chain. 
            c = sb.charAt(i) ;
            if( ((c == '+' || c == '-' ) && i > 0) || (c == '.' ) && i > 0  ) break;
            sbr.append(c);
        }
        // System.out.println(String.format("===sbr2 = %s ====", sbr.toString()));
        sb = sbr;
        
        for(int i = 0; i < sb.length(); i++){
            c = sb.charAt(i) ;
            if( Character.isDigit(c) ) foundDigit = true;
            if( c == '+') foundPlus = true;
            if( c == '-') foundMinus = true;
            if( c == '.') foundPoint = true;
        }
        if(!foundDigit) return 0;
        if(foundPlus && foundMinus) return 0;
        
        String res = sbr.toString();
        // System.out.println(String.format("===res = %s ===", res));
        try{
            Double d = Double.parseDouble(res);
            return  d.intValue();
        }catch(Exception e){
            return foundMinus?Integer.MIN_VALUE:Integer.MAX_VALUE;
        }
    }
}