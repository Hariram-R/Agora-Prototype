package com.hari.app.agora_prototype;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

public class TypefacedTextView extends android.support.v7.widget.AppCompatTextView {
    public TypefacedTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        if (isInEditMode()) {
            return;
        }

        TypedArray styledAttrs = context.obtainStyledAttributes(attrs, R.styleable.TypefacedTextView);
        String fontName = styledAttrs.getString(R.styleable.TypefacedTextView_typeface);
        styledAttrs.recycle();

        if (fontName != null) {
            Typeface typeface = Typeface.createFromAsset(context.getAssets(), fontName);
            setTypeface(typeface);
        }
    }
}
