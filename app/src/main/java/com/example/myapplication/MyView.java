package com.example.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    @Override    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        //paint.setColor(Color.RED); // цвет маркера
        paint.setStrokeWidth(10);
        int y = 50;
        int x = 50;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.YELLOW);
        Path path3= new Path();
        path3.moveTo(0, 0);
        int y3 = 30;
        int x3 = 500;
        while (x3 != 0 && y3 != 530){
            path3.lineTo(x3,y3);
            canvas.drawPath(path3,paint);
            path3.moveTo(0, 0);
            y3 += 50;
            x3 -= 50;

        }
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(x, y, 100,paint);
        paint.setColor(Color.GREEN);
        RectF rectF = new RectF(700,500, 900, 900);
        canvas.drawOval(rectF, paint);
        Rect rect = new Rect(0,1000, 1200, 10000);
        canvas.drawRect(rect, paint);
        paint.setColor(Color.rgb(150, 75, 0));
        Rect rect1 = new Rect(780,900, 820, 1000);
        canvas.drawRect(rect1, paint);
        paint.setColor(Color.LTGRAY);
        Rect house = new Rect(100,800, 400, 1200);
        canvas.drawRect(house, paint);
        Path path = new Path();
        path.moveTo(400,800);
        path.lineTo(100,800);
        path.lineTo(250,400);
        canvas.drawPath(path, paint);


        int y1 = 800;
        int x1 = 250;
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(x1, y1, 100,paint);

        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(100);
        canvas.drawArc(250,900, 2000, 1500, 90, 90,false, paint);
        paint.setStrokeWidth(10);
        canvas.drawArc(200,1000, 300, 1400, 180, 180,false, paint);
       /* paint.setStyle(Paint.Style.FILL);

        Path path1 = new Path();

        path.moveTo(400,800);
        path.lineTo(100,800);
        path.lineTo(250,400);
        int y1 = 800;
        int x1 = 200;
        while (x1 != 799 && y1 != 199){
            path.moveTo(x1,y1);
            path.lineTo(x1,y1);
            //path.lineTo(x1,y1);
            // canvas.drawPath(path1, paint);
        }

*/




        /*
        // canvas.drawRect(rect, paint);
        //paint.setColor(Color.rgb(255,1,22));
        //paint.setColor(Color.parseColor("#00ff00"));
        paint.setStyle(Paint.Style.STROKE); // заливка
        paint.setAntiAlias(true); // сглаживание
        paint.setTextSize(100); // размер текста
        paint.setStrokeWidth(10); // толщина маркера
        int y = getHeight()/2;        int x = getWidth()/2;
        //canvas.drawColor(Color.BLUE); // цвет фона        canvas.drawCircle(x, y, 200,paint);
        paint.setColor(Color.YELLOW);        canvas.drawLine(100,100,200,200, paint);
        // Rect rect = new Rect(100,100, 1000, 200);        // canvas.drawRect(rect, paint);
        RectF rectF = new RectF(100,100, 1000, 200);        canvas.drawOval(rectF, paint);
        canvas.drawText("Happy New Year",100,300,paint);        // текст под углом
        float rotate_center_x = 200; //центр поворота холста по оси X
        float rotate_center_y = 200; // центр поворота холста по оси Y
        float rotate_angle = 45; //угол поворота// поворачиваем холст
        canvas.rotate(-rotate_angle, rotate_center_x, rotate_center_y);
        canvas.drawText("Samsung",100,700,paint);        canvas.rotate(rotate_angle, rotate_center_x,
        rotate_center_y);        Path path = new Path();        path.moveTo(100,100);
        path.lineTo(500,500);        path.lineTo(100,400);        paint.setColor(Color.WHITE);
        canvas.drawPath(path, paint);*/
    }
}