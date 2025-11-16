import java.util.Random;
public class Main{
     static void main(String[] args){
        Random random = new Random();
        char[] texture = new char[] {' ','*', '*', '*','*'};
        Graphics graphics = new Graphics(130, 50, 2f);
        Shape[] snowFlakes = new Circle[30];
//      Shape[] shapes = new Shape[1];
//      shapes[0]= new SolidRect(new Vector2(-3,1), new char[] {'/'}, new Vector2(6,2f));


//       XmasTree Animation
         Shape[] shapes = new Shape[16];
         shapes[0] = new SolidRect(new Vector2(-2.5f, 0.5f), new char[] { '/' }, new Vector2(5, 0.5f));
         shapes[1] = new SolidRect(new Vector2(-0.2f, 0.4f), new char[] { 'o' }, new Vector2(0.4f, 0.5f));
         shapes[2] = new Line(new Vector2(-0.7f, 0.4f), new char[] { '/' },new Vector2(-0.2f, -0.2f));
         shapes[3] = new Line(new Vector2(0.2f, -0.2f),new char[] { '\\' }, new Vector2(0.7f, 0.4f) );
         shapes[4] = new Line(new Vector2(-0.7f, 0.4f), new char[] { '=' }, new Vector2(0.7f, 0.4f));
         shapes[5] = new Line(new Vector2(-0.45f, -0.25f), new char[] { '/' }, new Vector2(-0.1f, -0.7f));
         shapes[6] = new Line(new Vector2(0.1f, -0.7f), new char[] { '\\' }, new Vector2(0.45f, -0.25f));
         shapes[7] = new Line(new Vector2(-0.45f, -0.25f), new char[] { '=' }, new Vector2(0.45f, -0.25f));
         shapes[8] = new Line(new Vector2(-0.3f, -0.7f), new char[] { '/' }, new Vector2(0, -1.1f));
         shapes[9] = new Line(new Vector2(0, -1.1f), new char[] { '\\' }, new Vector2(0.3f, -0.7f));
         shapes[10] = new Line(new Vector2(-0.3f, -0.7f), new char[] { '=' }, new Vector2(0.3f, -0.7f));
         shapes[11] = new Circle(new Vector2(-0.3f, 0), new char[] { '.', ':', 'a', '@' }, 0.02f);
         shapes[12] = new Circle(new Vector2(0.4f, 0.2f), new char[] { '.', ':', 'a', '@' }, 0.02f);
         shapes[13] = new Circle(new Vector2(0.1f, -0.2f), new char[] { '.', ':', 'a', '@' }, 0.02f);
         shapes[14] = new Circle(new Vector2(-0.1f, -0.5f), new char[] { '.', ':', 'a', '@' }, 0.02f);
         shapes[15] = new Circle(new Vector2(0f, -1.1f), new char[] { '.', ':', 'a', '@' }, 0.05f);
        for (int i = 0; i<snowFlakes.length; i++){
            snowFlakes[i]= new Circle(new Vector2(-1.5f + (float)random.nextDouble(0, 731)/100, -1f-(float)random.nextDouble(0,200)/100), texture,0.002f);
        }
        while (true){
            graphics.Begin();
            for (Shape shape : shapes) {
                graphics.Draw(shape);
            }
            for (Shape snowFlake : snowFlakes) {
                graphics.Draw(snowFlake);
                snowFlake.Move(new Vector2(-0.0005f, 0.001f));
                //change 1 to 0.5 for Xmas tree animation
                if (snowFlake.getPosition().getY() > 0.5) {
                    snowFlake.setPosition(new Vector2(-1.5f + (float) random.nextDouble(0, 731) / 100, -1f - (float) random.nextDouble(0, 200) / 100));
                }
            }
            graphics.Finish();
        }





    }
}