package com.capstone.bidmarkit.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddBidRequest {
    private int productId;
    private int price;
}