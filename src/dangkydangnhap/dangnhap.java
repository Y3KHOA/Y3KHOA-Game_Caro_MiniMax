/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dangkydangnhap;

import carochess.LOGIN;
import ketnoisql.ketnoi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.fom1;
import dangkydangnhap.Viewdangnhap;
import javax.swing.JOptionPane;
/**
 *
 * @author Dell
 */
public class dangnhap {
     private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;
    public void check_login(fom1 sv) {
        con = ketnoi.getConnection();
        String sql = "select * from dndk where tk=? and mk=?";
        try {
            stmt = con.prepareStatement(sql);
            //
            stmt.setString(1, sv.getUser());
            stmt.setString(2, sv.getPass());
            //
            rs = stmt.executeQuery();
            if (rs.next()) {
                fom1 getsv = new fom1();
                //
                sv.setTbdn("Đăng Nhập Thành Công");
                JOptionPane.showMessageDialog(null, "Đăng nhập thành công !");
                new LOGIN().setVisible(true);
            }
            else {
                sv.setTbdn("Đăng Nhập Thất Bại");
                JOptionPane.showMessageDialog(null, "Đăng nhập thất bại !");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Đăng Nhập Thất Bại");
        }
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
