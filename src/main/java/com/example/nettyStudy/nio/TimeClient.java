package com.example.nettyStudy.nio;

public class TimeClient {
    public static void main(String[] args) {
        int port = 9090;
        if (args != null && args.length > 0) {
            try {
                port = Integer.parseInt(args[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        new Thread(new TimeClientHandle("localhost", port), "TimeClient-001").start();
    }
}
