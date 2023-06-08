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
import model.InforHospital;

/**
 *
 * @author HUNTER
 */
public class HospitalDAO {
Connection con = null; //ket noi voi sql
    PreparedStatement ps = null; // nem cau lenh query sang sql
    ResultSet rs = null; // nhan ket qua tra ve
    
    
    
    public List<InforHospital> getHospital() {
        List<InforHospital> list = new ArrayList<>();
        String query = "SELECT [name], [address], [email], [hotline] FROM [dbo].[hospital]";
        try {
            con = new DBContext().getConnection(); // mo ket noi voi sql sever
            ps = con.prepareStatement(query); //chay cau lenh query
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new InforHospital(
                        rs.getString(1), 
                        rs.getString(2), 
                        rs.getString(3),
                        rs.getString(4)
          
                           
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    
        public static void main(String[] args) {
        HospitalDAO dao = new HospitalDAO();

            
        List<InforHospital> listP = dao.getHospital();
        for (InforHospital o : listP) {
            System.out.println("\n"+o);
        }

   
        }
 
    
    
    
}
