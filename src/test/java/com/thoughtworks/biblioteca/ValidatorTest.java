package com.thoughtworks.biblioteca;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ValidatorTest {

    @Test
    public void shouldReturnFalseWhenCommandIsInvalid() {
        Map<String,String> menuOptions = new HashMap<String, String>();
        menuOptions.put("1", "Display Book Details");
        CommandHandler validator = new CommandHandler(menuOptions);


        assertEquals(false, validator.isValidCommand("bad command"));
    }

}