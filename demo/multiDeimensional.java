package demo;

public class multiDeimensional {
    public void OneStep(String[] stepOneData){
        for (String string : stepOneData) {
            System.err.println(string);
        }
        
    }
    public static void main(String[] args){
        multiDeimensional multiDeimensionalObject = new multiDeimensional();
        String[] stringArray = {"1","2","3"};
        multiDeimensionalObject.OneStep(stringArray);
    }
    
}
