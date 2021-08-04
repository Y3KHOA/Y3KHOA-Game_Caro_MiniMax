/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carochess;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.SystemTray;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import javax.swing.JButton;

import javax.swing.JOptionPane;
import javax.swing.Timer;


/**
 *
 * @author Thu
 */
public class GamePVP extends javax.swing.JFrame {

    int col,row;
//    int colmount[]={5,10,15};
//    int rowmount[]={5,10,15};
    int colmount[]={4,10,15,20};
    int rowmount[]={4,10,15,20};
    JButton btn[][];    
    boolean tick[][];
    int turn;
    int undoX[]=new int[row*col];
    int undoY[]=new int[row*col];
    int step=0;
    int cell;    
    String tenNguoiChoi1;
    String tenNguoiChoi2;
    
    public int getCol()
    {
        return this.col;
    }
    public void setCol(int col){
     this.col=col;   
    }
    public int getRow()
    {
        return this.row;
    }
    public void setRow(int row){
     this.row=row;
    }
    public int getTurn()
    {
        return this.turn;
    }
    public void setTurn(int turn){
     this.turn=turn;
    }
    public String getTenNguoiChoi1()
    {
        return this.tenNguoiChoi1;
    }
    public void setTenNguoiChoi1(String tenNguoiChoi1){
     this.tenNguoiChoi1=tenNguoiChoi1;
    }
     public String getTenNguoiChoi2()
    {
        return this.tenNguoiChoi2;
    }
    public void setTenNguoiChoi2(String tenNguoiChoi2){
     this.tenNguoiChoi2=tenNguoiChoi2;
    }
   
    
    public int getCell()
    {
        return this.cell;
    }
    public void setCell(int cell){
     this.cell=cell;   
    }
    /**
     * Creates new form GamePVP
     */
    public GamePVP(){}
    public GamePVP(String tenNguoiChoi1) {
        initComponents();        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setTitle("caro");
        this.row=5;
        this.col=5;
        this.turn=0;        
        this.turntxt.setText(tenNguoiChoi1);                             
        this.cell=0;
        this.btn=new JButton[row+2][col+2];
        this.tick=new boolean[row+2][col+2];
        this.undoX=new int[row*col];
        this.undoY=new int[row*col];   
        veBanco(row,col); 
        
    }
    public GamePVP(String title,int row,int col, int turn,int cell,String tenNguoiChoi1,String tenNguoiChoi2) {
        super(title);
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);        
        this.row=row;
        this.col=col;
        this.turn=turn;
        if(turn%2==0)
            turntxt.setText(tenNguoiChoi1);
        else turntxt.setText(tenNguoiChoi2);
        this.cell=cell;
        this.btn=new JButton[row+2][col+2];
        this.tick=new boolean[row+2][col+2];
        this.undoX=new int[row*col];
        this.undoY=new int[row*col];
        veBanco(this.row,this.col);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        newgamebtn = new javax.swing.JButton();
        undobtn = new javax.swing.JButton();
        CellChoose = new javax.swing.JComboBox<>();
        back = new javax.swing.JButton();
        change = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        turntxt = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 700));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 5));
        jPanel2.setPreferredSize(new java.awt.Dimension(650, 650));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 851, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(242, 242, 32));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 3));

        newgamebtn.setBackground(new java.awt.Color(102, 255, 0));
        newgamebtn.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        newgamebtn.setForeground(new java.awt.Color(255, 0, 0));
        newgamebtn.setText("Chơi lại");
        newgamebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newgamebtnActionPerformed(evt);
            }
        });

        undobtn.setBackground(new java.awt.Color(102, 255, 51));
        undobtn.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        undobtn.setForeground(new java.awt.Color(255, 51, 0));
        undobtn.setText("Đánh lại");
        undobtn.setEnabled(false);
        undobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undobtnActionPerformed(evt);
            }
        });

        CellChoose.setBackground(new java.awt.Color(102, 255, 51));
        CellChoose.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        CellChoose.setForeground(new java.awt.Color(255, 0, 0));
        CellChoose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5x5", "10x10", "15x15", "20x20" }));
        CellChoose.setToolTipText("");
        CellChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CellChooseActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(102, 255, 0));
        back.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        back.setForeground(new java.awt.Color(255, 0, 0));
        back.setText("Trở về");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        change.setBackground(new java.awt.Color(102, 255, 51));
        change.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        change.setForeground(new java.awt.Color(255, 51, 0));
        change.setText("Đổi quân ");
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(102, 255, 51));
        exit.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 0, 51));
        exit.setText("Thoát");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        turntxt.setEditable(false);
        turntxt.setColumns(20);
        turntxt.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        turntxt.setForeground(new java.awt.Color(255, 0, 0));
        turntxt.setRows(2);
        turntxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        jScrollPane1.setViewportView(turntxt);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/co-caro-1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(exit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CellChoose, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(change, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                        .addComponent(undobtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newgamebtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(newgamebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(undobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(change, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CellChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1135, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this,"Bạn có muốn thoát?")==JOptionPane.OK_OPTION)
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed
        // TODO add your handling code here:
        changeDisplay();
        turn=1-turn;
        if(turn%2==0)
        turntxt.setText(tenNguoiChoi1);
        else turntxt.setText(tenNguoiChoi2);
    }//GEN-LAST:event_changeActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new LOGIN().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void CellChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CellChooseActionPerformed
        // TODO add your handling code here:
        int i=CellChoose.getSelectedIndex();
        if(this.cell!=i){
            this.cell=i;
            int newcol=colmount[i];
            int newrow=rowmount[i];
            GamePVP newgame= new GamePVP("caro", newrow, newcol,turn,i,tenNguoiChoi1,tenNguoiChoi2);
            newgame.setVisible(true);
            newgame.tenNguoiChoi1=tenNguoiChoi1;
            newgame.tenNguoiChoi2=tenNguoiChoi2;
            newgame.CellChoose.setSelectedIndex(i);
            this.dispose();
        }
    }//GEN-LAST:event_CellChooseActionPerformed

    private void undobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undobtnActionPerformed
        // TODO add your handling code here:

        undo();

    }//GEN-LAST:event_undobtnActionPerformed

    private void newgamebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newgamebtnActionPerformed
        // TODO add your handling code here:
        GamePVP newgame= new GamePVP("caro", row, col,0,cell,tenNguoiChoi1,tenNguoiChoi2);
        newgame.setVisible(true);
        newgame.CellChoose.setSelectedIndex(cell);
        newgame.tenNguoiChoi1=tenNguoiChoi1;
        newgame.tenNguoiChoi2=tenNguoiChoi2;
        this.dispose();
    }//GEN-LAST:event_newgamebtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GamePVP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GamePVP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GamePVP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GamePVP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GamePVP().setVisible(true);
        });
    }
    public void veBanco(int row,int col)
    {
        this.jPanel2.setLayout(new GridLayout(row,col));        
        for(int i=0;i<=row+1;i++)
        {
            
            for(int j=0;j<=col+1;j++){
            btn[i][j]=new JButton("");
            btn[i][j].setActionCommand(i+","+j);
            btn[i][j].setBackground(Color.WHITE);
            btn[i][j].setFont(new java.awt.Font("Tahoma",3,18));
            btn[i][j].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionPerformed(evt);
            }
        });
            
            tick[i][j] = true;
            }
        }
        for(int i=1;i<=row;i++)
            for(int j=1;j<=col;j++)
            jPanel2.add(btn[i][j]);
            
        
        jPanel2.updateUI();
    }
    public boolean checkWin(int i,int j)
    {
        //kiem tra hang doc
        int h = i,d = 0, k,demquanchan=0;
        while (btn[h][j].getText()==btn[i][j].getText()) {            
            d++;
            h++;
        }
        if(btn[h][j].getText()!=btn[i][j].getText()&&btn[h][j].getText()!="")
           demquanchan++;
        h=i-1;
        while (btn[h][j].getText()==btn[i][j].getText()) {            
            d++;
            h--;
        }
        if(btn[h][j].getText()!=btn[i][j].getText()&&btn[h][j].getText()!="")
            demquanchan++;
        if(demquanchan!=2){
        if(d>4) return true;
        }
        //kiem tra hang ngang
         k=j;d=0;demquanchan=0;
        while (btn[i][k].getText()==btn[i][j].getText()) {            
            d++;
            k++;
        }
        if(btn[i][k].getText()!=btn[i][j].getText()&&btn[i][k].getText()!="")
            demquanchan++;
        k=j-1;
        while (btn[i][k].getText()==btn[i][j].getText()) {            
            d++;
            k--;
        }
        if(btn[i][k].getText()!=btn[i][j].getText()&&btn[i][k].getText()!="")
            demquanchan++;
        if(demquanchan!=2){
        if(d>4) return true;
        }
        //kiem tra duong cheo 
        h=i;k=j;d=0;demquanchan=0;
        while (btn[h][k].getText()==btn[i][j].getText()) {            
            d++;
            k++;
            h++;
        }
        if(btn[h][k].getText()!=btn[i][j].getText()&&btn[h][k].getText()!="")
            demquanchan++;
        h=i-1;k=j-1;
        while (btn[h][k].getText()==btn[i][j].getText()) {            
            d++;
            k--;
            h--;
        }
        if(btn[h][k].getText()!=btn[i][j].getText()&&btn[h][k].getText()!="")
            demquanchan++;
        if(demquanchan!=2){
        if(d>4) return true;
        }
        //kiem tra duong cheo
        h=i;k=j;d=0;demquanchan=0;
        while (btn[h][k].getText()==btn[i][j].getText()) {            
            d++;
            h++;
            k--;
        }
        if(btn[h][k].getText()!=btn[i][j].getText()&&btn[h][k].getText()!="")
            demquanchan++;
        h=i-1;k=j+1;
        while (btn[h][k].getText()==btn[i][j].getText()) {            
            d++;
            h--;
            k++;
        }
        if(btn[h][k].getText()!=btn[i][j].getText()&&btn[h][k].getText()!="")
            demquanchan++;
        if(demquanchan!=2){
        if(d>4) return true;
        }
        return false;
    }
    public boolean checkDraw(){
        return step==(row*col);
    }
    public void addPoint(int i,int j)
    {
        
        undoX[step]=i;
        undoY[step]=j;
        step++;
        if(turn%2==0)
        {
           
            btn[i][j].setText("X");
            btn[i][j].setForeground(Color.red);
        }
        else
        {
          
            btn[i][j].setText("O");
            btn[i][j].setForeground(Color.blue);
        }
        tick[i][j]=false;
        turn=1-turn;
        undobtn.setEnabled(true);
       
        
    }
    public void undo()
    {
        if(step>0){
            btn[undoX[step - 1]][undoY[step - 1]].setText("");
            btn[undoX[step - 1]][undoY[step - 1]].setActionCommand(undoX[step - 1]+","+undoY[step - 1]);
            
            tick[undoX[step-1]][undoY[step-1]]=true;
            turn--;
            step--;
            if(step==0) undobtn.setEnabled(false);
            if(turn%2==0)
            turntxt.setText(tenNguoiChoi1);
            else turntxt.setText(tenNguoiChoi2);
            
        }
    }
    public void playWithPlayer(int i,int j)
    {       
        if (tick[i][j]) {
            addPoint(i, j);
            if(turn%2==0)
            turntxt.setText(tenNguoiChoi1);
            else turntxt.setText(tenNguoiChoi2);
        }
        if(checkDraw()){
                btn[i][j].setEnabled(false);
                undobtn.setEnabled(false);
                CellChoose.setEnabled(false);
                change.setEnabled(false);
                JOptionPane.showMessageDialog(this, "Hòa");
        }
        else if (checkWin(i, j)) 
            {			
                for (i = 1; i <= row; i++)
                        for (j = 1; j <= col; j++) 
                btn[i][j].setEnabled(false);
                undobtn.setEnabled(false);	
                CellChoose.setEnabled(false);
                change.setEnabled(false);
                
                if(turn==0){
                JOptionPane.showMessageDialog(this, tenNguoiChoi2+"\n chiến thắng");
                turntxt.setText("Người chơi " +tenNguoiChoi2+"\n giành chiến thắng");
                }
                else{
                    JOptionPane.showMessageDialog(this, tenNguoiChoi1+"\n chiến thắng");
                turntxt.setText("Người chơi " +tenNguoiChoi1+"\n giành chiến thắng");
                }
            }
    }
   
    public void changeDisplay()
    {
         for(int i=1;i<=row;i++)
            for(int j=1;j<=col;j++)
            {
                if(btn[i][j].getText()=="O"){
                    btn[i][j].setText("X");
                btn[i][j].setForeground(Color.red);
                }
                else if(btn[i][j].getText()=="X"){
                    btn[i][j].setText("O");
                btn[i][j].setForeground(Color.blue);
                }
            }
        
    }
    private void ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        
        String s = evt.getActionCommand();
        StringTokenizer stk= new StringTokenizer(s,",");
        int i = Integer.parseInt(stk.nextToken());
        int j = Integer.parseInt(stk.nextToken());
       
         playWithPlayer(i, j);
         
       
}
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CellChoose;
    private javax.swing.JButton back;
    private javax.swing.JButton change;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newgamebtn;
    private javax.swing.JTextArea turntxt;
    private javax.swing.JButton undobtn;
    // End of variables declaration//GEN-END:variables
}
