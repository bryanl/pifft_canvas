package com.osesm.pifft;

import com.badlogic.gdx.backends.jogl.JoglApplication;

public class DesktopStarter {
  
  public static void main(String[] args) {
    new JoglApplication(new PifftCanvas(), "PifftCanvas", 1280, 800, false);
  }

}
