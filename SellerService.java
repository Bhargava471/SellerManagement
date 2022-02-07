package com.mouritech.springframework.service;
import java.util.List;

import com.mouritech.springframework.entity.Seller;
import com.mouritech.springframework.exception.SellerNotFoundException;





public interface SellerService {

	List<Seller> getAllSellers();

	void saveSeller(Seller theNewSeller);

	Seller getSeller(Long sellid) throws SellerNotFoundException;

	void updateSeller(Long sellid, Seller theNewSeller);

	void updateSellerName(Long sellid, String sellName);

	void updateSellerMail(Long sellid, String sellMail);
	
	void updateSellerMobile(Long sellid, Long sellMobNo);
	
	void updateSellerCity(Long sellid, String sellCity);
	
	void updateSellerCategory(Long sellid, String sellCategory);

	void deleteOrder(Long sellid);

	
	

}