package androidx.core.os;

/* loaded from: classes.dex */
public class UserManagerCompat {

    static class Api24Impl {
        static boolean isUserUnlocked(android.content.Context r1) {
                java.lang.Class<android.os.UserManager> r0 = android.os.UserManager.class
                java.lang.Object r1 = r1.getSystemService(r0)
                android.os.UserManager r1 = (android.os.UserManager) r1
                boolean r1 = r1.isUserUnlocked()
                return r1
        }
    }

    public static boolean isUserUnlocked(android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.os.UserManagerCompat.Api24Impl.isUserUnlocked(r2)
            return r2
        Lb:
            r2 = 1
            return r2
    }
}
