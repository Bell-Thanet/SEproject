package com.cpe.backend.J.entity;

import lombok.*;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "SPORTEQUIPMENT")
public class SportEquipment {
    @Id
    @SequenceGenerator(name = "SPORTEQUIPMENT_SEQ", sequenceName = "SPORTEQUIPMENT_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SPORTEQUIPMENT_SEQ")
    private Long category_id;

    private String category_name;

}
