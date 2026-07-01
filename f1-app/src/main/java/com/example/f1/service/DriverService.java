package com.example.f1.service;
import com.example.f1.client.OpenF1Client;
import com.example.f1.dto.DriverDto;
import org.springframework.stereotype.Service;
@Service
public class DriverService {
    private final OpenF1Client openF1Client;

    public DriverService(OpenF1Client openF1Client)
    {
        this.openF1Client = openF1Client;
    }
    public DriverDto getDriver(int driverNumber)
    {
        return openF1Client.getDriver(driverNumber);
    }
}