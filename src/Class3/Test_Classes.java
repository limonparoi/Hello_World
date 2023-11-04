package Class3;

public class Test_Classes {
    // Variable
    String Name;
    //Constructor
    public Test_Classes(){

    }
    //method
    public void printSomething(){
        System.out.println("Some Things");
    }

    public static void main(String[] args) {
        Test_Classes test = new Test_Classes();
        test.Name = "Class";
        test.printSomething();
    }
}
