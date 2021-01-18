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
        return "hello douding";
    }

    @RequestMapping("/test")
    public String hello(Model model) {

        Song song = new Song();
        song.name="Better Off";
        song.Author="douding";
        song.duration=567;

        String r = ts.getTests();

        model.addAttribute("onesong", r);
        return "test.html";
    }

//    @RequestMapping("/test")
//    public String hello(HttpServletRequest request, @RequestParam(value = "name", defaultValue = "springboot-thymeleaf") String name) {
//        Song song = new Song();
//        request.setAttribute("singlePerson", song);
//        return "test";
//    }

}
