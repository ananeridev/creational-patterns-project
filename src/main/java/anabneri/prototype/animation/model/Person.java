package anabneri.prototype.animation.model;

// clonable eh uma interface no Java que diz que a classe implementada eh colanvel ou nao
public class Person implements Cloneable {
	String line1;
	String line2;
	String line3;
	String line4;
	
	
	
	public Person(String line1, String line2, String line3, String line4) {
		this.line1 = line1;
		this.line2 = line2;
		this.line3 = line3;
		this.line4 = line4;
	}

	// funcao que desenha a person
	public void draw() {
		System.out.println("");
		System.out.println(line1);
		System.out.println(line2);
		System.out.println(line3);
		System.out.println(line4);
	}

	// para a animacao ir pro aldo esquerdo, pego so primeiro ate o ultimo caractere, e remove o caractere de indice 0 com a subsstring()
	public void left() {
		line1 = line1.substring(1);
		line2 = line2.substring(1);
		line3 = line3.substring(1);
		line4 = line4.substring(1);
	}


	public void right() {
		line1 = " " + line1;
		line2 = " " + line2;
		line3 = " " + line3;
		line4 = "_" + line4;
	}

	// esse metodo me possiblita em nao clonar cada um desses objetos
	@Override
	public Object clone() throws CloneNotSupportedException {
//		clone unificadp
//		Person clone = new Person(line1, line2, line3, line4);
		return super.clone();
	}
}
