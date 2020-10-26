package com.cg.invoicegenerator;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceGeneratorTest {
    @Test
    public void GivenDistanceAndTime_ShouldReturnFare(){
        InvoiceGenerator invoiceGenerator=new InvoiceGenerator();
        double distance=3.0;
        int time=5;
        double fare=InvoiceGenerator.calculateFare(distance,time);
        Assert.assertEquals(35,fare,0.0);
    }
    @Test
    public void GivenLessDistanceAndTime_ShouldReturnMinimumFare(){
        InvoiceGenerator invoiceGenerator=new InvoiceGenerator();
        double distance=0.2;
        int time=1;
        double fare=InvoiceGenerator.calculateFare(distance,time);
        Assert.assertEquals(5,fare,0.0);
    }
}
