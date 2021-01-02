package com.sukesh.functional.function;

import com.sukesh.functional.util.CommonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Locale;

public class FunctionUsage {
    private static final Logger LOGGER  = LoggerFactory.getLogger(FunctionUsage.class);
    public static void main(String[] args) {
        List<String> modifiableList = CommonUtil.buildStringList();
        //UnaryOperator extends Function interface.it accepts and returns the same parameter
        modifiableList.replaceAll(value -> value.toLowerCase(Locale.ROOT));
        LOGGER.info("Lowercase list : {}" , modifiableList);
    }
}
