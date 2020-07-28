package com.by.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yc
 * @since 2020-07-28
 */
@RestController
@RequestMapping("/tMenu")
public class TMenuController {

    @RequestMapping("/test")
    public String test(){
        return "test";
    }

}

