package com.book.store.app.bookstoreapplication.configuration;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Component
public class ProjectInfoContributor implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        Map<String,String> applicationInfo=new LinkedHashMap<>();
        applicationInfo.put("Application-Name : ","ReadEazy Mini E-commerce book-store");
        applicationInfo.put("Developer Name : ","Y.V.B Sudarshan");
        applicationInfo.put("contact Num : ","6281660838");
        applicationInfo.put("Email ID : ","sudharshanyemmanuru@gmail.com");
        builder.withDetail("Application-Information",applicationInfo);
    }
}
