class Solution {
    
    boolean palin(String s, int i, int j) {
        while(i<j) {
            if(s.charAt(i)!=s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }
    
    public boolean isPalindrome(String s) {
        String str="";
        
        for(int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            
            if(c>=65 && c<=90) {
                str+=Character.toLowerCase(c);
            } else if(c>=97 && c<=122) {
                str+=c;
            } else if(c>=48 && c<=57) {
                str+=c;
            }
        }
        
        return palin(str, 0, str.length()-1);
    }
}
