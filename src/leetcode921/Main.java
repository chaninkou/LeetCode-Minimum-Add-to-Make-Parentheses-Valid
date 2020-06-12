package leetcode921;

public class Main {
	public static void main(String[] args) {
		String S = "()()())";
		
		System.out.println("Input: " + S);
		
		FindMinAddToValidFunction solution = new FindMinAddToValidFunction();
		
		System.out.println("Solution: " + solution.minAddToMakeValid(S));
	}
}
