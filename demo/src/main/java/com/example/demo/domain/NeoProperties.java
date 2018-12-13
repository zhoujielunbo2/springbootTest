package com.example.demo.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Copyright (C), OYO
 *
 * @Auther: hexiaobo
 * @Date: 2018/12/13 15:21
 * @Description: NeoProperties
 */
@Component
@Data
public class NeoProperties {
    @Value("${com.neo.title}")
    private String title;
    @Value("${com.neo.description}")
    private String description;
}
