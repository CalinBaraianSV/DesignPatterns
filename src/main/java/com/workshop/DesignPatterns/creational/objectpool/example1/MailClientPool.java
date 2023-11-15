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
        for (int i = 0; i < maxSize; i++) {
            pool.add(new MailClient(serverAddress));
        }
    }

    public synchronized MailClient acquireClient() throws InterruptedException {
        if (pool.isEmpty()) {
            wait();
        }
        return pool.removeFirst();
    }

    public synchronized void releaseClient(MailClient client) {
        if (pool.size() < maxSize) {
            pool.addFirst(client);
            notify();
        } else {
            client.close();
        }
    }
}
