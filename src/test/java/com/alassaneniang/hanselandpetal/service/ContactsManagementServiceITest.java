package com.alassaneniang.hanselandpetal.service;

import com.alassaneniang.hanselandpetal.domain.CustomerContact;
import com.alassaneniang.hanselandpetal.repository.CustomerContactRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ContactsManagementServiceITest {

    @InjectMocks
    ContactsManagementService contactsManagementService;

    @Mock
    CustomerContactRepository customerContactRepository;

    @Test
    @DisplayName("Test AddContact Happy Path")
    void testAddContactHappyPath() {
        CustomerContact contact = CustomerContact
                .builder()
                .id(1)
                .firstName("Jenny")
                .lastName("Johnson")
                .build();
        when(customerContactRepository.save(contact))
                .thenReturn(contact);
        CustomerContact newContact = contactsManagementService.add(contact);
        assertThat(newContact).isNotNull();
        assertThat(newContact.getId()).isEqualTo(1);
        assertThat(newContact.getFirstName()).isEqualTo("Jenny");
        assertThat(newContact.getLastName()).isEqualTo("Johnson");
    }

}
