package javax.microedition.io;

import java.io.IOException;

public interface HttpConnection extends StreamConnection {
    String GET = "GET";
    String POST = "POST";
    String HEAD = "HEAD";
    int HTTP_OK = 200;
    void setRequestMethod(String method) throws IOException;
    void setRequestProperty(String key, String value) throws IOException;
    int getResponseCode() throws IOException;
}
