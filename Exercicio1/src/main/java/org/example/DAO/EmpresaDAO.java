package org.example.DAO;

import org.example.conexao.conexao;
import org.example.model.Empresa;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpresaDAO {
    public void cadastrar(Empresa empresa){
        Connection conn = conexao.conectar();
        String sql = "insert into empresa(nome,qtd_func,endereco) values (?,?,?)";

        try{
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,empresa.getNome());
            stmt.setInt(2,empresa.getQtd_func());
            stmt.setString(3,empresa.getEndereco());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null,"Empresa cadastrada com sucesso");
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro: "+e.getMessage());
        }
    }

    public void consultar(String nomeBusca) {
        Connection conn = conexao.conectar();
        String sql = "select * from empresa where nome = ?";
        try{
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,nomeBusca);

            ResultSet rs = stmt.executeQuery();
            if(rs.next()) {
                String resultado =
                        "NOME: "+rs.getString("nome") +
                                "\nQTD_FUNC: "+rs.getInt("qtd_func") +
                                "\nENDERECO: "+rs.getString("endereco");

                JOptionPane.showMessageDialog(null,resultado);
            } else {
                JOptionPane.showMessageDialog(null,"Empresa não encontrada");
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro: "+e.getMessage());
        }
    }
}
