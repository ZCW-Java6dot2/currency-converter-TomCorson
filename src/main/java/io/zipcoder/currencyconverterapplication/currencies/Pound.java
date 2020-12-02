package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Pound implements ConvertableCurrency {
    @Override
    public Double convert(CurrencyType currencyType) {
        return  currencyType.getRate()/1.64;
    }
    public CurrencyType getType(){
        return CurrencyType.POUND;
    }
}
