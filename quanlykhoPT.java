package KhoPhuTungXeMay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class quanlykhoPT {
    public ArrayList<xecontay> listPTxecontay;
    public ArrayList<xeso> listPTxeso;
    public ArrayList<xetayga> listPTxetayga;

    public quanlykhoPT() {
        this.listPTxecontay = new ArrayList<xecontay>();
        this.listPTxeso = new ArrayList<xeso>();
        this.listPTxetayga = new ArrayList<xetayga>();
    }
    
    public quanlykhoPT(ArrayList<xecontay> listPTxecontay, ArrayList<xeso> listPTxeso, ArrayList<xetayga> listPTxetayga) {
        this.listPTxecontay = listPTxecontay;
        this.listPTxeso = listPTxeso;
        this.listPTxetayga = listPTxetayga;
    }
    
    //*danhsachxecontay
    public void addPT1(xecontay xct) {
        this.listPTxecontay.add(xct);
    }

    // xuat thong tin
    public void xuatthongtin1() {
        for (xecontay xecontay : listPTxecontay) {
            System.out.println(xecontay);
        }
    }

    public int soluongpt1() {
        return this.listPTxecontay.size();
    }

    public void lamrongDanhsach1() {
        this.listPTxecontay.removeAll(listPTxecontay);
    }

    public boolean kiemTraPhuTungXe1(xecontay xct) {
        return this.listPTxecontay.contains(xct);
    }

    public boolean xoaThongTin1(xecontay xct) {
        return this.listPTxecontay.remove(xct);
    }

    public void sapXepTheoPtTangDan2() {
        Collections.sort(this.listPTxeso, new Comparator<xeso>() {

            @Override
            public int compare(xeso xes1, xeso xes2) {
                if (xes1.getPrice() < xes2.getPrice()) {
                    return -1;
                } else if (xes1.getPrice() > xes2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }
    public void sapXepTheoPtGiamDan1() {
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
    
    //*danhsachxeso
    public void addPT2(xeso xct) {
        this.listPTxeso.add(xct);
    }

    // xuat thong tin
    public void xuatthongtin2() {
        for (xeso xeso : listPTxeso) {
            System.out.println(xeso);
        }
    }

    public int soluongpt2() {
        return this.listPTxeso.size();
    }

    public void lamrongDanhsach2() {
        this.listPTxeso.removeAll(listPTxeso);
    }
    public boolean kiemTraPhuTungXe2(xeso xs) {
        return this.listPTxeso.contains(xs);
    }

    public boolean xoaThongTin2(xeso xeso) {
        return this.listPTxeso.remove(xeso);
    }

    public void sapXepTheoPtTangDan1() {
        Collections.sort(this.listPTxecontay, new Comparator<xecontay>() {

            @Override
            public int compare(xecontay xect1, xecontay xect2) {
                if (xect1.getPrice() < xect2.getPrice()) {
                    return -1;
                } else if (xect1.getPrice() > xect2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }
    public void sapXepTheoPtGiamDan2() {
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
    
    //*danhsachxetayga
    public void addPT3(xetayga xct) {
        this.listPTxetayga.add(xct);
    }

    // xuat thong tin
    public void xuatthongtin3() {
        for (xetayga xetayga : listPTxetayga) {
            System.out.println(xetayga);
        }
    }

    public int soluongpt3() {
        return this.listPTxetayga.size();
    }

    public void lamrongDanhsach3() {
        this.listPTxetayga.removeAll(listPTxetayga);
    }

    public boolean kiemTraPhuTungXe3(xetayga xtg) {
        return this.listPTxetayga.contains(xtg);
    }

    public boolean xoaThongTin3(xetayga xtg) {
        return this.listPTxetayga.remove(xtg);
    }

    public void sapXepTheoPtTangDan3() {
        Collections.sort(this.listPTxetayga, new Comparator<xetayga>() {

            @Override
            public int compare(xetayga xetg1, xetayga xetg2) {
                if (xetg1.getPrice() < xetg2.getPrice()) {
                    return -1;
                } else if (xetg1.getPrice() > xetg2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }
    public void sapXepTheoPtGiamDan3() {
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