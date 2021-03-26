/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhnhv.mathutil;

/**
 *
 * @author DELL
 */
public class MathUtility {
    //class này chứa có hàm toán học fake lại class chuẩn JDK
    //java.util.Math bên trong chứa các hàm toán học sqrt() abs() sin().
    //cái gì dùng chung cho mọi nơi, thì ta sẽ đặt là static
    
    public static final double PI = 3.1415;
    
    //hàm dùng chung tính giai thừa ()
    //quy ước n! = 1.2.3.4...n
    //0! = 1! = 1
    //ko có giai thừa âm
    //giai thừa tăng rất nhanh, 20! vừa khớp kiểu long
    //21! tràn long, bị sai nếu ráng lưu biến long
    //long: 10^18 18 con số 0
    
//    public static long getFactiorial(int n)
//    {
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid argument. N must be between 0...20");
//        
//        //CPU chạy đến đây, sure n từ 0...20
//        if(n == 0 || n == 1)
//            return 1;
//        
//        //CPU chạy đến đây sure n = 2..20
//        long result = 1; //cố tình heng để thấy đỏ
//        for (int i = 2; i <= n; i++) 
//            result *= i;
//        
//        return result;
//    }
    
    public static long getFactiorial(int n)
    {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. N must be between 0...20");
        
        //CPU chạy đến đây, sure n từ 0...20
        if(n == 0 || n == 1)
            return 1;
        
        return n * getFactiorial(n - 1); //xong đệ quy
        
        // n! = n * (n - 1)!
    }
}
