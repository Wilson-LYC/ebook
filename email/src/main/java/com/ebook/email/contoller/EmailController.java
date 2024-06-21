package com.ebook.email.contoller;

import com.alibaba.fastjson2.JSONObject;
import com.ebook.dto.ResponseDto;
import com.ebook.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ebook.pojo.Email;

@RestController
@RequestMapping("/email")
public class EmailController {
    @Autowired
    EmailService emailService;
    @GetMapping("/test")
    public String test(){
        return "success";
    }
    @PostMapping("/text")
    public ResponseDto sendText(@RequestBody Email email){
        return emailService.sendText(email);
    }
}

