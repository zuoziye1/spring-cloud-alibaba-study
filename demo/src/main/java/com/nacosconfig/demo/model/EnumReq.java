package com.nacosconfig.demo.model;

import lombok.Data;

/**
 * @Author: 姚飞虎
 * @Date: 2022/4/18 7:11 PM
 * @Description:
 */
@Data
public class EnumReq {

    private WeatherEnum weatherEnum;

    private String name ;
}
