package com.lv.rest.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonSpringbootImplController {
    private static final String NAME = "LeonV";
    private static final String NAME_V1 = "LeonV First";
    private static final String LASTNAME_V2 = "Second";

//    @GetMapping(value = "/{version}/person/sbi", version = "1.0.0")
//    public PersonV1 getFirstVersionOfPerson() {
//        return new PersonV1(NAME_V1);
//    }
//
//    @GetMapping(value = "/{version}/person/sbi", version = "2.0.0")
//    public PersonV2 getSecondVersionOfPerson() {
//        return new PersonV2(new Name(NAME, LASTNAME_V2));
//    }

    @GetMapping(path = "/person/sbi", version = "1.0.0")
    public PersonV1 getFirstVersionOfPersonRequestParam() {
        return new PersonV1(NAME_V1);
    }

    @GetMapping(path = "/person/sbi", version = "2.0.0")
    public PersonV2 getSecondVersionOfPersonRequestParam() {
        return new PersonV2(new Name(NAME, LASTNAME_V2));
    }

    //For request header, it's only needed to add the new property in application.properties
    //For accept header, it's only needed to add the new property in application.properties
}
