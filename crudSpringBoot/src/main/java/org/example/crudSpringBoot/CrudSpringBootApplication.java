package org.example.crudSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication
public class CrudSpringBootApplication {

	public static void main(String[] args) {


		SpringApplication.run(CrudSpringBootApplication.class, args);


		System.out.println("hello world");
	}

}


///  /api/students

// 1. end point listen (/app/students POST)

// 2. Business logic

// 3. interact with db

// 4. send response to client(POSTMAN)


//                              Controller - service - repository

// postman -> student controller -> student service  -> student repository -> db
//                (http req)        (businesss logic)       (db interact)