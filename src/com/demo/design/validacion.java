/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.design;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jona
 */
public class validacion {
    Character s;
	public void soloLetras(KeyEvent evt ){
		s=evt.getKeyChar();
		if (s<'a' || s>'z' ){
		if( s<'A'||s>'Z'){
		if( s!=KeyEvent.VK_SPACE){
		if( s!=KeyEvent.VK_ENTER){
		if( s!=KeyEvent.VK_BACK_SPACE){
		if( s>'ñ'||s<'Ñ'){
		if( s!=KeyEvent.VK_DELETE){	
			evt.consume();
		JOptionPane.showConfirmDialog(null, "Sólo puede ingresar letras","Advertencia",2);
		}}}}}}}
	}

	public void soloNumeros(KeyEvent evt){
		s=evt.getKeyChar();
		if ((s<'0' || s>'9' )){
		if( s!=KeyEvent.VK_SPACE){
		if( s!=KeyEvent.VK_ENTER){
		if( s!=KeyEvent.VK_BACK_SPACE){
		if( s!=KeyEvent.VK_DELETE){
			evt.consume();
		JOptionPane.showConfirmDialog(null, "Sólo puede ingresar números","Advertencia",2);
		}}}}}
	}
	
	
	public void ncaracter(KeyEvent evt){
		s=evt.getKeyChar();
		if ((s<'0' || s>'9' )){
		if( s!=KeyEvent.VK_SPACE){
		if( s!=KeyEvent.VK_ENTER){
		if( s!=KeyEvent.VK_BACK_SPACE){
		if (s<'a' || s>'z' ){
		if( s<'A'||s>'Z'){
		if( s!=KeyEvent.VK_DELETE){
			evt.consume();
			JOptionPane.showConfirmDialog(null, "No se aceptan carácteres especiales como: *, ´, +, |, ?","Advertencia",2);
			}}}}}}}
		
	}

	public void solomoney(KeyEvent evt){
		s=evt.getKeyChar();
		if ((s<'0' || s>'9' )){
		if( s!=KeyEvent.VK_SPACE){
		if( s!=KeyEvent.VK_ENTER){
		if( s!=KeyEvent.VK_BACK_SPACE){
		if( s!=KeyEvent.VK_DELETE){
		if( s<'.'||s>'.'){
			evt.consume();
		JOptionPane.showConfirmDialog(null, "Sólo puede valores monetarios 44 0 44.40","Advertencia",2);
		}}}}}}
	}

	public void numcomprobante(KeyEvent evt){
		s=evt.getKeyChar();
		if ((s<'0' || s>'9' )){
		if( s!=KeyEvent.VK_SPACE){
		if( s!=KeyEvent.VK_ENTER){
		if( s!=KeyEvent.VK_BACK_SPACE){
		if( s!=KeyEvent.VK_DELETE){
		if( s<'-'||s>'-'){
		if (s<'a' || s>'z' ){
		if( s<'A'||s>'Z'){
				evt.consume();
			JOptionPane.showConfirmDialog(null, "No se aceptan carácteres especiales como: *, ´, +, |, ?","Advertencia",2);
				}}}}}}}}

	}
	
	public void limpiartabla(JTable lista){
		DefaultTableModel model = (DefaultTableModel)lista.getModel();
		model.setRowCount(0);
	}
    
}
