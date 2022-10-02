package com.Medplus_Traders.Medplus_Traders.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Medplus_Traders.Medplus_Traders.Details.Details;

@Repository
public interface Details_DTO extends JpaRepository<Details, String>
{
  List<Details>   findByCode(String code);
}


