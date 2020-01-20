package com.retail;

public class TaxCalculator {

    
    public static final double SALES_TAX = 0.10; // 10%
    public static final double IMPORT_TAX =  0.05; // 5%

    public double getCalculatedTax(boolean isTaxable, boolean isImported, double price) {
        
        if(price == 0.0){
            throw new IllegalArgumentException("Price cannot be null");
        }
        
        double salesTax = 0.0;
        double importTax = 0.0;


        
        if (isTaxable) {
            salesTax = price*SALES_TAX;
        }
        if (isImported) {
            importTax = price*IMPORT_TAX;
        }
        
        return salesTax+importTax;
    }
} 


