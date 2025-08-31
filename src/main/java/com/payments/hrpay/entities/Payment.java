package com.payments.hrpay.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.AttributeBinderType;

@Data
@Entity
@Table(name = "payments")
public class Payment {

    @Id
    private Long id;
    private Double dailyIncome;
    private Integer days;


    private Double getTotal(){
        return dailyIncome * days;
    }
}
