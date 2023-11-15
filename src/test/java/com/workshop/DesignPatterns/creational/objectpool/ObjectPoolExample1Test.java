package com.workshop.DesignPatterns.creational.objectpool;

import com.workshop.DesignPatterns.creational.objectpool.example1.MailClient;
import com.workshop.DesignPatterns.creational.objectpool.example1.MailClientPool;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class ObjectPoolExample1Test {

    private MailClientPool pool;

    @Before
    public void setUp() {
        pool = new MailClientPool("mailserver.com", 2);
    }

    @Test
    public void testAcquireClient() {
        System.out.println("test");
        MailClient client1 = pool.acquireClient();
        assertNotNull(client1);

        MailClient client2 = pool.acquireClient();
        assertNotNull(client2);


        MailClient client3 = pool.acquireClient();
        pool.releaseClient(client1);
        pool.releaseClient(client2);
        pool.releaseClient(client3);
        assertNotNull(client3);
    }

    @Test
    public void testReleaseClient() {
        MailClient client1 = pool.acquireClient();
        pool.releaseClient(client1);

        MailClient client2 = pool.acquireClient();
        assertSame(client1, client2);
    }

    @Test
    public void testPoolSizeLimit() {
        MailClient client1 = pool.acquireClient();
        MailClient client2 = pool.acquireClient();

        pool.releaseClient(client1);
        pool.releaseClient(client2);

        MailClient client3 = pool.acquireClient();
        MailClient client4 = pool.acquireClient();

        assertSame(client1, client4);
        assertSame(client2, client3);
    }
}
