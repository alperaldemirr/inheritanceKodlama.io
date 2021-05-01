package com.company;

public class Main {

    public static void main(String[] args) {
        StudentCustomer alper = new StudentCustomer();
        alper.firstName="Alper Aldemir";

        InstructorCustomer engin = new InstructorCustomer();
        engin.firstName="Engin Demirog";

        StudentManager studentManager = new StudentManager();
        studentManager.comment(alper);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.banStudent(alper);


        CustomerManager customerManager = new CustomerManager();
        customerManager.add(alper);
        customerManager.Remove(engin);
        customerManager.Update(engin);
    }
}
