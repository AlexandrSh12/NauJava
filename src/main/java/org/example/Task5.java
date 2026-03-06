package org.example;

import java.net.Socket;
import java.util.Scanner;
public class Task5 implements Task {

    private String host;
    private int startPort;
    private int endPort;
    private boolean running;

    public Task5(String host, int startPort, int endPort) {
        this.host = host;
        this.startPort = startPort;
        this.endPort = endPort;
    }

    @Override
    public void start() {
        running = true;
        System.out.println("Scanning started " + host + " from port " + startPort + " to " + endPort);

        for (int port = startPort; port <= endPort; port++) {
            if (!running) {
                System.out.println("Scanning stopped.");
                return;
            }

            try {
                Socket socket = new Socket(host, port);
                System.out.println("Port " + port + " — open");
                socket.close();
            } catch (Exception e) {
                // порт закрыт, пропускаем
            }
        }

        System.out.println("Scanning stopped.");
    }

    @Override
    public void stop() {
        running = false;
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter host (e.g. localhost): ");
        String host = scanner.nextLine();

        System.out.print("Start with port: ");
        int startPort = scanner.nextInt();

        System.out.print("Stop with port: ");
        int endPort = scanner.nextInt();

        Task5 portScanner = new Task5(host, startPort, endPort);
        portScanner.start();
    }
}
