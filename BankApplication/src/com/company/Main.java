package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account leye=new Account("Adeleye Ifaturoti","ioaleye@gmail.com","07475 680 142");
        leye.withdraw();
        System.out.println(leye.getBalance());
    }
}
