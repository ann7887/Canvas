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
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLUE);
        Rect sky = new Rect(0,0, 1200, 1000);
        canvas.drawRect(sky, paint);
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
        paint.setColor(Color.rgb(63, 37, 18));
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

        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.rgb(255, 215, 0));
        paint.setStrokeWidth(5);
        Path path4 = new Path();
        int y4 = 670;
        int x4 = 260;
        int y5 = 820;
        int x5 = 370;
        path4.moveTo(x4,y4);
        while (x4 != 130 && y4 != 790){
            path4.lineTo(x5, y5);
            canvas.drawPath(path4,paint);
            y4 += 10;
            x4 -= 10;
            y5 += 10;
            x5 -= 10;
            path4.moveTo(x4,y4);
        }

        Path path6 = new Path();
        int y7 = 1200;
        int x6 = 200;
        int y6 = 1000;
        path6.moveTo(x6,y6);
        while (x6 != 300){
            path6.lineTo(x6, y7);
            canvas.drawPath(path6,paint);
            x6 += 10;
            path6.moveTo(x6,y6);
        }

        paint.setStrokeWidth(10);
        int y1 = 800;
        int x1 = 250;
        paint.setColor(Color.BLACK);
        canvas.drawCircle(x1, y1, 80,paint);

        paint.setColor(Color.rgb(63, 37, 18));
        paint.setStrokeWidth(100);
        canvas.drawArc(250,900, 2000, 1500, 90, 90,false, paint);
        paint.setStrokeWidth(10);
        paint.setColor(Color.BLACK);
        canvas.drawArc(200,1000, 300, 1400, 180, 180,false, paint);

        paint.setStrokeWidth(50);
        paint.setColor(Color.LTGRAY);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(250, 800, 110,paint);

        canvas.drawArc(170,970, 330, 1430, 180, 180,false, paint);
    }
}