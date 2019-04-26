package com.splitter.services;

import com.splitter.dto.UserNetWorthDto;
import org.springframework.stereotype.Component;

@Component
public interface UserAssetLiabilitiesService {

    UserNetWorthDto getMyNetWorth(Long userId);

}
