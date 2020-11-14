package com.codewithsouma;

public class TextBox extends UIControl{
    public String text = "";

    public void setText(String text){
        this.text = text;
    }
    public void clear(){
        text = "";
    }

}
