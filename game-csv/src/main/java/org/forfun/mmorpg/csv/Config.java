package org.forfun.mmorpg.csv;

import org.forfun.mmorpg.csv.convertor.JsonToArrayConvertor;
import org.forfun.mmorpg.csv.convertor.JsonToListConvertor;
import org.forfun.mmorpg.csv.convertor.JsonToMapConvertor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.format.support.DefaultFormattingConversionService;

@Configuration
public class Config {

    @Bean(name="conversionService")
    public ConversionService getConversionService() {
        DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService();
        conversionService.addConverter(new JsonToListConvertor());
        conversionService.addConverter(new JsonToArrayConvertor());
        conversionService.addConverter(new JsonToMapConvertor());
        return conversionService;
    }

}
