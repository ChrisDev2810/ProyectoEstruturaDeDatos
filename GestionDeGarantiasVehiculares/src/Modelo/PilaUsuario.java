
package Modelo;

public class PilaUsuario {

    private NodoUsuario tope;

    public PilaUsuario() {
        tope = null;
    }

    public boolean esVacia() {
        return tope == null;
    }

    public void insertar(Usuario usuario) {
        NodoUsuario nuevo = new NodoUsuario(usuario);
        if (!this.esVacia()) {
            nuevo.setSiguiente(tope);
        }
        tope = nuevo;
    }

    public Usuario buscarPorId(String id) {
        NodoUsuario aux = tope;
        for (; aux != null;) {
            if (id.equalsIgnoreCase(aux.getUsuario().getIdentificacion())) {
                return aux.getUsuario();
            }
            aux = aux.getSiguiente();
        }
        return null;
    }

    public NodoUsuario getTope() {
        return tope;
    }

    public String obtenerDatos() {
        NodoUsuario actual = tope;
        StringBuilder resultado = new StringBuilder();
        while (actual != null) {
            Usuario usuario = actual.getUsuario();
            resultado.append("Nombre: ").append(usuario.getNombre()).append("\n");
            resultado.append("Identificacion: ").append(usuario.getIdentificacion()).append("\n");
            resultado.append("Correo electronico: ").append(usuario.getEmail()).append("\n");
            resultado.append("Telefono").append(usuario.getTelefono()).append("\n");
            resultado.append("Contrasenna: ").append(usuario.getContrasenna()).append("\n");
            actual = actual.getSiguiente();
        }
        return resultado.toString();
    }

}
