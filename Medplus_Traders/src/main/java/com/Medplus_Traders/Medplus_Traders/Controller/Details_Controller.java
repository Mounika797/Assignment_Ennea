package com.Medplus_Traders.Medplus_Traders.Controller;

import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.Medplus_Traders.Medplus_Traders.Details.Details;
import com.Medplus_Traders.Medplus_Traders.Repository.Details_DTO;
import com.univocity.parsers.common.record.Record;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;



@RestController
public class Details_Controller 
{
	 @Autowired
	  Details_DTO service;
	 
	 
	 
	 
  @PostMapping("/upload")
  public String uploadData(@RequestParam("file") MultipartFile file, Date Date) throws Exception
  {
	 
	  
	  List<Details> details = new ArrayList<>();
	  InputStream inputStream =    file.getInputStream();
	  CsvParserSettings setting = new CsvParserSettings();
	  setting.setHeaderExtractionEnabled(true);
	  CsvParser parser = new CsvParser(setting);
	  List<Record>  parseAllRecords = parser.parseAllRecords(inputStream);
	  parseAllRecords.forEach(record -> {
		  Details detail = new Details();
		  detail.setCode(record.getString("code"));
		  detail.setName(record.getString("name"));
		  detail.setBatch(record.getString("batch"));
		  detail.setStock(Integer.parseInt(record.getString("stock")));
		  detail.setDeal(Integer.parseInt(record.getString("deal")));
		  detail.setFree(Integer.parseInt(record.getString("free")));
		  detail.setMrp(Double.parseDouble(record.getString("mrp")));
		  detail.setRate(Double.parseDouble(record.getString("rate")));
		  SimpleDateFormat formatter = new SimpleDateFormat("DD-DD-YYYY");
		  try {
			Date date = formatter.parse("exp");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  detail.setExp(Date);
		  detail.setCompany(record.getString("Company"));
		  detail.setSupplier(record.getString("Supplier"));
		  details.add(detail);
	  });
	  service.saveAll(details);
	  return "Upload Success";
  }
}
