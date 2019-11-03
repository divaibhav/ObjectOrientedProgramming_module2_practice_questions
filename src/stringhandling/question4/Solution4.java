/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 03-Nov-19
 *  Time: 1:16 PM
 */
package stringhandling.question4;

public class Solution4 {
    public static void main(String[] args) {
        String s1 = "amar";
        String s2 = "rama";
        Solution4 obj = new Solution4();
        if(obj.checkStrings(s1,s2)){
            System.out.println("Both contains same characters");
        }
        else {
            System.out.println("Both contains different characters");
        }



    }

    public boolean checkStrings(String s1, String s2) {
        boolean response = true;
        if(s1.length() == s2.length()){
            for (int i = 0; i < s2.length() ; i++) {
                if(s1.contains(""+ s2.charAt(i))){
                   continue;
                }
                else{
                    response = false;
                    break;
                }
            }

        }
        else{
            response = false;
        }

        return response;
    }
}
