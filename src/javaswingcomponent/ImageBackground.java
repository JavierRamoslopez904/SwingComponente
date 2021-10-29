/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswingcomponent;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author javie
 */
public class ImageBackground implements Serializable {

    /**
     * Atributos *
     */
    private File imagenFondo;
    private Float opacidad;

    /**
     * Método constructor *
     */
    public ImageBackground(File imgSource, Float opacity) {
        this.imagenFondo = imgSource;
        this.opacidad = opacity;
    }

    /**
     * Métodos getters y setters *
     */
    public File getImgSource() {
        return imagenFondo;
    }

    public void setImgSource(File imgSource) {
        this.imagenFondo = imgSource;
    }

    public Float getOpacity() {
        return opacidad;
    }

    public void setOpacity(Float opacity) {
        this.opacidad = opacity;
    }

}
