class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.length()==0) return 0;
        int sign = 1;
        int start = 0;
        if(s.charAt(start)=='-'){
            sign = -1;
            start++;
        }
        else if(s.charAt(start)=='+'){
            start++;
        }
        int i = start;
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            i++;
        }
        String sub = s.substring(start,i);
        long num = helper(sub,sub.length());
        num = num*sign;
        if (num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if (num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return (int)num;
    }
    public long helper(String s, int j){
        if(j==0){
            return 0;
        }
        int digit = s.charAt(j-1)-'0';
        long answer = helper(s,j-1);
        if(answer>(Integer.MAX_VALUE)){
            return (long)Integer.MAX_VALUE+1;
        }
        return 10*answer+digit;
    }
}