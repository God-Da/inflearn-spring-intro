package hello.hellospring.domain;

public class Member {

    private Long id; // 시스템에 저장할 때 등록되는 시스템이 정해주는 것
    private String name; // 사용자가 직접 입력

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
