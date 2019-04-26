package com.splitter.services;

import com.splitter.dto.UserNetWorthDto;
import com.splitter.dto.UsersAllGangsDto;
import org.springframework.stereotype.Component;

@Component
public interface UserAssetLiabilitiesService {

    UserNetWorthDto getMyNetWorth(Long userId);

    UsersAllGangsDto getMyGroupwiseNetWorth(Long userId);

}
