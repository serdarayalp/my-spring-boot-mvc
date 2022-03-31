package de.mydomain.spring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

@Controller
public class FormController {

    @Value("${ui.message}")
    private String message;

    @GetMapping("/messageByModel")
    public String getMessage(Model model) {
        model.addAttribute("message", message);
        return "main";
    }

    @GetMapping("/messageByModelAndView")
    public ModelAndView getMessage() {
        var mav = new ModelAndView();
        mav.addObject("message", message);

        mav.setViewName("main");

        return mav;
    }

    @GetMapping("/messageByModelMap")
    public String getMessageAndTime(ModelMap map) {

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        formatter.withLocale(new Locale("de", "DE"));
        formatter.withZone(ZoneId.of("Europe/Berlin"));

        String time = formatter.format(LocalDateTime.now());

        map.addAttribute("message", message)
                .addAttribute("time", time);

        return "main";
    }
}