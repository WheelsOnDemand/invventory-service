package com.inventoryservice.app.requestDto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateCarRequest {
	@NotBlank
	@NotNull
	private String id;
	
	@Min(0)
	private double dailyPrice;
	
	@Min(2015)
	private int modelYear;
	
	@NotBlank
	@NotNull
	private String plate;
	
	@Min(1)
	@Max(3)
	private int state;
	
	@NotNull
	@NotBlank
	private String modelId;
}