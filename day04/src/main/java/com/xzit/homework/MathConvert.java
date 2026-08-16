package com.xzit.homework;

import com.google.protobuf.Internal;
import org.springframework.core.convert.converter.Converter;

import java.math.BigDecimal;

public class MathConvert implements Converter<Double, BigDecimal> {
   //类型转换
    @Override
    public BigDecimal convert(Double aDouble) {
        return BigDecimal.valueOf(aDouble);
    }
}
