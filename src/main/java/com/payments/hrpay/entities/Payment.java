package com.payments.hrpay.entities;

import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Payment {
    private Long id;
    private String name;
    private Double dailyIncome;
    private Integer days;
    private Double tatalDays;

    public Payment() {

    }
    public Payment(String name, Double dailyIncome, Integer days) {
        super();
        this.name = name;
        this.dailyIncome = dailyIncome;
        this.days = days;
        this.tatalDays = getTotal();
    }

    private Double getTotal(){
        tatalDays = dailyIncome * days;
        return tatalDays;
    }
}
