package org.example;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class HttpStatusChecker {
    private static final String URL = "https://http.cat/";
    public String getStatusImage(int code) {
        try {
            Jsoup.connect(URL + code).ignoreContentType(true).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return URL + code;
    }
}
