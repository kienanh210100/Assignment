/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Context.DBContext;
import entity.Account;
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
                lst.add(new Players(rs.getInt(1), rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getInt(6)));
            }
        } catch (Exception e) {
        }
        return lst;
    }

    public ArrayList<Players> getAll() {
        ArrayList<Players> pls = new ArrayList<>();
        try {
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

    public Players getPlayer(int id) {
        try {
            String sql = "SELECT id,name,postion,year,nation,number FROM player WHERE id = ?";
            conn = new DBContext().getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Players p = new Players();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setPosition(rs.getString("postion"));
                p.setYear(rs.getInt("year"));
                p.setNation(rs.getString("nation"));
                p.setNumber(rs.getInt("number"));
                return p;
            }

        } catch (Exception ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void insertPlayer(String name, String position, int year, String nation, int number) {
        try {
            String sql = "INSERT INTO Player(name,postion,year,nation,number) values(?,?,?,?,?)";
            conn = new DBContext().getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, position);
            statement.setInt(3, year);
            statement.setString(4, nation);
            statement.setInt(5, number);
            statement.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updatePlayer(String name, String position, int year, String nation, int number, int id) {
        try {
            String sql = " UPDATE player SET name=?, postion=?, year=?, nation=? ,number =? WHERE id = ?";
            conn = new DBContext().getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, position);
            statement.setInt(3, year);
            statement.setString(4, nation);
            statement.setInt(5, number);
            statement.setInt(6, id);
            statement.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Account getAccount(String username, String password) {
        try {
            String query = "select * from account where username = ? and password = ?";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                Account a = new Account(rs.getString(1), rs.getString(2));
                return a;
            }
        } catch (Exception e) {
        }

        return null;
    }

    public void deletePlayer(int id) {
        try {
            String sql = "DELETE Player WHERE id=?";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            PreparedStatement statement = conn.prepareStatement(sql);
            //statement.setInt(1, number);
            //statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) throws Exception {
        DAO dao = new DAO();
        dao.updatePlayer("Haha", "GK", 1596, "U", 1, 1);

    }
}
