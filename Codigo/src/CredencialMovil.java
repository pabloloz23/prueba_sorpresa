
public class CredencialMovil extends Credencial {

    private String tokenBluetooth;

    public CredencialMovil(String tokenBluetooth) {
        this.tokenBluetooth = tokenBluetooth;
    }

    public String getTokenBluetooth() {
        return tokenBluetooth;
    }

    public void setTokenBluetooth(String tokenBluetooth) {
        this.tokenBluetooth = tokenBluetooth;
    }

    @Override
    public boolean validarCredencial() {
        // Ejemplo básico de validación
        return tokenBluetooth != null && !tokenBluetooth.isEmpty();
    }
}