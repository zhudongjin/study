package com.gold.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.gold.response.mch.MchSearchResponse;

import java.io.IOException;
import java.util.List;

/**
 * @author tangkaifei
 * @Date 2017/12/2 17:33
 */
public class MchSearchResultSerializer extends JsonSerializer<List<MchSearchResponse.MchSearchResult>> {
    private final static ObjectMapper mapper = new ObjectMapper();

    static {
        mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        mapper.configure(SerializationFeature.WRITE_ENUMS_USING_INDEX,true);
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS,false);
        mapper.configure(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS,true);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
    }

    @Override
    public void serialize(List<MchSearchResponse.MchSearchResult> value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
        gen.writeString(mapper.writeValueAsString(value));
    }
}
