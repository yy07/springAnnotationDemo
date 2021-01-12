package com.gupaoedu.conditional;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Author:jinboxaing
 * @date:2020/7/8 16:26
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Repository
public class City {
    /**
     * 城市名称
     */
    private String cityName="阿妹你看：圣地亚哥";
    /**
     * 城市code
     */
    private Integer cityCode=1;
}
