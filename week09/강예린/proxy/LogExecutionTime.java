package com.spring.proxy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // �޼ҵ忡 ������ ��
@Retention(RetentionPolicy.RUNTIME) // �������̼� ������ ��Ÿ�� ���ȿ��� ������ ��
public @interface LogExecutionTime {

}
