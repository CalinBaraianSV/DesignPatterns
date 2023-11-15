package com.workshop.DesignPatterns.creational.objectpool.example1;

import java.util.LinkedList;

public class MailClientPool {
    private LinkedList<MailClient> pool;
    private String serverAddress;
    private int maxSize;

    public MailClientPool(String serverAddress, int maxSize) {
        this.serverAddress = serverAddress;
        this.maxSize = maxSize;
        pool = new LinkedList<>();
    }

    public synchronized MailClient acquireClient() {
        if (!pool.isEmpty()) {
            return pool.removeFirst(); // Changed from pop to removeFirst
        }

        // If pool is empty, create a new MailClient
        return new MailClient(serverAddress);
    }

    public synchronized void releaseClient(MailClient client) {
        if (pool.size() < maxSize) {
            pool.addFirst(client); // Changed from push to addFirst
        } else {
            // Close and dispose the client if the pool is full
            client.close();
        }
    }
}