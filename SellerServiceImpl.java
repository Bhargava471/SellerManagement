package com.mouritech.springframework.service;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.springframework.entity.Seller;
import com.mouritech.springframework.exception.SellerNotFoundException;
import com.mouritech.springframework.repository.SellerRepository;

@Service
public class SellerServiceImpl implements SellerService{
	
	@Autowired
	private SellerRepository sellerRepository;

	@Transactional
	public List<Seller> getAllSellers() {
		
		return sellerRepository.findAll();
	}

	@Transactional
	public void saveSeller(Seller theNewOrder) {
		
		sellerRepository.save(theNewOrder);
	}

	@Transactional
	public Seller getSeller(Long sellid) throws SellerNotFoundException{
		return sellerRepository.findById(sellid)
				.orElseThrow(() -> new SellerNotFoundException(sellid));
	}
	
	@Transactional
	public void deleteSeller(Long sellid) {
		sellerRepository.deleteById(sellid);
		
	}

	@Override
	@Transactional
	public void updateSeller(Long sellid, Seller theNewSeller) {
		Seller existingSeller = null;
		try {
			existingSeller = sellerRepository.findById(sellid)
					.orElseThrow(() -> new SellerNotFoundException(sellid));
			existingSeller.setSellerName(theNewSeller.getSellerName());
			existingSeller.setSellerMail(theNewSeller.getSellerMail());
			sellerRepository.save(existingSeller);
		} catch (SellerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	@Transactional
	public void updateSellerName(Long sellid, String sellname) {
		Seller existingSeller = null;
		try {
			existingSeller = sellerRepository.findById(sellid)
					.orElseThrow(() -> new SellerNotFoundException(sellid));
			existingSeller.setSellerName(sellname);
			sellerRepository.save(existingSeller);
		} catch (SellerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Transactional
	public void updateSellerMail(Long sellid, String sellMail) {
		Seller existingSeller = null;
		try {
			existingSeller = sellerRepository.findById(sellid)
					.orElseThrow(() -> new SellerNotFoundException(sellid));
			existingSeller.setSellerMail(sellMail);
			sellerRepository.save(existingSeller);
		} catch (SellerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void updateSellerCategory(Long sellid, String sellCategory) {
		// TODO Auto-generated method stub
		Seller existingSeller = null;
		try {
			existingSeller = sellerRepository.findById(sellid)
					.orElseThrow(() -> new SellerNotFoundException(sellid));
			existingSeller.setSellerMail(sellCategory);
			sellerRepository.save(existingSeller);
		} catch (SellerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteOrder(Long sellid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSellerMobile(Long sellid, Long sellMobNo) {
		// TODO Auto-generated method stub
		Seller existingSeller = null;
		try {
			existingSeller = sellerRepository.findById(sellid)
					.orElseThrow(() -> new SellerNotFoundException(sellid));
			existingSeller.setSellerMobNo(sellMobNo);
			sellerRepository.save(existingSeller);
		} catch (SellerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateSellerCity(Long sellid, String sellCity) {
		// TODO Auto-generated method stub
		Seller existingSeller = null;
		try {
			existingSeller = sellerRepository.findById(sellid)
					.orElseThrow(() -> new SellerNotFoundException(sellid));
			existingSeller.setSellerCity(sellCity);
			sellerRepository.save(existingSeller);
		} catch (SellerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	

}