public class Ferz extends Figure {

    public Ferz(char x1, int y1, char picture, boolean color) {
        super(x1, y1,picture, color);
    }

    @Override
    protected boolean possibility(char x1, int y1,char x2,int y2, boolean color) {
//        if( () && x2<'i' && x1<'i' && y1<9 && y2<9  && x1>='a' && x2>='a' && y1>0 && y2>0){
//
//        }
        return false;
    }
}
