public class Main {
    public static void main(String[] args) {
        Bool trueVal = Bool.valueOf(true);
        Bool falseVal = Bool.valueOf(false);
        assert trueVal == Bool.TRUE && trueVal.equals(Bool.TRUE);
        assert trueVal.boolValue();
        assert trueVal != Bool.FALSE && !trueVal.equals(Bool.FALSE);
        assert trueVal != null && !trueVal.equals(null);
        assert falseVal == Bool.FALSE && falseVal.equals(Bool.FALSE);
        assert !falseVal.boolValue();
        assert falseVal != Bool.TRUE && !falseVal.equals(Bool.TRUE);
        assert falseVal != null && !falseVal.equals(null);
}}
