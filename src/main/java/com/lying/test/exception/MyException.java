/**
 * className:MyException
 * author:Lyibing
 * date: 2019/10/18
 */
package com.lying.test.exception;

public class MyException extends  RuntimeException {
    public MyException(){

    }
    public MyException(String str){
        //此处传入的是抛出异常后显示的信息提示
        super(str);
    }
}
