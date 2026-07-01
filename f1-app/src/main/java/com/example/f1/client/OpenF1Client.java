package com.example.f1.client;
import com.example.f1.dto.DriverDto;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class OpenF1Client {
    private final RestTemplate restTemplate;

    public OpenF1Client(RestTemplate restTemplate)
    {
        this.restTemplate = restTemplate;
    }

    public DriverDto getDriver(int driverNumber)
    {
        String url = "https://api.openf1.org/v1/drivers?driver_number=" + driverNumber;
        DriverDto[] drivers = restTemplate.getForObject(url, DriverDto[].class);

        if (drivers == null || drivers.length == 0)
        {
            return null;
        }
        return drivers[0];
    }
}