package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JunitJupiterTests {

    @Test
    public void testRemainZeroSpent() {

        CashbackHackService cashback = new CashbackHackService();

        Assertions.assertEquals(1000, cashback.remain(0));
    }

    @Test
    public void testRemainOneSpent() {

        CashbackHackService cashback = new CashbackHackService();

        Assertions.assertEquals(999, cashback.remain(1));
    }

    @Test
    public void testRemainBeforeThousandSpent() {

        CashbackHackService cashback = new CashbackHackService();

        Assertions.assertEquals(1, cashback.remain(999));
    }

    @Test
    public void testRemainThousandSpent() {

        CashbackHackService cashback = new CashbackHackService();

        Assertions.assertEquals(0, cashback.remain(1000));
    }

    @Test
    public void testRemainAfterThousandSpent() {

        CashbackHackService cashback = new CashbackHackService();

        Assertions.assertEquals(999, cashback.remain(1001));
    }
}