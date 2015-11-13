package pl.com.thepnx.service;

import net.sf.saxon.s9api.SaxonApiException;
import net.sf.saxon.s9api.XdmValue;

/**
 * Created by LJeczmienny on 2015-11-13.
 */
public interface XQueryOperation {


    XdmValue getXdmValue(String query, String s) throws SaxonApiException;
}
