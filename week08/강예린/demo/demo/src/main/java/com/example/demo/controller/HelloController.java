package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("hello") // viewresolver ���� hello.html�ѱ� �̰� templates�� �־����
    public String hello(Model model){
        model.addAttribute("data", "hello!");
        return "hello";
    }
    // �Ķ���� �Է� �޾Ƽ� name���� �����ϰ� model�� Ű "name"�� �Է� ���� name��- return�� hello-template.html��
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name",name);
        return "hello-template";
    }

    // http�� body�κ��� ���� �����ִ� ��- html ������� ���� string�� ��ȯ�߱⿡ �״�� ����
    @GetMapping("hello-string")
    @ResponseBody //�̰� ����ϸ� viewresolver ��� httpmessageconverter �θ�
    public String helloString(@RequestParam("name") String name, Model model){
        model.addAttribute("name",name);
        return "hello "+ name;
    }
    //��ü�� ��ȯ�߱⿡ json ������� ���
    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi (@RequestParam("name") String name){
        Hello h= new Hello();
        h.setName(name);
        return h;
    }

    // Ŭ���� �ȿ� staticŬ���� ����- �̷��� �ϸ� �ܺ�Ŭ����.����Ŭ���� �̷��� ����
    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

