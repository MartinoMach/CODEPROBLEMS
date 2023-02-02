package Problem13;

import java.util.LinkedHashMap;
import java.util.Map;

/* PROBLEM 13
 * 
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

* For example, 2 is written as II in Roman numeral, just two one's added together.
*  
* 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
* 
* Roman numerals are usually written largest to smallest from left to right. 
* 
* However, the numeral for four is not IIII. Instead, the number four is written as IV. 
* 
* Because the one is before the five we subtract it making four. 
* 
* The same principle applies to the number nine, which is written as IX. 
* 
* There are six instances where subtraction is used:
* I can be placed before V (5) and X (10) to make 4 and 9. 
* 
* X can be placed before L (50) and C (100) to make 40 and 90. 
* 
* C can be placed before D (500) and M (1000) to make 400 and 900.
* 
* Given an integer, convert it to a roman numeral.
* 
 */

class Problem13 {
    public int romanToInt(String s) {
        Map<String,Integer> map = new LinkedHashMap<String,Integer>(); 
        int num = 0;
        int i = 0;

        map.put("M",1000); 
        map.put("CM",900);
        map.put("D",500);
        map.put("CD",400);
        map.put("C",100);
        map.put("XC",90);
        map.put("L",50);
        map.put("XL",40); 
        map.put("X",10);
        map.put("IX",9);
        map.put("V",5);
        map.put("IV",4);
        map.put("I",1);

        while(i < s.length()) {
            if(i  < s.length() - 1 && map.containsKey(s.substring(i, i + 2))) {
                num+= map.get(s.substring(i, i + 2));
                i+=2;
            } else {
                num+= map.get(s.substring(i, i + 1));
                i++;
            }
        }
        return num;
    }
}