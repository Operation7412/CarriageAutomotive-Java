package com.carriageautomotive.service;

import java.util.ArrayList;

import org.springframework.web.servlet.ModelAndView;

import com.carriageautomotive.controller.Cart;
import com.carriageautomotive.controller.CartItem;
import com.carriageautomotive.model.UsageRecord;
import com.carriageautomotive.model.UsageRecordDetail;
import com.carriageautomotive.model.User;


public interface UsageRecordService {

	ArrayList<UsageRecord> findAllUsageRecord();

	UsageRecord findUsageRecordById(String Id);

	UsageRecord createUsageRecord(UsageRecord usageRecord);

	UsageRecord updateUsageRecord(UsageRecord usageRecord);

	void deleteUsageRecord(UsageRecord usageRecord);

	ArrayList<UsageRecord> findUsageRecordHistory(int products_PartID);

	ArrayList<UsageRecord> findUsageRecordByUserId(int Id);

	boolean usageRecordisNotDeletable(User user);

	public ArrayList<UsageRecord> findUsageRecordHistoryByDate(int pid, String startdate, String enddate);

	ArrayList<CartItem> checkStockAvailable(Cart cart);

	ArrayList<UsageRecordDetail> checkoutCartDetails(Cart cart);

}