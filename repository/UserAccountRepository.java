package com.asklora.system.bankmodelorm.repository;

import com.asklora.system.bankmodelorm.entity.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount,Long> {

    @Query(nativeQuery = true,value = "SELECT phone_number from USER_ACCOUNT where phone_number =:phoneNumber")
    String findUserAccountByPhoneNumber(String phoneNumber);
    @Query(nativeQuery = true,value = "SELECT tax_id from USER_ACCOUNT where tax_id =:taxId")
    String findUserAccountByTaxId(String taxId);
    @Query(nativeQuery = true,value = "SELECT account_number from USER_ACCOUNT where account_number =:accNumber")
    String findUserAccountByAccountNumber(String accNumber);

    UserAccount findUserAccountByUserId(Long userId);

}
