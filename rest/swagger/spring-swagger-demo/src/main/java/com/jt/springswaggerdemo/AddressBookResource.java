package com.jt.springswaggerdemo;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/api")
public class AddressBookResource {

    ConcurrentHashMap <String, Contact> contacts = new ConcurrentHashMap<>();

    @GetMapping("/{id}")
    @ApiOperation(value = "Finds contacts by ID value",
    notes = "Provide an ID to look up the contact from the address book.",
    response = Contact.class)
    public Contact getContact(@ApiParam(value = "ID value for the Contact you want to retrieve", required = true)
                                  @PathVariable String id) {
        return contacts.get(id);
    }

    @GetMapping("/")
    public List<Contact> getAllContacts() {
        return new ArrayList<Contact>(contacts.values());
    }

    @PostMapping("/")
    public Contact addContact (@RequestBody Contact contact) {
        contacts.put(contact.getId(), contact);
        return contact;
    }

}
