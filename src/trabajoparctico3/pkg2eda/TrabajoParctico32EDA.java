package trabajoparctico3.pkg2eda;

public class TrabajoParctico32EDA {
    
    public static void unidosNoMezclados(Pila pila1, Pila pila2, int tam1, int tam2){
        Pila pila3 = new Pila(tam1 + tam2);
                
        while(!pila1.pilaVacia() && !pila2.pilaVacia()){
            if(pila1.verElemento() >= pila2.verElemento()){
                pila3.push(pila1.verElemento());
                pila1.pop();
            }else{
                pila3.push(pila2.verElemento());
                pila2.pop();
            }
        }
        
        while(!pila1.pilaVacia()){
            pila3.push(pila1.verElemento());
            pila1.pop();
        }
        
        while(!pila2.pilaVacia()){
            pila3.push(pila2.verElemento());
            pila2.pop();
        }
        
        System.out.println("Pila ordenada pero no como piden");
        System.out.println("--pila 3--");
        pila3.verPila();
        
        while(!pila2.pilaLlena()){
            pila2.push(pila3.verElemento());
            pila3.pop();
        }
        
        while(!pila1.pilaLlena()){
            pila1.push(pila2.verElemento());
            pila2.pop();
        }
        
        while(!pila2.pilaLlena()){
            pila2.push(pila3.verElemento());
            pila3.pop();
        }
        
        while(!pila1.pilaVacia()){
            pila3.push(pila1.verElemento());
            pila1.pop();
        }
        
        while(!pila1.pilaLlena()){
            pila1.push(pila2.verElemento());
            pila2.pop();
        }
        
        while(!pila1.pilaVacia()){
            pila3.push(pila1.verElemento());
            pila1.pop();
        }
        
        System.out.println("Pila Ordenada");
        System.out.println("--Pila 3--");
        pila3.verPila();
        
    }
    
    public static void main(String[] args) {
        TrabajoParctico32EDA trabajo = new TrabajoParctico32EDA();
        int tam1 = 5, tam2 = 5;
        Pila pila1 = new Pila(tam1);
        Pila pila2 = new Pila(tam2);
        
        pila1.push(1);
        pila1.push(3);
        pila1.push(5);
        pila1.push(7);
        pila1.push(9);
        
        pila2.push(2);
        pila2.push(4);
        pila2.push(8);
        pila2.push(10);
        pila2.push(12);
        
        System.out.println("--pila 1--");
        pila1.verPila();
        System.out.println("--pila 2--");
        pila2.verPila();
                
        unidosNoMezclados(pila1, pila2, tam1, tam2);
    }

}
