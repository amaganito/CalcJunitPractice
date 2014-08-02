package com.bss.calc;
import static org.junit.Assert.*;

import org.junit.Test;





public class CalcAPIJUTest2 {


CalcAPI calc= new CalcAPI();



@Test

public void testAddP() {

int res=calc.add(4,6);

assertEquals(10, res);

res=calc.add(0,6);

assertEquals(6, res);

res=calc.add(44444,66666);

assertEquals(10, res);

}





@Test

public void testAddN() {

int res=calc.add(-4,-6);

assertEquals(-10, res);

}


@Test

public void testAddNN() {

int res=calc.add(-4,-6);

assertEquals(-10, res);

}


//@Ignore

@Test

public void testDivZero() {

@SuppressWarnings("unused")
int res=0, flag=0;

try

{

res=calc.div(1234, 0);

}

catch( ArithmeticException e)

{

System.out.println("Pass");

flag=1;

}

finally

{

if(flag!=1)

fail("exception didn't occur");

//assertTrue(false);

}

}


@Test(expected=ArithmeticException.class)

public void testDivZeroNew() {


calc.div(1234, 0);


}

}