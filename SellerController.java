package com.mouritech.springframework.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.mouritech.springframework.entity.Seller;
import com.mouritech.springframework.exception.SellerNotFoundException;
import com.mouritech.springframework.service.SellerService;

@RestController
@RequestMapping("/api/v1")
public class SellerController {
	
	@Autowired
	private SellerService sellService;
	
	@PostMapping("/order") 
	public ResponseEntity<?> saveOrder(@RequestBody Seller theNewSeller) {
		sellService.saveSeller(theNewSeller);
		return ResponseEntity.ok().body("New seller added successfully");
	}
	
	@GetMapping("/seller")
	public ResponseEntity<List<Seller>> getAllSellers() {
		List<Seller> sellerList = sellService.getAllSellers();
		return ResponseEntity.ok().body(sellerList);
	}
	
	@PutMapping("/seller/{sid}")
	public ResponseEntity<?> updateOrder(@PathVariable("sid") Long sellid,@RequestBody Seller theNewSeller ) throws SellerNotFoundException {
		//Order existingOrder = null;
		 sellService.updateSeller(sellid,theNewSeller);
		return ResponseEntity.ok().body("Seller updated successfully");
		
	 }

	@PutMapping("/seller/{sid}/{sellername}")
	public ResponseEntity<?> updateSellerName(@PathVariable("sid") Long sellid,
			@PathVariable("sellername") String sellername) throws SellerNotFoundException {
		 sellService.updateSellerName(sellid,sellername);
		return ResponseEntity.ok().body("Seller updated successfully");
		
	 }
	@PutMapping("/seller/{sid}/{sellermail}")
	public ResponseEntity<?> updateSellerMail(@PathVariable("sid") Long sellid,
			@PathVariable("sellermail") String sellermail) throws SellerNotFoundException {
		 sellService.updateSellerMail(sellid,sellermail);
		return ResponseEntity.ok().body("Seller updated successfully");
		
	 }
	@PutMapping("/seller/{sid}/{sellermob}")
	public ResponseEntity<?> updateSellerMobNo(@PathVariable("sid") Long sellid,
			@PathVariable("sellermob") String sellermob) throws SellerNotFoundException {
		 sellService.updateSellerName(sellid,sellermob);
		return ResponseEntity.ok().body("Seller updated successfully");
		
	 }
	
	@GetMapping("/seller/{sid}")
	public ResponseEntity<Seller> getSeller(@PathVariable("sid") Long sellid) throws SellerNotFoundException {
		Seller seller = sellService.getSeller(sellid);
		return ResponseEntity.ok().body(seller);
	}
	
	@DeleteMapping("/seller/{sid}")
	public ResponseEntity<?> deleteSeller(@PathVariable("sid") Long sellid) throws SellerNotFoundException {
		sellService.deleteOrder(sellid);
		return ResponseEntity.ok().body("Seller deleted successfully");
	}

}