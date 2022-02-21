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

    @Test
    void countSquaresA() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.countSquares(100, 144);
        assertEquals(expected, actual);
    }


}