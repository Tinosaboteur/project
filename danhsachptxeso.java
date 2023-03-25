package KhoPhuTungXeMay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class danhsachptxeso {
    public ArrayList<xeso> listPTxeso;

    public danhsachptxeso() {
        this.listPTxeso = new ArrayList<xeso>();
    }

    public danhsachptxeso(ArrayList<xeso> listPTxeso) {
        this.listPTxeso = listPTxeso;
    }

    public void addPT(xeso xct) {
        this.listPTxeso.add(xct);
    }

    // xuat thong tin
    public void xuatthongtin() {
        for (xeso xeso : listPTxeso) {
            System.out.println(xeso);
        }
    }

    public int soluongpt() {
        return this.listPTxeso.size();
    }

    public void lamrongDanhsach() {
        this.listPTxeso.removeAll(listPTxeso);
    }
    public boolean kiemTraPhuTungXe(xeso xs) {
        return this.listPTxeso.contains(xs);
    }

    public boolean xoaThongTin(xeso xeso) {
        return this.listPTxeso.remove(xeso);
    }

    public void sapXepTheoPtGiamDan() {
        Collections.sort(this.listPTxeso, new Comparator<xeso>() {

            @Override
            public int compare(xeso xes1, xeso xes2) {
                if (xes1.getPrice() < xes2.getPrice()) {
                    return 1;
                } else if (xes1.getPrice() > xes2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }
}
