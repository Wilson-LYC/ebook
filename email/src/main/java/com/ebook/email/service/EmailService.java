package com.ebook.email.service;

import com.ebook.dto.ResponseDto;
import com.ebook.pojo.Email;

public interface EmailService {

    ResponseDto sendText(Email email);
}
