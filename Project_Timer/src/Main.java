public class Main {
    public static void main(String[] args) {
        TimerClass t = new TimerClass();
        assert t.getTime() ==58;
        t.tick().tick(); // two ticks


    }
}
