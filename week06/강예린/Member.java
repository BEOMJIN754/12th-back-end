package com.example.demo.domain;

public class Member {
    // ���� ���ϴ� id�� �ƴ� �ý��ۿ��� �� id��
    private Long id;
    private String name;

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
