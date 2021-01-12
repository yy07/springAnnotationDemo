package com.gupaoedu.conditional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ServerImpl {
    @Qualifier("city")
    @Autowired
    City city;

    @Autowired
    Mapper mapper;
}
