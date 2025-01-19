package com.srpingcore;

import jakarta.persistence.Column;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import static java.lang.System.*;

@Component
@ComponentScan(basePackages="com.srpingcore")
public class Main {
    public static void main(String[] args) {

        out.printf("Hello and welcome!");

    }
}