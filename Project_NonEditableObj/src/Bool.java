public class Bool {
    public final static Bool FALSE = new Bool(false);
    public final static Bool TRUE = new Bool(true);

    private final boolean boolValue;

    private Bool(boolean boolValue) {
        this.boolValue = boolValue;
    }

    public static Bool valueOf(boolean b) {
        return b ? Bool.TRUE : Bool.FALSE;
    }

    public boolean boolValue() {
        return this.boolValue;
    }

}
