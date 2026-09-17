package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
public class AndroidMouseHandler {
    private int deltaX;
    private int deltaY;

    public AndroidMouseHandler() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.deltaX = r0
            r1.deltaY = r0
            return
    }

    private void logAction(int r4) {
            r3 = this;
            r0 = 9
            if (r4 != r0) goto L7
            java.lang.String r4 = "HOVER_ENTER"
            goto L31
        L7:
            r0 = 7
            if (r4 != r0) goto Ld
            java.lang.String r4 = "HOVER_MOVE"
            goto L31
        Ld:
            r0 = 10
            if (r4 != r0) goto L14
            java.lang.String r4 = "HOVER_EXIT"
            goto L31
        L14:
            r0 = 8
            if (r4 != r0) goto L1b
            java.lang.String r4 = "SCROLL"
            goto L31
        L1b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "UNKNOWN ("
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = ")"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        L31:
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "action "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "AndroidMouseHandler"
            r0.log(r1, r4)
            return
    }

    private void postTouchEvent(com.badlogic.gdx.backends.android.DefaultAndroidInput r2, int r3, int r4, int r5, int r6, int r7, long r8) {
            r1 = this;
            com.badlogic.gdx.utils.Pool<com.badlogic.gdx.backends.android.DefaultAndroidInput$TouchEvent> r0 = r2.usedTouchEvents
            java.lang.Object r0 = r0.obtain()
            com.badlogic.gdx.backends.android.DefaultAndroidInput$TouchEvent r0 = (com.badlogic.gdx.backends.android.DefaultAndroidInput.TouchEvent) r0
            r0.timeStamp = r8
            r0.x = r4
            r0.y = r5
            r0.type = r3
            r0.scrollAmountX = r6
            r0.scrollAmountY = r7
            java.util.ArrayList<com.badlogic.gdx.backends.android.DefaultAndroidInput$TouchEvent> r2 = r2.touchEvents
            r2.add(r0)
            return
    }

    public boolean onGenericMotion(android.view.MotionEvent r11, com.badlogic.gdx.backends.android.DefaultAndroidInput r12) {
            r10 = this;
            int r0 = r11.getSource()
            r0 = r0 & 2
            if (r0 != 0) goto La
            r11 = 0
            return r11
        La:
            int r0 = r11.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r8 = java.lang.System.nanoTime()
            monitor-enter(r12)
            r1 = 7
            if (r0 == r1) goto L3e
            r1 = 8
            if (r0 == r1) goto L1d
            goto L5e
        L1d:
            r0 = 9
            float r0 = r11.getAxisValue(r0)     // Catch: java.lang.Throwable -> L6a
            float r0 = java.lang.Math.signum(r0)     // Catch: java.lang.Throwable -> L6a
            float r0 = -r0
            int r7 = (int) r0     // Catch: java.lang.Throwable -> L6a
            r0 = 10
            float r11 = r11.getAxisValue(r0)     // Catch: java.lang.Throwable -> L6a
            float r11 = java.lang.Math.signum(r11)     // Catch: java.lang.Throwable -> L6a
            float r11 = -r11
            int r6 = (int) r11     // Catch: java.lang.Throwable -> L6a
            r3 = 3
            r4 = 0
            r5 = 0
            r1 = r10
            r2 = r12
            r1.postTouchEvent(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L6a
            goto L5e
        L3e:
            float r0 = r11.getX()     // Catch: java.lang.Throwable -> L6a
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L6a
            float r11 = r11.getY()     // Catch: java.lang.Throwable -> L6a
            int r11 = (int) r11     // Catch: java.lang.Throwable -> L6a
            int r1 = r10.deltaX     // Catch: java.lang.Throwable -> L6a
            if (r0 != r1) goto L50
            int r1 = r10.deltaY     // Catch: java.lang.Throwable -> L6a
            if (r11 == r1) goto L5e
        L50:
            r3 = 4
            r6 = 0
            r7 = 0
            r1 = r10
            r2 = r12
            r4 = r0
            r5 = r11
            r1.postTouchEvent(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L6a
            r10.deltaX = r0     // Catch: java.lang.Throwable -> L6a
            r10.deltaY = r11     // Catch: java.lang.Throwable -> L6a
        L5e:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L6a
            com.badlogic.gdx.Application r11 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Graphics r11 = r11.getGraphics()
            r11.requestRendering()
            r11 = 1
            return r11
        L6a:
            r11 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L6a
            throw r11
    }
}
