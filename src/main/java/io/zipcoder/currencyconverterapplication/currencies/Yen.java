package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Yen implements ConvertableCurrency {
    @Override
    public Double convert(CurrencyType currencyType) {
        return  currencyType.getRate()/231.68;
    }
    public CurrencyType getType(){
        return CurrencyType.YEN;
    }
}
