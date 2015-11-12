package pl.com.thepnx.exceptions;

import java.io.IOException;

/**
 * Created by pnx on 2015-11-12.
 */
public class PageLoadTimeoutException extends IOException {
    public PageLoadTimeoutException(IOException e) {
    }
}
