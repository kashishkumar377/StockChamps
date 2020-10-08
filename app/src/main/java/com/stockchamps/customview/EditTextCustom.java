package com.stockchamps.customview;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EditText;

import com.stockchamps.R;

@TargetApi(Build.VERSION_CODES.LOLLIPOP)
public class EditTextCustom extends EditText {
    public EditTextCustom(Context context) {
        super(context);
        applyCustomFont(context);
    }

    public EditTextCustom(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyCustomFont(context);
    }

    public EditTextCustom(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyCustomFont(context);
    }


    public EditTextCustom(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        applyCustomFont(context);
    }

    public void applyCustomFont(Context context) {
        Typeface customFont = FontCache.getTypeface(getResources().getString(R.string.pro_text_regular), context);
        setTypeface(customFont);
    }

}