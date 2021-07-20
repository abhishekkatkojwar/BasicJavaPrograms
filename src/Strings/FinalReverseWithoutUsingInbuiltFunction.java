package Strings;
public class FinalReverseWithoutUsingInbuiltFunction {
    public static void main(String[] args) {
        String str = "abhishek";
        char chars[] = str.toCharArray();  // converted to character array and printed in reverse order
        System.out.println(chars);
        for(int i= chars.length-1; i>=0; i--) {
            System.out.print(chars[i]);
        }
    }
}