public class Matematica {
	public static double generarNumeroPi(long){
		long aciertos= 0;
		double areaCuadrado= 4;
for (long i = 1; i <= pasos; i++) {
            double x = Math.random();
            double y = Math.random();

            double distancia = Math.sqrt(x * x + y * y);
            if (distancia <= 1.) {
                aciertos += 1;
            }

        }

        double radio = 1.;
        double areaCirculo = areaCuadrado * (aciertos * 1. / pasos);
        return areaCirculo / (radio * radio);
    }
}

