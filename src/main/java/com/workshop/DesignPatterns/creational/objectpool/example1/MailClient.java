package com.workshop.DesignPatterns.creational.objectpool.example1;

public class MailClient {
    private String serverAddress;

    public MailClient(String serverAddress) {
        this.serverAddress = serverAddress;
    }

    public void sendEmail(String message) {
        System.out.println("Sending email: " + message);
    }

    public void close() {
    }
}
