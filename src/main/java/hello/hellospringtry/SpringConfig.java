package hello.hellospringtry;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hello.hellospringtry.repository.MemberRepository;
import hello.hellospringtry.repository.MemoryMemberRepository;
import hello.hellospringtry.service.MemberService;

@Configuration
public class SpringConfig {

    @Bean
    MemberService memberService() {
        return new MemberService(memberRepository());
    }
    
    @Bean
    MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
