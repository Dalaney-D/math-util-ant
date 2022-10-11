/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.nghiapd.mathutil.core;

import com.nghiapd.mathutil.main.MathUtil;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author ADMIN
 */
@RunWith(value = Parameterized.class) //class này chuẩn bị chơi trò tách data 
//ra khỏi câu lệnh xanh đỏ để kiểm soát các
//test case
// thư viện JUnit sẽ tự generate thêm code phía hậu trường
//lúc biên dịch để giúp hiện thức hoá ý tưởng DDT
//ví dụ nó sẽ tự biết lấy data ở mảng 2 chiều nào đó nhồi vào hàm assertEquals()
//ép ta phải viết code theo cách nào đó định trước mới chạy đc

public class MathUtilDDTTest {
    //ta tự tạo 1 hàm trả về mảng 2 chiều chứa danh sách data mà ta dự định
    //nhồi vào hàm getF() và assertEquals()
    //phần duyệt mảng để nhồi vào hàm test thì FW tự lo

    @Parameterized.Parameters //bộ data nè
    public static Object[][] initData() {
        int a[] = {5, 10, 15, 20, 25};
        //mảng có giá trị ngay lúc khai báo thì dùng {}
        return new Integer[][]{
            {1, 0},
            {1, 1},
            {2, 2},
            {6, 3},
            {24, 4},
            {120, 5},
            {720, 6},};
        
    }
    @Parameterized.Parameter(value = 0)
    public long expected; //biến này sẽ lưu giá trị kì vọng khi
    //xài hàm getF() => expected

    @Parameterized.Parameter(value = 1)
    public int n; // biến này sẽ lưu giá trị khi đưa cho hàm getF() để check
    //ta sẽ map 2 biến này ứng với 2 cột của từng dòng
    //của mảng ở trên
    //thứ tự biến ko quan trọng, thứ tự cột trong mảng ko quan trọng
    //vì ta sẽ cấu hình việc map tương ứng này !!!

    //test thôi
    @Test
    public void testFactorialGivenRightArgumentReturnWell() {
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
    
    public MathUtilDDTTest() {
    }
    
}

//DDT: Data Driven Testing, là 1 kỹ thuật viết code kiểm thử dùng trong 
//Unit Test, dùng để viết code test các hàm/class một cách dễ đọc hơn!!!
//bằng cách tách data kiểm thử và câu lệnh test hàm thành 2 nơi khác nhau
//ví dụ cách cũ, no-DDT:
//assertEqual(0, getF(0))
//assertEqual(1, getF(1))
//assertEqual(2, getF(2))
//assertEqual(6, getF(3))
//assertEqual(24, getF(4))
//assertEqual(120, getF(5))
//assertEqual(720, getF(6))
//cách này dễ viết nhưng khó kiểm tra đủ hết tập test cases cần test, trộn lẫn data đưa vào, 
//và câu lệnh gọi hàm kiểm thử
//KĨ THUẬT TÁCH DATA 00, 11, 22, 63, 224
//để riêng ra 1 chỗ, sau đó nhồi fill/feed nạp chúng vào lệnh gọi hàm assertEqual(?, getF(?))
//giúp code trong sáng dễ hiểu
//kỹ thuật này gọi là: DATA DRIVEN TESTING
//                  tách data   hướng về    code kiểm thử
//THAM SỐ HÓA DATAA - BIẾN DATA RA 1 NƠI, ĐẶT CHO CHÚNG TÊN BIẾN
//LÁT HỒI NHỒI VÀO LỆNH SO SÁNH
//THAM SỐ HÓA - BIẾN DATA THÀNH BIẾN THAM SỐ - PARAMETERIZED
//1 | 0
//1 | 1
//2 | 2
//6 | 3
//hình dáng của mảng 2 chiều

//JUnit sẽ tự tách mảng thành các test case
//chạy so sánh xanh đỏ của từng test case và đưa ra kết luận
//xanh khi tất cả cùng xanh
//Đỏ khi chỉ cần 1 đỏ
//Đỏ có 2 tình huống:
//đỏ do có sự != giữa expected và actual
//đỏ vì expected != actual vậy ko bằng nhau vì lý do gì?
//1. expected là giá trị tính toán trc, hàm phải trả về bằng đc giá trị này
//và expected mình tính = tay khi chưa dùng app, phải tính ĐÚNG
//2. expected mình tính bằng tay và đã sai (kì vọng đã sai trước khi hàm trả về)
//cho dù kết quả trả về có đúng thì cũng màu đỏ. Kì vọng sai thì ko thể
//kết luận đc hàm có bug hay ko