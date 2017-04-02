package javaapplication1;

public class Rectangle
{
	private int length, width;

	public Rectangle()
	{
            this.setWidth(0);
            this.setLength(0);
	}

	public Rectangle(int width, int length)
	{
		setWidth(width);
		setLength(length);	
	}
        
        

	public int getLength()
	{
		return length;
	}
        
        public int getArea()
        {
            return length*width;
        }

	public int getWidth()
	{
		return width;
	}

	public final void setLength(int input)
	{
		length=input;
	}

	public final void setWidth(int input)
	{
		width=input;
	}

	public void showData()
	{
		System.out.println("width: " + this.getWidth()+"\n");
		System.out.println("length: " + this.getLength()+"\n");
                System.out.println("area: " + this.getArea()+"\n");
	}

	
}