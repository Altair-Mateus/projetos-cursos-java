/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Mateus
 * Created: 17 de abr de 2020
 */

USE system_gest;
create table produtos
(
	cod INT AUTO_INCREMENT,
    nome varchar(100),
    precoCusto double,
    precoVenda double,
    lucro double,
    estoque int,
    ncm int,
    unMedida varchar(40),
    marca varchar(40),
    modelo varchar(40),
    origem varchar(40),
    icms double,
    codBarras int,
    situacao varchar(40),
    categoria varchar(40),
    infoAdicionais varchar(100),
    primary key (cod)
);