package com.splitter.services;


import com.splitter.dto.BillRequestDto;

/**
 * Created by prateekgupta on 09/09/17.
 */

public interface BillService {

    void addBill(BillRequestDto billRequestDto);

    void addBillToGroup(BillRequestDto billRequestDto);

    BillRequestDto getBillDetails(Long billId);

}
