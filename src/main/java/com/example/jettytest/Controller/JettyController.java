package com.example.jettytest.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({"/portals/resume/"})
public class JettyController {
    @RequestMapping(
            value = {"get"},
            method = {RequestMethod.POST}
    )
    @ResponseBody
    public String getResume() {
        return "U R in now ......";
    }


}
