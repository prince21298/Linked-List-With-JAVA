

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

    public static void main(String[] args) {
        final int portNumber = 8080; // Specify the port number you want to listen on

        try (ServerSocket serverSocket = new ServerSocket(portNumber)) {
            System.out.println("Server is listening on port " + portNumber);

            while (true) {
                // Accept incoming connections
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());

                // Handle the client connection in a new thread
                new Thread(() -> handleClient(clientSocket)).start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void handleClient(Socket clientSocket) {
        try (InputStream inputStream = clientSocket.getInputStream();
             OutputStream outputStream = clientSocket.getOutputStream()) {

            // Generate the response (Hello, World!)
            String response = "Hello, World!\n";

            // Write the response back to the client
            outputStream.write(response.getBytes());

            System.out.println("Client disconnected: " + clientSocket.getInetAddress().getHostAddress());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
