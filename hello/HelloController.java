package com.hello.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{
    @GetMapping("/hellohello")//リンクの一番後ろにつけるキー？パス
    public String hello(){//メソッド名はなんでもいいが実態を表す名前が良い
        System.out.println("hello and welcom!");
        return "Hello　World!";
    }
}
