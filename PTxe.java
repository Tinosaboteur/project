package KhoPhuTungXeMay;


public class PTxe {
    
    protected String Kind;
    protected String Code;
    protected String Brand;
    protected double Price;
    protected String InPutDay;
    protected String OutPutDay;
    
    // contructor
    public PTxe() {
    }
    public PTxe(String code) {
        Code = code;
    }

    public PTxe(String kind, String code, String brand, double price, String inPutDay, String outPutDay) {
        Kind = kind;
        Code = code;
        Brand = brand;
        Price = price;
        InPutDay = inPutDay;
        OutPutDay = outPutDay;
    }
   
   
    public void RangeOfVehicle(){
        System.out.println("dong xe");
    }
    // get method
    public String getKind() {
        return Kind;
    }
    
    public String getCode() {
        return Code;
    }
    
    public String getBrand() {
        return Brand;
    }
    
    public double getPrice() {
        return Price;
    }

    public String getInPutDay() {
        return InPutDay;
    }
    
    public String getOutPutDay() {
        return OutPutDay;
    }
    
    // set method
    public void setKind(String kind) {
        Kind = kind;
    }
    
    public void setCode(String code) {
        Code = code;
    }
    
    public void setBrand(String brand) {
        Brand = brand;
    }
    
    public void setPrice(double price) {
        Price = price;
    }
    
    public void setInPutDay(String inPutDay) {
        InPutDay = inPutDay;
    }
    
    public void setOutPutDay(String outPutDay) {
        OutPutDay = outPutDay;
    }

// toString
public String toString(){
    return Kind+Brand+Price+InPutDay+OutPutDay;
}
}