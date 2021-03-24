/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuComputer.mathutil.main;

import com.tuComputer.methutil.MathUtlity;

/**
 *
 * @author Hoang Tu
 */
public class Main {
    
    public static void main(String[] args) {
        // test xem 5! có bằng 120 ko
        long expected = 120; //hi vong 120 là giá trị trả về
        int n = 5;          // nếu tui tính 5!
        long actual = MathUtlity.getFactorial(n);
                //actual: cái value hàm thực sử trả về
                // ta đi so sánh = mắt để luận xem hàm ta viết chạy đúng hay không
        System.out.println("5!: Expected:" + expected + ";Actual: " + actual);
        
        // tình huống test số 2, 0! xem sao?
        // TÌNH HUỐNG TEST, TÌNH HUỐNG XÀI, GỌI LÀ TEST CASE
        n = 0;          // tui muốn tính 0!
        expected = 1;  //hi vọng nhận về 1
        actual = MathUtlity.getFactorial(n);
        System.out.println("0!: Expected: " + expected + "; Actual: " +actual);
                     
        
        
//        System.out.println("Hello GitHub");
//        System.out.println("This is 1st upload connects to remote GitHub server");
    
    }
}

// trong quy trình lập trình chuyên nghiệp/ ở các cty, đặc biệt làm cho JP
// mọi hàm/class bạn viết ra đều phải đc test kĩ càng trc khi ghép
// nó vào trong các cụm tính năng, và ghép với UI, back-end
// làm sao để test các hàm, các class
// dân dev có nhiều cách
// 1. Cách 1: sout ( kết quả xử lí của hàm)
// 2. Cách 2: JOptionPane (pop-up lên kết quả xử lí hàm) bên Java Desktop
// 3. Cách 3: ghi vào LOG file trong môn Java Web, hay in kết quả xử lí
//            ra 1 trang web tạm nào đó
// với 3 cách này, ta gọi hàm, nhìn kết quả  trả về của hàm - ACTUAL VALUE 
// và ta so sánh với các kết quả mà ta tự tính toán trước đó
// khi chưa gọi hàm- ta gọi là GIÁ TRỊ KÌ VỌNG - EXPECTED VALUE
// nếu EXPECCTED VALUE == ACTUAL VALUE (thực tế và kì vọn khớp nhau)
// HÀM CHẠY ĐÚNG
// nếu không bằng, hàm xử lí sai
// 3 cách trên đòi hỏi dev phải dùng mắt để luận kết quả đúng sai
// nhiều test case cần phải test, ta rất dễ bỏ sót, nhìn sai kết quả
// KĨ THUẬT TEST NHƯ Ở TRÊN GỌI LÀ MANUAL TEST
// TEST KHI CODE VỪA MỚI XONG TỪNG HÀM GỌI LÀ UNIT TEST

// CÒN CÁCH XỊN XÒ thứ 4
// ta hông cần nhìn = mắt từng trường hợp sử dụng hàm
// ta nhờ máy so sánh dùm actual với expected luôn
// và nếu tất cả các tình huống đều khớp( bằng nhau) ném ra 1 màu xanh
// nếu hầu hết đều khớp, chỉ có ít nhất 1 cái không khớp(hàm không ổn định) 
// ném ra màu đỏ -> cảnh báo dân dev code có trục trặc
// vậy lúc này ta chỉ nhìn màu là đủ , ko cần luận từng kết quả
// kĩ thuật này gọi là test driven development + test automation  (tự động hóa việc test)
//  vừa viết code vừa viết test 
// muốn làm đc điều này ta cần thêm thư viện phụ trợ để tung ra màu
// thư viện này đều có tương ứng ở các ngôn ngữ lập trình
// JAVA: JUnit, TESTNG...
//C#: NUnit, xUnit, MSTest
// PHP : PHPUnit
// ...

