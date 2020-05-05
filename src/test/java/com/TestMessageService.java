package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.MessageService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestMessageService {

	@Test
	public void testMessage() {
		MessageService ms = new MessageService();
		System.out.println("testMessage");
		Assertions.assertEquals(ms.Hello(), "Hello Folks!!!");
	}
	
	@Test
	public void testWelcome() {
		MessageService ms = new MessageService();
		System.out.println("testWelcome");
		Assertions.assertEquals(ms.Welcome(), "Welcome!!!");
	}
	
	@Test
	public void testDevops() {
		MessageService ms = new MessageService();
		System.out.println("testDevops");
		Assertions.assertEquals(ms.DevOps(), "Happy learning DevOps Engineers!!!");
	}
}