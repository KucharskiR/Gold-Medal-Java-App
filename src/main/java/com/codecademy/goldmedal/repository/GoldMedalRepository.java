package com.codecademy.goldmedal.repository;

import com.codecademy.goldmedal.model.GoldMedal;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

public interface GoldMedalRepository extends CrudRepository<GoldMedal, Long>{
	List<GoldMedal> findByCountry(String country, Sort sort);
	int countByCountry(String country);
	List<GoldMedal> getByCountryAndSeason(String country, String season, Sort sort);
	int countBySeason(String season, Sort sort);
	int countByCountryAndGender(String country, String gender);
}
