package com.splitter.entities;

import lombok.*;

/**
 * Created by prateekgupta on 09/09/17.
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Contribution  extends SuperEntity {

    private Double shareAmount;
    private Double sharePercentage;

}
