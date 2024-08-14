/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype;

/**
 *
 * @author Robinson Mosquera
 */
public class Document implements Prototype{
    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public Prototype clone() {
        return new Document(this.content);
    }
    
}
