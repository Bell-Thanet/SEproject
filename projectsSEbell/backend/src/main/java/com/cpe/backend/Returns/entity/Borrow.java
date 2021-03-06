// package com.cpe.backend.Returns.entity;

// import lombok.*;

// import javax.persistence.Id;
// import javax.persistence.JoinColumn;
// import javax.persistence.ManyToOne;
// import javax.persistence.SequenceGenerator;
// import javax.persistence.Table;

// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;

// import java.util.Date;

// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.FetchType;
// import com.fasterxml.jackson.annotation.JsonManagedReference;


// @Data
// @Entity
// @Table(name = "BORROW")
// public class Borrow {
//     @Id
//     @SequenceGenerator(name = "BORROW_SEQ", sequenceName = "BORROW_SEQ")
//     @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BORROW_SEQ")
//     private Long borrow_id;

//     private Date borrow_date;

//     @ManyToOne(fetch = FetchType.EAGER, targetEntity = Member.class)
//     @JoinColumn(name = "id", insertable = true)
//     @JsonManagedReference
//     private Member members;

//     // @ManyToOne(fetch = FetchType.EAGER, targetEntity = Employee.class)
//     // @JoinColumn(name = "emp_id", insertable = true)
//     // @JsonManagedReference
//     // private Employee employee;

//     // @ManyToOne(fetch = FetchType.EAGER, targetEntity = Category.class)
//     // @JoinColumn(name = "category_id", insertable = true)
//     // @JsonManagedReference
//     // private Category category;

//     // @ManyToOne(fetch = FetchType.EAGER, targetEntity = SportEquipment.class)
//     // @JoinColumn(name = "se_id", insertable = true)
//     // @JsonManagedReference
//     // private SportEquipment sportEquipment;

//     public Borrow() {
//     }

// }
