package com.distCal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class distController 
{
@Autowired
private IDistService distService;
//mapping the getProduct() method to /product
@GetMapping(value = "/dist/{length}/{unit}/{length2}/{unit2}")
public List<dist> getProduct(@PathVariable(value = "length") double length
		,@PathVariable(value = "unit") String unit
		,@PathVariable(value = "length2") double length2
		,@PathVariable(value = "unit2") String unit2
		) 
{
//finds all the products
List<dist> products = distService.findAll(length,unit,length2,unit2);
//returns the product list
return products;
}
}
