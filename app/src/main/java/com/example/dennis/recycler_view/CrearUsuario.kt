package com.example.dennis.recycler_view

import android.content.Intent
import android.os.Bundle
import android.view.View

class CrearUsuario {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_usuario)
        buttonCrearUsuario.setOnClickListener{
            v: View? ->  crearUsuario()
        }
    }
    fun crearUsuario(){
        val cedula=editTextCedula.text.toString()
        val nombre=editTextNombre.text.toString()
        val apellido= editTextApellido.text.toString()
        val descripcion=editTextDescripcion.text.toString()
        val fechaNacimiento= editTextFechaNacimiento.text.toString()
        Singleton.usuarios.add(Usuario(cedula,nombre,apellido,descripcion,fechaNacimiento,true))
    }
    fun irlayout(){
        val intent= Intent(this,layouts::class.java)
        startActivity(intent)
    }
}