package com.codewithsouma;

public class TextBox extends UIControl{
    public String text = "";

    public TextBox() {
        super(true);
    }

    @Override
    public String toString() {
        return text;
    }

    public void setText(String text){
        this.text = text;
    }
    public void clear(){
        text = "";
    }

}
