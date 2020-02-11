public class Main {
    public static void main(String[] args) {
        /*
         * Task 1
         */
        char letter = 'a';
        while (letter != '{') {
            System.out.println(letter);
            letter++;
        }
        /*
         * Task 2
         */
        long begin = new java.util.Date().getTime();
        int i = 0;
        while (i < 100000000) i++;
        long end = new java.util.Date().getTime();
        System.out.println("If i is int: " + (end - begin));

        begin = new java.util.Date().getTime();
        long j = 0;
        while (j < 100000000) j++;
        end = new java.util.Date().getTime();
        System.out.println("If i is long: " + (end - begin));
    }
}