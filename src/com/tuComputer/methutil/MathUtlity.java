    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuComputer.methutil;

/**
 *
 * @author Hoang Tu
 */
public class MathUtlity {
    //class này chứa các hàm toán học fake lại class chuản của JDK
    //java.util.Math bên trong chứa các hàm toán học sqrt() abs() sin()...
    // cái gì mà dùng chung cho mọi nơi thì ta sẽ đặt là static
    public static final double PI = 3.141;
   
    // hàm dùng chung tính giai thừa ()
    // quy ước n! = 1.2.3.4.5.....n
    // 0! = 1! =1
    // không có giai thừa số âm
    // giai thừa tăng rất nhanh, 20! vừa khớp kiểu long
    // 21! tràn long, bị sai nếu ráng lưu biến long
    // long: 10^18 18 con số 0
    public static long getFactorial (int n){
    if (n < 0 || n > 20)
        throw new IllegalArgumentException("Invalid argument. N must e between 0...20");
        
    // CPU chạy đến đây, sure n từ 0...20
    if ( n == 0 || n == 1)
        return 1;
    
    
    
    // CPU chạy đến đây sure n = 2..20
    long result = 1;   // cố tình để 0
    for  (int i = 2; i <= n; i++)
        result *= i;
    
    return result;
    
    
    }
}
