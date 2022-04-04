package com.jt.springswaggerdemo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel (description = "Details about the Contact")
public class Contact {

    @ApiModelProperty (notes = "The unique ID for the Contact")
    private String id;
    @ApiModelProperty (notes = "The name for the Contact")
    private String name;
    @ApiModelProperty (notes = "The telephone number for the Contact")
    private String telnum;

    public Contact(String id, String name, String telnum) {
        this.id = id;
        this.name = name;
        this.telnum = telnum;
    }

    public Contact() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelnum() {
        return telnum;
    }

    public void setTelnum(String telnum) {
        this.telnum = telnum;
    }
}
