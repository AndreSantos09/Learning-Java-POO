public class EscopoV {
private int numero;

public EscopoV(int numero) {
this.numero = numero;
}  

public int resultado(int numero) {

int resultado = this.numero * numero;

return resultado;
}

// metodo incorreto, pois a variavel numero ésta em conflito! 
//public int resultado(int numero) {

//  int numero = this.numero * numero;
    
// return numero;
// }

}
