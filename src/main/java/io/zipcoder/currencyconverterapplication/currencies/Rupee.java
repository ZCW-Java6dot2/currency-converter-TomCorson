package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Rupee implements ConvertableCurrency {
    @Override
    public Double convert(CurrencyType currencyType) {
        return  currencyType.getRate()/136.64;
    }
    public CurrencyType getType(){
        return CurrencyType.RUPEE;
    }
}
