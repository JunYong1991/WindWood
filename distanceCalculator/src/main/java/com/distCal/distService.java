package com.distCal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;  

@Service
public class distService implements IDistService  
{
@Override
public List<dist> findAll(double length,String unit,double length2,String unit2)
{
//creating an object of ArrayList
ArrayList<dist> products = new ArrayList<dist>();
//adding length to the List


boolean result = unit.toLowerCase().contains("y");
boolean result2 = unit2.toLowerCase().contains("y");

if (result) {
	length = length* 0.9144;
}

if (result2) {
	length = length* 0.9144;
}

double totalLength = length + length2;
BigDecimal bd = new BigDecimal(totalLength).setScale(2, RoundingMode.HALF_UP);  
double newNum = bd.doubleValue();  
products.add(new dist(newNum, "Meters"));

//returns a list of product
return products;
}
}
