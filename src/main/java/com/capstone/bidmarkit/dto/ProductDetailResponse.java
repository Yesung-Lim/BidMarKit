package com.capstone.bidmarkit.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetailResponse {
    private List<String> url;
    private String name;
    private int bidPrice;
    private int initPrice;
    private int price;
    private LocalDateTime deadline;
    private String sellerName;
    private String content;
}
