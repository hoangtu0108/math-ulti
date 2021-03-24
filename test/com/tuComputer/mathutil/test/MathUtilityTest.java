/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuComputer.mathutil.test;

import com.tuComputer.methutil.MathUtlity;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hoang Tu
 */
public class MathUtilityTest {
    
    // ta sẽ viết những doạn code ở đây để test cái hàm chính getFactorial()
    // bên MathUtility ccoi mày chayj có đúng không
    // viết code để test code chính
    // đúng sai ở đây chúng tôi dùng màu sắc XANH ĐỎ
    @Test  // biến hàm thường thành hàm main ()
    // Shift - F6 để chạy
    public void testFactorialGivenRightArgumentGoodResult(){
        
        int n = 5; // tui muon tinh 5!
        long expect = 120; // tui hi vọng trả về 120
        long actual = MathUtlity.getFactorial(n);
        assertEquals(expect, actual);
        
        // khớp thì màu xanh, sai lệch màu đỏ
        // màu xanh xuất hiện khi tất cả các tình huống xài hàm
        // test case đều xanh
        // màu đỏ xuất hiện ngay khi có ít nhất 1 thằng đỏ 
        // 1 test case sai, all bỏ 
        // ẩn ý; hàm đã đúng thì phải đúng cho tất cả các case
        // mình test
        
        assertEquals(720, MathUtlity.getFactorial(6)); //6! có đúng là 720 ko?
        assertEquals(24, MathUtlity.getFactorial(4));
        assertEquals(6, MathUtlity.getFactorial(3));
        assertEquals(2, MathUtlity.getFactorial(2));
        assertEquals(1, MathUtlity.getFactorial(1));
        assertEquals(1, MathUtlity.getFactorial(0));
        //           0
        
        
        
    }// khi màu đỏ thì có 2 tình huống: hàm bạn tính sai ko như kì vọng
     //                                 hàm tính đúng, bạn kì vọng saii
    
    // ta sẽ đi test hàm có ném ra ngoại lệ như thiết kế hay ko
    // hàm được thiết kế rằng đưa tham số n 0...20 => tính đúng n!
    // hàm đc thiết kế rằng: đưa tham số cà chớn, < 0 > 20
    //                       ném ra ngoại lệ cảnh báo sai tham số, ngoài miền giá trị tính!
    // chốt: đưa tham số cà chớn phải ném về ngoại lệ
    //       nếu thấy đúng là ném về ngoại lệ khi đưa tham số cà chơn thì kế luận hàm ĐÚNG. XANH
    // thấy ngoại lệ khi đưa n cà chớn, mừng rơi nước mắt vì hàm chạy
    // đúng như thiết kế
    // ngoại lệ xuất hiện khi 5! thì là hàm đúng mà
    // ngoại lệ thì không phải là giá trị để so sánh kiểu assertEquals()
    // vậy ta phải dùng kiểu khác !!
    
    //  @Test (expected = Exception.class) // không nên bắt mức cao nhất
                                           // mặc dù không saig 
   @Test (expected = IllegalArgumentException.class)
    public void getFactorialGivenWrongArgumentThrowException (){
    MathUtlity.getFactorial(40);
    MathUtlity.getFactorial(-40);
    
    }// cá luôn 2 thằng này phải ném về ngoại lệ  IllegalArgumentException
}
