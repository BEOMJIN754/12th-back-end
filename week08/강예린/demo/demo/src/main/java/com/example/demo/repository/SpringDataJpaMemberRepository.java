package com.example.demo.repository;

import com.example.demo.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
//JpaRepository<Member, Long> ���⼭ Long�� pk�� Ÿ��
// JpaRepository�� extends �ް� �ִ� interface�� �˾Ƽ� bean�� �������
public interface SpringDataJpaMemberRepository  extends JpaRepository<Member, Long>, MemberRepository {

}
