/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;

import Modelo.PilaUsuario;
import Modelo.Usuario;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Pedro", "Perez Zeledon", "1-111", "pedro@gmail.com", "hola", "23452");
        Usuario u2 = new Usuario("Maria", "Lopez", "2-222", "maria@gmail.com", "12345", "2345");
        Usuario u3 = new Usuario("Juan", "Garcia", "3-333", "juan@gmail.com", "qwerty", "234");
        Usuario u4 = new Usuario("Luis", "Ramirez", "4-444", "luis@gmail.com", "abcdef", "2345");
        Usuario u5 = new Usuario("Ana", "Martinez", "5-555", "ana@gmail.com", "abc123", "23452345");
        Usuario u6 = new Usuario("Laura", "Hernandez", "6-666", "laura@gmail.com", "pass123", "4657456");
        Usuario u7 = new Usuario("Carlos", "Rodriguez", "7-777", "carlos@gmail.com", "admin", "3453");
        Usuario u8 = new Usuario("Sofia", "Gonzalez", "8-888", "sofia@gmail.com", "qazwsx", "34564");
        Usuario u9 = new Usuario("Diego", "Torres", "9-999", "diego@gmail.com", "letmein", "23457");
        Usuario u10 = new Usuario("Isabel", "Sanchez", "10-1010", "isabel@gmail.com", "password", "4567");

        PilaUsuario pila = new PilaUsuario();
        pila.insertar(u1);
        pila.insertar(u2);
        pila.insertar(u3);
        pila.insertar(u4);
        pila.insertar(u5);
        pila.insertar(u6);
        pila.insertar(u7);
        pila.insertar(u8);
        pila.insertar(u9);
        pila.insertar(u10);
        System.out.println(pila.obtenerDatos());
    }

}
