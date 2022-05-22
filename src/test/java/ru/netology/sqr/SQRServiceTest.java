package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void SqrTestLeftLessRight() {
        SQRService service = new SQRService();
        int actual = service.sqrResult(200, 300);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void SqrTestLeftMoreRight() {
        SQRService service = new SQRService();
        int actual = service.sqrResult(500, 300);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SqrTestNegativeLimit() {
        SQRService service = new SQRService();
        int actual = service.sqrResult(-200, 300);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }
}
