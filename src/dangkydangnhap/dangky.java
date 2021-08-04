/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dangkydangnhap;

import com.sun.tools.javac.jvm.ByteCodes;
import ketnoisql.ketnoi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.fom1;

/**
 *
 * @author Dell
 */
public class dangky {
    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;
    public void dangky(fom1 dksv) {
        con = ketnoi.getConnection();
        String sql = "insert into dndk(tk,mk) values(?,?)";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, dksv.getUser());
            stmt.setString(2, dksv.getPass());
            if(dksv.getPass().length()<6)
            {
                JOptionPane.showMessageDialog(null, "Đăng Ký Thất Bại");
                return;
            }
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đăng Ký Thành Công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Đăng Ký Thất Bại");
        }
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
