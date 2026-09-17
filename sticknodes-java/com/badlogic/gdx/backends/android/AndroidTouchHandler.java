package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
public class AndroidTouchHandler {
    public AndroidTouchHandler() {
            r0 = this;
            r0.<init>()
            return
    }

    private void logAction(int r4, int r5) {
            r3 = this;
            if (r4 != 0) goto L5
            java.lang.String r4 = "DOWN"
            goto L3f
        L5:
            r0 = 5
            if (r4 != r0) goto Lb
            java.lang.String r4 = "POINTER DOWN"
            goto L3f
        Lb:
            r0 = 1
            if (r4 != r0) goto L11
            java.lang.String r4 = "UP"
            goto L3f
        L11:
            r0 = 6
            if (r4 != r0) goto L17
            java.lang.String r4 = "POINTER UP"
            goto L3f
        L17:
            r0 = 4
            if (r4 != r0) goto L1d
            java.lang.String r4 = "OUTSIDE"
            goto L3f
        L1d:
            r0 = 3
            if (r4 != r0) goto L23
            java.lang.String r4 = "CANCEL"
            goto L3f
        L23:
            r0 = 2
            if (r4 != r0) goto L29
            java.lang.String r4 = "MOVE"
            goto L3f
        L29:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "UNKNOWN ("
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = ")"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        L3f:
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "action "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", Android pointer id: "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            java.lang.String r5 = "AndroidMultiTouchHandler"
            r0.log(r5, r4)
            return
    }

    private void postTouchEvent(com.badlogic.gdx.backends.android.DefaultAndroidInput r2, int r3, int r4, int r5, int r6, int r7, long r8) {
            r1 = this;
            com.badlogic.gdx.utils.Pool<com.badlogic.gdx.backends.android.DefaultAndroidInput$TouchEvent> r0 = r2.usedTouchEvents
            java.lang.Object r0 = r0.obtain()
            com.badlogic.gdx.backends.android.DefaultAndroidInput$TouchEvent r0 = (com.badlogic.gdx.backends.android.DefaultAndroidInput.TouchEvent) r0
            r0.timeStamp = r8
            r0.pointer = r6
            r0.x = r4
            r0.y = r5
            r0.type = r3
            r0.button = r7
            java.util.ArrayList<com.badlogic.gdx.backends.android.DefaultAndroidInput$TouchEvent> r2 = r2.touchEvents
            r2.add(r0)
            return
    }

    private int toGdxButton(int r3) {
            r2 = this;
            if (r3 == 0) goto L1b
            r0 = 1
            if (r3 != r0) goto L6
            goto L1b
        L6:
            r1 = 2
            if (r3 != r1) goto La
            return r0
        La:
            r0 = 4
            if (r3 != r0) goto Le
            return r1
        Le:
            r1 = 8
            if (r3 != r1) goto L14
            r3 = 3
            return r3
        L14:
            r1 = 16
            if (r3 != r1) goto L19
            return r0
        L19:
            r3 = -1
            return r3
        L1b:
            r3 = 0
            return r3
    }

    public void onTouch(android.view.MotionEvent r21, com.badlogic.gdx.backends.android.DefaultAndroidInput r22) {
            r20 = this;
            r0 = r21
            r10 = r22
            int r1 = r21.getAction()
            r9 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r21.getAction()
            r2 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r2
            int r11 = r1 >> 8
            int r1 = r0.getPointerId(r11)
            long r12 = java.lang.System.nanoTime()
            monitor-enter(r22)
            r14 = 20
            r15 = -1
            r7 = 0
            switch(r9) {
                case 0: goto L115;
                case 1: goto L9e;
                case 2: goto L26;
                case 3: goto L9e;
                case 4: goto L9e;
                case 5: goto L115;
                case 6: goto L9e;
                default: goto L24;
            }
        L24:
            goto L17d
        L26:
            int r11 = r21.getPointerCount()     // Catch: java.lang.Throwable -> L188
            r8 = 0
        L2b:
            if (r8 >= r11) goto L17d
            int r1 = r0.getPointerId(r8)     // Catch: java.lang.Throwable -> L188
            float r2 = r0.getX(r8)     // Catch: java.lang.Throwable -> L188
            int r9 = (int) r2     // Catch: java.lang.Throwable -> L188
            float r2 = r0.getY(r8)     // Catch: java.lang.Throwable -> L188
            int r7 = (int) r2     // Catch: java.lang.Throwable -> L188
            int r6 = r10.lookUpPointerIndex(r1)     // Catch: java.lang.Throwable -> L188
            if (r6 != r15) goto L43
            r14 = r8
            goto L99
        L43:
            if (r6 < r14) goto L47
            goto L17d
        L47:
            int[] r1 = r10.button     // Catch: java.lang.Throwable -> L188
            r5 = r1[r6]     // Catch: java.lang.Throwable -> L188
            if (r5 == r15) goto L64
            r3 = 2
            r1 = r20
            r2 = r22
            r4 = r9
            r16 = r5
            r5 = r7
            r17 = r6
            r18 = r7
            r7 = r16
            r14 = r8
            r19 = r9
            r8 = r12
            r1.postTouchEvent(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L188
            goto L79
        L64:
            r17 = r6
            r18 = r7
            r14 = r8
            r19 = r9
            r3 = 4
            r7 = 0
            r1 = r20
            r2 = r22
            r4 = r19
            r5 = r18
            r8 = r12
            r1.postTouchEvent(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L188
        L79:
            int[] r1 = r10.deltaX     // Catch: java.lang.Throwable -> L188
            int[] r2 = r10.touchX     // Catch: java.lang.Throwable -> L188
            r3 = r2[r17]     // Catch: java.lang.Throwable -> L188
            int r9 = r19 - r3
            r1[r17] = r9     // Catch: java.lang.Throwable -> L188
            int[] r1 = r10.deltaY     // Catch: java.lang.Throwable -> L188
            int[] r3 = r10.touchY     // Catch: java.lang.Throwable -> L188
            r4 = r3[r17]     // Catch: java.lang.Throwable -> L188
            int r7 = r18 - r4
            r1[r17] = r7     // Catch: java.lang.Throwable -> L188
            r2[r17] = r19     // Catch: java.lang.Throwable -> L188
            r3[r17] = r18     // Catch: java.lang.Throwable -> L188
            float[] r1 = r10.pressure     // Catch: java.lang.Throwable -> L188
            float r2 = r0.getPressure(r14)     // Catch: java.lang.Throwable -> L188
            r1[r17] = r2     // Catch: java.lang.Throwable -> L188
        L99:
            int r8 = r14 + 1
            r14 = 20
            goto L2b
        L9e:
            int r14 = r10.lookUpPointerIndex(r1)     // Catch: java.lang.Throwable -> L188
            if (r14 != r15) goto La6
            goto L17d
        La6:
            r1 = 20
            if (r14 < r1) goto Lac
            goto L17d
        Lac:
            int[] r1 = r10.realId     // Catch: java.lang.Throwable -> L188
            r1[r14] = r15     // Catch: java.lang.Throwable -> L188
            float r1 = r0.getX(r11)     // Catch: java.lang.Throwable -> L188
            int r8 = (int) r1     // Catch: java.lang.Throwable -> L188
            float r0 = r0.getY(r11)     // Catch: java.lang.Throwable -> L188
            int r11 = (int) r0     // Catch: java.lang.Throwable -> L188
            int[] r0 = r10.button     // Catch: java.lang.Throwable -> L188
            r6 = r0[r14]     // Catch: java.lang.Throwable -> L188
            r5 = 3
            if (r6 == r15) goto Le5
            if (r9 != r5) goto Ld4
            r2 = 5
            r0 = r20
            r1 = r22
            r3 = r8
            r4 = r11
            r15 = 3
            r5 = r14
            r18 = r8
            r15 = 0
            r7 = r12
            r0.postTouchEvent(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L188
            goto Le8
        Ld4:
            r18 = r8
            r15 = 0
            r2 = 1
            r0 = r20
            r1 = r22
            r3 = r18
            r4 = r11
            r5 = r14
            r7 = r12
            r0.postTouchEvent(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L188
            goto Le8
        Le5:
            r18 = r8
            r15 = 0
        Le8:
            int[] r0 = r10.touchX     // Catch: java.lang.Throwable -> L188
            r0[r14] = r18     // Catch: java.lang.Throwable -> L188
            int[] r0 = r10.touchY     // Catch: java.lang.Throwable -> L188
            r0[r14] = r11     // Catch: java.lang.Throwable -> L188
            int[] r0 = r10.deltaX     // Catch: java.lang.Throwable -> L188
            r0[r14] = r15     // Catch: java.lang.Throwable -> L188
            int[] r0 = r10.deltaY     // Catch: java.lang.Throwable -> L188
            r0[r14] = r15     // Catch: java.lang.Throwable -> L188
            boolean[] r0 = r10.touched     // Catch: java.lang.Throwable -> L188
            r0[r14] = r15     // Catch: java.lang.Throwable -> L188
            int[] r0 = r10.button     // Catch: java.lang.Throwable -> L188
            r0[r14] = r15     // Catch: java.lang.Throwable -> L188
            float[] r0 = r10.pressure     // Catch: java.lang.Throwable -> L188
            r1 = 0
            r0[r14] = r1     // Catch: java.lang.Throwable -> L188
            r0 = 3
            if (r9 != r0) goto L17d
            int[] r0 = r10.realId     // Catch: java.lang.Throwable -> L188
            r1 = -1
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> L188
            boolean[] r0 = r10.touched     // Catch: java.lang.Throwable -> L188
            java.util.Arrays.fill(r0, r15)     // Catch: java.lang.Throwable -> L188
            goto L17d
        L115:
            r15 = 0
            int r14 = r22.getFreePointerIndex()     // Catch: java.lang.Throwable -> L188
            r2 = 20
            if (r14 < r2) goto L11f
            goto L17d
        L11f:
            int[] r2 = r10.realId     // Catch: java.lang.Throwable -> L188
            r2[r14] = r1     // Catch: java.lang.Throwable -> L188
            float r1 = r0.getX(r11)     // Catch: java.lang.Throwable -> L188
            int r8 = (int) r1     // Catch: java.lang.Throwable -> L188
            float r1 = r0.getY(r11)     // Catch: java.lang.Throwable -> L188
            int r9 = (int) r1     // Catch: java.lang.Throwable -> L188
            int r1 = r21.getButtonState()     // Catch: java.lang.Throwable -> L188
            r7 = r20
            int r6 = r7.toGdxButton(r1)     // Catch: java.lang.Throwable -> L188
            r1 = -1
            if (r6 == r1) goto L14f
            r3 = 0
            r1 = r20
            r2 = r22
            r4 = r8
            r5 = r9
            r16 = r6
            r6 = r14
            r7 = r16
            r18 = r8
            r19 = r9
            r8 = r12
            r1.postTouchEvent(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L188
            goto L155
        L14f:
            r16 = r6
            r18 = r8
            r19 = r9
        L155:
            int[] r1 = r10.touchX     // Catch: java.lang.Throwable -> L188
            r1[r14] = r18     // Catch: java.lang.Throwable -> L188
            int[] r1 = r10.touchY     // Catch: java.lang.Throwable -> L188
            r1[r14] = r19     // Catch: java.lang.Throwable -> L188
            int[] r1 = r10.deltaX     // Catch: java.lang.Throwable -> L188
            r1[r14] = r15     // Catch: java.lang.Throwable -> L188
            int[] r1 = r10.deltaY     // Catch: java.lang.Throwable -> L188
            r1[r14] = r15     // Catch: java.lang.Throwable -> L188
            boolean[] r1 = r10.touched     // Catch: java.lang.Throwable -> L188
            r2 = r16
            r3 = -1
            if (r2 == r3) goto L16e
            r7 = 1
            goto L16f
        L16e:
            r7 = 0
        L16f:
            r1[r14] = r7     // Catch: java.lang.Throwable -> L188
            int[] r1 = r10.button     // Catch: java.lang.Throwable -> L188
            r1[r14] = r2     // Catch: java.lang.Throwable -> L188
            float[] r1 = r10.pressure     // Catch: java.lang.Throwable -> L188
            float r0 = r0.getPressure(r11)     // Catch: java.lang.Throwable -> L188
            r1[r14] = r0     // Catch: java.lang.Throwable -> L188
        L17d:
            monitor-exit(r22)     // Catch: java.lang.Throwable -> L188
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Graphics r0 = r0.getGraphics()
            r0.requestRendering()
            return
        L188:
            r0 = move-exception
            monitor-exit(r22)     // Catch: java.lang.Throwable -> L188
            throw r0
    }

    public boolean supportsMultitouch(android.content.Context r2) {
            r1 = this;
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.lang.String r0 = "android.hardware.touchscreen.multitouch"
            boolean r2 = r2.hasSystemFeature(r0)
            return r2
    }
}
