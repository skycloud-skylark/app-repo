package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("AWS DevOps CI/CD Demo lab ECR App is running");

        // keep app running so container stays alive
        while (true) {
            try {
                Thread.sleep(60000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
