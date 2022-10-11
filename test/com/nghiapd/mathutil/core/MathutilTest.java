/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.nghiapd.mathutil.core;

import com.nghiapd.mathutil.main.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.Test;



/**
 *
 * @author ADMIN
 */
public class MathutilTest {

    //Framework ép dev phải viết code theo 1 khung đựng sẵn nào đó
    //thường khung đc ký hiệu = @....., annotation - flag đánh dấu 1 điều gì đó sẽ diễn ra lúc biên dịch, runtime
    
//    @Test   //test thử hàm so sánh 2 giá trọ expected và actual
//            //máy tự so sánh giùm luôn, kh nhìn = mắt để tự so sánh như bên hàm main() dùng sout()
//            //mà FW JUnit tự generate ra code so sánh giá trị, tự dùng bảng màu XANH ĐỎ mang ý nghĩa PASSED FAILED
//    public void tryAssert(){
//        Assert.assertEquals(100, 100);
//    }
//    
//    //Test hàm getFactorial() nhà mình, như bên main() nhưng chơi kiểu xanh đỏ
//    
//    @Test   //quy tắc đặt tên hàm dành cho kiểm thử 
//            //tên hàm bao hàm ngữ nghĩa của việc kiểm thử
//            //test này kiểm tra tính gt cới tham số tử tế 0..20
//    public void testFactorialGivenRightArgumentReturnsWell(){
//        //Test case #1: n = 0, 0! hy vọng trả về 1. thực tế hàm trả về mấy chạy mới biết
//        long expected = 1;
//        long actual = MathUtil.getFactorial(0);
//        
//        Assert.assertEquals(expected, actual);
//
//        //Test case #2: n = 1, 1! hy vọng trả về 1. thực tế ?
//        Assert.assertEquals(1, MathUtil.getFactorial(1));
//        
//        //Test case #3: n = 2, 2! hy vọng trả về 1. thực tế ?
//        Assert.assertEquals(2, MathUtil.getFactorial(2));
//
//    }
//    
//    @Test
//    public void testFactorialGivenRightArgumentReturnsWell2(){
//        
//        //Test case #4: n = 3, 3! hy vọng trả về 1. thực tế ?
//        Assert.assertEquals(6, MathUtil.getFactorial(3));
//        
//        //Test case #5: n = 4, 4! hy vọng trả về 1. thực tế ?
//        Assert.assertEquals(24, MathUtil.getFactorial(4));
//
//    }
    
    //KIỂM THỬ NGOẠI LỆ KHI ĐƯA DÂT CÀ CHỚN!!!
    //n < 0, kh tính giai thừa âm
    //n > 20, k tính giai thừa tràn kiểu long
    //hàm đc thiết kế: NÉM RA NGOẠI LỆ TÊN LÀ Illegal-Argument-Exception
    //THAY VÌ NHẬN VỀ 1 GIÁ TRỊ LONG, BẠN NHẬN VỀ 1 CÂU CHỬI
    //TA ĐO LƯỜNG CÓ CÂU CHỬI XUẤT HIỆN HAY KH KHI N = -5
    //THẤY NGOẠI LỆ MỪNG RƠI NƯỚC MẮT
    
    //NẾU -5 mà app ném ra ngoại lệ IllegalArgumentException 
    //nghĩa là hàm ổn, chạy như thiết kế, như kì vọng
    //vậy nghĩa là hàm passed màu xanh!!!
    //đúng kì vọng ~~~ MÀU XANH
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException(){
        MathUtil.getFactorial(5);
        
        //Test case #6: n = -5, expected: hy vọng thấy ngoại lệ
        //tên là IllegalArgumentException
    }
    
    
    
}
    //@Test: là 1 kí hiệu annotation báo với JUnit va JVM để generate cái hàm tryAssert() thành main() truyền thống
    //và gửi cho JVM để chạy. App chạy từ main()
    //thiếu @Test tương đương app thiếu main() no-runable

    //CHỐT DEAL XANH ĐỎ
    //NẾU TẤT CẢ CÁC TEST CASES, @TEST ĐỀU MÀU XANH -> KẾT LUẬN HÀM ĐÚNG CHO NHỮNG THỨ MÌNH ĐÃ TEST,XANH CUỐI CÙNG KHI TẤT CẢ @TEST PHẢI XANH
        //1. XANH KHI TẤT CẢ CÙNG XANH
        
        //NẾU TRONG CÁC @TEST CÓ ÍT NHẤT 1 THẰNG ĐỎ XEM NHƯ TẤT CẢ LÀ ĐỎ, Ý NGHĨA LÀ HÀM ĐÚNG THÌ PHẢI ĐÚNg HẾT, 
        //CÓ 1 THẰNG SAU HÀM KH ỔN ĐỊNH VỀ KẾT QUẢ -> PHẢI GỌI LÀ HÀM SAI

        //2. ĐỎ KHI CÓ ÍT NHẤT 1 THẰNG ĐỎ
        //ĐỎ ĐẾN TỪ 1 TRONG TÌNH HUỐNG
        //EXPECTED đã tính đúng, ACTUAL trả về sau -> BUG CỦA HÀM
        //EXPEXTED dã tính/gõ sai, ACTUAL sai đúng