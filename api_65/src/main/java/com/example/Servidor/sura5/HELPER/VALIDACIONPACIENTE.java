//package com.example.Servidor.sura5.HELPER;

import com.example.Servidor.sura5.MODELOS.PACIENTE;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//public class VALIDACIONPACIENTE {
//    //1. inyectar un objeto de la clase modelo
//    private PACIENTE paciente = new PACIENTE();
//
//    public boolean validarNombres(String nombres) {
//        {
//
//            //paso 1 se consulta un exprecion regular almacenandola en una variable de  tipo string
//            String expresionRegula = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ ]+$";
//
//            //2 activar el patron
//
//            Pattern patron = Pattern.compile(expresionRegula);
//
//            //3 se busca coincidencia entre la cadena y el patron
//
//            Matcher coincidancia = patron.matcher(nombres);
//
//            //4 indico si hubo o no hbo coincidencia
//
//            if (coincidancia.find()) {
//              return true;
//            } else {
//                return false;
//            }
//        }
//    }
//
//    public boolean validarfechanacimiento(LocalDate fecha){}
//
//    public boolean validadciudad (String ciudad){
//        {
//
//            //paso 1 se consulta un exprecion regular almacenandola en una variable de  tipo string
//            String expresionRegula="^[a-zA-ZñÑáéíóúÁÉÍÓÚ ]+$";
//
//            //2 activar el patron
//
//            Pattern patron= Pattern.compile(expresionRegula);
//
//            //3 se busca coincidencia entre la cadena y el patron
//
//            Matcher coincidancia= patron.matcher(ciudad);
//
//            //4 indico si hubo o no hbo coincidencia
//
//            if(coincidancia.find()){
//                return true;
//            }else {
//              return false;
//            }
//        }
//    }
//
//    public boolean validarcorreo (String correo){
//        {
//
//            //paso 1 se consulta un exprecion regular almacenandola en una variable de  tipo string
//            String expresionRegula="^[a-zA-Z0-9._%+-]+@sura.com$";
//
//            //2 activar el patron
//
//            Pattern patron= Pattern.compile(expresionRegula);
//
//            //3 se busca coincidencia entre la cadena y el patron
//
//            Matcher coincidancia= patron.matcher(correo);
//
//            //4 indico si hubo o no hbo coincidencia
//
//            if(coincidancia.find()){
//               return true;
//            }else {
//                return false;
//            }
//        }
//    }
//
//    public boolean validartelefono (String telefono){
//        //paso 1 se consulta un exprecion regular almacenandola en una variable de  tipo string
//        String expresionRegula="^[0-9]+$";
//
//        //2 activar el patron
//
//        Pattern patron= Pattern.compile(expresionRegula);
//
//        //3 se busca coincidencia entre la cadena y el patron
//
//        Matcher coincidancia= patron.matcher(telefono);
//
//        //4 indico si hubo o no hbo coincidencia
//
//        if(coincidancia.find()){
//            return true;
//        }else {
//            return false;
//        }
//    }
//    }
//
//    public boolean validarips(String ips){}
//
//    public boolean validargrupoingreso (String grupoingreso){}
//
//    public boolean validarfechadeafiliacion (LocalDate afiliacion){}
//
//
//
//
//}
