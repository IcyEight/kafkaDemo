package com.example.kafkaDemo.xml.processor;
import org.json.JSONObject;
import org.json.XML;

import com.example.kafkaDemo.model.Order;

//<Order>
//<Id>id1</Id>
//<Amount>100.4</Amount>
//</Order>

public class CustomXmlProcessor {

	public static Order processXml(String xmlContent) {
		JSONObject jsonObject = XML.toJSONObject(xmlContent);
		
		Order order = new Order();
		order.setId(jsonObject.getJSONObject("Order").get("Id").toString());
		order.setAmount(Double.parseDouble(jsonObject.getJSONObject("Order").get("Amount").toString()));
		
		return order;
	}

}
