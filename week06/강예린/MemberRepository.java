package com.example.demo.repository;

import com.example.demo.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    // ����� �����ϰ� ��� ��ȯ
    Member save(Member member);
    // null�� �� Optional�� ���μ� ��ȯ
    // ���� id�� name���� ��� ã��
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    // ���ݱ��� ����� ��� ȸ���� ����Ʈ�� ��ȯ��
   List<Member> findAll();}
