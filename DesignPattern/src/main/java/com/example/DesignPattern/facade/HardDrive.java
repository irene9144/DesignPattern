package com.example.DesignPattern.facade;

public class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("Reading from hard drive.");
        return new byte[size]; // 예시를 위한 간단한 구현
    }
}
