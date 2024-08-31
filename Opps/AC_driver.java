public class AC_driver {
    public static void main(String[] args) {
        AC a1 = new AC();
        a1.on();
        a1.increaseTemp();
        a1.display();

        a1.off();
        a1.display();

        AC a2 = new AC();
        a2.increaseTemp();
    }
}
