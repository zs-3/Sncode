package androidx.core.view;

/* loaded from: classes.dex */
public final class WindowCompat {

    static class Api16Impl {
        static void setDecorFitsSystemWindows(android.view.Window r1, boolean r2) {
                android.view.View r1 = r1.getDecorView()
                int r0 = r1.getSystemUiVisibility()
                if (r2 == 0) goto Ld
                r2 = r0 & (-1793(0xfffffffffffff8ff, float:NaN))
                goto Lf
            Ld:
                r2 = r0 | 1792(0x700, float:2.511E-42)
            Lf:
                r1.setSystemUiVisibility(r2)
                return
        }
    }

    static class Api30Impl {
        static void setDecorFitsSystemWindows(android.view.Window r0, boolean r1) {
                r0.setDecorFitsSystemWindows(r1)
                return
        }
    }

    public static void setDecorFitsSystemWindows(android.view.Window r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto La
            androidx.core.view.WindowCompat.Api30Impl.setDecorFitsSystemWindows(r2, r3)
            goto Ld
        La:
            androidx.core.view.WindowCompat.Api16Impl.setDecorFitsSystemWindows(r2, r3)
        Ld:
            return
    }
}
