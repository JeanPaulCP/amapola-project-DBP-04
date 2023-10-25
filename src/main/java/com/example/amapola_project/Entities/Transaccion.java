//package com.example.amapola_project.Entities;
//import java.util.Date;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "transaccion")
//public class Transaccion{
//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        private Long id;
//        @ManyToOne
//        private Usuario comprador;
//        private String nombreVendedor;
//
//        @ManyToMany
//        private Set<Producto> productosComprados;
//        private Date fechaTransaccion;
//        private double precioTotal;
//        private String metodoPago;
//}