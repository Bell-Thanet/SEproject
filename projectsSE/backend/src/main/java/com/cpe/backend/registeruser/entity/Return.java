package com.cpe.backend.registeruser.entity;
import lombok.*;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
@Data
@Entity
@NoArgsConstructor
@Table(name="Return")
public class Return {
    @Id
    @SequenceGenerator(name="Return_seq",sequenceName="Return_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="Return_seq")
    
    private @NonNull Long return_id;
    private @NonNull Date timeReturn;


    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Status.class)
    @JoinColumn(name = "Status_ID", insertable = true)
    private Status status;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Employee.class)
    @JoinColumn(name = "Employee_ID", insertable = true)
    private Employee employee;

    

//     @ManyToOne(fetch = FetchType.EAGER, targetEntity = Gender.class)
//     @JoinColumn(name = "Gender_ID", insertable = true)
//     private Gender gender;

//     @ManyToOne(fetch = FetchType.EAGER, targetEntity = PhoneType.class)
//     @JoinColumn(name = "PhoneType_ID", insertable = true)
//     private PhoneType phoneType;


    
}