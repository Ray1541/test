package com.jiang.test3_0.view;


import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;

import com.jiang.test3_0.textwarrior.android.FreeScrollingTextField;
import com.jiang.test3_0.textwarrior.android.YoyoNavigationMethod;
import com.jiang.test3_0.textwarrior.common.ColorScheme;
import com.jiang.test3_0.textwarrior.common.Document;
import com.jiang.test3_0.textwarrior.common.DocumentProvider;
import com.jiang.test3_0.textwarrior.common.LanguageCpp;
import com.jiang.test3_0.textwarrior.common.Lexer;

/**
 * Created by Ray
 * on   2018.11.25
 */
public class homeView extends FreeScrollingTextField {

    private Document _inputtingDoc;
    private boolean _isWordWrap;
    private Context mContext;
    private String _lastSelectFile;
    private int _index;

    public homeView(Context context) {
        super(context);
        init();
    }



    public homeView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public homeView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {

        setTextSize(70);
        setShowLineNumbers(true);
        setAutoCompete(false);
        setHighlightCurrentRow(true);
        setWordWrap(false);
        setAutoIndentWidth(2);
        Lexer.setLanguage(LanguageCpp.getInstance());
        setNavigationMethod(new YoyoNavigationMethod(this));


    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        // TODO: Implement this method
        super.onLayout(changed, left, top, right, bottom);
        if (_index != 0 && right > 0) {
            moveCaret(_index);
            _index = 0;
        }
    }

    @Override
    public void setWordWrap(boolean enable) {
        // TODO: Implement this method
        _isWordWrap = enable;
        super.setWordWrap(enable);
    }

    public void setAutoIndentWidth(int autoIndentWidth)
    {
        _autoIndentWidth = autoIndentWidth;
    }


    public DocumentProvider getText() {
        return createDocumentProvider();
    }


    public void setBackgroundColor(int color) {
        getColorScheme().setColor(ColorScheme.Colorable.BACKGROUND, color);
    }

    public void setTextColor(int color) {
        getColorScheme().setColor(ColorScheme.Colorable.FOREGROUND, color);
    }

    public void setTextHighlightColor(int color) {

        getColorScheme().setColor(ColorScheme.Colorable.SELECTION_BACKGROUND, color);
    }

}
