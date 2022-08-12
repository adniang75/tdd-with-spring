package com.alassaneniang.hanselandpetal.repository;

import com.alassaneniang.hanselandpetal.domain.CustomerContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerContactRepository extends JpaRepository<CustomerContact, Long> {

}