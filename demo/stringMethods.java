package demo;

public class stringMethods {
    public void concatCheck(String arg) {
        String s = "Sachin";
        s = s.concat(" Tendulkar");
        System.out.println(s);
    }

    public void checkSample2(String args) {
        char characters[] = { 'G', 'f', 'g' };
        String firstString = new String(characters);
        String secondString = new String(firstString);
        System.out.println(firstString);
        System.out.println(secondString);
    }
    public void sampleCheck3(){
        byte ascii[] = { 71, 70, 71 };
        String firstString = new String(ascii);
        System.out.println(firstString);
        String secondString = new String(ascii, 1, 2);
        System.out.println(secondString);
    }

    public static void main(String[] args) {
        stringMethods stringMethodsCheck = new stringMethods();
        stringMethodsCheck.concatCheck(null);
        stringMethodsCheck.checkSample2(null);
        stringMethodsCheck.sampleCheck3();
    }
}
