package poly.edu.tv00071_lab2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OkController {
    @RequestMapping("/ok")
    public String ok() {
        return "ok";
    }
    public String m1() {
        return "ok";
    }
    public String m2() {
        return "ok";
    }
    public String m3() {
        return "ok";
    }
}