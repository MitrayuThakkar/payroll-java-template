package org.example;

import java.util.Scanner;

public class App {
    public static double[] calculatePayroll(double h,int d){
        double r=16.78,o=1.5;
        double g=h<=40?h*r:40*r+(h-40)*r*o;
        double s=0.06*g,f=0.14*g,t=0.05*g,u=10,i=d>=3?35:15;
        double n=g-(s+f+t+u+i);
        return new double[]{g,n,s,f,t,u,i};
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to the Payroll Program!");
        System.out.print("How many hours did you work this week? ");
        double h=in.nextDouble();
        System.out.print("How many children do you have? ");
        int d=in.nextInt();
        double[] r=calculatePayroll(h,d);
        System.out.println("Payroll Stub:");
        System.out.printf("Hours: %.2f\n",h);
        System.out.printf("Rate: %.2f $/hr\n",16.78);
        System.out.printf("Gross: $%.2f\n",r[0]);
        System.out.printf("SocSec: $%.2f\n",r[2]);
        System.out.printf("FedTax: $%.2f\n",r[3]);
        System.out.printf("StTax: $%.2f\n",r[4]);
        System.out.printf("Union: $%.2f\n",r[5]);
        System.out.printf("Ins: $%.2f\n",r[6]);
        System.out.printf("Net: $%.2f\n",r[1]);
        System.out.println("Thank you for using the Payroll Program!");
        in.close();
    }
}

