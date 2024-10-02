
import  luatdoanhnghiep.khoinhanuoc.tienluong.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        int tham_nien_cong_tac = 8;
        double luong =
                TienLuong.luongCoBan(TienLuong.BAC_CAO_DANG,
                        tham_nien_cong_tac);
        System.out.println("Lương của nhân viên : " + luong);
        System.out.println("Phí bảo hiểm : " +
                TienLuong.soTienBaoHiem(luong));
    }
}