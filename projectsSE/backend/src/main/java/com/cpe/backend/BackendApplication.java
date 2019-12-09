package com.cpe.backend;

import com.cpe.backend.registeruser.entity.Employee;
import com.cpe.backend.registeruser.entity.Member;
import com.cpe.backend.registeruser.entity.Status;
import com.cpe.backend.registeruser.entity.Return;
import com.cpe.backend.registeruser.repository.StatusRepository;
import com.cpe.backend.registeruser.repository.EmployeeRepository;
import com.cpe.backend.registeruser.repository.MemberRepository;
import com.cpe.backend.registeruser.repository.ReturnRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Bean
	ApplicationRunner init(StatusRepository statusRepository, EmployeeRepository employeeRepository, MemberRepository memberRepository) {
		return args -> {
			
			Stream.of("ปรกติ", "เสียหาย").forEach(name -> {
				Status status = new Status();
				status.setName(name);
				statusRepository.save(status);
			});

			Stream.of("ตี๋", "แว่น").forEach(name -> {
				Employee employee = new Employee();
				employee.setName(name);
				employeeRepository.save(employee);
			});
			Stream.of(1).forEach(name -> {
				Member member = new Member();
				member.setName(name);
				memberRepository.save(member);
			});


			
			// Stream.of("บริษัท", "มือถือ", "โทรศัพท์บ้าน").forEach(name -> {
			// 	PhoneType phonetype = new PhoneType();
			// 	phonetype.setName(name);
			// 	phonetypeRepository.save(phonetype);
			// });

			// Stream.of("นาย", "นาง","นางสาว").forEach(name -> {
			// 	NameType nameType = new NameType();
			// 	nameType.setName(name);
			// 	nametypeRepository.save(nameType);
			// });


			statusRepository.findAll().forEach(System.out::println); // แสดง ข้อมูลทั้งหมดใน Entity Customer บน Terminal

			
		};
	}

}
