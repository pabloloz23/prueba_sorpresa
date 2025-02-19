public class TarjetaRFID {
	public class TarjetaRFID extends Credencial {
    private String numeroSerie;

    public TarjetaRFID(String numeroSerie) {
        this.tipo = "TarjetaRFID";
        this.numeroSerie = numeroSerie;
    }
}
}
