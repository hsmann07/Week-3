package week3sem2;

import java.time.LocalDate;
import java.time.Month;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MANN
 */
public class TestingClass {
    public static void main (String[] args)
    {
    Employee employee1 = new Employee("Fred","Flintstone",1234,LocalDate.of(1998, Month.MARCH, 14));
            System.out.printf("The Employee is %s%n",employee1);
                     System.out.printf("The Employee is %s,that was a %s%n",employee1.getDateOfBirth(),employee1.getDateOfBirth().getDayOfWeek());
    Employee employee2 = new Employee("Harry","Langrian",3343,LocalDate.of(1998, Month.JULY, 04));
            System.out.printf("The Employee is %s%n",employee2);
                     System.out.printf("The Employee is %s,that was a %s%n",employee2.getDateOfBirth(),employee2.getDateOfBirth().getDayOfWeek());                 

    }
    
}
