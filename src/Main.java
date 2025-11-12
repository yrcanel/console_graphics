import java.util.Random;
public class Main{
     static void main(String[] args){
        Random random = new Random();
        char[] texture = new char[] {' ','*', '*', '*','*'};
        Graphics graphics = new Graphics(130, 50, 2f);
        Shape[] snowFlakes = new Circle[30];
        Shape[] shapes = new Shape[1];
        shapes[0]= new SolidRect(new Vector2(-3,1), new char[] {'/'}, new Vector2(6,2f));
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
                if (snowFlake.getPosition().getY() > 1) {
                    snowFlake.setPosition(new Vector2(-1.5f + (float) random.nextDouble(0, 731) / 100, -1f - (float) random.nextDouble(0, 200) / 100));
                }
            }
            graphics.Finish();
        }





    }
}