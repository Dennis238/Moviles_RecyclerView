package com.example.jorgecarrillo.debermoviles1

class Singleton {
    companion object {
        var usuarios:ArrayList<Usuario> = ArrayList()

        init {
            usuarios.add(Usuario("1718973779", "Dennis", "Veintimilla", "Estudiante de Sistemas","23/08/96", true))
            usuarios.add(Usuario("1719375632", "María", "Pérez","Administrativo","11/10/1970",false))
            usuarios.add(Usuario("1936482489", "Fernando", "Alvarado","Profesor","01/12/1980",true))
        }

    
}