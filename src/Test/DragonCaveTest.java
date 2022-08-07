package Test;

import Java.DragonCave;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DragonCaveTest {

    @org.junit.jupiter.api.Test
    void main() {
    }
    @Test
    void WinningCave() {

            assertEquals("You've won!!",DragonCave.CavePicker(1));
    }

    @Test
    void LosingCave(){
        assertEquals("You're Dead!!" ,DragonCave.CavePicker(2));
    }
}