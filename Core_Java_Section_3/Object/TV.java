package Core_Java_Section_3.Object;

public class TV {
    String company;
    double price;
    
    public TV(String company, double price) {
        this.company = company;
        this.price = price;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "TV{" +"company=" + company +", price=" + price + "}";
    }
}
