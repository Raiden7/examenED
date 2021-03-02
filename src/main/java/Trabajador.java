/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ProfDiurno
 */
public class Trabajador {

public String n;//nombre
public int e;//edad
public int cat;//categoria
public int ant;//antiguedad
public double sue;//salario

Trabajador() {
n = "Ana";
e = 30;
cat = 0;
ant = 0;
}

Trabajador(String a, int b, int c, int d, int s) {
n = a;
e = b;
cat = c;
ant = d;
sue = s;
}

//modifica el metodo para que muestre el toString pasandole el trabajador como parámetro
public String toString() {
return "Nombre: " + n + "\nEdad: " + e + "\nCategoria: "
	+ cat + "\nAntiguedad: " + ant + "\nSalario: "
		+ sue;
}



public static void main(String[] args) {

Trabajador t1 = new Trabajador();

//Calculo del sueldo del trabajador
if (t1.cat == 0 && t1.ant == 0) {
t1.sue = t1.sue + t1.sue * 0.15 + 150;
} else if (t1.cat == 0 && t1.ant == 1) {
t1.sue = t1.sue + t1.sue * 0.15 + 300;
} else if (t1.cat == 0 && t1.ant == 2) {
t1.sue = t1.sue + t1.sue * 0.15 + 600;
} else if (t1.cat == 1 && t1.ant == 0) {
t1.sue = t1.sue + t1.sue * 0.35 + 150;
} else if (t1.cat == 1 && t1.ant == 1) {
t1.sue = t1.sue + t1.sue * 0.35 + 300;
} else if (t1.cat == 1 && t1.ant == 2) {
t1.sue = t1.sue + t1.sue * 0.35 + 600;
} else if (t1.cat == 2 && t1.ant == 0) {
t1.sue = t1.sue + t1.sue * 0.6 + 150;
} else if (t1.cat == 2 && t1.ant == 1) {
t1.sue = t1.sue + t1.sue * 0.6 + 300;
} else {
t1.sue = t1.sue + t1.sue * 0.6 + 600;
}

}
}
