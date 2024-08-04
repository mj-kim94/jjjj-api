package com.kongkong.jjjjapi.Home.service;

import com.kongkong.jjjjapi.Home.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    private final HomeRepository homeRepository;

    @Autowired
    public HomeService(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
    }

//    public Object getTest() {
//        return homeRepository.
//    }
}
