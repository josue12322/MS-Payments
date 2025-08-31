package com.payments.hrpay.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
public class Worker implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;

    private String name;
    private Double dailyIncome;
}
