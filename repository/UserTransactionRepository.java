package com.asklora.system.bankmodelorm.repository;

import com.asklora.system.bankmodelorm.entity.UserTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTransactionRepository extends JpaRepository<UserTransaction,String> {
}
