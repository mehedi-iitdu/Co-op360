package com.datasoft.co_op360.utils;

import android.content.Context;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

/**
 * Created by mehedi on 1/25/17.
 */

public class Shape {

    public static Drawable drawCircle(Context context, int width, int height, final int color_center, final int color_shade) {

        ShapeDrawable oval = new ShapeDrawable(new OvalShape());

        oval.setIntrinsicHeight (height);
        oval.setIntrinsicWidth (width);
        oval.getPaint().setColor(color_center);
        oval.setShaderFactory(new ShapeDrawable.ShaderFactory() {
            @Override
            public Shader resize(int width, int height) {
                return new RadialGradient(width/2, height/2, width-10, color_center, color_shade, Shader.TileMode.MIRROR);
            }
        });

        return oval;
    }
}
