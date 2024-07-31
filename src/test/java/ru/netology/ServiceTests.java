package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServiceTests {
    @Test
    public void testCalculateCustoms() {
        int price = 250, weight = 2, expected = 202;

        int result = Service.calculateCustoms(price, weight);

        Assertions.assertEquals(expected, result);
    }
}
