package ru.netology.sqr;

public class SQRService {
    public int sqrResult(int leftLimit, int rightLimit) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i > leftLimit && i * i < rightLimit) {
                count++;
            }
        }
        return count;
    }

}
