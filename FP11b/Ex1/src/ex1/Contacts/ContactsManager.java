/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Contacts;

import ex1.Exceptions.ContactsManagerException;
import ex1.Interfaces.ContactsManagerServices;

/**
 *
 * @author NERD-X
 */
public class ContactsManager implements ContactsManagerServices {

    private Contact[] list;

    @Override
    public boolean createList() {
        list = new Contact[0];
        return true;
    }

    @Override
    public boolean addContact(Contact contact) throws ContactsManagerException {
        if (list != null) {
            if (list.length == 0) {
                list = new Contact[1];
                list[0] = contact;
            } else {
                Contact[] tmp = list;
                list = new Contact[list.length + 1];
                System.arraycopy(tmp, 0, list, 0, tmp.length);
                list[list.length - 1] = contact;
            }
            return true;
        } else {
            throw new ContactsManagerException(ContactsManagerException.LIST_NOT_CREATED);
        }
    }

    @Override
    public boolean removeContact(Contact contact) throws ContactsManagerException {
        if (list != null) {
            if (list.length == 0) {
                throw new ContactsManagerException(ContactsManagerException.EMPTY_LIST);
            } else {
                int k = 0;
                while (k < list.length && !list[k].equals(contact)) {
                    k++;
                }
                if (k < list.length) {
                    Contact[] tmp = list;
                    list = new Contact[list.length - 1];
                    for (int i = 0; i < k; i++) {
                        list[i] = tmp[i];
                    }
                    for (int j = k; j < list.length; j++) {
                        list[j] = tmp[j + 1];
                    }
                    return true;
                }
            }
        }
        throw new ContactsManagerException(ContactsManagerException.LIST_NOT_CREATED);

    }

    @Override
    public Contact searchContactByNumber(String phoneNumber) throws ContactsManagerException {
        if (list != null) {
            if (list.length == 0) {
                throw new ContactsManagerException(ContactsManagerException.EMPTY_LIST);
            } else {
                Contact found = null;
                int k = 0;
                while (k < list.length && !list[k].getPhoneNumber().equals(phoneNumber)) {
                    k++;
                }
                if (k < list.length) {
                    found = list[k];
                }
                return found;
            }
        }
        throw new ContactsManagerException(ContactsManagerException.LIST_NOT_CREATED);
    }

    @Override
    public String searchInternationalContactByName(String name, String surName) throws ContactsManagerException {
        if (list != null) {
            if (list.length == 0) {
                throw new ContactsManagerException(ContactsManagerException.EMPTY_LIST);
            } else {
                String text = "";
                for(Contact tmp : list){
                    if(tmp instanceof InternationalContact && tmp.getFirstName().equals(name) && tmp.getSurName().equals(surName)){
                        text += tmp.toString();
                    }
                }
                return text;
            }
        }
        throw new ContactsManagerException(ContactsManagerException.LIST_NOT_CREATED);
    }

}
