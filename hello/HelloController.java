package com.hello.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class HelloController{
    @GetMapping("/hellohello")//リンクの一番後ろにつけるキー？パス
    public String index(
            @RequestParam(name="name",value = "name",defaultValue = "no name",required = false)String name,
            @RequestParam(name = "id")String id){
                return "ID:"+id+"NAME:"+name;
    }
}
