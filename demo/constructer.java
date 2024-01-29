package demo;


// import java.io.*; 
// Driver Class 
class cunstractor {
    private int number;
    private String name;

    //cunstractor
    public cunstractor(int number, String name){
        this.name = name;
        this.number = number;
    }

     // Methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return number;
    }

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
        cunstractor GFG2Var = new cunstractor(9876543, "name");
        GFG2Var.GFG2("Prince");
        GFG2Var.forLoopGFG2(new String[] { "Ron", "Harry", "Hermione" });
        System.out.println("Name: " + GFG2Var.getName());
        System.out.println("Age: " + GFG2Var.getAge());
    }
}
