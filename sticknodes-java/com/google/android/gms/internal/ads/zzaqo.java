package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaqo {
    public static final java.lang.String zza = "Volley";
    public static final boolean zzb = false;
    private static final java.lang.String zzc = null;

    static {
            java.lang.String r0 = "Volley"
            r1 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            com.google.android.gms.internal.ads.zzaqo.zzb = r0
            java.lang.Class<com.google.android.gms.internal.ads.zzaqo> r0 = com.google.android.gms.internal.ads.zzaqo.class
            java.lang.String r0 = r0.getName()
            com.google.android.gms.internal.ads.zzaqo.zzc = r0
            return
    }

    public zzaqo() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void zza(java.lang.String r1, java.lang.Object... r2) {
            java.lang.String r0 = com.google.android.gms.internal.ads.zzaqo.zza
            java.lang.String r1 = zze(r1, r2)
            android.util.Log.d(r0, r1)
            return
    }

    public static void zzb(java.lang.String r1, java.lang.Object... r2) {
            java.lang.String r0 = com.google.android.gms.internal.ads.zzaqo.zza
            java.lang.String r1 = zze(r1, r2)
            android.util.Log.e(r0, r1)
            return
    }

    public static void zzc(java.lang.Throwable r1, java.lang.String r2, java.lang.Object... r3) {
            java.lang.String r0 = com.google.android.gms.internal.ads.zzaqo.zza
            java.lang.String r2 = zze(r2, r3)
            android.util.Log.e(r0, r2, r1)
            return
    }

    public static void zzd(java.lang.String r1, java.lang.Object... r2) {
            boolean r0 = com.google.android.gms.internal.ads.zzaqo.zzb
            if (r0 == 0) goto Ld
            java.lang.String r0 = com.google.android.gms.internal.ads.zzaqo.zza
            java.lang.String r1 = zze(r1, r2)
            android.util.Log.v(r0, r1)
        Ld:
            return
    }

    private static java.lang.String zze(java.lang.String r7, java.lang.Object... r8) {
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r7 = java.lang.String.format(r0, r7, r8)
            java.lang.Throwable r8 = new java.lang.Throwable
            r8.<init>()
            java.lang.Throwable r8 = r8.fillInStackTrace()
            java.lang.StackTraceElement[] r8 = r8.getStackTrace()
            r0 = 2
            r1 = 2
        L15:
            int r2 = r8.length
            r3 = 1
            if (r1 >= r2) goto L61
            r2 = r8[r1]
            java.lang.String r2 = r2.getClassName()
            java.lang.String r4 = com.google.android.gms.internal.ads.zzaqo.zzc
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L5e
            r2 = r8[r1]
            java.lang.String r2 = r2.getClassName()
            r4 = 46
            int r4 = r2.lastIndexOf(r4)
            int r4 = r4 + r3
            java.lang.String r2 = r2.substring(r4)
            r4 = 36
            int r4 = r2.lastIndexOf(r4)
            int r4 = r4 + r3
            java.lang.String r2 = r2.substring(r4)
            r8 = r8[r1]
            java.lang.String r8 = r8.getMethodName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = "."
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            goto L63
        L5e:
            int r1 = r1 + 1
            goto L15
        L61:
            java.lang.String r8 = "<unknown>"
        L63:
            java.util.Locale r1 = java.util.Locale.US
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4 = 0
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            long r5 = r5.getId()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r2[r4] = r5
            r2[r3] = r8
            r2[r0] = r7
            java.lang.String r7 = "[%d] %s: %s"
            java.lang.String r7 = java.lang.String.format(r1, r7, r2)
            return r7
    }
}
