public class Line extends Shape{
    protected Vector2 endCord;
    float k;
    float b;
    boolean isVertical;
    public Line(Vector2 position, char[] texture, Vector2 endCord){
        super(position, texture);
        this.endCord = endCord;
        if (endCord.getX() == position.getX()){
            isVertical = true;
        }
        else {
            k = (endCord.getY() - position.getY()) / (endCord.getX() - position.getX());
            b = endCord.getY() - endCord.getX() * k;
        }


    }

    @Override
    public char[] Draw(Graphics graphics){
        char[] buff = graphics.getBuffer();

        for (int i = 0; i< graphics.getWidth(); i++){
            for (int j = 0; j< graphics.getHeight(); j++){
                if (!isVertical) {
                    float x = (float) i / graphics.getWidth() * 2.0f * graphics.getMultiplier() - graphics.getMultiplier();
                    float y = (float) j / graphics.getHeight() * 2.0f * graphics.getMultiplier() - graphics.getMultiplier();
                    x *= graphics.getAspect() * graphics.getPixelAspect();
                    float val = k * x + b;
                    if (y > val - 0.05f && y < val + 0.05f && x > position.getX() && x < endCord.getX()) {
                        buff[i + j * graphics.getWidth()] = texture[0];
                    }
                }
                else {
                    float x = (float) i / graphics.getWidth() * 2.0f * graphics.getMultiplier() - graphics.getMultiplier();
                    float y = (float) j / graphics.getHeight() * 2.0f * graphics.getMultiplier() - graphics.getMultiplier();
                    x *= graphics.getAspect() * graphics.getPixelAspect();
                    float minY = Math.min(position.getY(), endCord.getY());
                    float maxY = Math.max(position.getY(), endCord.getY());

                    if (y >= minY && y <= maxY&& Math.abs(x- position.getX())<0.02f) {
                        buff[i + j * graphics.getWidth()] = texture[0];
                    }
                }
            }
        }
        return buff;
    }
}