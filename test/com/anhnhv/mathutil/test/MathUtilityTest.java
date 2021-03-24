/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhnhv.mathutil.test;

import com.anhnhv.mathutil.MathUtility;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class MathUtilityTest {

    //ta sẽ viết những đoạn code ở đây để test cái hàm chính getFactorial()
    //bên MathUtility coi mày chạy có đúng không
    //viết code để test code chính
    //đúng sai ở đây chúng tôi dùng màu sắc XANH ĐỎ
    @Test //biến hàm thường thành hàm main()
    //Shift-F6 để chạy
    
    public void testFactorialGivenRightArgumentReturnsGoodResult() {
        
        int n = 5; //tui muốn tính 5!
        long expected = 120;    //tui hy vọng trả về 120
        long actual = MathUtility.getFactiorial(n);
        assertEquals(expected, actual);
        //khớp màu xanh, sai lệch màu đỏ
        //màu xanh xuất hiện khi tất cả các tình huống xài hàm
        //test case đều xanh
        //màu đỏ xuất hiện ngay khi có ít nhất 1 thằng đỏ 
        //                          một test case sai, tất cả bỏ đi
        //ẩn ý: hàm đã đúng thì phải đúng cho tất cả các tình huống
        //mình test
        
        assertEquals(720, MathUtility.getFactiorial(6)); //6! có đúng là 720 hông
        assertEquals(24, MathUtility.getFactiorial(4));
        assertEquals(6, MathUtility.getFactiorial(3));
        assertEquals(2, MathUtility.getFactiorial(2));
        assertEquals(1, MathUtility.getFactiorial(1));
        assertEquals(1, MathUtility.getFactiorial(0));
    
    }   //khi màu đỏ thì có 2 tình huống: hàm bạn tính sai không như kì vọng
        //                                hàm tính đúng, bạn kì vọng sai
    
    //ta sẽ đi test hàm có ném ra ngoại lệ như thiết kế hay kh
    //hàm dược thiết kế rằng: đưa tham số / 0..20 --> tính đúng n!
    //hàm được thiết kế rằng: đưa tham số cà chớn, < 0 > 20
    //                          ném ra ngoại lệ cảnh báo sai tham số, ngoài
    //                          miền giá trị tính !
    //chốt: đưa tham số cà chớn phải ném về ngoiaj lệ
    //      nếu thấy đúng là ném về ngoiaj lệ khi đưa tham số cà chớn
    //      thì kết luận hàm đúng, XANH
    //thấy ngoại lệ khi đưa n cà chớn, mừng rơi nước mắt vì hàm chạy 
    //đúng như thiết kế
    //ngoại lệ xuất hiện khi 5! thì là hàm đúng mà
    //ngoại lệ thì ko phải giá trị để so sánh kiểu assertEquals()
    //vậy ta phải dùng kiểu khác !!!
    //@Test(expected = Exception.class) //ko nếu bắt mức cao nhất
                                        //mặc dù ko sai
    @Test(expected = IllegalArgumentException.class)
    public void getFactorialGivenWrongArgumentThrowsException()
    {
        MathUtility.getFactiorial(40);
        MathUtility.getFactiorial(-40);
    }   //cá luôn 2 thằng này phải ném ra ngoại lệ IllegalArgumentException

}