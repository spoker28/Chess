public abstract class Figure {
   protected char x1;
   protected int y1;
   protected char x2;
   protected int y2;
   protected boolean color;
   protected char picture;
   protected Figure(char x1,int y1,char picture, boolean color){
      this.x1=x1;
      this.y1=y1;
      this.picture=picture;
      this.color=color;
   }

   protected abstract boolean possibility(char x1, int y1, char x2, int y2, boolean color);


//   protected char x2;
//   protected int y2;
}