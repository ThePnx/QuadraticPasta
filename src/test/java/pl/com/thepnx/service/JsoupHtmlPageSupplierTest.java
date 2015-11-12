package pl.com.thepnx.service;

import org.junit.Test;
import pl.com.thepnx.exceptions.PageLoadTimeoutException;
import pl.com.thepnx.service.Impl.JsoupHtmlPageSupplier;

import java.net.MalformedURLException;

/**
 * Created by pnx on 2015-11-12.
 */

public class JsoupHtmlPageSupplierTest {

    @Test(expected = MalformedURLException.class)
    public void shouldThrowMalformedURLException() throws Exception {
        JsoupHtmlPageSupplier sut = new JsoupHtmlPageSupplier();
        sut.loadPage("rgherfdsfsdf");
    }

    @Test(expected = PageLoadTimeoutException.class)
    public void shouldThrowPageLoadTimeoutException() throws Exception {
        JsoupHtmlPageSupplier sut = new JsoupHtmlPageSupplier();
        sut.loadPage("http://bbbbaaaaa.edu.pl");
    }
}