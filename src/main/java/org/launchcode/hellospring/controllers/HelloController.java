package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    //@GetMapping("hello")
    @RequestMapping(method={RequestMethod.GET, RequestMethod.POST}, value="hello")
    @ResponseBody
    public String helloQuery(@RequestParam String name){
        return "Hello, " + name;
    }
    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye(){
        return "Goodbye, Spring!";
    }
    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloPath(@PathVariable String name){
        return "Hello, " + name;
    }
    /*@GetMapping("form")
    @ResponseBody
    public String helloForm(){
        return "<html>"+"<body>"
                +"<form action='hello'>"
                +"<input type='text' name='name'>"
                +"<input type='submit' value='Greet me!'>"
                +"</form>"+"</body>"+"</html>";*/
        @GetMapping("form")
        @ResponseBody
        public String helloForm(){
            return "<html>"+"<body>"
                    +"<form action='hello' method='post'>"
                    +"<input type='text' name='name'>"
                    +"<input type='submit' value='Greet me!'>"
                    +"</form>"+"</body>"+"</html>";
    }
}


