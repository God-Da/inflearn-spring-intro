package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository{

    //JPQL select m from Member m where m.name=? 메서드 네임과 반환타입등으로만 쿼리문을 작성할 수 있다.
    @Override
    Optional<Member> findByName(String name);
}
