package com.example.ck_demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CkDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CkDemoApplication.class, args);
    }
//    @Bean
//    CommandLineRunner commandLineRunner(ProductReponsitory productReponsitory){
//        return args -> {
//                Product p =new Product("IPhone", "Moden", "US", "phone", ProductStatus.ACTIVE);
//                Product p1 =new Product("Samsung", "Convenient", "Korea", "phone", ProductStatus.ACTIVE);
//            productReponsitory.saveAll(List.of(p, p1));
//            System.out.println(p);
//            Employee e = new Employee("Huyen Tran", "0946003194", "huyen@gmail.com", LocalDate.of(2002, 11,11), "Ho Chi Minh", EmployeeStatus.ACTIVE);
//            Employee e1 = new Employee("Nguyen Van A", "0178965412", "NguyenA@gmail.com", LocalDate.of(2001, 10,10), "Ho Chi Minh", EmployeeStatus.ACTIVE);
//            employeeReponsitory.saveAll(List.of(e,e1));
//            this.phone = phone;
//            this.email = email;
//            this.name = name;
//            this.address = address;
//            Customer c = new Customer("0123456789", "ngan@gmail.com", "Pham Ngan", "Le Loi, phuong 1, Go Vap");
//            Customer c1 = new Customer("0123412789", "hoanganh@gmail.com", "Hoang Anh", "Nguyen Van Nghi, phuong 1, Go Vap");
//            customerReponsitory.saveAll(List.of(c,c1));
//            List<Customer> list = customerReponsitory.findAll();
//            list.forEach();\
//            System.out.println();
//            list.forEach(System.out::println);
//        };
}
