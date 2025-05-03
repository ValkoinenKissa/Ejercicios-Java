package com.example.hellofx.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label mensajeLabel;

    @FXML
    private TextField userTextField;

    @FXML
    private PasswordField passwordField;


    @FXML
    protected void onHelloButtonClick() {
        String usuario = userTextField.getText();
        String contrasena = passwordField.getText();
        if (usuario.isEmpty() || contrasena.isEmpty()) {
            mensajeLabel.setText("Por favor, rellena todos los campos.");
        } else {
            mensajeLabel.setText("Usuario: " + usuario + " / Contraseña: " + contrasena);
            // Aquí podrías hacer validación real o login
        }

    }



}