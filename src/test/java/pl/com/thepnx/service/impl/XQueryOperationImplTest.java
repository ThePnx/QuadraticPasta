package pl.com.thepnx.service.impl;

import junit.framework.TestCase;
import net.sf.saxon.s9api.XdmValue;

/**
 * Created by LJeczmienny on 2015-11-13.
 */
public class XQueryOperationImplTest extends TestCase {

    private String XQuery;
    private String XmlFileInString;

    @Override
    public void setUp() throws Exception {
        XQuery = getXQuery();
        XmlFileInString = getXmlFileInString();
    }

    public void testName() throws Exception {

        XQueryOperationImpl query = new XQueryOperationImpl();

        XdmValue xdmValue = query.getXdmValue(XQuery,XmlFileInString);

        assertEquals("XQuery Kick Start", xdmValue.itemAt(0).getStringValue());
    }

    private String getXQuery() {
        return "for $x in /bookstore/book\n" +
                "where $x/price>40\n" +
                "order by $x/title\n" +
                "return $x/title";
    }

    private String getXmlFileInString() {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "\n" +
                "<bookstore>\n" +
                "\n" +
                "<book category=\"COOKING\">\n" +
                "  <title lang=\"en\">Everyday Italian</title>\n" +
                "  <author>Giada De Laurentiis</author>\n" +
                "  <year>2005</year>\n" +
                "  <price>30.00</price>\n" +
                "</book>\n" +
                "\n" +
                "<book category=\"CHILDREN\">\n" +
                "  <title lang=\"en\">Harry Potter</title>\n" +
                "  <author>J K. Rowling</author>\n" +
                "  <year>2005</year>\n" +
                "  <price>29.99</price>\n" +
                "</book>\n" +
                "\n" +
                "<book category=\"WEB\">\n" +
                "  <title lang=\"en\">XQuery Kick Start</title>\n" +
                "  <author>James McGovern</author>\n" +
                "  <author>Per Bothner</author>\n" +
                "  <author>Kurt Cagle</author>\n" +
                "  <author>James Linn</author>\n" +
                "  <author>Vaidyanathan Nagarajan</author>\n" +
                "  <year>2003</year>\n" +
                "  <price>49.99</price>\n" +
                "</book>\n" +
                "\n" +
                "<book category=\"WEB\">\n" +
                "  <title lang=\"en\">Learning XML</title>\n" +
                "  <author>Erik T. Ray</author>\n" +
                "  <year>2003</year>\n" +
                "  <price>39.95</price>\n" +
                "</book>\n" +
                "\n" +
                "</bookstore>";
    }
}