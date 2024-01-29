package demo;

public class doWhile {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.err.println( String.format("Hello World %d", i+1));
            i++;
        }
        while (i<10);
    }
}
