package com.kosta.remoteweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model, Locale locale) {
        model.addAttribute("name", "Spring MVC");



        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("date", date);
        model.addAttribute("serverTime", formattedDate );		//브라우저에서 요청한 시각을 JSP로 전달함

        return "hello";
    }
}
