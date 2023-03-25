package KhoPhuTungXeMay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class danhsachptxecontay {
    public ArrayList<xecontay> listPTxecontay;

    public danhsachptxecontay() {
        this.listPTxecontay = new ArrayList<xecontay>();
    }

    public danhsachptxecontay(ArrayList<xecontay> listPTxecontay) {
        this.listPTxecontay = listPTxecontay;
    }

    public void addPT(xecontay xct) {
        this.listPTxecontay.add(xct);
    }

    // xuat thong tin
    public void xuatthongtin() {
        for (xecontay xecontay : listPTxecontay) {
            System.out.println(xecontay);
        }
    }

    public int soluongpt() {
        return this.listPTxecontay.size();
    }

    public void lamrongDanhsach() {
        this.listPTxecontay.removeAll(listPTxecontay);
    }

    public boolean kiemTraPhuTungXe(xecontay xct) {
        return this.listPTxecontay.contains(xct);
    }

    public boolean xoaThongTin(xecontay xct) {
        return this.listPTxecontay.remove(xct);
    }

    public void sapXepTheoPtGiamDan() {
        Collections.sort(this.listPTxecontay, new Comparator<xecontay>() {

            @Override
            public int compare(xecontay xect1, xecontay xect2) {
                if (xect1.getPrice() < xect2.getPrice()) {
                    return 1;
                } else if (xect1.getPrice() > xect2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }
}
