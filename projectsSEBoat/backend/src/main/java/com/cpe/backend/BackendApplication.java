package com.cpe.backend;

import com.cpe.backend.Sportequipment.entity.Employee;
import com.cpe.backend.Sportequipment.entity.Category;
import com.cpe.backend.Sportequipment.entity.Sportequipment;
import com.cpe.backend.Sportequipment.entity.Sporttype;
import com.cpe.backend.Sportequipment.repository.CategoryRepository;
import com.cpe.backend.Sportequipment.repository.EmployeeRepository;
import com.cpe.backend.Sportequipment.repository.SportequipmentRepository;
import com.cpe.backend.Sportequipment.repository.SporttypeRepository;

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
	ApplicationRunner init(EmployeeRepository employeeRepository,CategoryRepository categoryRepository,SporttypeRepository sporttypeRepository) {
		return args -> {
			
			

			Stream.of("ภาวินี แสนสุข", "ชบาแก้ว สร้อยสวย",
			"สุขใจ แสนสุข","สุปราณี สระแก้ว","อรจิรา ลิสารา","แพรภัคพร เจนจิรนา").forEach(name -> {
				Employee employee = new Employee();
				employee.setEmployee(name);
				employeeRepository.save(employee);
			});
			Stream.of("กีฬากลางแจ้ง","กีฬาทางน้ำ","กีฬาในร่ม").forEach(name -> {
				Category category = new Category();
				category.setCategory(name);
				categoryRepository.save(category);
			});
			Stream.of("กรีฑา", "ว่ายน้ำ","ฟุตบอล","วอลเลย์บอล","เซปักตะกร้อ",
			"เทนนิส","เทเบิลเทนนิส","แบตมินตัน","วอลเลย์บอลชายหาด","เปตอง","ฟุตซอล").forEach(name -> {
				Sporttype sporttype = new Sporttype();
				sporttype.setSporttype(name);
				sporttypeRepository.save(sporttype);
			});

			


			categoryRepository.findAll().forEach(System.out::println); // แสดง ข้อมูลทั้งหมดใน Entity Customer บน Terminal
			employeeRepository.findAll().forEach(System.out::println);
			sporttypeRepository.findAll().forEach(System.out::println);			
		};
	}

}
