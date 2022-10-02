package com.Medplus_Traders.Medplus_Traders.Repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.Medplus_Traders.Medplus_Traders.Details.Details;

public interface Details_Rest_Repository extends PagingAndSortingRepository<Details, String>
{
	List<Details>   findByCode(String code);

}
