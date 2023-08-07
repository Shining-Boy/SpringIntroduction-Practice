package hello.hellospringtry;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hello.hellospringtry.repository.JdbcMemberRepository;
import hello.hellospringtry.repository.MemberRepository;
import hello.hellospringtry.repository.MemoryMemberRepository;
import hello.hellospringtry.service.MemberService;

@Configuration
public class SpringConfig {

    private final DataSource dataSource;

    public SpringConfig(DataSource dataSource){
        this.dataSource = dataSource;
    }

    @Bean
    MemberService memberService() {
        return new MemberService(memberRepository());
    }
    
    @Bean
    MemberRepository memberRepository() {
        //return new MemoryMemberRepository();
        return new JdbcMemberRepository(dataSource);
    }
}
