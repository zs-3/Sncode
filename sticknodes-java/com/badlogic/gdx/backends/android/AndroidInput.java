package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
public interface AndroidInput extends com.badlogic.gdx.Input, android.view.View.OnTouchListener, android.view.View.OnKeyListener, android.view.View.OnGenericMotionListener {
    void addGenericMotionListener(android.view.View.OnGenericMotionListener r1);

    void addKeyListener(android.view.View.OnKeyListener r1);

    /* synthetic */ float getAccelerometerX();

    /* synthetic */ float getAccelerometerY();

    /* synthetic */ float getAccelerometerZ();

    /* synthetic */ float getAzimuth();

    @Override // com.badlogic.gdx.Input
    /* synthetic */ long getCurrentEventTime();

    /* synthetic */ int getDeltaX();

    /* synthetic */ int getDeltaX(int r1);

    /* synthetic */ int getDeltaY();

    /* synthetic */ int getDeltaY(int r1);

    /* synthetic */ float getGyroscopeX();

    /* synthetic */ float getGyroscopeY();

    /* synthetic */ float getGyroscopeZ();

    /* synthetic */ com.badlogic.gdx.InputProcessor getInputProcessor();

    /* synthetic */ int getMaxPointers();

    /* synthetic */ com.badlogic.gdx.Input.Orientation getNativeOrientation();

    /* synthetic */ float getPitch();

    /* synthetic */ float getPressure();

    /* synthetic */ float getPressure(int r1);

    /* synthetic */ float getRoll();

    /* synthetic */ int getRotation();

    /* synthetic */ void getRotationMatrix(float[] r1);

    /* synthetic */ void getTextInput(com.badlogic.gdx.Input.TextInputListener r1, java.lang.String r2, java.lang.String r3, java.lang.String r4);

    /* synthetic */ void getTextInput(com.badlogic.gdx.Input.TextInputListener r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, com.badlogic.gdx.Input.OnscreenKeyboardType r5);

    @Override // com.badlogic.gdx.Input
    /* synthetic */ int getX();

    /* synthetic */ int getX(int r1);

    @Override // com.badlogic.gdx.Input
    /* synthetic */ int getY();

    /* synthetic */ int getY(int r1);

    /* synthetic */ boolean isButtonJustPressed(int r1);

    /* synthetic */ boolean isButtonPressed(int r1);

    @java.lang.Deprecated
    /* synthetic */ boolean isCatchBackKey();

    /* synthetic */ boolean isCatchKey(int r1);

    @java.lang.Deprecated
    /* synthetic */ boolean isCatchMenuKey();

    /* synthetic */ boolean isCursorCatched();

    @Override // com.badlogic.gdx.Input
    /* synthetic */ boolean isKeyJustPressed(int r1);

    @Override // com.badlogic.gdx.Input
    /* synthetic */ boolean isKeyPressed(int r1);

    /* synthetic */ boolean isPeripheralAvailable(com.badlogic.gdx.Input.Peripheral r1);

    @Override // com.badlogic.gdx.Input
    /* synthetic */ boolean isTouched();

    @Override // com.badlogic.gdx.Input
    /* synthetic */ boolean isTouched(int r1);

    /* synthetic */ boolean justTouched();

    void onDreamingStarted();

    void onDreamingStopped();

    void onPause();

    void onResume();

    void processEvents();

    @java.lang.Deprecated
    /* synthetic */ void setCatchBackKey(boolean r1);

    @Override // com.badlogic.gdx.Input
    /* synthetic */ void setCatchKey(int r1, boolean r2);

    @java.lang.Deprecated
    /* synthetic */ void setCatchMenuKey(boolean r1);

    /* synthetic */ void setCursorCatched(boolean r1);

    /* synthetic */ void setCursorPosition(int r1, int r2);

    @Override // com.badlogic.gdx.Input
    /* synthetic */ void setInputProcessor(com.badlogic.gdx.InputProcessor r1);

    void setKeyboardAvailable(boolean r1);

    @Override // com.badlogic.gdx.Input
    /* synthetic */ void setOnscreenKeyboardVisible(boolean r1);

    /* synthetic */ void setOnscreenKeyboardVisible(boolean r1, com.badlogic.gdx.Input.OnscreenKeyboardType r2);

    /* synthetic */ void vibrate(int r1);

    /* synthetic */ void vibrate(int r1, int r2, boolean r3);

    @Override // com.badlogic.gdx.Input
    /* synthetic */ void vibrate(int r1, boolean r2);

    /* synthetic */ void vibrate(com.badlogic.gdx.Input.VibrationType r1);
}
