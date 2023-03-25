package KhoPhuTungXeMay;
import java.util.Objects;

public class xecontay extends PTxe implements Comparable<xecontay>{
    
    public xecontay(){}

    public xecontay(String code) {
        super(code);
    }

    public xecontay(String kind, String code, String brand, double price, String inPutDay, String outPutDay) {
        super(kind, code, brand, price, inPutDay, outPutDay);
    }

    @Override
    public void RangeOfVehicle() {
        System.out.println("\nDanh cho xe con tay");
    }

    @Override
    public String toString() {
        return "------INFO.PT.XECONTAY-----\nPhu tung " + Kind.toUpperCase() + " danh cho xe " + Brand.toUpperCase()
                + "\nMa SP:" + Code.toUpperCase() + "\nNgay nhap kho:" + InPutDay + "\nNgay xuat kho:" + OutPutDay
                + "\nGia: " + Price;
    }

    @Override
    public int compareTo(xecontay o) {
        return this.Kind.compareTo(o.Code);
    }

    public int hashCode() {
        return Objects.hash(Kind, Code , Brand , Price , InPutDay , OutPutDay);
    }
    
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        xecontay other = (xecontay) obj;
        return Objects.equals(Code, other.Code);
    }
    
}

