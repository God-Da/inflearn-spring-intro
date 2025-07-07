package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L; // 0,1,2 키 값을 생성해주는 시퀀스

    @Override
    public Member save(Member member) {
        member.setId(++sequence); // 시퀀스를 1 증가시키고, member의 id를 설정
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id)); // store에서 id로 Member를 찾아 Optional로 감싸서 반환;
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member -> member.getName().equals(name)) // 이름이 일치하는 Member를 필터링
                .findAny(); // 일치하는 Member가 있으면 Optional로 반환
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values()); // store의 모든 Member 값을 리스트로 반환
    }

    public void clearStore(){
        store.clear();
    }
}
