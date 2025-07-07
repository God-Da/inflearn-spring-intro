package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); // 회원 저장
    Optional<Member> findById(Long id); // 회원 ID로 조회
    Optional<Member> findByName(String name); // 회원 이름으로 조회
    List<Member> findAll(); // 모든 사용자 조회
}
