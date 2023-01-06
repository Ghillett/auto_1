package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {

    @Test
    public void testRemainZeroSpent() {

        CashbackHackService cashback = new CashbackHackService();

        Assert.assertEquals(1000, cashback.remain(0));
    }

    @Test
    public void testRemainOneSpent() {

        CashbackHackService cashback = new CashbackHackService();

        Assert.assertEquals(999, cashback.remain(1));
    }

    @Test
    public void testRemainBeforeThousandSpent() {

        CashbackHackService cashback = new CashbackHackService();

        Assert.assertEquals(1, cashback.remain(999));
    }

    @Test
    public void testRemainThousandSpent() {

        CashbackHackService cashback = new CashbackHackService();

        Assert.assertEquals(0, cashback.remain(1000));
    }

    @Test
    public void testRemainAfterThousandSpent() {

        CashbackHackService cashback = new CashbackHackService();

        Assert.assertEquals(999, cashback.remain(1001));
    }
}