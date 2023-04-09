package KhoPhuTungXeMay;

public abstract class PTxe {

    protected String Kind;
    protected String Code;
    protected String Brand;
    protected double Price;
    protected int InPutDay, Inputmonth, Inputyear, Outputday, Outputmonth, Outputyear ;
    
    // contructor
    public PTxe(String kind, String code, String brand, double price, int inPutDay, int inputmonth, int inputyear,
            int outputday, int outputmonth, int outputyear) {
        Kind = kind;
        Code = code;
        Brand = brand;
        Price = price;
        InPutDay = inPutDay;
        Inputmonth = inputmonth;
        Inputyear = inputyear;
        Outputday = outputday;
        Outputmonth = outputmonth;
        Outputyear = outputyear;
    }
    public PTxe() {
    }

    public PTxe(String code) {
        Code = code;
    }
    
    // get set method
    public String getKind() {
        return Kind;
    }
    
    public void setKind(String kind) {
        Kind = kind;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }
    
    public String getBrand() {
        return Brand;
    }
    
    public void setBrand(String brand) {
        Brand = brand;
    }

    public double getPrice() {
        return Price;
    }
    
    public void setPrice(double price) {
        Price = price;
    }

    public int getInPutDay() {
        return InPutDay;
    }
    
    public void setInPutDay(int inPutDay) {
        InPutDay = inPutDay;
    }
    
    public int getInputmonth() {
        return Inputmonth;
    }
    
    public void setInputmonth(int inputmonth) {
        Inputmonth = inputmonth;
    }
    
    public int getInputyear() {
        return Inputyear;
    }
    
    public void setInputyear(int inputyear) {
        Inputyear = inputyear;
    }

    public int getOutputday() {
        return Outputday;
    }
    
    public void setOutputday(int outputday) {
        Outputday = outputday;
    }
    
    public int getOutputmonth() {
        return Outputmonth;
    }
    
    public void setOutputmonth(int outputmonth) {
        Outputmonth = outputmonth;
    }
    
    public int getOutputyear() {
        return Outputyear;
    }
    
    public void setOutputyear(int outputyear) {
        Outputyear = outputyear;
    }
    
    // toString
    public String toString() {
        return Kind + Brand + Price + InPutDay + Inputmonth + Inputyear + Outputday + Outputmonth + Outputyear;
    }
}