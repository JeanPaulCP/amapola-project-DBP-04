//package com.example.amapola_project.Entities;
//
//import java.util.Date;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "mensajeria")
//public class Mensajeria {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String ContenidoMensaje;
//    private Date FechaEnvio;
//    @ManyToOne
//    private Usuario remitente;
//    @ManyToOne
//    private Usuario destinatario;
//    private String estadoMensaje;
//
//    // Constructores
//    public Mensajeria() {
//    }
//    public Mensajeria(String ContenidoMensaje,
//                      Date FechaEnvio,
//                      Usuario remitente,
//                      Usuario destinatario,
//                      String estadoMensaje) {
//        this.ContenidoMensaje = ContenidoMensaje;
//        this.FechaEnvio = FechaEnvio;
//        this.remitente = remitente;
//        this.destinatario = destinatario;
//        this.estadoMensaje = estadoMensaje;
//    }
//}