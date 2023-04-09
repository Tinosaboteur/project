package KhoPhuTungXeMay;
import java.util.Objects;

public class xeso extends PTxe implements Comparable<xeso>{

    public xeso(String code) {
        super(code);
    }

    public xeso() {
    }

    public xeso(String kind, String code, String brand, double price, int inPutDay, int inputmonth,
            int inputyear, int outputday, int outputmonth, int outputyear) {
        super(kind, code, brand, price, inPutDay, inputmonth, inputyear, outputday, outputmonth, outputyear);
    }

    @Override
    public String toString() {
        return "------INFO.PT.XESO-----\nPhu tung " + Kind.toUpperCase() + " danh cho xe " + Brand.toUpperCase()
                + "\nMa SP:" + Code.toUpperCase() + "\nNgay nhap kho:" + InPutDay +"/"+ Inputmonth+"/"+ Inputyear + "\nNgay xuat kho:" + Outputday+"/"+ Outputmonth+"/"+ Outputyear
                + "\nGia: " + Price;
    }

    @Override
    public int compareTo(xeso o) {
        return this.Kind.compareTo(o.Code);
    }
    
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        xeso other = (xeso) obj;
        return Objects.equals(Code, other.Code);
    }
}
