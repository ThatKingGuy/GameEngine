package com.gabe.GEngine.listener;

import imgui.ImGui;
public class Keyboard {
    public static boolean isKeyPressed(int key){
        return ImGui.isKeyDown(key);
    }
}
