package com.workshop.DesignPatterns.creational.objectpool;

import com.workshop.DesignPatterns.creational.objectpool.example1.MailClient;
import com.workshop.DesignPatterns.creational.objectpool.example1.MailClientPool;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ObjectPoolExample1Test {

    private MailClientPool pool;

    @Before
    public void setUp() {
        pool = new MailClientPool("mailserver.com", 2);
    }

    @Test
    public void testAcquireClient() throws InterruptedException {
        MailClient client1 = pool.acquireClient();
        assertNotNull(client1);

        MailClient client2 = pool.acquireClient();
        assertNotNull(client2);

        // Testing that acquiring another client doesn't return null
        // This simulates creating a new client as the pool limit is 2
        MailClient client3 = pool.acquireClient();
        pool.releaseClient(client1);
        pool.releaseClient(client2);
        pool.releaseClient(client3);
        assertNotNull(client3);
    }

    @Test
    public void testReleaseClient() throws InterruptedException {
        MailClient client1 = pool.acquireClient();
        pool.releaseClient(client1);

        // Attempt to acquire again and check if we get the same client
        MailClient client2 = pool.acquireClient();
        assertSame(client1, client2); // check if the same instance is returned
    }

    @Test
    public void testPoolSizeLimit() throws InterruptedException {
        MailClient client1 = pool.acquireClient();
        MailClient client2 = pool.acquireClient();

        // Release both clients back to the pool
        pool.releaseClient(client1);
        pool.releaseClient(client2);

        // Acquire again to test pool size limit
        MailClient client3 = pool.acquireClient();
        MailClient client4 = pool.acquireClient();

        // The pool should not create a new instance here, should return the existing ones
        assertSame(client1, client4);
        assertSame(client2, client3);
    }
}
