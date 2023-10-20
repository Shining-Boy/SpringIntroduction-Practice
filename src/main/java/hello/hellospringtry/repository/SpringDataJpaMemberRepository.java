package hello.hellospringtry.repository;

import hello.hellospringtry.domain.Member;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository{
    Optional<Member> findByName(String name);
}
