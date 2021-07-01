package com.folksdev.resttemplate.dto.converter;

import com.folksdev.resttemplate.dto.AvgPriceDto;
import com.folksdev.resttemplate.model.AvgPrice;
import org.springframework.stereotype.Component;

@Component
public class AvgPriceDtoConverter {

    public AvgPriceDto convert(AvgPrice from){
        return new AvgPriceDto(from.getMins(), from.getPrice(), from.getSymbol());
    }
}
