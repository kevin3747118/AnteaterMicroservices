package com.anteater.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderLineItemsDto {
  private long id;

  private String skuCode;
  private BigDecimal price;
  private Integer quantity;
}
