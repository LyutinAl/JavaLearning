package com.ltp.workbook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FilmController {
    
    @GetMapping("/")
    public String showsRreturn() {
        return "shows";
    }
}
