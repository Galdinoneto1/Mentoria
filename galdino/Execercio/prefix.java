package galdino.Execercio;
//Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".

class Solution {
    public static void main(String[] args) {
    }


    public String prefix(String[] strs) {
        if(strs == null || strs.length == 0)    return "";
        String word = strs[0];
        int i = 1;
        while(i < strs.length){
            while(strs[i].indexOf(word) != 0)
                word = word.substring(0,word.length()-1);
            i++;
        }
        return word;
    }
}