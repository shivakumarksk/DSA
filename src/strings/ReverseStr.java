package strings;

public class ReverseStr {
    public static void main(String[] args) {
        //ReverseStr strrev=new ReverseStr();
        System.out.println(ReverseStr.reverseStr("kumar siva"));
        System.out.println(isPalindrome("KAAK"));
        System.out.println(ReverseStr.reverseStrman("kumar siva"));
    }

    public static String    reverseStr(String str) {
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static  String reverseStrman(String str) {
        char[] ch=str.toCharArray();
        int left=0;
        int right=ch.length-1;
        while(left<right) {
            char temp=ch[left];
            ch[left] = ch[right];
            ch[right]= temp;
            left++;
            right--;
        }
        return new String(ch);
    }
    public static boolean isPalindrome(String str) {
        String reversed=reverseStr(str);
        return reversed.equals(str);
    }
}
