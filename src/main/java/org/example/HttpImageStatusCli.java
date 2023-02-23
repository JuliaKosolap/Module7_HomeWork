package org.example;

import org.jsoup.HttpStatusException;

import java.io.IOException;
import java.util.Scanner;

public class HttpImageStatusCli {
    public void askStatus() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter HTTP status code");

        int answer = 0;
        try {
            answer = in.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter valid number");;
        }
        HttpStatusImageDownloader imageDownloader = new HttpStatusImageDownloader();

        try {
            imageDownloader.downloadStatusImage(answer);
        } catch (IOException e) {
            System.out.println("There is not image for HTTP status " + answer);;
        }
        in.close();

    }
    }

