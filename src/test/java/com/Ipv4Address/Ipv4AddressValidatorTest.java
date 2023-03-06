package com.Ipv4Address;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ipv4AddressValidatorTest {
    private Ipv4AddressValidator Ipv4Validator = new Ipv4AddressValidator();
    @Test
    public void testValidIpv4Address() {
        String ipv4 = "192.168.1.1";

        assertTrue(Ipv4Validator.ValidateIpv4Address(ipv4));
    }
    public void testValidIpv4Address1() {
        String ipv4 = "192.168.1.1";
        assertTrue(Ipv4Validator.ValidateIpv4Address("10.0.0.1"));
    }

    @Test
    public void testInvalidIpv4Address() {
        assertFalse(Ipv4Validator.ValidateIpv4Address(""));
    }
    public void testInvalidIpv4Address1() {
        assertFalse(Ipv4Validator.ValidateIpv4Address("192.168.1"));
    }
    public void testInvalidIpv4Address2() {
        assertFalse(Ipv4Validator.ValidateIpv4Address("192.168.1.256"));
    }
    public void testInvalidIpv4Address3() {
        assertFalse(Ipv4Validator.ValidateIpv4Address("192.168.0.0"));
    }
    public void testInvalidIpv4Address4() {
        assertFalse(Ipv4Validator.ValidateIpv4Address("192.168.255.255"));
    }

    @Test
    public void testInvalidCharacters() {
        assertFalse(Ipv4Validator.ValidateIpv4Address("192.168.1.a"));
    }public void testInvalidCharacters1() {
        assertFalse(Ipv4Validator.ValidateIpv4Address("192.168.1.1a"));
    }public void testInvalidCharacters2() {
        assertFalse(Ipv4Validator.ValidateIpv4Address("192.168.1.-1"));
    }
}