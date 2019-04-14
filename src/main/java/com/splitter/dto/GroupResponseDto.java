package com.splitter.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupResponseDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private List<UserResponseDto> users;
    private UserResponseDto admin;

}
