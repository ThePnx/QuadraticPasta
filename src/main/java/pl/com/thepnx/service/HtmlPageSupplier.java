package pl.com.thepnx.service;

import pl.com.thepnx.model.HtmlBody;

import java.io.IOException;

/**
 * Created by pnx on 2015-11-12.
 */
public interface HtmlPageSupplier {

    HtmlBody loadPage(String url) throws IOException;

}
