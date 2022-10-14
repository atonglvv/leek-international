package cn.atong.leek.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

/**
 * @program: leek-international
 * @description:
 * @author: atong
 * @create: 2022-10-14 22:06
 */
@Component
public class MessageUtils {

    @Autowired
    MessageSource messageSource;


    /**
     * 根据消息键和参数 获取消息 委托给spring messageSource
     * @param code 消息键
     * @param args 参数
     * @return 获取国际化翻译值
     */
    public String message(String code, Object... args) {

        return messageSource.getMessage(code, args, LocaleContextHolder.getLocale());
    }
}
