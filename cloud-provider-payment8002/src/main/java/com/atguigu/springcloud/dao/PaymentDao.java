package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @auther hiber
 * @create 2020/5/13
 */
@Mapper
public interface PaymentDao {
    //写
    public int creat(Payment payment);
    //读
    public Payment getPaymentById(@Param("id") Long id);
}
