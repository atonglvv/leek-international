package cn.atong.leek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: leek-international
 * @description: 国际化
 * @author: atong
 * @create: 2022-10-14 20:29
 */
@RestController
public class InternationalController {

    @Autowired
    MessageSource messageSource;

    @GetMapping("/hello")
    public String hello() {
        return messageSource.getMessage("name", null, LocaleContextHolder.getLocale());
    }
}
