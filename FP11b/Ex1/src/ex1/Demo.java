/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import ex1.Contacts.Contact;
import ex1.Contacts.ContactsManager;
import ex1.Contacts.InternationalContact;
import ex1.Exceptions.ContactsManagerException;
import ex1.Exceptions.FirstLetterIsLowerCaseException;
import ex1.Exceptions.InvalidCountryPhoneIndicatorException;
import ex1.Exceptions.InvalidPhoneNumberException;
import ex1.Exceptions.MoreThanOneWordInNameException;

/**
 * Classe para teste
 *
 * @author NERD-X
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Contact c1 = new Contact("Miguel", "Costa", "913624653");
        } catch (FirstLetterIsLowerCaseException | MoreThanOneWordInNameException | InvalidPhoneNumberException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            InternationalContact ic1 = new InternationalContact("Miguel", "Costa", "913624653", "Portugal", "00351");
        } catch (FirstLetterIsLowerCaseException | MoreThanOneWordInNameException | InvalidPhoneNumberException | InvalidCountryPhoneIndicatorException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Contact c1 = new Contact("Miguel", "Costa", "913624653");
            InternationalContact ic1 = new InternationalContact("Miguel", "Costa", "913624653", "Portugal", "00351");
            ContactsManager m1 = new ContactsManager();
            m1.createList();
            m1.addContact(c1);
            m1.addContact(ic1);
            m1.removeContact(c1);
            m1.addContact(c1);
            System.out.println(m1.searchContactByNumber("913624653"));
            System.out.println(m1.searchInternationalContactByName("Miguel", "Costa"));
        } catch (ContactsManagerException | FirstLetterIsLowerCaseException | InvalidCountryPhoneIndicatorException | InvalidPhoneNumberException | MoreThanOneWordInNameException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
