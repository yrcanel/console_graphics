public class SolidRect extends Shape {
    protected Vector2 size;
    public SolidRect(Vector2 position, char[] texture, Vector2 size){
        super(position, texture);
        this.size = size;
    }

    @Override
    public char[] Draw(Graphics graphics) {
        char[] buff = new char[graphics.getBuffer().length];
        for (int i =0; i< graphics.getWidth(); i++){
            for (int j=0; j< graphics.getHeight(); j++){
                float x = (float)i/ graphics.getWidth()*2.0f* graphics.getMultiplier()- graphics.getMultiplier();
                float y = (float)j/ graphics.getHeight()*2.0f* graphics.getMultiplier()- graphics.getMultiplier();
                x*= graphics.getPixelAspect()* graphics.getAspect();
                if (x> position.getX()&&x< position.getX()+size.getX()&&y> position.getY()&&y< position.getY()+ size.getY()){
                    buff[i+j* graphics.getWidth()] = texture[0];
                }
            }
        }
        return buff;
    }

}
