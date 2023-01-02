class Solution {
    public boolean detectCapitalUse(String word) {
        int count=0;
        for(int i=0; i<word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))) count++;
        }
        //case 1 & case 2
        if(count == word.length() || count == 0) 
            return true;
        //case 3
        return count == 1 && Character.isUpperCase(word.charAt(0));
    }
}