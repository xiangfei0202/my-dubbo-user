package com.king.service.first.impl;

import com.king.service.FirstService;
import org.springframework.stereotype.Service;

/**
 * Created by xiangfei on 16/7/18.
 */
@Service("firstService")
public class FirstServiceImpl implements FirstService {
    public String getString() {
        return "Good morning!";
    }
}
