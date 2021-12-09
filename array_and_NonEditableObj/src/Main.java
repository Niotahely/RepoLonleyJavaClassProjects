public class Main {
    public static class StringTest {
        public static void main(String[] args) {
            ArrayString<String> s1 = new ArrayString<>("");
            ArrayString<String> s2 = new ArrayString<>("hello");
            ArrayString<String> s3 = s1.concat(s2);
            assert s3.length() == s1.length() + s2.length();
            for (int index = 0; index < s3.length(); index++)
                assert s3.charAt(index) == s2.charAt(index);
            ArrayString<String> s4 = new ArrayString<>(" world");
            s3 = s2.concat(s4);
            assert s3.length() == s2.length() + s4.length();
            for (int index = 0; index < s2.length(); index++)
                assert s3.charAt(index) == s2.charAt(index);
            for (int index = 0; index < s4.length(); index++)
                assert s3.charAt(index + s2.length()) == s4.charAt(index);


        }
    }
}
