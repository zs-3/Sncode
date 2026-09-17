package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdr {
    public static void zza(boolean r0, java.lang.String r1) throws com.google.android.gms.internal.ads.zzdq {
            if (r0 == 0) goto L3
            return
        L3:
            com.google.android.gms.internal.ads.zzdq r0 = new com.google.android.gms.internal.ads.zzdq
            r0.<init>(r1)
            throw r0
    }

    public static boolean zzb(android.content.Context r4) {
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 24
            if (r0 >= r1) goto L7
            goto L2e
        L7:
            r1 = 26
            if (r0 >= r1) goto L1f
            java.lang.String r2 = com.google.android.gms.internal.ads.zzeu.zzc
            java.lang.String r3 = "samsung"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L2e
            java.lang.String r2 = com.google.android.gms.internal.ads.zzeu.zzd
            java.lang.String r3 = "XT1650"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L2e
        L1f:
            if (r0 >= r1) goto L30
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r0 = "android.hardware.vr.high_performance"
            boolean r4 = r4.hasSystemFeature(r0)
            if (r4 == 0) goto L2e
            goto L30
        L2e:
            r4 = 0
            return r4
        L30:
            java.lang.String r4 = "EGL_EXT_protected_content"
            boolean r4 = zzd(r4)
            return r4
    }

    public static boolean zzc() {
            java.lang.String r0 = "EGL_KHR_surfaceless_context"
            boolean r0 = zzd(r0)
            return r0
    }

    private static boolean zzd(java.lang.String r3) {
            r0 = 0
            android.opengl.EGLDisplay r1 = android.opengl.EGL14.eglGetDisplay(r0)
            r2 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r1 = android.opengl.EGL14.eglQueryString(r1, r2)
            if (r1 == 0) goto L15
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L15
            r3 = 1
            return r3
        L15:
            return r0
    }
}
