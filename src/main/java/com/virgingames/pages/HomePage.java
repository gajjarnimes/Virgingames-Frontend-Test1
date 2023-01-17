package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
     @CacheLookup
     @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/label[1]")
     WebElement AcceptLink;

    @CacheLookup
    @FindBy(linkText = "Login")
    WebElement loginLink;

    public void clickOnAcceptLink(){
        clickOnElement(AcceptLink);
        log.info("Clicking on accept link :"+ AcceptLink.toString());

    }
    public void clickOnLoginLink() {
      clickOnElement(loginLink);
        log.info("Clicking on login link : " + loginLink.toString());
    }
    }


