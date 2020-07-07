package cg.blog.blogapp;

import cg.blog.blogapp.model.Blog;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {

    @GetMapping("/test-template")
    public String getTemplate() {
        return "index";
    }

    @GetMapping("")
    public String getHomePage(Model model) {

        Blog blog = new Blog();
        blog.setTitle("Hello");

        model.addAttribute("blog",blog);

        return "home";
    }

    @PostMapping("/hello")
    public String receiveHello(@ModelAttribute Blog blog, Model model) {
        model.addAttribute("blog",blog);
        return "home";
    }

}
