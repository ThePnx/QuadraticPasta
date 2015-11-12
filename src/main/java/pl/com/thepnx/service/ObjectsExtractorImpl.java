package pl.com.thepnx.service;

import pl.com.thepnx.model.HtmlBody;
import pl.com.thepnx.model.ExtractedObject;
import pl.com.thepnx.model.Impl.ExtractedObjectImpl;

/**
 * Created by pnx on 2015-11-12.
 */

public class ObjectsExtractorImpl implements ObjectsExtractor {
    public ExtractedObject extractPromotion(HtmlBody htmlBody) {
        return new ExtractedObjectImpl();
    }
}
