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
import java.util.ArrayList;
import java.util.List;

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
    public static void main(String[] args) {
        DAO dao = new DAO();
        List<Players> lst = dao.getAllPlayers();
        for (Players p : lst) {
            System.out.println(p);
        }
    }
}
