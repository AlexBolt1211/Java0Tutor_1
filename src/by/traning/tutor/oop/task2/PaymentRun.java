package by.traning.tutor.oop.task2;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class PaymentRun {
    public static void main(String[] args){

        Payment payment = new Payment();
        payment.addProduct("vtr",9);

        payment.printPayment(payment);

    }
}
