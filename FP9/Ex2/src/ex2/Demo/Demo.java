/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Demo;

import ex2.Courses.Course;
import ex2.Courses.Discipline;
import ex2.Enums.AcademicStatus;
import ex2.Enums.CientificArea;
import ex2.Persons.PersonManagement;
import ex2.Persons.Support;
import ex2.Persons.Teacher;
import java.time.LocalDate;

/**
 * Classe para testar o codigo implementado
 * @author NERD-X
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Testes: ");
        Course lei = new Course(1, "Licenciatura em Engenharia Informática");
        Discipline paradigmas = new Discipline(1, "Paradigmas de Programação");
        System.out.println(lei.addDiscipline(paradigmas));
        Teacher n1 = new Teacher(1, "Miguel Costa", 19458463, "DONT KNOW", 255999666, 
                AcademicStatus.MESTRADO, CientificArea.INFORMATICA, LocalDate.now());
        System.out.println(paradigmas.addTeacher(n1));
        System.out.println(n1.toString());
        Support n2 = new Support(1, "Joaquim das Couves", 1548546, "DONT KNOW", 255644666, AcademicStatus.MESTRADO, CientificArea.INFORMATICA, LocalDate.now(), 100);
        System.out.println(n2.toString());
        
        System.out.println("FOR REAL: ");
        PersonManagement gestao = new PersonManagement();
        System.out.println(gestao.addPerson(n1));
        System.out.println(gestao.addPerson(n1)); //Ja existe no sistema
        System.out.println(gestao.addPerson(n2));
        System.out.println(gestao.PrintAll());
        System.out.println("\n" + "Removido: " + gestao.removePerson(n2));
        System.out.println(gestao.PrintAll());
        
    }
    
}
