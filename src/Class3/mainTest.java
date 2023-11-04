package Class3;

public class mainTest {
    public static void main(String[] args) {
        Test_Classes  test= new Test_Classes();
        test.printSomething();

        person Person = new person();
        Person.name = "Leemon";
        Person.height = 6.21f;
        Person.mobileNumber= "01715135506";


        Person.printName();
        System.out.println(Person.getMobileNumber());
        System.out.println(Person.getHeight());
        Person.printAddress("b4, G Block");
    }

}
