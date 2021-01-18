package tech.hidouding.webone.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tech.hidouding.webone.entity.Song;
import tech.hidouding.webone.service.TestService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {

    @Autowired
    private TestService ts;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    @ResponseBody
    public String index(){

        String s="";
        return "hello douding3 ";
    }

    @RequestMapping("/test")
    public String test(Model model) {

        String r = ts.getTests();

        model.addAttribute("onesong", r);
        return "test.html";
    }

}
