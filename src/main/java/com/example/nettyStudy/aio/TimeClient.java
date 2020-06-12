package com.example.nettyStudy.aio;

import com.example.nettyStudy.nio.TimeClientHandle;

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
        new Thread(new AsyncTimeClientHandle("localhost", port), "AsyncTimeClientHandle-001").start();
    }
}
