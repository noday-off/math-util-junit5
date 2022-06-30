/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trthinh.mathutil.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Tri Thinh
 */
public class MathUtilTest {

    // chơi DDT, tách data ra khỏi câu lệnh kiểm thử, tham số hóa data này
    // vào torng câu lệnh kiểm thử
    //chuẩn bị bộ data
    private static Object[][] initData() {
        return new Integer[][]{
            {1, 1},
            {2, 2},
            {5, 120},
            {6, 120}
        };
    }

    @ParameterizedTest
    @MethodSource("initData") //tên hàm cung cấp data, ngầm định thứ tự của các phần tử mảng, map vào tham số hàm
    public void testGetFactorialGivenRightArgReturnsWell(int input, long expected) {
        assertEquals(expected, MathUtil.getFactorial(input));
    }

    @org.junit.jupiter.api.Test
    public void testGetFactorialGivenWrongArgThrowException() {
        //xài biểu thức Lambda
        //hàm nhận tham số thứ 2 là 1 cái object có code implement cái
        //functional interface tên là Executable - có 1 hàm duy nhất ko code
        //tên là execute()
        //chơi chậm
//        Executable excObject = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                MathUtil.getFactorial(-5);
//            }
//        };

//        Executable excObject = () -> MathUtil.getFactorial(-5);
        assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(-5));
    }

}
