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
    HourlyEmployee employee1 = new HourlyEmployee("Fred ","Flintstone",1234,LocalDate.of(1998, Month.MARCH, 14),30);
            System.out.printf("The Employee1 is %s%n",employee1);
                     System.out.printf("The Employee is %s,that was a %s%n",employee1.getDateOfBirth(),employee1.getDateOfBirth().getDayOfWeek());
   HourlyEmployee employee2 = new HourlyEmployee("Harry ","Langrian",3343,LocalDate.of(1998, Month.JULY, 04),20);
            System.out.printf("The Employee2 is %s%n",employee2);
                     System.out.printf("The Employee is %s,that was a %s%n",employee2.getDateOfBirth(),employee2.getDateOfBirth().getDayOfWeek());                 

                       employee1.addHoursWorked(30);
                       System.out.printf("Pay Cheque of employee1 is %s",employee1.getPayCheque());
                       
                       CommissionEmployee empl3 = new CommissionEmployee("Harley","Quinn",1233, 
                                                LocalDate.of(1992, Month.MARCH, 2),10);
    
       empl3.addSales(34000);
       empl3.addSales(1232);
       System.out.printf("Employee3 is %s%n", empl3);
       System.out.printf("The employee was born on %s, that was a %s%n",
                                            empl3.getDateOfBirth(), 
                                            empl3.getDateOfBirth().getDayOfWeek());
       System.out.printf("The pay cheque for employee 3 is %s%n", 
                                                    empl3.getPayCheque());
    }
    
}
