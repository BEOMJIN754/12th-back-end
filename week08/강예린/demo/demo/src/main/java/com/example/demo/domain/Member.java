package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Member {
    // ���� ���ϴ� id�� �ƴ� �ý��ۿ��� �� id��
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // pk ����, DB���� �ڵ����� ������༭ �̷��� ��
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
