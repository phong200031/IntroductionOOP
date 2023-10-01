package model;

import java.awt.Color;

public class MyColorModel {
    private Color foreground;
    private Color background;
    private boolean opaque;
public MyColorModel (){
     this.foreground = Color.black;
     this.background = Color.white;
     this.opaque = true;
}
//

public Color getForeground() {
    return foreground;
}


public void setForeground(Color foreground) {
    this.foreground = foreground;
}


public Color getBackground() {
    return background;
}


public void setBackground(Color background) {
    this.background = background;
}

public boolean getOpaque() {
    return opaque;
}

public void setOpaque(boolean opaque) {
    this.opaque = opaque;
}    
}