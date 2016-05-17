package com.github.gerlof85.helloworldapp;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import org.junit.Test;
import org.openqa.selenium.By;
 
 
public class WebTest {
    @Test
    public void userCanLoginByUsername() {
        open("/hello-world-webapp/");
        $(By.tagName("h2")).shouldHave(text("Hello World!"));
        $(By.tagName("body")).shouldHave(text("Zien of deze hello zichtbaar wordt!"));
    }
}
