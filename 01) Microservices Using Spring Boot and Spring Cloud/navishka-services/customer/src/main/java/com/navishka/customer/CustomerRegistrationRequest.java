package com.navishka.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
