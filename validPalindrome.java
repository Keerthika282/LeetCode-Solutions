class Solution {
    
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String normal="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                normal+=ch;
            }
        }
        String reverse="";
        for(int i=normal.length()-1;i>=0;i--){
            reverse+=normal.charAt(i);
        }
        return normal.equals(reverse);   
    
    }    
}