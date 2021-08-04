/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carochess;

/**
 *
 * @author Thu
 */
public class AI {
    PVsC game;
   
    int nextMoveX;
    int nextMoveY;
    long mangDiemTanCong[]={0,9,54,162,1458,13112,118008};
    long mangDiemPhongThu[]={0,3,27,99,729,6561,59049};
//    long mangDiemTanCong[]={0,3,24,192,1536,12888,98304};
//    long mangDiemPhongThu[]={0,1,9,81,729,6561,59049};
    
    
    public int getnextMoveX()
    {
        return nextMoveX;
    }
    public int getnextMoveY()
    {
        return nextMoveY;
    }
    public AI(){}
    public AI(PVsC game)
    {
        this.game=game;
    }
   
    long tc_doc(int i,int j)//tấn công dọc
    {
        String quanTa,quanDich;
        if(game.turn%2==1){
            quanTa="O";
            quanDich="X";
        }
        else{
            quanTa="X";
            quanDich="O";
        }
        long tong=0;
        int soquanta=0;
        int soquandich=0;
        for(int dem=1;dem<6;dem++)
        {
            if(game.btn[i+dem][j].getText()==quanTa)
            {
                soquanta++;
            }
            else
                if(game.btn[i+dem][j].getText()==quanDich){
                    soquandich++;
                    break;
                }
                else{
                    break;
                
            }
        }
        for(int dem=1;dem<6;dem++)
        {
            if(game.btn[i-dem][j].getText()==quanTa)
            {
                soquanta++;
            }
            else
                if(game.btn[i-dem][j].getText()==quanDich){
                    soquandich++;
                    break;
                }
                else
                    break;
                
            
        }
        if(soquandich==2)
            return 0;
        tong=tong-mangDiemPhongThu[soquandich];
        tong=tong+mangDiemTanCong[soquanta];
        return tong;
    }
    long tc_ngang(int i,int j)
    {
        String quanTa,quanDich;
        if(game.turn%2==1){
            quanTa="O";
            quanDich="X";
        }
        else{
            quanTa="X";
            quanDich="O";
        }
        long tong=0;
        int soquanta=0;
        int soquandich=0;
        for(int dem=1;dem<6;dem++)
        {
            if(game.btn[i][j+dem].getText()==quanTa)
            {
                soquanta++;
            }
            else
                if(game.btn[i][j+dem].getText()==quanDich){
                    soquandich++;
                    break;
                }
                else{
                    break;
                
            }
        }
        for(int dem=1;dem<6;dem++)
        {
            if(game.btn[i][j-dem].getText()==quanTa)
            {
                soquanta++;
            }
            else
                if(game.btn[i][j-dem].getText()==quanDich){
                    soquandich++;
                    break;
                }
                else {
                    break;
                
            }
        }
        if(soquandich==2)
            return 0;
        tong=tong-mangDiemPhongThu[soquandich];
        tong=tong+mangDiemTanCong[soquanta];
        return tong;
    }
    long tc_cheo1(int i,int j)
    {
        String quanTa,quanDich;
        if(game.turn%2==1){
            quanTa="O";
            quanDich="X";
        }
        else{
            quanTa="X";
            quanDich="O";
        }
        long tong=0;
        int soquanta=0;
        int soquandich=0;
        for(int dem=1;dem<6;dem++)
        {
            if(game.btn[i+dem][j+dem].getText()==quanTa)
            {
                soquanta++;
            }
            else
                if(game.btn[i+dem][j+dem].getText()==quanDich){
                    soquandich++;
                    break;
                }
                else{
                    break;
                }
            
        }
        for(int dem=1;dem<6;dem++)
        {
            if(game.btn[i-dem][j-dem].getText()==quanTa)
            {
                soquanta++;
            }
            else
                if(game.btn[i-dem][j-dem].getText()==quanDich){
                    soquandich++;
                    break;
                }
                else{
                    break;
                
            }
        }
        if(soquandich==2)
            return 0;
        tong=tong-mangDiemPhongThu[soquandich];
        tong=tong+mangDiemTanCong[soquanta];
        return tong;
    }
    long tc_cheo2(int i,int j)
    {
        String quanTa,quanDich;
        if(game.turn%2==1){
            quanTa="O";
            quanDich="X";
        }
        else{
            quanTa="X";
            quanDich="O";
        }
        long tong=0;
        int soquanta=0;
        int soquandich=0;
        for(int dem=1;dem<6;dem++)
        {
            if(game.btn[i-dem][j+dem].getText()==quanTa)
            {
                soquanta++;
            }
            else
                if(game.btn[i-dem][j+dem].getText()==quanDich){
                    soquandich++;
                    break;
                }
                else{
                    break;
                
            }
        }
        for(int dem=1;dem<6;dem++)
        {
            if(game.btn[i+dem][j-dem].getText()==quanTa)
            {
                soquanta++;
            }
            else
                if(game.btn[i+dem][j-dem].getText()==quanDich){
                    soquandich++;
                    break;
                }
                else{
                    break;
                }
            
        }
        if(soquandich==2)
            return 0;
        tong=tong-mangDiemPhongThu[soquandich];
        tong=tong+mangDiemTanCong[soquanta];
        return tong;
    }
    long pt_doc(int i,int j)
    {
        String quanTa,quanDich;
        if(game.turn%2==1){
            quanTa="O";
            quanDich="X";
        }
        else{
            quanTa="X";
            quanDich="O";
        }
        long tong=0;
        int soquanta=0;
        int soquandich=0;
        for(int dem=1;dem<6;dem++)
        {
            if(game.btn[i+dem][j].getText()==quanTa)
            {
                soquanta++;
                break;
            }
            else
                if(game.btn[i+dem][j].getText()==quanDich){
                    soquandich++;
                   
                }
                else{
                    break;
                
            }
        }
        for(int dem=1;dem<6;dem++)
        {
            if(game.btn[i-dem][j].getText()==quanTa)
            {
                soquanta++;break;
            }
            else
                if(game.btn[i-dem][j].getText()==quanDich){
                    soquandich++;
                    
                }
                else{
                    break;
                
            }
        }
        if(soquanta==2)
            return 0;
        tong=tong+mangDiemPhongThu[soquandich];
        //tong=tong-mangDiemTanCong[soquanta];
        return tong;
    }
    long pt_ngang(int i,int j)
    {
        String quanTa,quanDich;
        if(game.turn%2==1){
            quanTa="O";
            quanDich="X";
        }
        else{
            quanTa="X";
            quanDich="O";
        }
        long tong=0;
        int soquanta=0;
        int soquandich=0;
        for(int dem=1;dem<6;dem++)
        {
            if(game.btn[i][j+dem].getText()==quanTa)
            {
                soquanta++; break;
            }
            else
                if(game.btn[i][j+dem].getText()==quanDich){
                    soquandich++;
                   
                }
                else{
                    break;
                }
            
        }
        for(int dem=1;dem<6;dem++)
        {
            if(game.btn[i][j-dem].getText()==quanTa)
            {
                soquanta++;break;
            }
            else
                if(game.btn[i][j-dem].getText()==quanDich){
                    soquandich++;
                    
                }
                else{
                    break;
                }
            
        }
        if(soquanta==2)
            return 0;
        tong=tong+mangDiemPhongThu[soquandich];
        //tong=tong-mangDiemTanCong[soquanta];
        return tong;
    }
    long pt_cheo1(int i,int j)
    {
        String quanTa,quanDich;
        if(game.turn%2==1){
            quanTa="O";
            quanDich="X";
        }
        else{
            quanTa="X";
            quanDich="O";
        }
        long tong=0;
        int soquanta=0;
        int soquandich=0;
        for(int dem=1;dem<6;dem++)
        {
            if(game.btn[i+dem][j+dem].getText()==quanTa)
            {
                soquanta++; break;
            }
            else
                if(game.btn[i+dem][j+dem].getText()==quanDich){
                    soquandich++;
                   
                }
                else{
                    break;
                }
            
        }
        for(int dem=1;dem<6;dem++)
        {
            if(game.btn[i-dem][j-dem].getText()==quanTa)
            {
                soquanta++;break;
            }
            else
                if(game.btn[i-dem][j-dem].getText()==quanDich){
                    soquandich++;
                    
                }
                else{
                    break;
                }
            
        }
        if(soquanta==2)
            return 0;
        tong=tong+mangDiemPhongThu[soquandich];
        //tong=tong-mangDiemTanCong[soquanta];
        return tong;
    }
    long pt_cheo2(int i,int j)
    {
        String quanTa,quanDich;
        if(game.turn%2==1){
            quanTa="O";
            quanDich="X";
        }
        else{
            quanTa="X";
            quanDich="O";
        }
        long tong=0;
        int soquanta=0;
        int soquandich=0;
        for(int dem=1;dem<6;dem++)
        {
            if(game.btn[i-dem][j+dem].getText()==quanTa)
            {
                soquanta++;break;
            }
            else
                if(game.btn[i-dem][j+dem].getText()==quanDich){
                    soquandich++;
                    
                }
                else{
                    break;
                }
            
        }
        for(int dem=1;dem<6;dem++)
        {
            if(game.btn[i+dem][j-dem].getText()==quanTa)
            {
                soquanta++;break;
            }
            else
                if(game.btn[i+dem][j-dem].getText()==quanDich){
                    soquandich++;
                    
                }
                else{
                    break;
                }
            }
        
        if(soquanta==2)
            return 0;
        tong=tong+mangDiemPhongThu[soquandich];
        //tong=tong-mangDiemTanCong[soquanta];
        return tong;
    }
    public long minimax(int i,int j)
    {
        long diemtancong=tc_doc(i,j)+tc_ngang(i,j)+tc_cheo1(i,j)+tc_cheo2(i,j);
        long diemphongthu=pt_doc(i,j)+pt_ngang(i,j)+pt_cheo1(i,j)+pt_cheo2(i,j);       
        return diemtancong>diemphongthu?diemtancong:diemphongthu;
    }
     public void findnextmove()
    {
       long DiemMax=0;
       for(int i=1;i<=game.row;i++){       
            for(int j=1;j<=game.col;j++){
                if(game.tick[i][j]){
                    long diem=minimax(i, j);                                        
                    if(DiemMax<diem){                    
                        DiemMax=diem;
                        nextMoveX=i;nextMoveY=j;      
                    }
                }   
            }
        }        
    }
    public void khoidongAI()
    {
        
        
            findnextmove();
            game.addPoint(nextMoveX,nextMoveY);
            
            
        
    }
}
