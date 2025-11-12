public class Circle extends Shape{
    protected  float size;
    public Circle(Vector2 position, char[] texture, float size) {
        super(position, texture);
        this.size = size;
    }
    @Override
    public char[] Draw(Graphics graphics){
        char[] buffer=new char[graphics.getBuffer().length];
        for(int i = 0; i< graphics.getWidth(); i++){
            for(int j =0; j< graphics.getHeight(); j++){
                float x = (float)i/ graphics.getWidth()*2.0f* graphics.getMultiplier()- graphics.getMultiplier();
                float y = (float)j/ graphics.getHeight()*2.0f* graphics.getMultiplier()- graphics.getMultiplier();
                x*= graphics.getAspect()*graphics.getPixelAspect();
                float f = (x- position.getX()) * (x- position.getX()) + (y - position.getY()) * (y - position.getY());
                char pixel;
                if(f<size){

                    if(f<size/8){
                        pixel = texture[3];
                    }
                    else if (f<size/3) {
                        pixel=texture[2];
                    }
                    else if (f<size/1.5f) {
                        pixel=texture[1];
                    }
                    else pixel=texture[0];
                    buffer[i+j* graphics.getWidth()] = pixel;
                }
            }
        }
        return  buffer;
    }
}
