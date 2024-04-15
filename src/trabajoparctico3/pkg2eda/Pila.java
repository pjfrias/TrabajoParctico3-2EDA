package trabajoparctico3.pkg2eda;

public class Pila {

    private int[] arreglo;
    private int tope;
    private int tamanio;

    public Pila(int tamanio) {
        arreglo = new int[tamanio];
        tope = -1;
        this.tamanio = tamanio;

    }

    public void push(int nro) {
        if (!pilaLlena()) {
            tope++;
            arreglo[tope] = nro;

        } else {
            System.out.println("El arreglo esta completo, no se puede insertar el nro.");
        }
    }

    public void push(int nro, boolean ordenado) {

        if (!ordenado) {
            if (!pilaLlena()) {
                tope++;
                arreglo[tope] = nro;

            } else {
                System.out.println("El arreglo esta completo, no se puede insertar el nro.");
            }
        } else {
            // ACA VA EL CODIGO DE LA LOGICA DEL EJERCICIO - PUNTO A

            if (pilaVacia()) {
                push(nro);
            } else {
                if (pilaLlena()) {
                    System.out.println("El arreglo esta completo, no se puede insertar el nro.");
                } else {
                    Pila aux = new Pila(tamanio);
                    while (nro < verElemento()) { //Voy pasando los elementos hasta que encuentre uno igual o mayor
                        aux.push(this.pop());
                    }
                    this.push(nro); //Ingreso el nro nuevo a la pila
                    while (!aux.pilaVacia()) { //Devuelvo los elementos que habia sacado a la pila original
                        this.push(aux.pop());
                    }
                }
            }
        }
    }

    public int pop() {
        int retorno;
        if (!pilaVacia()) {
            retorno = arreglo[tope];
            tope--;
            return retorno;
        } else {
            System.out.println("El arreglo se encuentra vacio");
            return -1;
        }
    }

    public boolean pilaVacia() {
        return tope == -1;
    }

    public boolean pilaLlena() {
        return tope == tamanio - 1;
    }

    public int verElemento() {
        if (!pilaVacia()) {
            return arreglo[tope];
        }
        else{
            return arreglo[tope];
        }
        
    }

    public void verPila() {
        for (int i = this.tope; i >= 0; i--) {
            System.out.print("    " + arreglo[i]);
            if(i == this.tope) System.out.print(" <-- Tope");
            System.out.println();
        }
    }
    
}
