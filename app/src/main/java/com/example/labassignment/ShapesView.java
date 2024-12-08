package com.example.labassignment;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class ShapesView extends View {

    private Paint paint;

    public ShapesView(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        paint.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // Draw Circle
        paint.setColor(0xFF2196F3); // Blue
        canvas.drawCircle(200, 200, 100, paint); // Center (200, 200), Radius 100

        // Draw Rectangle
        paint.setColor(0xFF4CAF50); // Green
        canvas.drawRect(50, 350, 350, 550, paint); // Left-Top (50, 350), Right-Bottom (350, 550)

        // Draw Triangle
        paint.setColor(0xFFFF9800); // Orange
        Path path = new Path();
        path.moveTo(600, 350); // Top point
        path.lineTo(500, 550); // Bottom-left
        path.lineTo(700, 550); // Bottom-right
        path.close(); // Connects back to the top point
        canvas.drawPath(path, paint);
    }
}
