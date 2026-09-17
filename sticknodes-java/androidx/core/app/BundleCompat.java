package androidx.core.app;

/* loaded from: classes.dex */
public final class BundleCompat {

    static class Api18Impl {
        static android.os.IBinder getBinder(android.os.Bundle r0, java.lang.String r1) {
                android.os.IBinder r0 = r0.getBinder(r1)
                return r0
        }

        static void putBinder(android.os.Bundle r0, java.lang.String r1, android.os.IBinder r2) {
                r0.putBinder(r1, r2)
                return
        }
    }

    public static void putBinder(android.os.Bundle r0, java.lang.String r1, android.os.IBinder r2) {
            androidx.core.app.BundleCompat.Api18Impl.putBinder(r0, r1, r2)
            return
    }
}
