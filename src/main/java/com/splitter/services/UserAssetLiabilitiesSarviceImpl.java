package com.splitter.services;

import com.splitter.dto.AssetLiabilitiesDto;
import com.splitter.dto.UserNetWorthDto;
import com.splitter.entities.BillUserGroup;
import com.splitter.enums.BillStatus;
import com.splitter.repositories.BillUserGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserAssetLiabilitiesSarviceImpl implements UserAssetLiabilitiesService {

    @Autowired
    private BillUserGroupRepository billUserGroupRepository;

    @Transactional(readOnly = true)
    @Override
    public UserNetWorthDto getMyNetWorth(Long userId) {

        List<AssetLiabilitiesDto> assets = new ArrayList<>();
        List<AssetLiabilitiesDto> liabilities = new ArrayList<>();
        Double netWorth = 0.0;
        List<BillUserGroup> billUserGroupList = billUserGroupRepository.findByUserId(userId, Byte.valueOf(BillStatus.ACTIVE.getId().toString()));
        for (BillUserGroup billUserGroup : billUserGroupList) {

            Double.sum(netWorth, billUserGroup.getShare());
            AssetLiabilitiesDto assetLiabilitiesDto = AssetLiabilitiesDto.builder()
                    .billName(billUserGroup.getBill().getName())
                    .share(billUserGroup.getShare())
                    .build();
            if (billUserGroup.getShare() < 0) {
                liabilities.add(assetLiabilitiesDto);
            } else {
                assets.add(assetLiabilitiesDto);
            }
        }

        UserNetWorthDto userNetWorthDto = UserNetWorthDto.builder()
                .assets(assets)
                .liabilities(liabilities)
                .netWorth(netWorth)
                .build();
        return userNetWorthDto;
    }
}
