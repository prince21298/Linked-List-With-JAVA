package demo;

import java.util.Arrays;

public class ArrayConcept {
    public class StudentCase2 {
        public String name;

        StudentCase2(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }

        public void sample2Check(String args) {
            // declares an Array and initializing the elements of the array
            StudentCase2[] myStudents = new StudentCase2[] { new StudentCase2("Dharma"), new StudentCase2("sanvi"),
                    new StudentCase2("Rupa"), new StudentCase2("Ajay") };

            // accessing the elements of the specified array
            for (StudentCase2 m : myStudents) {
                System.out.println(m);
            }
        }
    }

    public class Student {
        public int roll_no;
        public String name;

        Student(int roll_no, String name) {
            this.roll_no = roll_no;
            this.name = name;
        }

        public void sample1Check(String args) {
            Student[] arr;
            arr = new Student[5];
            arr[0] = new Student(1, "aman");
            arr[1] = new Student(2, "vaibhav");
            arr[2] = new Student(3, "shikar");
            arr[3] = new Student(4, "dharmesh");
            arr[4] = new Student(5, "mohit");
            for (int i = 0; i < arr.length; i++)
                System.out.println("Element at " + i + " : " + arr[i].roll_no + " " + arr[i].name);
        }
    }

    public void TestCase1(String arg) {
        int[] integerArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int i : integerArray) {
            System.out.println(i);
        }
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(integerArray));
        System.out.println(integerArray.length);
        System.out.println(Arrays.asList(integerArray));
        int keinkey = 4;
        System.out.println(Arrays.binarySearch(integerArray, keinkey));
        System.out.println(keinkey + " found at index = " + Arrays.binarySearch(integerArray, 1, 3, keinkey));
    }

    public void ComapreArray(String arg) {
        int intArr[] = { 10, 20, 15, 22, 35 };
        int intArr1[] = { 10, 15, 22 };
        System.out.println("Integer Arrays on comparison: " + Arrays.compare(intArr, intArr1));
    }

    public void compareUnsignedArray(String arg) {
        int intArr[] = { 10, 20, 15, 22, 35 };
        int intArr1[] = { 10, 15, 22 };
        System.out.println("Integer Arrays on comparison: " + Arrays.compareUnsigned(intArr, intArr1));
    }

    public void copyOfArrays(String arg) {
        int intArr[] = { 10, 20, 15, 22, 35 };
        System.out.println("Integer Array: " + Arrays.toString(intArr));
        System.out.println("Integer Array: " + Arrays.toString(Arrays.copyOf(intArr, 10)));
        System.out.println("Integer Array: " + Arrays.toString(Arrays.copyOfRange(intArr, 0, 2)));
    }

    public void deepEqualsArrays(String arg) {
        int intArr[][] = { { 10, 20, 15, 22, 35 } };
        int intArr1[][] = { { 10, 15, 22 } };
        int intArr2[][] = { { 10, 20, 15, 22, 35 } };
        int intArr4[][] = { { 10, 20, 15, 22, 35 } };
        System.out.println("Integer Arrays on comparison: "+ Arrays.deepEquals(intArr, intArr1)); // false
        System.out.println("Integer Arrays on comparison: "+ Arrays.deepEquals(intArr, intArr2)); // true
        System.out.println("Integer Arrays on comparison: "+ Arrays.deepEquals(intArr, intArr4)); // false
    }
    public void deepHashCodeArrays(String arg){
        int intArr[][] = { { 10, 20, 15, 22, 35 } }; 
        System.out.println("Integer Array: "+ Arrays.deepHashCode(intArr)); 
        System.out.println("Integer Array: "+ Arrays.deepToString(intArr)); 
        System.out.println("Integer Array: "+ Arrays.deepEquals(intArr,intArr)); 
    }

    public static void main(String[] args) {
        ArrayConcept ArrayConceptModules = new ArrayConcept();
        ArrayConceptModules.TestCase1(null);
        ArrayConceptModules.ComapreArray(null);
        ArrayConceptModules.compareUnsignedArray(null);
        ArrayConceptModules.copyOfArrays(null);
        ArrayConceptModules.deepEqualsArrays(null);
        ArrayConceptModules.deepHashCodeArrays(null);
        Student StudentModules = ArrayConceptModules.new Student(0, null);
        StudentModules.sample1Check(null);
        StudentCase2 StudentCase2Modules = ArrayConceptModules.new StudentCase2(null);
        StudentCase2Modules.sample2Check(null);
    }
}