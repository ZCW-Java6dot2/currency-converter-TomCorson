package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Euro implements ConvertableCurrency {
    @Override
    public Double convert(CurrencyType currencyType) {
        return  currencyType.getRate()/1.88;
    }
    public CurrencyType getType(){
        return CurrencyType.EURO;
    }
}
