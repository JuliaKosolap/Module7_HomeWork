package org.example;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        HttpStatusChecker checker = new HttpStatusChecker();
        checker.getStatusImage(200);
        checker.getStatusImage(1000);
        HttpStatusImageDownloader imageDownloader = new HttpStatusImageDownloader();
        imageDownloader.downloadStatusImage(200);
        HttpImageStatusCli imageStatusCli = new HttpImageStatusCli();
        imageStatusCli.askStatus();
    }
}