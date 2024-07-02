package com.example.demo.repository;

import com.example.demo.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository{
    // id를 키로 member객체를 값으로 가지는 hashmap
    private static Map<Long, Member> store= new HashMap<>();
    // 키 값을 생성하게 하는 것
    private static  long sequence= 0L;
    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream().filter(member -> member.getName().equals(name)).findAny();
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public  void clearStore() {
        store.clear();
    }
}
