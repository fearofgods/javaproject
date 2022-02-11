/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cellphonestore.function;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author hongd
 */
public class Functions {
    //Convert int curency to string format curency ###.###.###
    public String Currency(int currencyAmount) {
        Locale locale = new Locale("vn", "VN");
	NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
	String resultRaw = numberFormat.format(currencyAmount);
        String resultChangeChar = resultRaw.substring(3, resultRaw.length());
        String result = resultChangeChar.replace(",", ".");
	return result;
    }
    
}
