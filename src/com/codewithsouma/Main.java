package com.codewithsouma;

public class Main {

    public static void main(String[] args) {
       var control = new UIControl(true);
        var textBox = new TextBox();
        show(textBox);// textBox is a control because it is a child of UIControl
        show(control);//not an textBox

    }
    public static void show(UIControl control){// upcasting
        if (control instanceof TextBox){
            var textBox = (TextBox)control;//down casting
            textBox.text = "Hello World!!!";
        }
        System.out.println(control);
    }

}
