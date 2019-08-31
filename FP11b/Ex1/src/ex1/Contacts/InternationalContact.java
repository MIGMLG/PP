/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Contacts;

import ex1.Exceptions.FirstLetterIsLowerCaseException;
import ex1.Exceptions.InvalidCountryPhoneIndicatorException;
import ex1.Exceptions.InvalidPhoneNumberException;
import ex1.Exceptions.MoreThanOneWordInNameException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe que contem a definição de um contacto internacional
 *
 * @author NERD-X
 */
public class InternationalContact extends Contact {

    private String countryPhoneIndicator;
    private String country;
    Pattern wordPattern = Pattern.compile("^00[0-9]+");

    /**
     * Metodo Constructor do InternationalContact
     * @param firstName Primeiro Nome
     * @param surName Apelido
     * @param phoneNumber Número de Telemóvel
     * @param country Nome do país
     * @param countryPhoneIndicator Indicador do país
     * @throws FirstLetterIsLowerCaseException
     * @throws MoreThanOneWordInNameException
     * @throws InvalidPhoneNumberException
     * @throws InvalidCountryPhoneIndicatorException
     */
    public InternationalContact(String firstName, String surName, String phoneNumber, String country, String countryPhoneIndicator) throws FirstLetterIsLowerCaseException, MoreThanOneWordInNameException, InvalidPhoneNumberException, InvalidCountryPhoneIndicatorException {
        super(firstName, surName, phoneNumber);
        this.setCountry(country);
        this.setCountryPhoneIndicator(countryPhoneIndicator);
    }

    /**
     * Metodo para obter o indicador de telemóvel do país
     *
     * @return
     */
    public String getCountryPhoneIndicator() {
        return countryPhoneIndicator;
    }

    /**
     * Metodo para definir o indicador do telemóvel do país, tem de conter 00 no
     * ínicio
     *
     * @param countryPhoneIndicator indicador do país
     * @throws InvalidCountryPhoneIndicatorException
     */
    public void setCountryPhoneIndicator(String countryPhoneIndicator) throws InvalidCountryPhoneIndicatorException {
        Matcher wordMatcher = wordPattern.matcher(countryPhoneIndicator);
        if (wordMatcher.matches()) {
            this.countryPhoneIndicator = countryPhoneIndicator;
        } else {
            throw new InvalidCountryPhoneIndicatorException("O indicador tem de conter dois 00 seguido dos outros digitos.");
        }
    }

    /**
     * Metodo para obter o nome do país
     *
     * @return
     */
    public String getCountry() {
        return country;
    }

    /**
     * Metodo para definir o nome do país, a primeira letra tem de ser maiuscula
     *
     * @param country nome do país
     * @throws FirstLetterIsLowerCaseException
     */
    public void setCountry(String country) throws FirstLetterIsLowerCaseException {
        if (Character.isUpperCase(country.charAt(0))) {
            this.country = country;
        } else {
            throw new FirstLetterIsLowerCaseException("A primeira letra do país tem de ser maiuscula.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " InternationalContact{" + "countryPhoneIndicator=" + countryPhoneIndicator + ", country=" + country + '}';
    }
}
