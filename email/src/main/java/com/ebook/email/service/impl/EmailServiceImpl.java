package com.ebook.email.service.impl;

import com.alibaba.fastjson2.JSONObject;
import com.ebook.dto.ResponseDto;
import com.ebook.dto.TemplateResponse;
import com.ebook.email.service.EmailService;
import com.ebook.pojo.Email;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import cn.hutool.extra.mail.MailException;
import cn.hutool.extra.mail.MailUtil;

@Slf4j
@Service
public class EmailServiceImpl implements EmailService {
    @Override
    public ResponseDto sendText(Email email) {
        try{
            MailUtil.send(email.getRecipient(),email.getSubject(),email.getContent(),email.isHtml());
        }catch (MailException e){
            log.error("文本邮件发送失败",e);
            return new TemplateResponse.ServerError();
        }
        return new ResponseDto(200,"邮件发送成功", JSONObject.from(email));
    }
}
