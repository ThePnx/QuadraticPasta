package pl.com.thepnx.model.impl;

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

    public String getPromoPrice() {
        return htmlBody.getElementsByClass("new-price").text();
    }

    public String getNormalPrice() {
        return htmlBody.getElementsByClass("old-price").text();
    }


    public String getItemName() {
        return htmlBody.getElementsByClass("product-name").text();
    }

    public String getItemUrl() {
        return  htmlBody.getElementsByTag("script").text();
    }
}
