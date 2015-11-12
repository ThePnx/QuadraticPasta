package pl.com.thepnx.service;

import pl.com.thepnx.model.HtmlBody;
import pl.com.thepnx.model.ExtractedObject;

/**
 * Created by pnx on 2015-11-12.
 */
public interface ObjectsExtractor {

    ExtractedObject extractPromotion(HtmlBody htmlBody);

}
