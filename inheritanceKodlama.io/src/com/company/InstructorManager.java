package com.company;

public class InstructorManager {
    public void deleteStudent(Customer customer) {
        System.out.println(customer.firstName + " isimli kullanici sistemden silindi.");
    }

    public void banStudent(Customer customer) {
        System.out.println(customer.firstName + " isimli kullanici sistemde yasaklandi.");
    }

    public void rankUpStudent(Customer customer){
        System.out.println(customer.firstName + " isimli kullanicinin rutbesi yukseltildi.");
    }

    public void rankDownStudent(Customer customer){
        System.out.println(customer.firstName + " isimli kullanicinin rutbesi dusuruldu.");
    }
}
