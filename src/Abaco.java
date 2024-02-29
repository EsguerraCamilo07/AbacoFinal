public class Abaco {

    private int[] valores = new int[7];

    public void establecerValores(int[] valores) {
        for(int i = 0; i < valores.length; i++) {
            this.valores[i] = valores[i];
        }
    }

    public void mostrar() {
        // Recorre de 0 a 6
        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.print(ceros(valores[i]));
            System.out.print("---");
            System.out.print(ceros(9 - valores[i]));
            System.out.println();
        }
    }

    public int sumaTotal() {

        int suma = 0;

        for(int i = 0; i < valores.length; i++) {

            int posicion = 6 - i;

            if(posicion == 6) {
                suma += valores[posicion] * 1000000;
            } else if(posicion == 5) {
                suma += valores[posicion] * 100000;
            } else if(posicion == 4) {
                suma += valores[posicion] * 10000;
            } else if(posicion == 3) {
                suma += valores[posicion] * 1000;
            } else if(posicion == 2) {
                suma += valores[posicion] * 100;
            } else if(posicion == 1) {
                suma += valores[posicion] * 10;
            } else {
                suma += valores[posicion];
            }

        }

        return suma;

    }




    private String ceros(int n) {

        String ceros = "";

        for(int i = 0; i < n; i++) {
            ceros += "0";
        }

        return ceros;

    }

}