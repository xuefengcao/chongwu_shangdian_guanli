package com.system.common.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

public class LongToStringJsonConverter extends ObjectMapper {
    /**
     *
     */
    private static final long serialVersionUID = 1683531771040674386L;

    public LongToStringJsonConverter(){
        super();
        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addSerializer(Long.class, ToStringSerializer.instance);
        simpleModule.addSerializer(Long.TYPE, ToStringSerializer.instance);
        registerModule(simpleModule);
    }
}