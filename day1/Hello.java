// 1�� �ּ���

/*
	������
	�ּ���
*/

/**
	����ȭ �ּ�
	==> javadoc �� �̿��ؼ� API ������ ���鶧 ����Ѵ�.
*/

// ================  ***  CLASS (Ŭ����)�� ����  ***  ====================
/*
	CLASS (Ŭ����)�� ��� ���ø����̼� ���۽� �ʿ��� ���� �����̶�� ��������.
	
	1. ��Ű�� ����

		==> ��Ű���� Ŭ������ ����Ǿ��� ���丮 ��ζ�� ����ȴ�.

		package ��Ű����;	==> �̶� ��Ű������ �ݵ�� �ҹ��ڷ� �����ؾ� �Ѵ�.

		��) package my.com;


	2. import ��

		��) import ��Ű����.Ŭ������;

			import java.lang.String;
			import java.lang.System;
			import java.*;

	3. Ŭ���� ����

	4. �������ϱ�

	5. �����ϱ�




*/

import java.util.Date;
import java.lang.String;
import java.lang.System;

public class Hello
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println("�ȳ� ����");
		// System.out �� �����(�ܼ�ȭ��)�� ���Ѵ�.
		// System.out.println("�ȳ�");�� �����(�ܼ�ȭ��)�� �ȳ��� ���

		System.out.print("Hi world!");

		System.out.println(new Date());
		// ���� ��¥�� ��Ÿ����
		// new Date() �� ���� �ý����� ��¥ �ð��� ������ ���̴�.
	}
}
