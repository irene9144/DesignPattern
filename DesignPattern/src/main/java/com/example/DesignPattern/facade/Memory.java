package com.example.DesignPattern.facade;

public class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Memory load from position: " + position);
    }
}
