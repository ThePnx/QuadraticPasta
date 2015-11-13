package pl.com.thepnx.service.impl;

import org.junit.Test;
import pl.com.thepnx.service.impl.JsoupHtmlPageSupplier;

import java.net.MalformedURLException;

/**
 * Created by pnx on 2015-11-12.
 */

public class JsoupHtmlPageSupplierTest {


    public static final String INVALID_HTML_ADRESS = "invalidHtmlAdress";

    @Test(expected = MalformedURLException.class)
    public void shouldThrowMalformedURLException() throws Exception {
        JsoupHtmlPageSupplier sut = new JsoupHtmlPageSupplier();
        sut.loadPage(INVALID_HTML_ADRESS);
    }



}