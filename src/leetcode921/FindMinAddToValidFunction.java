package leetcode921;

public class FindMinAddToValidFunction {
	// O(n) time and O(1) space
	public int minAddToMakeValid(String S) {
        int leftBracket = 0;
        int rightBracket = 0;
        
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == '('){
                rightBracket++;
            } else if (rightBracket > 0){ // If its ')' and there is already leftBracket
                rightBracket--;
            } else {
                leftBracket++;
            }
        }
        
        return leftBracket + rightBracket; // Add total
    }
}
