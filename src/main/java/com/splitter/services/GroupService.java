package com.splitter.services;


import com.splitter.dto.GroupRequestDto;
import com.splitter.dto.GroupResponseDto;

import java.util.List;

/**
 * Created by prateek on 28/9/17.
 */
public interface GroupService {

    GroupResponseDto addNewGroup(GroupRequestDto groupRequestDto);

    List<GroupResponseDto> getAllGroups();

    void addUserToGroup(GroupRequestDto groupRequestDto);
}
