package com.distCal;
import java.util.List;
public interface IDistService 
{
List<dist> findAll(double length,String unit,double length2,String unit2);
}
