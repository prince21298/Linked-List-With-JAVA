package demo;

public class continueConcept {
    public static void main(String args[])
    {
        for (int i = 0; i <= 15; i++) {
             if (i < 10 || i > 14) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
