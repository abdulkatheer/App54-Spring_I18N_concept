package org.katheer.bean;

import org.springframework.context.MessageSource;

import java.util.Locale;

public class Welcome {
    private MessageSource messageSource;

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public void welcomeMessageWithParams() {
        Locale l1 = new Locale("en", "US");
        Locale l2 = new Locale("it", "IT");
        Locale l3 = new Locale("fr", "FR");

        System.out.println(messageSource.getMessage("welcome", new Object[] {
                "en", "US"}, l1));
        System.out.println(messageSource.getMessage("welcome", new Object[] {
                "it", "IT"}, l2));
        System.out.println(messageSource.getMessage("welcome", new Object[] {
                "fr", "FR"}, l3));
    }

    public void welcomeMessageWithoutParams() {
        Locale l1 = new Locale("en", "US");
        Locale l2 = new Locale("it", "IT");
        Locale l3 = new Locale("fr", "FR");

        System.out.println(messageSource.getMessage("welcome", null, l1));
        System.out.println(messageSource.getMessage("welcome", null, l2));
        System.out.println(messageSource.getMessage("welcome", null, l3));
    }
}
