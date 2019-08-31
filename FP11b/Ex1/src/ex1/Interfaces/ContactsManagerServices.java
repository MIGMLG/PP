/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Interfaces;

import ex1.Contacts.Contact;
import ex1.Exceptions.ContactsManagerException;

/**
 *
 * @author NERD-X
 */
public interface ContactsManagerServices {
    
    public boolean createList();
    
    public boolean addContact(Contact contact) throws ContactsManagerException;
    
    public boolean removeContact(Contact contact) throws ContactsManagerException;
    
    public Contact searchContactByNumber(String phoneNumber) throws ContactsManagerException;
    
    public String searchInternationalContactByName(String name, String surName) throws ContactsManagerException;
}
