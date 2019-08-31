/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Contacts;

import ex1.Exceptions.FirstLetterIsLowerCaseException;
import ex1.Exceptions.InvalidPhoneNumberException;
import ex1.Exceptions.MoreThanOneWordInNameException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe contem a definição de contacto
 *
 * @author NERD-X
 */
public class Contact {

    private final int MAX_DIGITS = 9;
    private String firstName;
    private String surName;
    private String phoneNumber;
    Pattern wordPattern = Pattern.compile("\\w+");

    /**
     * Metodo Constructor de um Contact
     *
     * @param firstName Primeiro Nome
     * @param surName Apelido
     * @param phoneNumber Número de Telemóvel
     * @throws FirstLetterIsLowerCaseException
     * @throws MoreThanOneWordInNameException
     * @throws InvalidPhoneNumberException
     */
    public Contact(String firstName, String surName, String phoneNumber) throws FirstLetterIsLowerCaseException, MoreThanOneWordInNameException, InvalidPhoneNumberException {
        this.setFirstName(firstName);
        this.setSurName(surName);
        this.setPhoneNumber(phoneNumber);
    }

    /**
     * Metodo para definir o primeiro nome, a primeira letra tem de ser
     * maiuscula e só pode conter uma palavra
     *
     * @param firstName Primeiro Nome
     * @throws FirstLetterIsLowerCaseException
     * @throws MoreThanOneWordInNameException
     */
    public void setFirstName(String firstName) throws FirstLetterIsLowerCaseException, MoreThanOneWordInNameException {
        Matcher wordMatcher = wordPattern.matcher(firstName);
        if (Character.isUpperCase(firstName.charAt(0))) {
            if (wordMatcher.matches()) {
                this.firstName = firstName;
            } else {
                throw new MoreThanOneWordInNameException("Só pode conter uma palavra o Nome.");
            }
        } else {
            throw new FirstLetterIsLowerCaseException("A Primeira letra do Nome tem de ser Maiuscula.");
        }

    }

    /**
     * Metodo para definir o ultimo nome, a primeira letra tem de ser maiuscula
     * e só pode conter uma palavra
     *
     * @param surName Apelido
     * @throws MoreThanOneWordInNameException
     * @throws FirstLetterIsLowerCaseException
     */
    public void setSurName(String surName) throws MoreThanOneWordInNameException, FirstLetterIsLowerCaseException {
        Matcher wordMatcher = wordPattern.matcher(surName);
        if (Character.isUpperCase(surName.charAt(0))) {
            if (wordMatcher.matches()) {
                this.surName = surName;
            } else {
                throw new MoreThanOneWordInNameException("Só pode conter uma palavra o Apelido.");
            }
        } else {
            throw new FirstLetterIsLowerCaseException("A Primeira letra do Apelido tem de ser Maiuscula.");
        }
    }

    /**
     * Metodo para definir o número de telemóvel, tem de conter exatamente 9
     * digitos
     *
     * @param phoneNumber
     * @throws InvalidPhoneNumberException
     */
    public void setPhoneNumber(String phoneNumber) throws InvalidPhoneNumberException {
        if (phoneNumber.length() == MAX_DIGITS) {
            this.phoneNumber = phoneNumber;
        } else {
            throw new InvalidPhoneNumberException("O numero só pode conter 9 digitos.");
        }
    }

    /**
     * Metodo para obter o primeiro nome
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Metodo para obter o apelido
     * @return
     */
    public String getSurName() {
        return surName;
    }

    /**
     * Metodo para obter o numero de telemóvel
     * @return
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" + "firstName=" + firstName + ", surName=" + surName + ", phoneNumber=" + phoneNumber + '}';
    }
    
}
