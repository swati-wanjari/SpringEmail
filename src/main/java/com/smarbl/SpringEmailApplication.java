package com.smarbl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringEmailApplication {

	@Autowired
	private EmailSenderService senderService;
	public static void main(String[] args) {

		SpringApplication.run(SpringEmailApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void sendEmail(){
		senderService.sendEmail("swati.wanjari@smarbl.com",
				"This is subject",
				"This is Body");
	}
}
