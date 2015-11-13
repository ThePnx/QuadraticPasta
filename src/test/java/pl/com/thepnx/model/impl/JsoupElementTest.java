package pl.com.thepnx.model.impl;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by pnx on 2015-11-12.
 */
public class JsoupElementTest {

    Element htmlBody = sampleHtmlSource();
    JsoupElement jsoupElement;

    @Before
    public void setUp() throws Exception {
        jsoupElement = new JsoupElement(htmlBody);
    }

    @Test
    public void shouldReturnPromoPrice() throws Exception {

        String price = jsoupElement.getPromoPrice();
        assertEquals("359,00 zł", price);
    }

    @Test
    public void shouldReturnNormalPrice() throws Exception {

        String price = jsoupElement.getNormalPrice();
        assertEquals("419,00 zł", price);
    }

    @Test
    public void shouldReturnItemName() throws Exception {

        String name = jsoupElement.getItemName();

        assertEquals("Dysk 3TB", name);
    }

    private Element sampleHtmlSource() {
        return Jsoup.parse("<p class=\"product-name\">Dysk 3TB</p>\n" +
                "<div class=\"old-price\">419,00 zł</div>\n" +
                "<div class=\"new-price\">359,00 zł</div>\n" +
                "<script type=\"text/javascript\">\n" +
                "    \n" +
                "    window.onload = function () {\n" +
                "        Hitman.HotShot.init(new Date(2015,10,13,10,0,0), new Date('Thu Nov 12 2015 23:53:07 +0100'), function () {\n" +
                "            $.ajax({\n" +
                "                url: '/hot-shots/current/widget',\n" +
                "                success: function (data) {\n" +
                "                    $('#hotShot').parent().html(data);\n" +
                "                }\n" +
                "            });\n" +
                "        });\n" +
                "\n" +
                "        $('.hot-shot').click(function () {\n" +
                "            window.location = \"/goracy_strzal/6416\";\n" +
                "        });\n" +
                "    };\n" +
                "    \n" +
                "</script>").body();
    }
}