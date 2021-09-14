package com.water.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: 大水怪
 * @date: 2021/9/8 21:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T>{

    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code,String message ){
        this(code,message,null);
    }

}
