package com.ebook.dto;

public class TemplateResponse {
    public static class ServerError extends ResponseDto {
        public ServerError() {
            super(500, "服务器错误", null);
        }
    }

}
