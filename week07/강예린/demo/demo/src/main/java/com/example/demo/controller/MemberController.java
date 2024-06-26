package com.example.demo.controller;

import com.example.demo.domain.Member;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemberController {
    private final MemberService memberservice;
    //�����ڷ� �����ϴ� ���
    @Autowired
    public MemberController(MemberService memberservice) {
        this.memberservice = memberservice;
    }
    // Getmapping�� url â�� ġ�� ��� ȣ��- ��ȸ�Ҷ� ���
    @GetMapping("/members/new")
    public String createForm(){
        return "members/createMemberForm";
        }

    // �����͸� ������ ������ ���
        @PostMapping("/members/new")
    public String create(MemberForm form){
            Member member= new Member();
            member.setName(form.getName());
            memberservice.join(member);

            //ȸ�������� �������� Ȩȭ������ ������
            return "redirect:/";
        }

        @GetMapping("/members")
    public String list(Model model){
        List<Member> members= memberservice.findMembers();
        model.addAttribute("members", members);
        return  "members/memberList";
        }
    // �ʵ� ����
    /*@Autowired
    private MemberService memberservice;*/

    // setter �̿�
    /*@Autowired
    public void setMemberservice(MemberService memberservice){
        this.memberservice= memberservice;
    }*/
}
