class Solution {
    public int myAtoi(String s) {
        int idx = 0;
	int sign = 1;
        long res = 0;

        while (idx < s.length() && s.charAt(idx) == ' ') {
		idx++;
	}

        if (idx < s.length() && (s.charAt(idx) == '-' || s.charAt(idx) == '+')) {
            //sign = (s.charAt(idx++) == '-') ? -1 : 1;
	    if(s.charAt(idx++) == '-'){
	    	sign = -1;
	    }
	    else{
	    	sign = 1;
	    }
        }

        while (idx < s.length() && s.charAt(idx) >= '0' && s.charAt(idx) <= '9') {
            res = res * 10 + (s.charAt(idx++) - '0');

            if (res * sign > Integer.MAX_VALUE){ 
		    return Integer.MAX_VALUE;
	    }
            if (res * sign < Integer.MIN_VALUE){ 
		    return Integer.MIN_VALUE;
	    }
        }

        return (int)(res * sign);
    }
    public static void main(String[] args){
    	String s = "-123";
	Solution sln = new Solution();
	int result = sln.myAtoi(s);
	System.out.println(result);
    }
}
