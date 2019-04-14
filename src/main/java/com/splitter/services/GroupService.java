package com.splitter.services;


import com.splitter.dto.GroupRequestDto;
import com.splitter.dto.GroupResponseDto;
import com.splitter.entities.Group;

import java.util.List;

/**
 * Created by prateek on 28/9/17.
 */
public interface GroupService {

    Group addNewGroup(GroupRequestDto groupRequestDto);

    List<GroupResponseDto> getAllGroups();

    void addUserToGroup(GroupRequestDto groupRequestDto);
}
