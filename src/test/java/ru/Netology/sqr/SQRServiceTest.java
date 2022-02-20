package ru.Netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {





    @Test
    void countSquares() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.countSquares(9800, 9801);
        assertEquals(expected, actual);



    }
}