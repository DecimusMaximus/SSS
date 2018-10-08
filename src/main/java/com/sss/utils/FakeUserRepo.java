package com.sss.utils;

import com.sss.entities.AppUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class FakeUserRepo {

    @Bean
    public List<AppUser> fakeUserDb(){
        List<AppUser> fakeUserDbList = new ArrayList<AppUser>();
        fakeUserDbList.add(new AppUser(1L, "Bruce", "2weeks"));
        fakeUserDbList.add(new AppUser(2L, "Michael", "bestOffice"));
        fakeUserDbList.add(new AppUser(3L, "Lara", "imnotcroft22"));

        return fakeUserDbList;
    }
}
