package cn.zephyr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: zephyrLai
 * @Date: 2019/3/5 14:21
 * @Description:
 */
@Controller
public class MvnController {
    @RequestMapping("/")
    public String index(){
        return "/index.html";
    }
}
