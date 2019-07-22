package gen;

import java.util.HashMap;

public  class Clase extends Valor {
	String nombre;
	HashMap<String,String> atributos= new HashMap<String, String>();
	public Clase(Object value){
        super(value);
    }
	public void AgregarAtributo(String attr,String valor) {
		atributos.put(attr, valor);
	};
}
