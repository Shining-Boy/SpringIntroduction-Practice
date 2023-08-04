package hello.hellospringtry.controller;

import org.springframework.beans.factory.annotation.Autowired;

import hello.hellospringtry.service.MemberService;

public class MemberController {
    private final MemberService memberService;
    
    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }
}
