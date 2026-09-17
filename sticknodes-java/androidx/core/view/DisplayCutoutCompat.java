package androidx.core.view;

/* loaded from: classes.dex */
public final class DisplayCutoutCompat {
    private final android.view.DisplayCutout mDisplayCutout;

    static class Api28Impl {
        static android.view.DisplayCutout createDisplayCutout(android.graphics.Rect r1, java.util.List<android.graphics.Rect> r2) {
                android.view.DisplayCutout r0 = new android.view.DisplayCutout
                r0.<init>(r1, r2)
                return r0
        }

        static java.util.List<android.graphics.Rect> getBoundingRects(android.view.DisplayCutout r0) {
                java.util.List r0 = r0.getBoundingRects()
                return r0
        }

        static int getSafeInsetBottom(android.view.DisplayCutout r0) {
                int r0 = r0.getSafeInsetBottom()
                return r0
        }

        static int getSafeInsetLeft(android.view.DisplayCutout r0) {
                int r0 = r0.getSafeInsetLeft()
                return r0
        }

        static int getSafeInsetRight(android.view.DisplayCutout r0) {
                int r0 = r0.getSafeInsetRight()
                return r0
        }

        static int getSafeInsetTop(android.view.DisplayCutout r0) {
                int r0 = r0.getSafeInsetTop()
                return r0
        }
    }

    private DisplayCutoutCompat(android.view.DisplayCutout r1) {
            r0 = this;
            r0.<init>()
            r0.mDisplayCutout = r1
            return
    }

    static androidx.core.view.DisplayCutoutCompat wrap(android.view.DisplayCutout r1) {
            if (r1 != 0) goto L4
            r1 = 0
            goto La
        L4:
            androidx.core.view.DisplayCutoutCompat r0 = new androidx.core.view.DisplayCutoutCompat
            r0.<init>(r1)
            r1 = r0
        La:
            return r1
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<androidx.core.view.DisplayCutoutCompat> r0 = androidx.core.view.DisplayCutoutCompat.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            androidx.core.view.DisplayCutoutCompat r3 = (androidx.core.view.DisplayCutoutCompat) r3
            android.view.DisplayCutout r0 = r2.mDisplayCutout
            android.view.DisplayCutout r3 = r3.mDisplayCutout
            boolean r3 = androidx.core.util.ObjectsCompat.equals(r0, r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public int getSafeInsetBottom() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.DisplayCutout r0 = r2.mDisplayCutout
            int r0 = androidx.core.view.DisplayCutoutCompat.Api28Impl.getSafeInsetBottom(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public int getSafeInsetLeft() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.DisplayCutout r0 = r2.mDisplayCutout
            int r0 = androidx.core.view.DisplayCutoutCompat.Api28Impl.getSafeInsetLeft(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public int getSafeInsetRight() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.DisplayCutout r0 = r2.mDisplayCutout
            int r0 = androidx.core.view.DisplayCutoutCompat.Api28Impl.getSafeInsetRight(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public int getSafeInsetTop() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.DisplayCutout r0 = r2.mDisplayCutout
            int r0 = androidx.core.view.DisplayCutoutCompat.Api28Impl.getSafeInsetTop(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public int hashCode() {
            r1 = this;
            android.view.DisplayCutout r0 = r1.mDisplayCutout
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DisplayCutoutCompat{"
            r0.append(r1)
            android.view.DisplayCutout r1 = r2.mDisplayCutout
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
