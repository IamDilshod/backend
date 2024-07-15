package zaur.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String getInfoForAllEmps(){
        System.out.println("Salom");
        return "view-for-all-employees";
    }

    @GetMapping("/hr_info")
    public String getInfoOnlyForHR(){
        System.out.println("sadadadasd !!");
        System.out.println("sadadadasd !!");
        return "view-for-hr";
    }

    @GetMapping("/manager_info")
    public String getInfoOnlyForManagers(){
        return "view-for-managers";
    }
}
