package com.example.f1.dto;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DriverDto {
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("driver_number")
    private Integer driverNumber;
    @JsonProperty("team_name")
    private String teamName;

  public String toString()
  {
        return "DriverDto{fullName='" + fullName + "', driverNumber=" + driverNumber + ", teamName='" + teamName + "'}";
    }
}