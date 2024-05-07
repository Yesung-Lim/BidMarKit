package com.capstone.bidmarkit.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class ProductBriefResponse {
    String thumbnail, productName, category;
    Integer productId, bidPrice, price, state;
    LocalDateTime deadline;
}
