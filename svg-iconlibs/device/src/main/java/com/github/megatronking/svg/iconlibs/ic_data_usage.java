package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_data_usage extends SVGRenderer {

    public ic_data_usage(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(13.0f, 2.05f);
        mPath.rLineTo(0f, 3.03f);
        mPath.rCubicTo(3.39f, 0.49f, 6.0f, 3.39f, 6.0f, 6.92f);
        mPath.rCubicTo(0.0f, 0.9f, -0.18f, 1.75f, -0.48f, 2.54f);
        mPath.rLineTo(2.6f, 1.53f);
        mPath.rCubicTo(0.56f, -1.24f, 0.88f, -2.62f, 0.88f, -4.07f);
        mPath.rCubicTo(0.0f, -5.18f, -3.95f, -9.45f, -9.0f, -9.95f);
        mPath.close();
        mPath.moveTo(13.0f, 2.05f);
        mPath.moveTo(12.0f, 19.0f);
        mPath.rCubicTo(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        mPath.rCubicTo(0.0f, -3.53f, 2.61f, -6.43f, 6.0f, -6.92f);
        mPath.lineTo(11.0f, 2.05f);
        mPath.rCubicTo(-5.06f, 0.5f, -9.0f, 4.76f, -9.0f, 9.95f);
        mPath.rCubicTo(0.0f, 5.52f, 4.47f, 10.0f, 9.99f, 10.0f);
        mPath.rCubicTo(3.31f, 0.0f, 6.24f, -1.61f, 8.06f, -4.09f);
        mPath.rLineTo(-2.6f, -1.53f);
        mPath.cubicTo(16.17f, 17.98f, 14.21f, 19.0f, 12.0f, 19.0f);
        mPath.close();
        mPath.moveTo(12.0f, 19.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}