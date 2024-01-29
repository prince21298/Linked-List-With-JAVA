package demo;

import java.nio.charset.Charset;

public class checkStringFunction {
    public static void main(String[] args) {
        // String creation and printing
        String s = "GeeksforGeeks";
        System.out.println(s);

        // String creation from byte array
        byte[] b_arr = { 71, 101, 101, 107, 115 };
        String s_byte = new String(b_arr); // Geeks
        System.out.println(s_byte);

        // Charset usage (corrected for clarity)
        Charset cs = Charset.defaultCharset();
        String s_byte_char = new String(b_arr, cs); // Geeks
        System.out.println(s_byte_char);
        System.out.println(cs); // Print the default charset

        // String subarray constructors (corrected for consistency)
        String s2 = new String(b_arr, 1, 3); // eek
        System.out.println(s2);
        String s3 = new String(b_arr, 1, 3, cs); // eek
        System.out.println(s3);

        // String creation from char array
        char[] char_arr = { 'G', 'e', 'e', 'k', 's' };
        String s6 = new String(char_arr); // Geeks
        System.out.println(s6);

        // String creation from Unicode code points
        int[] uni_code = { 71, 101, 101, 107, 115 };
        String s8 = new String(uni_code, 1, 3); // eek
        System.out.println(s8);

        // String creation from StringBuffer and StringBuilder
        StringBuffer s_buffer = new StringBuffer("Geeks");
        String s9 = new String(s_buffer); // Geeks
        System.out.println(s9);
        StringBuilder s_builder = new StringBuilder("Geeks");
        String s10 = new String(s_builder); // Geeks
        System.out.println(s10);

        // String methods
        System.out.println("GeeksforGeeks".length());
        System.out.println("GeeksforGeeks".charAt(3)); // Print the character
        System.out.println("GeeksforGeeks".substring(3));
        System.out.println("GeeksforGeeks".substring(2, 5));
        String output = "Geeks".concat("forGeeks"); // Combine strings
        System.out.println(output);
        int output1 = "Learn Share Learn".indexOf("Share"); // Find index
        System.out.println(output1);
        String output3 = "Learn Share Learn"; // Find index
        int output2 = output3.indexOf("ea",3);// returns 13
        System.out.println(output2);
        System.out.println(output3.lastIndexOf("a"));
        System.out.println("Geeks".equals("Geeks"));
        System.out.println("Geeks".equalsIgnoreCase("Geeks"));
    }
}
