package com.splitter.repositories;

import com.splitter.entities.BillUserGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillUserGroupRepository extends JpaRepository<BillUserGroup, Long> {

    @Query("select bug from BillUserGroup bug where bug.bill.id = :billId")
    List<BillUserGroup> findByBillId(Long billId);

    @Query("select bug from BillUserGroup bug where bug.user.id = :userId and bug.bill.status = :status")
    List<BillUserGroup> findByUserId(Long userId, Byte status);
}
