package com.kodilla.patterns.singleteon;

import com.kodilla.patterns.singleton.SettingFileEngine;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SettingsFileEngineTestSuite {

    private static SettingFileEngine settingFileEngine;

    @BeforeAll
    public static void openSettingsFile(){
        settingFileEngine = new SettingFileEngine();
        settingFileEngine.open("myapp.settings");
    }

    @AfterAll
    public static void closeSettingsFile(){
        settingFileEngine.close();
    }

    @Test
    void testGetFileName(){
        //Given
        //When
        String fileName = settingFileEngine.getFileName();
        System.out.println("Opened: " + fileName);
        //Then
        assertEquals("Myapp.settings",fileName);
    }
    @Test
    void testLoadSettings() {
        //Given
        //When
        boolean result = settingFileEngine.loadSettings();
        //Then
        assertTrue(result);
    }

    @Test
    void testSaveSettings() {
        //Given
        //When
        boolean result = settingFileEngine.saveSettings();
        //Then
        assertTrue(result);
    }
}
