package com.gupaoedu.conditional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author:jinboxaing
 * @date:2020/7/8 16:26
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class City {
    /**
     * 城市名称
     */
    private String cityName;
    /**
     * 城市code
     */
    private Integer cityCode;
}
