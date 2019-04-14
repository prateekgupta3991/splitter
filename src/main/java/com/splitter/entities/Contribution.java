package com.splitter.entities;

import lombok.*;

/**
 * Created by prateekgupta on 09/09/17.
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Contribution {

    private Double shareAmount;
    private Double sharePercentage;

}
