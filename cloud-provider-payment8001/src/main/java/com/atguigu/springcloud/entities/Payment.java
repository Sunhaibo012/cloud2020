package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @auther hiber
 * @create 2020/5/13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {//Serializable 序列化，分布式用得到
    private Long id;
    private String serial;
}
