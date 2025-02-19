import java.util.List;

public class PlataformaSeguridad {
    private List<Usuario> listaUsuarios;
    private List<Cerradura> listaCerraduras;

    public PlataformaSeguridad(List<Usuario> listaUsuarios, List<Cerradura> listaCerraduras) {
        this.listaUsuarios = listaUsuarios;
        this.listaCerraduras = listaCerraduras;
    }

    public boolean autenticarUsuario(String usuarioID, String credencial) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getID().equals(usuarioID) && usuario.getCredencial().validar(credencial)) {
                return true;
            }
        }
        return false;
    }

    public boolean enviarOrden(String cerraduraID, String accion) {
        for (Cerradura cerradura : listaCerraduras) {
            if (cerradura.getID().equals(cerraduraID)) {
                if (accion.equalsIgnoreCase("desbloquear")) {
                    cerradura.desbloquear();
                    return true;
                } else if (accion.equalsIgnoreCase("bloquear")) {
                    cerradura.bloquear();
                    return true;
                }
            }
        }
        return false;
    }
  
    public void generarInforme() {
        System.out.println("===== INFORME DE SEGURIDAD =====");
        for (Cerradura cerradura : listaCerraduras) {
            System.out.println("Cerradura ID: " + cerradura.getID() + " | Estado: " + cerradura.getEstado());
        }
    }
}
