/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.HistoryVaccine;

/**
 *
 * @author HUNTER
 */
public class HistoryDAO {
   Connection con = null; //ket noi voi sql
    PreparedStatement ps = null; // nem cau lenh query sang sql
    ResultSet rs = null; // nhan ket qua tra ve
    
            

    
    public List<HistoryVaccine> getHistory() {
        List<HistoryVaccine> list = new ArrayList<>();
        String query = "SELECT u.username, u.gender, h.name, ap.appointmentDateAt, v.name AS vaccine_name, a.price\n" +
                        "FROM [user] u\n" +
                        "JOIN appointment a ON u.idUser = a.idUserVaccineA\n" +
                        "JOIN appointment_provision ap ON a.idAppoinmentProvisionA = ap.idAppointmentProvision\n" +
                        "JOIN vaccine v ON ap.idVaccineAP = v.idVaccine\n" +
                        "JOIN hospital h ON ap.idHAP = h.idH; ";
        try {
            con = new DBContext().getConnection(); // mo ket noi voi sql sever
            ps = con.prepareStatement(query); //chay cau lenh query
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new HistoryVaccine(
                        rs.getString(1), 
                        rs.getString(2), 
                        rs.getString(3),
                        rs.getString(4), 
                       rs.getString(5),
                        rs.getDouble(6)
                           
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    
    
        public List<HistoryVaccine> getHistoryByIduser(String idUser) {
        List<HistoryVaccine> list = new ArrayList<>();
        String query = "SELECT u.username, u.gender, h.name, ap.appointmentDateAt, v.name AS vaccine_name, a.price\n" +
                        "FROM [user] u\n" +
                        "JOIN appointment a ON u.idUser = a.idUserVaccineA\n" +
                        "JOIN appointment_provision ap ON a.idAppoinmentProvisionA = ap.idAppointmentProvision\n" +
                        "JOIN vaccine v ON ap.idVaccineAP = v.idVaccine\n" +
                        "JOIN hospital h ON ap.idHAP = h.idH; ";
        try {
            con = new DBContext().getConnection(); // mo ket noi voi sql sever
            ps = con.prepareStatement(query); //chay cau lenh query
            ps.setString(1, idUser);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new HistoryVaccine(
                        rs.getString(1), 
                        rs.getString(2), 
                        rs.getString(3),
                        rs.getString(4), 
                       rs.getString(5),
                        rs.getDouble(6)
                           
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    
        public static void main(String[] args) {
        HistoryDAO dao = new HistoryDAO();

            
        List<HistoryVaccine> listP = dao.getHistory();
        for (HistoryVaccine o : listP) {
            System.out.println("\n"+o);
        }

   
        }
        


}
