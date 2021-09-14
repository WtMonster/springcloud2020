package com.water.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: 大水怪
 * @date: 2021/9/8 21:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private Long id;
    private String serial;

}
