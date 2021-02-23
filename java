class pila {
//Stack = es una clase que permite explicar el concepto de pila
//son metodos nativos de la clase Stack
//push = metodo que permite introducir un dato
//pop = metodo que permite quitar el ultimo dato
//peek = permite visualizar cual es el ultimo dato
//empty = saber si la pila esta vacia

public static void main(String[] args) {
    //FILO = PRIMERO EN ENTRAR ULTIMO EN SALIR
//Vamos a crear una pila
       Stacks pilax = new Stack();
       pilax.push(50); //insertamos el numero 50
       pilax.push("sss");//insertamos sss
//metodo empty para saber el estado
//metodo peek para ver el ultimo
//metodo pop para quitar el ultimo
       System.out.println("el ultimo de la pila es: \n"+pilax.peek());
       System.out.println("La pila es \n");
}
}