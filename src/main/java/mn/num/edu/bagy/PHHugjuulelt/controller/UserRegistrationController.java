//package mn.num.edu.bagy.PHHugjuulelt.controller;
//
//import lombok.AllArgsConstructor;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//@AllArgsConstructor
//@RequestMapping("/auth")
//public class UserRegistrationController {
//    private UserService userService;
//
//    @PostMapping("/signup")
//    public String registerUserAccount(@RequestBody UserRegistrationDto registrationDto) {
//        userService.save(registrationDto);
//        System.out.println(registrationDto);
//        return "redirect:/auth/signup?success";
//    }
//
//    @PostMapping("/login")
//    public String login(@RequestBody LoginDto loginDto) {
//        System.out.println(loginDto);
//        userService.loginUser(loginDto);
//        System.out.println("*****************Logged in***************");
//        return "redirect:/auth/login?success";
//    }
//
//}
