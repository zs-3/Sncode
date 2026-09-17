package androidx.core.os;

/* loaded from: classes.dex */
public class BuildCompat {
    protected static boolean isAtLeastPreReleaseCodename(java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = "REL"
            boolean r0 = r0.equals(r3)
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toUpperCase(r0)
            java.lang.String r2 = r2.toUpperCase(r0)
            int r2 = r3.compareTo(r2)
            if (r2 < 0) goto L1b
            r1 = 1
        L1b:
            return r1
    }

    @android.annotation.SuppressLint({"RestrictedApi"})
    @java.lang.Deprecated
    public static boolean isAtLeastS() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 >= r1) goto L17
            r1 = 30
            if (r0 < r1) goto L15
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "S"
            boolean r0 = isAtLeastPreReleaseCodename(r1, r0)
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            return r0
    }

    public static boolean isAtLeastT() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto L17
            r1 = 32
            if (r0 < r1) goto L15
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "Tiramisu"
            boolean r0 = isAtLeastPreReleaseCodename(r1, r0)
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            return r0
    }
}
