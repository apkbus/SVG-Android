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
public class ic_speaker_notes_off extends SVGRenderer {

    public ic_speaker_notes_off(Context context) {
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
        
        mPath.moveTo(10.54f, 11.0f);
        mPath.rLineTo(-0.54f, -0.54f);
        mPath.lineTo(7.54f, 8.0f);
        mPath.lineTo(6.0f, 6.46f);
        mPath.lineTo(2.38f, 2.84f);
        mPath.lineTo(1.27f, 1.73f);
        mPath.lineTo(0.0f, 3.0f);
        mPath.rLineTo(2.01f, 2.01f);
        mPath.lineTo(2.0f, 22.0f);
        mPath.rLineTo(4.0f, -4.0f);
        mPath.rLineTo(9.0f, 0f);
        mPath.rLineTo(5.73f, 5.73f);
        mPath.lineTo(22.0f, 22.46f);
        mPath.lineTo(17.54f, 18.0f);
        mPath.rLineTo(-7.0f, -7.0f);
        mPath.close();
        mPath.moveTo(10.54f, 11.0f);
        mPath.moveTo(8.0f, 14.0f);
        mPath.lineTo(6.0f, 14.0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.close();
        mPath.moveTo(8.0f, 14.0f);
        mPath.rMoveTo(-2.0f, -3.0f);
        mPath.lineTo(6.0f, 9.0f);
        mPath.rLineTo(2.0f, 2.0f);
        mPath.lineTo(6.0f, 11.0f);
        mPath.close();
        mPath.moveTo(6.0f, 11.0f);
        mPath.rMoveTo(14.0f, -9.0f);
        mPath.lineTo(4.08f, 2.0f);
        mPath.lineTo(10.0f, 7.92f);
        mPath.lineTo(10.0f, 6.0f);
        mPath.rLineTo(8.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rLineTo(-7.92f, 0f);
        mPath.rLineTo(1.0f, 1.0f);
        mPath.lineTo(18.0f, 9.0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rLineTo(-4.92f, 0f);
        mPath.rLineTo(6.99f, 6.99f);
        mPath.cubicTo(21.14f, 17.95f, 22.0f, 17.08f, 22.0f, 16.0f);
        mPath.lineTo(22.0f, 4.0f);
        mPath.rCubicTo(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        mPath.close();
        mPath.moveTo(20.0f, 2.0f);
        
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