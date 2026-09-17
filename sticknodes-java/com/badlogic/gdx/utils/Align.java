package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public class Align {
    public static final boolean isBottom(int r0) {
            r0 = r0 & 4
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public static final boolean isCenterHorizontal(int r1) {
            r0 = r1 & 8
            if (r0 != 0) goto La
            r1 = r1 & 16
            if (r1 != 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    public static final boolean isCenterVertical(int r1) {
            r0 = r1 & 2
            if (r0 != 0) goto La
            r1 = r1 & 4
            if (r1 != 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    public static final boolean isLeft(int r0) {
            r0 = r0 & 8
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public static final boolean isRight(int r0) {
            r0 = r0 & 16
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public static final boolean isTop(int r0) {
            r0 = r0 & 2
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }
}
