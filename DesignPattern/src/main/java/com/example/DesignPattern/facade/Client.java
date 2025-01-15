package com.example.DesignPattern.facade;

public class Client {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start(); // 컴퓨터 시작
    }
}
