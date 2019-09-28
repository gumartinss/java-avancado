/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pw.bancodados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 65772
 */
public class ClassePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            // Cria uma coneção com o banco de dados 
            // Não esquecer de inicializar o xampp, Mysql
            // Banco de dados e as tabelas tem que estar criadas
            Connection conexao = DriverManager
                    .getConnection("jdbc:mysql://localhost/banco_dados","root", "");
            // Classes que nos permite executar comandos no Banco de Dados
            Statement statement = conexao.createStatement();
            
            // Método que executa o camando 
            //statement.execute("INSERT INTO livros (id, nome, preco) VALUES (1, 'Laranja', 10.00)");
            //statement.execute("UPDATE livros SET nome = 'Fri wuili', preco = 1.00 WHERE id = 1");
            //statement.execute("DELETE FROM livros WHERE id = 1");
            ResultSet rs = statement.executeQuery("SELECT * FROM livros");
            while(rs.next()){
                String nome = rs.getString("nome");
                System.out.println(nome);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
