public class PalindromeOrNot {
    public static void main(String[] args) {
        String str = "123454321";
        char[] arr = str.toCharArray();

        int i = 0;
        int j = arr.length - 1;
        int flag = 0;
        while (i < (arr.length) / 2) {
            if (arr[i] == arr[j]) {
                i++;
                j--;
            } else {
                flag = 1;
                break;
            }
            ;
        }
        if (flag == 0) {
            System.out.println("It is palindrome");
        } else
            System.out.println("NOt palindrome");
    }
}
