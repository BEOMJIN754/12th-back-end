package com.example.demo.service;

import com.example.demo.repository.MemberRepository;
import com.example.demo.repository.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// ���� �ڵ�� ������ �� ����ϱ�
@Configuration
public class SpringConfig {
    // �̰� �����ڷ� �����ϴ°�
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
