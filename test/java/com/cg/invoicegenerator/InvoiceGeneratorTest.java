package com.cg.invoicegenerator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvoiceGeneratorTest {
    InvoiceGenerator invoiceGenerator=null;
    @Before
    public void SetUp() throws Exception{
        invoiceGenerator=new InvoiceGenerator();
    }

    @Test
    public void GivenDistanceAndTime_ShouldReturnFare(){
        double distance=3.0;
        int time=5;
        double fare=InvoiceGenerator.calculateFare(distance,time);
        Assert.assertEquals(35,fare,0.0);
    }
    @Test
    public void GivenLessDistanceAndTime_ShouldReturnMinimumFare(){
        double distance=0.2;
        int time=1;
        double fare=InvoiceGenerator.calculateFare(distance,time);
        Assert.assertEquals(5,fare,0.0);
    }
    @Test
    public void GivenMultipleRides_ShouldReturnInvoiceSummary(){
        Ride rides[] ={new Ride(3.0,5),
                      new Ride(0.2,1)
                      };
        InvoiceSummary summary=invoiceGenerator.calculateFare(rides);
        InvoiceSummary expectedSummary=new InvoiceSummary(2,40);
        Assert.assertEquals(expectedSummary,summary);

    }
}
