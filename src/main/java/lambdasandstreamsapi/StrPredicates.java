package lambdasandstreamsapi;

public class StrPredicates {
	public static boolean isPalindrome(String str){
		int n = str.length();
		int j = n-1;
		for (int i=0; i<n/2; i++) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			j-=1;
		}
		return true;
	}

}
