package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fatih  {
public fatih() {    PageFactory.initElements(Driver.get(),this);}


    @FindBy (id = "dd")
    public WebDriver aa;

}