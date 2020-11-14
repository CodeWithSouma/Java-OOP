package com.codewithsouma;

public class TextBox extends UIControl{
    public String text = "";

//    public TextBox() {
//        super(true);
//    }

    @Override
    public String toString() {
        return text;
    }

    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    public void setText(String text){
        this.text = text;
    }
    public void clear(){
        text = "";
    }

}
