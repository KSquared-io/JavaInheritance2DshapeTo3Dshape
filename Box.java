/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author Class
 */
public class Box extends Rectangle{
    private int height;
    
    public Box()
    {
            super();
            this.setHeight(0);
    }

    public Box(int width, int length, int height)
    {
		super(width, length);
                setHeight(height);
    }

    public void setHeight(int height)
    {
        this.height=height;
    }
    
    public int getHeight()
    {
        return height;
    }
        
    public int getVolume()
    {
        return (this.getArea()*height);
    }
    
    public void showData()
    {
		System.out.println("width: " + this.getWidth()+"\n");
		System.out.println("length: " + this.getLength()+"\n");
                System.out.println("height: " + this.getHeight()+"\n");
                System.out.println("volume: " + this.getVolume()+"\n");
    }
}
