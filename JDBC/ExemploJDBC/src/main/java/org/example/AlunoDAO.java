package org.example;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlunoDAO {
    public void cadastrar(Aluno aluno){
        Connection conn = conexao.conectar();
        String sql = "insert into aluno(nome,idade) values (?,?)";

        try{
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,aluno.getNome());
            stmt.setInt(2,aluno.getIdade());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null,"Aluno cadastrado com sucesso");
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro: "+e.getMessage());
        }
    }
}
