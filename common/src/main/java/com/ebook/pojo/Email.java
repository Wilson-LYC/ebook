package com.ebook.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Email {
    @NotNull(message = "发件人不能为空")
    String recipient;//收件人
    String subject="公式E点通";//主题
    @NotNull(message = "内容不能为空")
    String content;//内容
    boolean isHtml=false;//是否是html
}
