package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther hiber
 * @create 2020/5/13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//返回json串
public class CommonResult<T> {//<T>为泛型，CommonResult装什么类型返什么类型
    //404 not_found
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
