package com.dsa.Searching.Linear;

public class SearchInString {
    public static void main(String[] args) {
        String str  = "Search in String";
        char target = 'S';
        System.out.println(linearSearch(str, target));
    }
    static boolean linearSearch(String str, char target)
    {
        //edge case
        if(str.length() == 0)
            return false;
        //run a for loop
        for (char ch: str.toCharArray()) {
            if(target == ch)
                return  true;

        }
        /*for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i))
                return  true;
        }*/
        //if element is not found
        return  false;
    }

}
