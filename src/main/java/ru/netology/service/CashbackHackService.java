package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;

    public int Remain(int amount) {
        return boundary - amount % boundary;
    }
}