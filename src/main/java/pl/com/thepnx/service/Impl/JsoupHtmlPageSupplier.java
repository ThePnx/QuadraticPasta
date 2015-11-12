package pl.com.thepnx.service.impl;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import pl.com.thepnx.exceptions.PageLoadTimeoutException;
import pl.com.thepnx.model.HtmlBody;
import pl.com.thepnx.model.impl.JsoupElement;
import pl.com.thepnx.service.HtmlPageSupplier;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by pnx on 2015-11-12.
 */
public class JsoupHtmlPageSupplier implements HtmlPageSupplier {

    public static final int TIMEOUT_MILLIS = 1000;

    public HtmlBody loadPage(String url) throws IOException {

        Element htmlBody = parseHtmlToDocumnet(url);

        return new JsoupElement(htmlBody);
    }

    private Element parseHtmlToDocumnet(String adress) throws MalformedURLException, PageLoadTimeoutException {
        URL url = stringToURL(adress);
        Element htmlBody;

        try {
            htmlBody = Jsoup.parse(url, TIMEOUT_MILLIS).body();
        } catch (IOException e) {
            throw new PageLoadTimeoutException(e);
        }
        return htmlBody;
    }

    private URL stringToURL(String adress) throws MalformedURLException {
        return new URL(adress);
    }
}
