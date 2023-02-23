package org.example;

import java.io.*;
import java.net.URL;

public class HttpStatusImageDownloader {
    public void downloadStatusImage(int code) throws IOException {
        HttpStatusChecker statusChecker = new HttpStatusChecker();
        String linkToImage = statusChecker.getStatusImage(code);
        URL url = new URL(linkToImage);
        InputStream in = new BufferedInputStream(url.openStream());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        int n;
        while (-1 != (n = in.read(buf))) {
            out.write(buf, 0, n);
        }
        out.close();
        in.close();
        byte[] response = out.toByteArray();
        FileOutputStream fos = new FileOutputStream("src/main/imageOutput/status.jpg");
        fos.write(response);
        fos.close();
    }
}

