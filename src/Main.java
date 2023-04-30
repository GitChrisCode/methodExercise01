public class Main {
    public static void main(String[] args) {

        System.out.println(sum(5, 10));

        System.out.println(sumOutput(sum(10,20)));
    }
    //very simple content --> project state: "to be removed ..."
    public static int sum(int a, int b) {
        return a + b;
    }

    public static String sumOutput(int s) {
        return ("Summe: " + s);
    }
}