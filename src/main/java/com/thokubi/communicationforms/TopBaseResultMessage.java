package com.thokubi.communicationforms;

import lombok.Data;

@Data
public class TopBaseResultMessage {
    private String companyName;
    private String lastName;
    private String firstName;
    private String street;
    private String postalCode;
    private String city;
    private Integer recId;
}
