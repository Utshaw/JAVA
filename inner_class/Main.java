


public class Main {
    public static void main(String[] args) { // Anonymous inner class
        
        Phone specialPhone = new Phone() {
            public void show() {
                System.out.println("Call, SMS, EMAIL");
            }
        };
        specialPhone.show();


    }
}