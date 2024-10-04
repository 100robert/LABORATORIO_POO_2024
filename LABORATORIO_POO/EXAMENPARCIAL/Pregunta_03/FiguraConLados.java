package LABORATORIO_POO.EXAMENPARCIAL.Pregunta_03;

public abstract class FiguraConLados implements FiguraGeometrica {
    protected int numeroLados;

        public FiguraConLados(int numeroLados) {
            this.numeroLados = numeroLados;
            
        }

        public int getNumeroLados() {
            return numeroLados;
        }
 
}
