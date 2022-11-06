package com.springboot.hello.controller;

import com.springboot.hello.dto.MemberDto;
import com.sun.source.tree.MemberReferenceTree;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {

    @ApiOperation(value = "GET 메서드 예제", notes = "Hello 를 반환하는 예제")
    @GetMapping("/hello")
    public String getHello() {
        return "Hello World";
    }

    @GetMapping("/name/{name}")
    public String getName(@PathVariable String name){
        return name;
    }

    @GetMapping("/request3")
    public String getRequestParam3(MemberDto memberDto){
        return memberDto.toString();
    }

    @PostMapping("/member")
    public String postMember(@RequestBody MemberDto memberDto){
        return memberDto.toString();
    }


}
