package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FileuploadDownloadApplication {

	public static void main(String[] args) {
		System.out.println("Before:::::::::::::::");
		SpringApplication.run(FileuploadDownloadApplication.class, args);
		System.out.println("After:::::::::::::::");
	}

}
