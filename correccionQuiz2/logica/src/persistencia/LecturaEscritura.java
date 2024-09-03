/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import logica.Tarjeta;

/**
 *
 * @author Robinson Mosquera
 */
public class LecturaEscritura {
    private BufferedReader reader;
    private BufferedWriter writer;
    private String filename;
    private List<Tarjeta> list;

    public LecturaEscritura(String filename) {
        this.filename = filename;
        list = new ArrayList();
    }

    public List<Tarjeta> getList() {
        return list;
    }

    public void setList(List<Tarjeta> list) {
        this.list = list;
    }
    
    public void leerTarjetas() throws FileNotFoundException, IOException{
        try{
            reader = new BufferedReader(new FileReader("archivos"));
            String line = reader.readLine();
            while(line!=null){
                String[] datos = line.split(";");
                switch (datos[2]){
                    case "Joven"
                }
            }
        }
    }
    
}
