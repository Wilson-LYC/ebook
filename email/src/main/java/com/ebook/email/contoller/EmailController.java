package com.ebook.email.contoller;

import com.alibaba.fastjson2.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/send")
public class EmailController {
    @PostMapping("/captcha")
    public JSONObject sendEmailCaptcha(){
        return null;
    }
}
