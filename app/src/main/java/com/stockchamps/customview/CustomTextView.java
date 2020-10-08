package com.stockchamps.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import com.stockchamps.R;

/**
 * Created with IntelliJ IDEA.
 * User: prateek
 * Date: 12/6/16
 * Time: 12:02 PM
 * To change this template use File | File Templates.
 */
public class CustomTextView extends TextView {

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context,  attrs);

        //Typeface.createFromAsset doesn't work in the layout editor. Skipping...
        if (isInEditMode()) {
            return;
        }

        TypedArray styledAttrs = context.obtainStyledAttributes(attrs,  R.styleable.CustomTextView);
        String fontName = styledAttrs.getString(R.styleable.CustomTextView_typeface);
        styledAttrs.recycle();

        if (fontName != null) {
            Typeface typeface = Typeface.createFromAsset(context.getAssets(),  fontName);
            setTypeface(typeface);
        }
        this.setPaintFlags(this.getPaintFlags() | Paint.SUBPIXEL_TEXT_FLAG);
    }
}
