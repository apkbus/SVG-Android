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
public class ic_adb extends SVGRenderer {

    public ic_adb(Context context) {
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
        
        mPath.moveTo(5.0f, 16.0f);
        mPath.rCubicTo(0.0f, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f);
        mPath.rCubicTo(3.87f, 0.0f, 7.0f, -3.13f, 7.0f, -7.0f);
        mPath.rLineTo(0f, -4.0f);
        mPath.lineTo(5.0f, 12.0f);
        mPath.rLineTo(0f, 4.0f);
        mPath.close();
        mPath.moveTo(5.0f, 16.0f);
        mPath.moveTo(16.12f, 4.37f);
        mPath.rLineTo(2.1f, -2.1f);
        mPath.rLineTo(-0.82f, -0.83f);
        mPath.rLineTo(-2.3f, 2.31f);
        mPath.cubicTo(14.16f, 3.28f, 13.12f, 3.0f, 12.0f, 3.0f);
        mPath.rCubicTo(-1.1199999f, 0.0f, -2.16f, 0.28f, -3.09f, 0.75f);
        mPath.lineTo(6.6f, 1.44f);
        mPath.rLineTo(-0.82f, 0.83f);
        mPath.rLineTo(2.1f, 2.1f);
        mPath.cubicTo(6.14f, 5.64f, 5.0f, 7.68f, 5.0f, 10.0f);
        mPath.rLineTo(0f, 1.0f);
        mPath.rLineTo(14.0f, 0f);
        mPath.rLineTo(0f, -1.0f);
        mPath.rCubicTo(0.0f, -2.32f, -1.14f, -4.36f, -2.88f, -5.63f);
        mPath.close();
        mPath.moveTo(16.12f, 4.37f);
        mPath.moveTo(9.0f, 9.0f);
        mPath.rCubicTo(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        mPath.rCubicTo(0.0f, -0.5500002f, 0.45f, -1.0f, 1.0f, -1.0f);
        mPath.rCubicTo(0.5500002f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        mPath.rCubicTo(0.0f, 0.5500002f, -0.45f, 1.0f, -1.0f, 1.0f);
        mPath.close();
        mPath.moveTo(9.0f, 9.0f);
        mPath.rMoveTo(6.0f, 0.0f);
        mPath.rCubicTo(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        mPath.rCubicTo(0.0f, -0.5500002f, 0.45f, -1.0f, 1.0f, -1.0f);
        mPath.rCubicTo(0.5500002f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        mPath.rCubicTo(0.0f, 0.5500002f, -0.45f, 1.0f, -1.0f, 1.0f);
        mPath.close();
        mPath.moveTo(15.0f, 9.0f);
        
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