/**
 * CS 105 Theory and Practice I
 * CRN: 38066
 * Assignment: Employee
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Anton Obyedkov
 */
package edu.sbcc.cs105;

/**
 * This class provides first level testing the Employee object.
 *
 */
public class Program {

    /**
     * Create an employee and test that the proper name has been created. Test
     * the initial salary amount and then give the employee a raise. Then check
     * to make sure the salary matches the raised salary.
     * 
     * 
     * @param args
     *            command line values. Not used in this example.
     */
    public static void main(String[] args) {
        Employee harry = new Employee("Harry", 10000);
        double percent = 10;
        double harrysSalary = harry.getSalary();
        // The Employee's name has been writen
        System.out.println("Employee's name: " + harry.getName());
        // The Salary he has currently
        System.out.println("Current Salary: " + "$" + harry.getSalary());
        // Harry gets a 10% raise.
        harry.raiseSalary(percent);
        System.out.println("Percentage: " + percent + "%");
        // How much that Harry got in total
        System.out.println("Total: " + "$" + harry.getSalary());
    }
}