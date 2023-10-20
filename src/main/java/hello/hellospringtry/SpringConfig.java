package hello.hellospringtry;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hello.hellospringtry.repository.JdbcMemberRepository;
import hello.hellospringtry.repository.JdbcTemplateMemberRepository;
import hello.hellospringtry.repository.JpaMemberRepository;
import hello.hellospringtry.repository.MemberRepository;
import hello.hellospringtry.repository.MemoryMemberRepository;
import hello.hellospringtry.service.MemberService;
import jakarta.persistence.EntityManager;

@Configuration
public class SpringConfig {

    // private final DataSource dataSource;
    // private final EntityManager em;
    private final MemberRepository memberRepository;

    public SpringConfig(/*DataSource dataSource, EntityManager em*/ MemberRepository memberRepository){
        // this.dataSource = dataSource;
        // this.em = em;
        this.memberRepository = memberRepository;
    }

    @Bean
    MemberService memberService() {
        return new MemberService(memberRepository);
    }
    
    // @Bean
    // MemberRepository memberRepository() {
    //     //return new MemoryMemberRepository();
    //     //return new JdbcMemberRepository(dataSource);
    //     //return new JdbcTemplateMemberRepository(dataSource);
    //     return new JpaMemberRepository(em);
    // }
}
