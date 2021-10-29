/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswingcomponent;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author javie
 */
public class JPanelBackground extends JPanel implements Serializable {

    /**
     * Atributos *
     */
    private ImageBackground imagenFondo;

    /**
     * Método constructor *
     */
    public JPanelBackground() {

    }

    // Getters and Setters
    public ImageBackground getImgSource() {
        return imagenFondo;
    }

    public void setImgSource(ImageBackground imgSource) {
        this.imagenFondo = imgSource;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (imagenFondo != null) {

            if (imagenFondo.getImgSource() != null && imagenFondo.getImgSource().exists()) {

                ImageIcon imageIcon = new ImageIcon(imagenFondo.getImgSource().getAbsolutePath());
                Graphics2D g2d = (Graphics2D) g;
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, imagenFondo.getOpacity()));
                g.drawImage(imageIcon.getImage(), 0, 0, null);
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));

            }

        }
    }

}
