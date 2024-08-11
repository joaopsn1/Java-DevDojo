package dominio.futebol;

public class Estado {
    private String estado;

    @Override
    public String toString() {
        return estado;
    }

    public Estado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
