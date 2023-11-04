package Class3;

public class person {
    String name;
    float height;
    String mobileNumber;

    public person(){

    }
    public void printName(){

        System.out.println("Your name is" + name);
    }

    public String getMobileNumber(){
        return mobileNumber;
    }

    public void printAddress(String address){
        System.out.println("Your Address :" + address);
    }

    public float getHeight(){
        return height;
    }

     
}
