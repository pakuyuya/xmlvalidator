package org.ppa.xmlvalidator.core.validate.matcher;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.ppa.xmlvalidator.util.XmlElementData;

public class MatcherHelper {

    static public List<Matcher> createMatchers(XmlElementData src) {
        List<Matcher> matchers = new ArrayList<Matcher>();

        matchers.add(new NameMatcher(src.getName()));

        for (Entry<String, String> attr : src.getAttributes().entrySet()) {
            matchers.add(new AttributePatternMatcher(attr.getKey(), attr.getValue()));
        }

        return matchers;
    }
}
