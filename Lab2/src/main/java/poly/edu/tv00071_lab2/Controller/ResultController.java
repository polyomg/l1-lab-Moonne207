package poly.edu.tv00071_lab2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ResultController {

    @RequestMapping("/a")
    public String m1() {
        return "a"; // view a.html
    }

    @RequestMapping("/b")
    public String m2(Model model) {
        model.addAttribute("message", "I come from b");
        return "forward:/a"; // ?1 forward để giữ lại model
    }

    @RequestMapping("/c")
    public String m3(RedirectAttributes params) {
        params.addAttribute("message", "I come from c");
        return "redirect:/a"; // ?2 redirect thì message thành query param
    }

    // ?3
    @ResponseBody
    @RequestMapping("/d")
    public String m4() {
        return "I come from d"; // trả về text trực tiếp
    }
}