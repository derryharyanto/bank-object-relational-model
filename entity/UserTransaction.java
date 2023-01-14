package com.asklora.system.bankmodelorm.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "USER_TRANSACTION")
public class UserTransaction {

    @Id
    @Column(name = "TRANSACTION_ID",unique=true, nullable = false)
    private String transactionId;
    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "USER_ID", nullable = false)
    @Column(name = "USER_ID")
    private UserAccount userId;
    @Column(name = "AMOUNT_TRANSACTION")
    private BigDecimal amountTransaction;
    @Column(name = "PREVIOUS_BALANCE")
    private BigDecimal previousBalance;
    @Column(name = "TOTAL_BALANCE")
    private BigDecimal totalBalance;

    @CreatedDate
    @Column(name = "created_dtime")
    private Date createdDtime;
}
