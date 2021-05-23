package com.stackroute.SwaggerAPI_Ex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/sr")
    public String sayHello()
    {
        return "Swagger Implementation...!!!";
    }

    @GetMapping("/api/posts/{name}")
    public String partofString(@PathVariable("name") String name)
    {
        return name.substring(2,6);
    }

    @GetMapping("/api/sr1")
    public String Welcome()
    {
        return "Welcome to Swagger Implementation...!!!";
    }

}
