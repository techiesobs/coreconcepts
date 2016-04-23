package com.kensiris.java8.samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kensiris.java8.samples.invoice.model.Invoice;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Invoice a1 = new Invoice(1011.50);
        Invoice a2 = new Invoice(999.50);
        Invoice a3 = new Invoice(1811.50);
        Invoice a4 = new Invoice(1111.80);
        List<Invoice> invoiceList = new ArrayList<Invoice>();
        invoiceList.add(a1);
        invoiceList.add(a2);
        invoiceList.add(a3);
        invoiceList.add(a4);
        
        System.out.println(invoiceList);
        
        Collections.sort(invoiceList, new Comparator<Invoice>(){
        	public int compare(Invoice a1, Invoice a2){
        		return Double.compare(a1.getAmount(), a2.getAmount());
        	}
		});
        
        System.out.println(invoiceList);
        
//        invoiceList.sort(comparingDouble(Invoices::getAmount));
        System.out.println(invoiceList.stream().filter(inv -> inv.getAmount()>1000));
        
    }
}
