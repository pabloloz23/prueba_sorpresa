public class Biometria extends Credencial {

    private String tipoHuella;

    public Biometria(String tipo, String tipoHuella) {
        super(tipo);
        this.tipoHuella = tipoHuella;
    }

    public String getTipoHuella() {
        return tipoHuella;
    }

    public void setTipoHuella(String tipoHuella) {
        this.tipoHuella = tipoHuella;
    }

    public String capturarHuella() {
        System.out.println("Simulando la captura de huella...");
        return "HUELLA_SIMULADA";
    }

    public boolean verificarHuella(String huellaCapturada) {
        System.out.println("Simulando la verificación de huella...");
        return huellaCapturada != null && huellaCapturada.equals(tipoHuella);
    }

    @Override
    public boolean validar() {
        String huellaCapturada = capturarHuella();
        boolean resultado = verificarHuella(huellaCapturada);
        if (resultado) {
            System.out.println("Huella verificada con éxito. Credencial válida.");
        } else {
            System.out.println("La huella no coincide. Credencial inválida.");
        }
        return resultado;
    }
}
