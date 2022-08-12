package com.alassaneniang.hanselandpetal.service;

import com.alassaneniang.hanselandpetal.domain.CustomerContact;
import com.alassaneniang.hanselandpetal.repository.CustomerContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ContactsManagementService {

    private final CustomerContactRepository customerContactRepository;

    public CustomerContact add(CustomerContact contact) {
        return customerContactRepository.save(contact);
    }

}
