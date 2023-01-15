package com.asklora.system.bankmodelorm.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "USER_ACCOUNT")
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "user_seq")
    @Column(name = "USER_ID",unique=true, nullable = false)
    private Long userId;

    @Size(max = 13)
    @Column(name="ACCOUNT_NUMBER",unique=true, nullable = false)
    private String accountNumber;

    @Column(name = "BALANCE")
    private BigDecimal balance;

    @Column(name = "PHONE_NUMBER",unique=true, nullable = false)
    @Size(max = 13)
    private String phoneNumber;

    @Size(max =7)
    @Column(name = "tax_id",unique=true, nullable = false)
    private String taxId;
    @Column(name = "EMAIL", nullable = false)
    private String email;
    @Column(name = "USER_NAME")
    private String userName;
    @Column(name = "LIVING_ADDRESS")
    private String livingAddress;
    @CreatedDate
    @Column(name = "created_dtime")
    private Date createdDtime;

    @LastModifiedDate
    @Column(name = "updated_dtime")
    private Date updatedDtime;
}
