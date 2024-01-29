package demo;

// import java.io.*; 
// Driver Class 
class GFG {
    // main functi
    public void GFG2(String aString) {
        int a = 10000;
        if (aString == "Prince") {
            int i = 0;
            while (i < aString.length()) {
                System.out.println(Character.toUpperCase(aString.charAt(i)));
                i++;
            }
        } else {
            System.out.println(a);
        }
    }

    public void forLoopGFG2(String[] aArray) {
        for (String x : aArray) {
            System.out.println(x);
        }
    }

    public void forLoopOnOBJGFG2(String[] aArray) {
        for (String x : aArray) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        GFG GFG2Var = new GFG();
        GFG2Var.GFG2("Prince");
        GFG2Var.forLoopGFG2(new String[] { "Ron", "Harry", "Hermione" });

    }
}
