package com.example.maths;

public class ArithMetic {

    public float add(float ...a){
        float result = 0;
        for (float input : a){
            result += input;
        }
        return result;
    }

    float sub(float ...a){
        float result = 0;
        for (float input : a){
            result -= input;
        }
        return result;
    }

    public float div(float ...a){
        float result = 0;
        for (float input : a){
            result -= input;
        }
        return result;
    }
}