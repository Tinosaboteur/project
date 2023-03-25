package KhoPhuTungXeMay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class danhsachptxetayga {
    public ArrayList<xetayga> listPTxetayga;

    public danhsachptxetayga() {
        this.listPTxetayga = new ArrayList<xetayga>();
    }

    public danhsachptxetayga(ArrayList<xetayga> listPTxetayga) {
        this.listPTxetayga = listPTxetayga;
    }

    public void addPT(xetayga xct) {
        this.listPTxetayga.add(xct);
    }

    // xuat thong tin
    public void xuatthongtin() {
        for (xetayga xetayga : listPTxetayga) {
            System.out.println(xetayga);
        }
    }

    public int soluongpt() {
        return this.listPTxetayga.size();
    }

    public void lamrongDanhsach() {
        this.listPTxetayga.removeAll(listPTxetayga);
    }

    public boolean kiemTraPhuTungXe(xetayga xtg) {
        return this.listPTxetayga.contains(xtg);
    }

    public boolean xoaThongTin(xetayga xtg) {
        return this.listPTxetayga.remove(xtg);
    }

    public void sapXepTheoPtGiamDan() {
        Collections.sort(this.listPTxetayga, new Comparator<xetayga>() {

            @Override
            public int compare(xetayga xetg1, xetayga xetg2) {
                if (xetg1.getPrice() < xetg2.getPrice()) {
                    return 1;
                } else if (xetg1.getPrice() > xetg2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }
}
