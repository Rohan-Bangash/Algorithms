public class Palindrome {

	public static void main(String[] args) {
		//int[] arr = {1, 2, 3, 2, 1};  // Example of a palindrome
        int[] arr = {9, 8, 7, 6, 5, 4};  // Example of a non-palindrome
        boolean truth_value = true;

        for(int i=0, j=arr.length-1; i<j; i++, j--) {
            if(arr[i] != arr[j]) {
                truth_value = false;
                break;
            }
        }
        System.out.println(truth_value);
	}

}