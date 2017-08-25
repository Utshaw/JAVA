package comparable;

//When we use our defined class we should use Comparable interface


public class MyCar implements Comparable<MyCar>{

    private String registrationNumber;
    private int price;

    public MyCar(String registrationNumber, int price) {
        this.registrationNumber = registrationNumber;
        this.price = price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(obj.getClass() == this.getClass())
        {
            MyCar test = (MyCar)obj;
            if(this.registrationNumber.equals(test.getRegistrationNumber()) && this.getPrice() == test.getPrice())
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = hash * 31 + this.getPrice();
        hash = hash * 31 + (null == this.getRegistrationNumber() ? 0 : this.getRegistrationNumber().hashCode());
        return hash;
    }


    @Override
    public String toString() {
        return "Reg no. "+getRegistrationNumber() + " Price: " + getPrice();
    }

    @Override
    public int compareTo(MyCar o) {
        if(this.getPrice() > o.getPrice())
            return 1; // 1 means this object is greater than the object we're comparing against
        if(this.getPrice() < o.getPrice())
            return -1; // -1 means this object is less than the object we're comparing against
        return 0; // 0 means this object is same as the object we're comparing against

    }
}
