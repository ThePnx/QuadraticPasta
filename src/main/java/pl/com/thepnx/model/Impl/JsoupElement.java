package pl.com.thepnx.model.Impl;

import org.jsoup.nodes.Element;
import pl.com.thepnx.model.HtmlBody;

/**
 * Created by pnx on 2015-11-12.
 */
public class JsoupElement implements HtmlBody {


    private Element htmlBody;

    public JsoupElement(Element htmlBody) {
        this.htmlBody = htmlBody;
    }


}
