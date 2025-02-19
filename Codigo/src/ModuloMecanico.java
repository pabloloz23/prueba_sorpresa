public class ModuloMecanico {
    private boolean estadoBloqueo;
    private float desgaste;

    public ModuloMecanico(float desgaste) {
        this.desgaste = desgaste;
    }

    public void cambiarBloqueo() {
        estadoBloqueo = !estadoBloqueo;
    }

    public void setDesgaste(float desgaste) {
        if (desgaste >= 0) this.desgaste = desgaste;
    }

    public float getDesgaste() {
        return desgaste;
    }
}
