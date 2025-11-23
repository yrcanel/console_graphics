import java.util.Random;

public class Animation {
    Graphics graphics;
    char[] texture;
    Random random;

    public Animation(Graphics graphics, char[] texture) {
        this.graphics = graphics;
        this.texture = texture;
        random = new Random();
    }

    public void doMGETRAIN() {
        Shape[] smokes = new Shape[5];
        Shape[] shapes = new Shape[21];
        shapes[0] = new Line(new Vector2(-2.5f, 1.2f), new char[]{'-'}, new Vector2(5f, 1.2f));
        shapes[1] = new Line(new Vector2(-0.9f, 0.7f), new char[]{'='}, new Vector2(-0.6f, 0.7f));
        shapes[2] = new SolidRect(new Vector2(-2.5f, 1.25f), new char[]{'/'}, new Vector2(5.0f, 0.5f));
        shapes[3] = new Circle(new Vector2(-2.0f, 1.0f), new char[]{'.', ':', 'a', '@'}, 0.02f);
        shapes[4] = new Circle(new Vector2(-2.4f, 1.0f), new char[]{'.', ':', 'a', '@'}, 0.02f);
        shapes[5] = new Circle(new Vector2(-1.4f, 1.0f), new char[]{'.', ':', 'a', '@'}, 0.02f);
        shapes[6] = new Circle(new Vector2(-1.0f, 1.0f), new char[]{'.', ':', 'a', '@'}, 0.02f);
        shapes[7] = new Circle(new Vector2(-0.4f, 1.0f), new char[]{'.', ':', 'a', '@'}, 0.02f);
        shapes[8] = new Circle(new Vector2(0.0f, 1.0f), new char[]{'.', ':', 'a', '@'}, 0.02f);
        shapes[9] = new Circle(new Vector2(0.4f, 1.0f), new char[]{'.', ':', 'a', '@'}, 0.02f);
        shapes[10] = new Circle(new Vector2(0.8f, 1.0f), new char[]{'.', ':', 'a', '@'}, 0.02f);
        shapes[11] = new SolidRect(new Vector2(-2.5f, 0.4f), new char[]{'#'}, new Vector2(1.6f, 0.4f));
        shapes[12] = new SolidRect(new Vector2(-2.5f, 0.2f), new char[]{'|'}, new Vector2(1.6f, 0.2f));
        shapes[13] = new SolidRect(new Vector2(-0.6f, 0.7f), new char[]{':'}, new Vector2(1.5f, 0.1f));
        shapes[14] = new SolidRect(new Vector2(-0.6f, 0.5f), new char[]{'o'}, new Vector2(1.5f, 0.2f));
        shapes[15] = new Line(new Vector2(0.9f, 0.8f), new char[]{'\\'}, new Vector2(1.5f, 1.1f));
        shapes[16] = new SolidRect(new Vector2(-0.6f, 0.1f), new char[]{'|'}, new Vector2(0.7f, 0.1f));
        shapes[17] = new SolidRect(new Vector2(-0.6f, 0.2f), new char[]{'o'}, new Vector2(0.06f, 0.5f));
        shapes[18] = new SolidRect(new Vector2(-0.1f, 0.2f), new char[]{'o'}, new Vector2(0.09f, 0.5f));
        shapes[19] = new SolidRect(new Vector2(0.5f, 0.4f), new char[]{'o'}, new Vector2(0.2f, 0.2f));
        shapes[20] = new SolidRect(new Vector2(-0.53f, 0.2f), new char[]{'.'}, new Vector2(0.43f, 0.33f));
        smokes[0] = new Circle(new Vector2(0.6f, 0.2f), texture, 0.03f);
        smokes[1] = new Circle(new Vector2(0.2f, -0.2f), texture, 0.03f);
        smokes[2] = new Circle(new Vector2(-0.2f, -0.5f), texture, 0.03f);
        smokes[3] = new Circle(new Vector2(-0.8f, -1.0f), texture, 0.03f);
        smokes[4] = new Circle(new Vector2(-1.5f, -1.5f), texture, 0.03f);
        while (true) {
            graphics.Begin();
            for (Shape shape : shapes) {
                graphics.Draw(shape);

            }
            for (Shape smoke : smokes) {
                graphics.Draw(smoke);
                smoke.Move(new Vector2(-0.0002f - (float) random.nextDouble(-0.0002, 0.0002), -0.0002f - (float) random.nextDouble(-0.0002, 0.0002)));

                if (smoke.getPosition().getY() < -2.0) {
                    smoke.setPosition(new Vector2(0.6f, 0.2f));
                }
            }
            graphics.Finish();
        }
    }

    public void doXmasTree() {
        Shape[] snowFlakes = new Circle[30];
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
            snowFlakes[i]= new Circle(new Vector2(-1.5f + (float)random.nextDouble(0, 731)/100, -1f-(float)random.nextDouble(0,200)/100), new char[] {' ','*', '*', '*','*'},0.002f);
        }


        while (true){
            graphics.Begin();
            for (Shape shape : shapes) {
                graphics.Draw(shape);
            }
            for (Shape snowFlake : snowFlakes) {
                graphics.Draw(snowFlake);
                snowFlake.Move(new Vector2(-0.0005f, 0.001f));
                if (snowFlake.getPosition().getY() > 0.5) {
                    snowFlake.setPosition(new Vector2(-1.5f + (float) random.nextDouble(0, 731) / 100, -1f - (float) random.nextDouble(0, 200) / 100));
                }
            }
            graphics.Finish();
        }
    }
}
