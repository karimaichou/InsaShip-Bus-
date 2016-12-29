package fr.insaship.util;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig.Feature;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;


public class MyJsonMapper extends ObjectMapper {    
    public MyJsonMapper() {
        this.configure(Feature.FAIL_ON_EMPTY_BEANS, false);
        this.setSerializationInclusion(Inclusion.NON_NULL);
        this.setSerializationInclusion(Inclusion.NON_DEFAULT);
        this.setSerializationInclusion(Inclusion.NON_EMPTY);
    }
}
