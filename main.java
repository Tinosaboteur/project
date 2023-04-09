package KhoPhuTungXeMay;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        quanlykhoPT dsxe = new quanlykhoPT();
        int a;

        // chọn menu

        do {
            System.out.println("\n----------MENU----------");
            System.out.println("Hay nhap vao con so tuong ung trong menu:");
            System.out.println("1: Them vao danh sach PT danh cho xe con tay.");
            System.out.println("2: Them vao danh sach PT danh cho xe so.");
            System.out.println("3: Them vao danh sach PT danh cho xe tay ga.");
            System.out.println("4:Xuat thong tin phu tung xe con tay.");
            System.out.println("5:Xuat thong tin phu tung xe so.");
            System.out.println("6:Xuat thong tin phu tung xe tay ga.");
            System.out.println("7:Thong ke so luong phu tung.");
            System.out.println("8:Kiem tra phu tung xe.");
            System.out.println("9:Xuat thong tin danh sach theo gia tang dan.");
            System.out.println("10:Xuat thong tin danh sach theo gia giam dan.");
            System.out.println("11:Xoa thong tin phu tung.");
            System.out.println("12:Thoat chuong trinh.");
            System.out.print("Chon: ");
            a = input.nextInt();
            // nhập lại menu

            if (a < 1 || a > 12) {
                System.out.println("\n----------ERROR----------");
                System.out.println("Vui long chon trong khoang 1 toi 12!!!!!");

            } else {
                // vào menu
                switch (a) {
                    case 1: {

                        xecontay xecontay = new xecontay();
                        System.out.println("Hay nhap vao loai phu tung: ");
                        input.nextLine();
                        String Kind = input.nextLine();
                        System.out.println("Hay nhap vao hang san xuat: ");
                        String Brand = input.nextLine();
                        System.out.println("Hay nhap vao ma SP: ");
                        String Code = Brand + "-" + input.nextLine();
                        Double Price;
                        do {
                            System.out.println("Hay nhap vao gia san pham: ");
                            Price = input.nextDouble();
                            if (Price < 0) {
                                System.out.println("Gia tien phai lon hon 0");
                            }
                        } while (Price < 0);
                        int Inputmonth;
                        do {
                            System.out.println("Hay nhap vao thang nhap kho: ");
                            Inputmonth = input.nextInt();
                            if (Inputmonth < 1 || Inputmonth > 12) {
                                System.out.println("Phai nhap trong khoang tu 1 toi 12: ");
                            }
                        } while (Inputmonth < 1 || Inputmonth > 12);

                        int InPutDay;
                        switch (Inputmonth) {
                            case 1, 3, 5, 7, 8, 10, 12: {

                                do {
                                    System.out.println("Hay nhap vao ngay nhap kho: ");
                                    InPutDay = input.nextInt();
                                    if (InPutDay < 0 || InPutDay > 31) {
                                        System.out.println("Thang " + Inputmonth + " chi co 31 ngay!");
                                        System.out.println("Nhap lai!!!");
                                    }
                                } while (InPutDay < 0 || InPutDay > 31);

                                break;
                            }
                            case 4, 6, 9, 11: {

                                do {
                                    System.out.println("Hay nhap vao ngay nhap kho: ");
                                    InPutDay = input.nextInt();
                                    if (InPutDay < 0 || InPutDay > 30) {
                                        System.out.println("Thang " + Inputmonth + " chi co 30 ngay!");
                                        System.out.println("Nhap lai!!!");
                                    }
                                } while (InPutDay < 0 || InPutDay > 30);

                                break;
                            }
                            default: {

                                do {
                                    System.out.println("Hay nhap vao ngay nhap kho: ");
                                    InPutDay = input.nextInt();
                                    if (InPutDay < 0 || InPutDay > 28) {
                                        System.out.println("Thang " + Inputmonth + " chi co 28 ngay!");
                                        System.out.println("Nhap lai!!!");
                                    }
                                } while (InPutDay < 0 || InPutDay > 29);

                                break;
                            }
                        }

                        int Inputyear;
                        do {
                            System.out.println("Hay nhap vao nam nhap kho: ");
                            Inputyear = input.nextInt();
                            if (Inputyear < 0) {
                                System.out.println("Nam phai lon hon 0");
                            }
                        } while (Inputyear < 0);
                        int Outputmonth;
                        do {
                            System.out.println("Hay nhap vao thang xuat kho: ");
                            Outputmonth = input.nextInt();
                            if (Outputmonth < 0 || Outputmonth > 12) {
                                System.out.println("Phai nhap trong khoang tu 1 toi 12: ");
                            }
                        } while (Outputmonth < 0 || Outputmonth > 12);
                        int OutputDay;
                        switch (Outputmonth) {
                            case 1, 3, 5, 7, 8, 10, 12: {
                                do {
                                    System.out.println("Hay nhap vao ngay xuat kho: ");
                                    OutputDay = input.nextInt();
                                    if (OutputDay < 0 || OutputDay > 31) {
                                        System.out.println("Thang " + Outputmonth + " chi co 31 ngay!");
                                        System.out.println("Nhap lai!!!");
                                    }
                                } while (OutputDay < 0 || OutputDay > 31);
                                break;
                            }
                            case 4, 6, 9, 11: {
                                do {
                                    System.out.println("Hay nhap vao ngay xuat kho: ");
                                    OutputDay = input.nextInt();
                                    if (OutputDay < 0 || OutputDay > 30) {
                                        System.out.println("Thang " + Outputmonth + " chi co 30 ngay!");
                                        System.out.println("Nhap lai!!!");
                                    }
                                } while (OutputDay < 0 || OutputDay > 30);
                                break;
                            }
                            default: {
                                do {
                                    System.out.println("Hay nhap vao ngay xuat kho: ");
                                    OutputDay = input.nextInt();
                                    if (OutputDay < 0 || OutputDay > 28) {
                                        System.out.println("Thang " + Outputmonth + " chi co 28 ngay!");
                                        System.out.println("Nhap lai!!!");
                                    }
                                } while (OutputDay < 0 || OutputDay > 29);
                                break;
                            }
                        }
                        int Outputyear;
                        do {
                            System.out.println("Hay nhap vao nam xuat kho: ");
                            Outputyear = input.nextInt();
                            if (Inputyear < 0) {
                                System.out.println("Nam phai lon hon 0");
                            }
                            if (Outputyear < Inputyear) {
                                System.out.println("Nam xuat kho phai lon hon nam nhap kho!");
                            }
                        } while (Outputyear < 0 || Outputyear < Inputyear);
                        xecontay = new xecontay(Kind, Code, Brand, Price, InPutDay, Inputmonth, Inputyear, OutputDay,
                                Outputmonth, Outputyear);
                        dsxe.addPT1(xecontay);
                        break;
                    }
                    case 2: {
                        System.out.println("Hay nhap vao loai phu tung: ");
                        input.nextLine();
                        String Kind = input.nextLine();
                        System.out.println("Hay nhap vao hang san xuat: ");
                        String Brand = input.nextLine();
                        System.out.println("Hay nhap vao ma SP: ");
                        String Code = Brand + "-" + input.nextLine();
                        Double Price;
                        do {
                            System.out.println("Hay nhap vao gia san pham: ");
                            Price = input.nextDouble();
                            if (Price < 0) {
                                System.out.println("Gia tien phai lon hon 0");
                            }
                        } while (Price < 0);
                        int Inputmonth;
                        do {
                            System.out.println("Hay nhap vao thang nhap kho: ");
                            Inputmonth = input.nextInt();
                            if (Inputmonth < 1 || Inputmonth > 12) {
                                System.out.println("Phai nhap trong khoang tu 1 toi 12: ");
                            }
                        } while (Inputmonth < 1 || Inputmonth > 12);

                        int InPutDay;
                        switch (Inputmonth) {
                            case 1, 3, 5, 7, 8, 10, 12: {

                                do {
                                    System.out.println("Hay nhap vao ngay nhap kho: ");
                                    InPutDay = input.nextInt();
                                    if (InPutDay < 0 || InPutDay > 31) {
                                        System.out.println("Thang " + Inputmonth + " chi co 31 ngay!");
                                        System.out.println("Nhap lai!!!");
                                    }
                                } while (InPutDay < 0 || InPutDay > 31);

                                break;
                            }
                            case 4, 6, 9, 11: {

                                do {
                                    System.out.println("Hay nhap vao ngay nhap kho: ");
                                    InPutDay = input.nextInt();
                                    if (InPutDay < 0 || InPutDay > 30) {
                                        System.out.println("Thang " + Inputmonth + " chi co 30 ngay!");
                                        System.out.println("Nhap lai!!!");
                                    }
                                } while (InPutDay < 0 || InPutDay > 30);

                                break;
                            }
                            default: {

                                do {
                                    System.out.println("Hay nhap vao ngay nhap kho: ");
                                    InPutDay = input.nextInt();
                                    if (InPutDay < 0 || InPutDay > 28) {
                                        System.out.println("Thang " + Inputmonth + " chi co 28 ngay!");
                                        System.out.println("Nhap lai!!!");
                                    }
                                } while (InPutDay < 0 || InPutDay > 29);

                                break;
                            }
                        }

                        int Inputyear;
                        do {
                            System.out.println("Hay nhap vao nam nhap kho: ");
                            Inputyear = input.nextInt();
                            if (Inputyear < 0) {
                                System.out.println("Nam phai lon hon 0");
                            }
                        } while (Inputyear < 0);
                        int Outputmonth;
                        do {
                            System.out.println("Hay nhap vao thang xuat kho: ");
                            Outputmonth = input.nextInt();
                            if (Outputmonth < 0 || Outputmonth > 12) {
                                System.out.println("Phai nhap trong khoang tu 1 toi 12: ");
                            }
                        } while (Outputmonth < 0 || Outputmonth > 12);
                        int OutputDay;
                        switch (Outputmonth) {
                            case 1, 3, 5, 7, 8, 10, 12: {
                                do {
                                    System.out.println("Hay nhap vao ngay xuat kho: ");
                                    OutputDay = input.nextInt();
                                    if (OutputDay < 0 || OutputDay > 31) {
                                        System.out.println("Thang " + Outputmonth + " chi co 31 ngay!");
                                        System.out.println("Nhap lai!!!");
                                    }
                                } while (OutputDay < 0 || OutputDay > 31);
                                break;
                            }
                            case 4, 6, 9, 11: {
                                do {
                                    System.out.println("Hay nhap vao ngay xuat kho: ");
                                    OutputDay = input.nextInt();
                                    if (OutputDay < 0 || OutputDay > 30) {
                                        System.out.println("Thang " + Outputmonth + " chi co 30 ngay!");
                                        System.out.println("Nhap lai!!!");
                                    }
                                } while (OutputDay < 0 || OutputDay > 30);
                                break;
                            }
                            default: {
                                do {
                                    System.out.println("Hay nhap vao ngay xuat kho: ");
                                    OutputDay = input.nextInt();
                                    if (OutputDay < 0 || OutputDay > 28) {
                                        System.out.println("Thang " + Outputmonth + " chi co 28 ngay!");
                                        System.out.println("Nhap lai!!!");
                                    }
                                } while (OutputDay < 0 || OutputDay > 29);
                                break;
                            }
                        }
                        int Outputyear;
                        do {
                            System.out.println("Hay nhap vao nam xuat kho: ");
                            Outputyear = input.nextInt();
                            if (Inputyear < 0) {
                                System.out.println("Nam phai lon hon 0");
                            }
                            if (Outputyear < Inputyear) {
                                System.out.println("Nam xuat kho phai lon hon nam nhap kho!");
                            }
                        } while (Outputyear < 0 || Outputyear < Inputyear);
                        xeso xeso = new xeso(Kind, Code, Brand, Price, InPutDay, Inputmonth, Inputyear, OutputDay,
                                Outputmonth, Outputyear);
                        dsxe.addPT2(xeso);
                        break;
                    }

                    case 3: {
                        System.out.println("Hay nhap vao loai phu tung: ");
                        input.nextLine();
                        String Kind = input.nextLine();
                        System.out.println("Hay nhap vao hang san xuat: ");
                        String Brand = input.nextLine();
                        System.out.println("Hay nhap vao ma SP: ");
                        String Code = Brand + "-" + input.nextLine();
                        Double Price;
                        do {
                            System.out.println("Hay nhap vao gia san pham: ");
                            Price = input.nextDouble();
                            if (Price < 0) {
                                System.out.println("Gia tien phai lon hon 0");
                            }
                        } while (Price < 0);
                        int Inputmonth;
                        do {
                            System.out.println("Hay nhap vao thang nhap kho: ");
                            Inputmonth = input.nextInt();
                            if (Inputmonth < 1 || Inputmonth > 12) {
                                System.out.println("Phai nhap trong khoang tu 1 toi 12: ");
                            }
                        } while (Inputmonth < 1 || Inputmonth > 12);

                        int InPutDay;
                        switch (Inputmonth) {
                            case 1, 3, 5, 7, 8, 10, 12: {

                                do {
                                    System.out.println("Hay nhap vao ngay nhap kho: ");
                                    InPutDay = input.nextInt();
                                    if (InPutDay < 0 || InPutDay > 31) {
                                        System.out.println("Thang " + Inputmonth + " chi co 31 ngay!");
                                        System.out.println("Nhap lai!!!");
                                    }
                                } while (InPutDay < 0 || InPutDay > 31);

                                break;
                            }
                            case 4, 6, 9, 11: {

                                do {
                                    System.out.println("Hay nhap vao ngay nhap kho: ");
                                    InPutDay = input.nextInt();
                                    if (InPutDay < 0 || InPutDay > 30) {
                                        System.out.println("Thang " + Inputmonth + " chi co 30 ngay!");
                                        System.out.println("Nhap lai!!!");
                                    }
                                } while (InPutDay < 0 || InPutDay > 30);

                                break;
                            }
                            default: {

                                do {
                                    System.out.println("Hay nhap vao ngay nhap kho: ");
                                    InPutDay = input.nextInt();
                                    if (InPutDay < 0 || InPutDay > 28) {
                                        System.out.println("Thang " + Inputmonth + " chi co 28 ngay!");
                                        System.out.println("Nhap lai!!!");
                                    }
                                } while (InPutDay < 0 || InPutDay > 29);

                                break;
                            }
                        }

                        int Inputyear;
                        do {
                            System.out.println("Hay nhap vao nam nhap kho: ");
                            Inputyear = input.nextInt();
                            if (Inputyear < 0) {
                                System.out.println("Nam phai lon hon 0");
                            }
                        } while (Inputyear < 0);
                        int Outputmonth;
                        do {
                            System.out.println("Hay nhap vao thang xuat kho: ");
                            Outputmonth = input.nextInt();
                            if (Outputmonth < 0 || Outputmonth > 12) {
                                System.out.println("Phai nhap trong khoang tu 1 toi 12: ");
                            }
                        } while (Outputmonth < 0 || Outputmonth > 12);
                        int OutputDay;
                        switch (Outputmonth) {
                            case 1, 3, 5, 7, 8, 10, 12: {
                                do {
                                    System.out.println("Hay nhap vao ngay xuat kho: ");
                                    OutputDay = input.nextInt();
                                    if (OutputDay < 0 || OutputDay > 31) {
                                        System.out.println("Thang " + Outputmonth + " chi co 31 ngay!");
                                        System.out.println("Nhap lai!!!");
                                    }
                                } while (OutputDay < 0 || OutputDay > 31);
                                break;
                            }
                            case 4, 6, 9, 11: {
                                do {
                                    System.out.println("Hay nhap vao ngay xuat kho: ");
                                    OutputDay = input.nextInt();
                                    if (OutputDay < 0 || OutputDay > 30) {
                                        System.out.println("Thang " + Outputmonth + " chi co 30 ngay!");
                                        System.out.println("Nhap lai!!!");
                                    }
                                } while (OutputDay < 0 || OutputDay > 30);
                                break;
                            }
                            default: {
                                do {
                                    System.out.println("Hay nhap vao ngay xuat kho: ");
                                    OutputDay = input.nextInt();
                                    if (OutputDay < 0 || OutputDay > 28) {
                                        System.out.println("Thang " + Outputmonth + " chi co 28 ngay!");
                                        System.out.println("Nhap lai!!!");
                                    }
                                } while (OutputDay < 0 || OutputDay > 29);
                                break;
                            }
                        }
                        int Outputyear;
                        do {
                            System.out.println("Hay nhap vao nam xuat kho: ");
                            Outputyear = input.nextInt();
                            if (Inputyear < 0) {
                                System.out.println("Nam phai lon hon 0");
                            }
                            if (Outputyear < Inputyear) {
                                System.out.println("Nam xuat kho phai lon hon nam nhap kho!");
                            }
                        } while (Outputyear < 0 || Outputyear < Inputyear);
                        xetayga xetayga = new xetayga(Kind, Code, Brand, Price, InPutDay, Inputmonth, Inputyear,
                                OutputDay,
                                Outputmonth, Outputyear);
                        dsxe.addPT3(xetayga);
                        break;
                    }
                    case 4: {
                        dsxe.xuatthongtin1();
                        break;
                    }
                    case 5: {
                        dsxe.xuatthongtin2();
                        break;
                    }
                    case 6: {
                        dsxe.xuatthongtin3();
                        break;
                    }
                    case 7: {
                        int quantity;
                        System.out.println("\nChon thong ke danh sach so luong cua loai phu tung xe: ");
                        System.out.println("1. Danh sach phu tung xe con tay.");
                        System.out.println("2. Danh sach phu tung xe so.");
                        System.out.println("3. Danh sach phu tung xe tay ga.\n");
                        System.out.print("Chon: ");

                        do {
                            quantity = input.nextInt();
                            if (quantity < 1 || quantity > 3) {
                                System.out.println("\n-------ERROR-------");
                                System.out.println("Phai nhap trong khoang tu 1->3");
                                System.out.println("Chon thong ke danh sach so luong cua loai xe: ");
                                System.out.println("1. Danh sach phu tung xe con tay.");
                                System.out.println("2. Danh sach phu tung xe so.");
                                System.out.println("3. Danh sach phu tung xe tay ga.");
                                System.out.print("Chon: ");

                            } else {
                                switch (quantity) {
                                    case 1: {
                                        System.out.println("\nSo luong phu tung xe con tay: " + dsxe.soluongpt1());
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("\nSo luong phu tung xe so: " + dsxe.soluongpt2());
                                        break;
                                    }
                                    case 3: {
                                        System.out.println("\nSo luong phu tung xe tay ga: " + dsxe.soluongpt3());
                                        break;
                                    }
                                }
                            }
                        } while (quantity < 1 || quantity > 3);
                        break;
                    }
                    case 8: {
                        int x;
                        System.out.println("\nKiem tra phu tung xe.");
                        System.out.println("1: Kiem tra phu tung xe con tay.");
                        System.out.println("2: Kiem tra phu tung xe so.");
                        System.out.println("3: Kiem tra phu tung xe tay ga.");
                        System.out.print("Chon: ");

                        do {
                            x = input.nextInt();
                            if (x < 1 || x > 3) {
                                System.out.println("\n------ERROR-------");
                                System.out.println("Phai nhap trong khoang tu 1->3");
                                System.out.println("Kiem tra phu tung xe.");
                                System.out.println("1: Kiem tra phu tung xe con tay.");
                                System.out.println("2: Kiem tra phu tung xe so.");
                                System.out.println("3: Kiem tra phu tung xe tay ga.");
                                System.out.print("Chon: ");

                            } else {
                                switch (x) {
                                    case 1: {
                                        System.out.println("\nNhap ma san pham de kiem tra");
                                        input.nextLine();
                                        String codeCheck = input.nextLine();
                                        xecontay xecontay = new xecontay(codeCheck);
                                        System.out.println("Kiem tra phu tung co trong danh sach: "
                                                + dsxe.kiemTraPhuTungXe1(xecontay));
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("\nNhap ma san pham de kiem tra");
                                        input.nextLine();
                                        String codeCheck = input.nextLine();
                                        xeso xeso = new xeso(codeCheck);
                                        System.out.println(
                                                "Kiem tra phu tung co trong danh sach: "
                                                        + dsxe.kiemTraPhuTungXe2(xeso));
                                        break;
                                    }
                                    case 3: {
                                        System.out.println("\nNhap ma san pham de kiem tra");
                                        input.nextLine();
                                        String codeCheck = input.nextLine();
                                        xetayga xetayga = new xetayga(codeCheck);
                                        System.out.println("Kiem tra phu tung co trong danh sach: "
                                                + dsxe.kiemTraPhuTungXe3(xetayga));
                                        break;
                                    }
                                }
                            }

                        } while (x < 1 || x > 3);

                        break;
                    }
                    case 9: {
                        int x;
                        System.out.println("\nXuat thong tin danh sach theo gia tang dan.");
                        System.out.println("1: Danh sach phu tung xe con tay.");
                        System.out.println("2: Danh sach phu tung xe so.");
                        System.out.println("3: Danh sach phu tung xe tay ga.");
                        System.out.print("Chon: ");

                        do {
                            x = input.nextInt();
                            if (x <= 0 || x > 3) {
                                System.out.println("\n----------ERROR----------");
                                System.out.println("Vui long chon trong khoang 1 toi 3!!!!!");
                                System.out.println("Xuat thong tin danh sach theo gia tang dan.");
                                System.out.println("1: Danh sach phu tung xe con tay.");
                                System.out.println("2: Danh sach phu tung xe so.");
                                System.out.println("3: Danh sach phu tung xe tay ga.");
                                System.out.print("Chon: ");

                            }
                        } while (x <= 0 || x > 3);
                        switch (x) {
                            case 1: {
                                dsxe.sapXepTheoPtTangDan1();
                                dsxe.xuatthongtin1();
                                break;
                            }
                            case 2: {
                                dsxe.sapXepTheoPtTangDan2();
                                dsxe.xuatthongtin2();
                                break;
                            }
                            case 3: {
                                dsxe.sapXepTheoPtTangDan3();
                                dsxe.xuatthongtin3();
                                break;
                            }
                        }
                        break;
                    }
                    case 10: {
                        int x;
                        System.out.println("\nXuat thong tin danh sach theo gia giam dan.");
                        System.out.println("1: Danh sach phu tung xe con tay.");
                        System.out.println("2: Danh sach phu tung xe so.");
                        System.out.println("3: Danh sach phu tung xe tay ga.");
                        System.out.print("Chon: ");

                        do {
                            x = input.nextInt();
                            if (x <= 0 || x > 3) {
                                System.out.println("\n----------ERROR----------");
                                System.out.println("Vui long chon trong khoang 1 toi 3!!!!!");
                                System.out.println("Xuat thong tin danh sach theo gia giam dan.");
                                System.out.println("1: Danh sach phu tung xe con tay.");
                                System.out.println("2: Danh sach phu tung xe so.");
                                System.out.println("3: Danh sach phu tung xe tay ga.");
                                System.out.print("Chon: ");

                            }
                        } while (x <= 0 || x > 3);
                        switch (x) {
                            case 1: {
                                dsxe.sapXepTheoPtGiamDan1();
                                dsxe.xuatthongtin1();
                                break;
                            }
                            case 2: {
                                dsxe.sapXepTheoPtGiamDan2();
                                dsxe.xuatthongtin2();
                                break;
                            }
                            case 3: {
                                dsxe.sapXepTheoPtGiamDan3();
                                dsxe.xuatthongtin3();
                                break;
                            }
                        }
                        break;
                    }
                    case 11: {
                        int x;
                        System.out.println("Xoa thong tin phu tung.");
                        System.out.println("1: Xoa thong tin trong danh sach xe con tay");
                        System.out.println("2: Xoa thong tin trong danh sach xe so");
                        System.out.println("3: Xoa thong tin trong danh sach xe tay ga");
                        System.out.print("Chon: ");

                        do {
                            x = input.nextInt();
                            if (x < 1 || x > 3) {
                                System.out.println("\n-----ERROR-----");
                                System.out.println("Phai nhap trong khoang tu 1->3");
                                System.out.println("Xoa thong tin phu tung.");
                                System.out.println("1: Xoa thong tin trong danh sach xe con tay");
                                System.out.println("2: Xoa thong tin trong danh sach xe so");
                                System.out.println("3: Xoa thong tin trong danh sach xe tay ga");
                                System.out.print("Chon: ");

                            } else {
                                switch (x) {
                                    case 1: {
                                        System.out.println("Nhap ma phu tung cua xe con tay: ");
                                        input.nextLine();
                                        String codeCheck = input.nextLine();
                                        xecontay xecontay = new xecontay(codeCheck);
                                        System.out.println("Xoa thong tin phu tung: " + dsxe.xoaThongTin1(xecontay));
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("Nhap ma phu tung cua xe so: ");
                                        input.nextLine();
                                        String codeCheck = input.nextLine();
                                        xeso xeso = new xeso(codeCheck);
                                        System.out.println("Xoa thong tin phu tung : " + dsxe.xoaThongTin2(xeso));
                                        break;
                                    }
                                    case 3: {
                                        System.out.println("Nhap ma phu tung cua xe tay ga ");
                                        input.nextLine();
                                        String codeCheck = input.nextLine();
                                        xetayga xetayga = new xetayga(codeCheck);
                                        System.out.println("Xoa thong tin phu tung : " + dsxe.xoaThongTin3(xetayga));
                                        break;
                                    }
                                }
                            }
                        } while (x < 1 || x > 3);
                        break;
                    }
                    case 12: {
                        System.out.println("Tran trong cam on.");
                        break;
                    }

                }
            }
        } while (a != 12);
        input.close();
    }
}
