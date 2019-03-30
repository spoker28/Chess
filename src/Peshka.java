import static java.lang.Math.abs;

public class Peshka extends Figure {
    protected Peshka(char x1, int y1,char picture,boolean color) {
        super(x1, y1, picture, color);
    }
    boolean check=false;
    @Override
    protected boolean possibility(char x1, int y1,char x2,int y2, boolean color) {
        if ((y2-y1==1 && color == false) || (y2-y1==2 && check==false && color==false) || (y2-y1==-1 && color == true) || (y2-y1==-2 && check==false && color==true )  && x2<'i' && x1<'i' && y1<9 && y2<9  && x1>='a' && x2>='a' && y1>0 && y2>0 ){
            this.check=true;
            return true;
        }
        else
            return false;
    }
}
