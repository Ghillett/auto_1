package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainZeroSpent() {

        CashbackHackService cashback = new CashbackHackService();

        Assert.assertEquals(cashback.remain(0), 1000);
    }

    @Test
    public void testRemainOneSpent() {

        CashbackHackService cashback = new CashbackHackService();

        Assert.assertEquals(cashback.remain(1), 999);
    }

    @Test
    public void testRemainBeforeThousandSpent() {

        CashbackHackService cashback = new CashbackHackService();

        Assert.assertEquals(cashback.remain(999), 1);
    }

    @Test
    public void testRemainThousandSpent() {

        CashbackHackService cashback = new CashbackHackService();

        Assert.assertEquals(cashback.remain(1000), 0);
    }
}
