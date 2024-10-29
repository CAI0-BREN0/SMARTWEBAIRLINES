package br.com.smartweb.airlines;

public class Voo_old {
    private final String codigo;
    private final String origem;
    private final String destino;

    public Voo_old(String codigo, String origem, String destino) {
        this.codigo = codigo;
        this.origem = origem;
        this.destino = destino;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    @Override
    public String toString() {
        return "Voo{" +
                "codigo='" + codigo + '\'' +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Voo_old voo = (Voo_old) o;

        if (!codigo.equals(voo.codigo)) return false;
        if (!origem.equals(voo.origem)) return false;
        return destino.equals(voo.destino);
    }

    @Override
    public int hashCode() {
        int result = codigo.hashCode();
        result = 31 * result + origem.hashCode();
        result = 31 * result + destino.hashCode();
        return result;
    }
}

