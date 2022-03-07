/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Context.DBContext;
import entity.Players;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class DAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Players> getAllPlayers() {
        List<Players> lst = new ArrayList<>();
        String query = "select * from player";
        try {
            //mo ket noi voi sql
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                lst.add(new Players(rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getInt(5)));
            }
        } catch (Exception e) {
        }
        return lst;
    }

    public ArrayList<Players> getAll() {
        ArrayList<Players> pls = new ArrayList<>();
        try {
            // String sql = "SELECT [id],[name],[gender],[dob],[phonenumber] FROM [Student]";
            String sql = "Select * from player";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Players p = new Players();
                p.setName(rs.getString("name"));
                p.setPosition(rs.getString("position"));
                p.setYear(rs.getInt("year"));
                p.setNation(rs.getString("nation"));
                p.setNumber(rs.getInt("number"));
                pls.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pls;
    }

    public Players getPlayer(int number) {
        try {
            String sql = "SELECT name,position,year,nation,number FROM player WHERE number = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, number);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Players p = new Players();
                p.setName(rs.getString("name"));
                p.setPosition(rs.getString("position"));
                p.setYear(rs.getInt("year"));
                p.setNation(rs.getString("nation"));
                p.setNumber(rs.getInt("number"));
                return p;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void insertPlayer(String name, String position, int year, String nation, int number) {
        try {
            String sql = "INSERT INTO Player(name,position,year,nation,number) values(?,?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, position);
            statement.setInt(3, year);
            statement.setString(4, nation);
            statement.setInt(5, number);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updatePlayer(String name, String position, int year, String nation, int number) {
        try {
            String sql = "UPDATE Player SET name=?, position=?, year=?, nation=?, number=? WHERE number = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, position);
            statement.setInt(3, year);
            statement.setString(4, nation);
            statement.setInt(5, number);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deletePlayer(int number) {
        try {
            String sql = "DELETE Player WHERE number=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, number);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        DAO dao = new DAO();
        List<Players> lst = dao.getAllPlayers();
        for (Players p : lst) {
            System.out.println(p);
        }
    }
}
