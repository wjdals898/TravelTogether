package com.shinhan.travelTogether.payment;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
	
	@Autowired
	PaymentDAO paymentDAO;
	
	public int insertPaymentInfo(PaymentDTO payment) {
		return paymentDAO.insertPaymentInfo(payment);
	}
	
	public PaymentFundingInfoDTO getFundingInfo(int fundingId) {
		
		return paymentDAO.getFundingInfo(fundingId);
	}
	
	public List<Map<String, Object>> paymentRecipe(int userId){
		return paymentDAO.paymentRecipe(userId);
	}
	public List<Map<String, Object>> refundRecipe(int userId){
		return paymentDAO.refundRecipe(userId);
	}
	
	public Map<String, Object>checkingFundingState(int funding_id){
		return paymentDAO.checkingFundingState(funding_id);
	}
	public int updatePeopleNum(int funding_id) {
		return paymentDAO.updatePeopleNum(funding_id);
	}
	
}
