package poly.edu.tv00071_lab1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/rectangle")
public class RectangleController {

    @GetMapping("/form")
    public String form() {
        return "poly/rectangle";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam double length,
                            @RequestParam double width,
                            Model model) {
        double area = length * width;
        double perimeter = 2 * (length + width);

        model.addAttribute("area", area);
        model.addAttribute("perimeter", perimeter);

        return "poly/rectangle";
    }
}
