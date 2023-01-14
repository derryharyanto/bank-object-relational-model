package com.asklora.system.bankmodelorm.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "USER_ACCOUNT")
public class UserAccount {

    @Id
    @Column(name = "USER_ID",unique=true, nullable = false)
    private Long userId;
    @Column(name="ACCOUNT_NUMBER",unique=true, nullable = false)
    private String accountNumber;
    @Column(name = "BALANCE")
    private BigDecimal balance;
    @Column(name = "PHONE_NUMBER",unique=true, nullable = false)
    private String phoneNumber;
    @Column(name = "TAX_ID",unique=true, nullable = false)
    private String taxId;
    @Column(name = "EMAIL",unique=true, nullable = false)
    private String email;
    @Column(name = "USER_NAME")
    private String UserName;
    @Column(name = "LIVING_ADDRESS")
    private String livingAddress;
    @CreatedDate
    @Column(name = "created_dtime")
    private Date createdDtime;

    @LastModifiedDate
    @Column(name = "updated_dtime")
    private Date updatedDtime;
}
