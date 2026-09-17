package com.google.android.gms.ads.internal.util.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public class zzm {
    protected static final com.google.android.gms.internal.ads.zzfym zza = null;

    static {
            r0 = 4000(0xfa0, float:5.605E-42)
            com.google.android.gms.internal.ads.zzfym r0 = com.google.android.gms.internal.ads.zzfym.zza(r0)
            com.google.android.gms.ads.internal.util.client.zzm.zza = r0
            return
    }

    static java.lang.String zzd(java.lang.String r3) {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            int r1 = r0.length
            r2 = 4
            if (r1 < r2) goto L27
            r1 = 3
            r0 = r0[r1]
            int r0 = r0.getLineNumber()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " @"
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
        L27:
            return r3
    }

    public static void zze(java.lang.String r4) {
            r0 = 3
            boolean r0 = zzm(r0)
            if (r0 == 0) goto L3c
            java.lang.String r0 = "Ads"
            if (r4 == 0) goto L39
            int r1 = r4.length()
            r2 = 4000(0xfa0, float:5.605E-42)
            if (r1 > r2) goto L14
            goto L39
        L14:
            com.google.android.gms.internal.ads.zzfym r1 = com.google.android.gms.ads.internal.util.client.zzm.zza
            java.lang.Iterable r4 = r1.zzc(r4)
            java.util.Iterator r4 = r4.iterator()
            r1 = 1
            r2 = 0
        L20:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L3c
            java.lang.Object r3 = r4.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r1 == 0) goto L32
            android.util.Log.d(r0, r3)
            goto L37
        L32:
            java.lang.String r1 = "Ads-cont"
            android.util.Log.d(r1, r3)
        L37:
            r1 = 0
            goto L20
        L39:
            android.util.Log.d(r0, r4)
        L3c:
            return
    }

    public static void zzf(java.lang.String r1, java.lang.Throwable r2) {
            r0 = 3
            boolean r0 = zzm(r0)
            if (r0 == 0) goto Lc
            java.lang.String r0 = "Ads"
            android.util.Log.d(r0, r1, r2)
        Lc:
            return
    }

    public static void zzg(java.lang.String r4) {
            r0 = 6
            boolean r0 = zzm(r0)
            if (r0 == 0) goto L3c
            java.lang.String r0 = "Ads"
            if (r4 == 0) goto L39
            int r1 = r4.length()
            r2 = 4000(0xfa0, float:5.605E-42)
            if (r1 > r2) goto L14
            goto L39
        L14:
            com.google.android.gms.internal.ads.zzfym r1 = com.google.android.gms.ads.internal.util.client.zzm.zza
            java.lang.Iterable r4 = r1.zzc(r4)
            java.util.Iterator r4 = r4.iterator()
            r1 = 1
            r2 = 0
        L20:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L3c
            java.lang.Object r3 = r4.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r1 == 0) goto L32
            android.util.Log.e(r0, r3)
            goto L37
        L32:
            java.lang.String r1 = "Ads-cont"
            android.util.Log.e(r1, r3)
        L37:
            r1 = 0
            goto L20
        L39:
            android.util.Log.e(r0, r4)
        L3c:
            return
    }

    public static void zzh(java.lang.String r1, java.lang.Throwable r2) {
            r0 = 6
            boolean r0 = zzm(r0)
            if (r0 == 0) goto Lc
            java.lang.String r0 = "Ads"
            android.util.Log.e(r0, r1, r2)
        Lc:
            return
    }

    public static void zzi(java.lang.String r4) {
            r0 = 4
            boolean r0 = zzm(r0)
            if (r0 == 0) goto L3c
            java.lang.String r0 = "Ads"
            if (r4 == 0) goto L39
            int r1 = r4.length()
            r2 = 4000(0xfa0, float:5.605E-42)
            if (r1 > r2) goto L14
            goto L39
        L14:
            com.google.android.gms.internal.ads.zzfym r1 = com.google.android.gms.ads.internal.util.client.zzm.zza
            java.lang.Iterable r4 = r1.zzc(r4)
            java.util.Iterator r4 = r4.iterator()
            r1 = 1
            r2 = 0
        L20:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L3c
            java.lang.Object r3 = r4.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r1 == 0) goto L32
            android.util.Log.i(r0, r3)
            goto L37
        L32:
            java.lang.String r1 = "Ads-cont"
            android.util.Log.i(r1, r3)
        L37:
            r1 = 0
            goto L20
        L39:
            android.util.Log.i(r0, r4)
        L3c:
            return
    }

    public static void zzj(java.lang.String r4) {
            r0 = 5
            boolean r0 = zzm(r0)
            if (r0 == 0) goto L3c
            java.lang.String r0 = "Ads"
            if (r4 == 0) goto L39
            int r1 = r4.length()
            r2 = 4000(0xfa0, float:5.605E-42)
            if (r1 > r2) goto L14
            goto L39
        L14:
            com.google.android.gms.internal.ads.zzfym r1 = com.google.android.gms.ads.internal.util.client.zzm.zza
            java.lang.Iterable r4 = r1.zzc(r4)
            java.util.Iterator r4 = r4.iterator()
            r1 = 1
            r2 = 0
        L20:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L3c
            java.lang.Object r3 = r4.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r1 == 0) goto L32
            android.util.Log.w(r0, r3)
            goto L37
        L32:
            java.lang.String r1 = "Ads-cont"
            android.util.Log.w(r1, r3)
        L37:
            r1 = 0
            goto L20
        L39:
            android.util.Log.w(r0, r4)
        L3c:
            return
    }

    public static void zzk(java.lang.String r1, java.lang.Throwable r2) {
            r0 = 5
            boolean r0 = zzm(r0)
            if (r0 == 0) goto Lc
            java.lang.String r0 = "Ads"
            android.util.Log.w(r0, r1, r2)
        Lc:
            return
    }

    public static void zzl(java.lang.String r1, java.lang.Throwable r2) {
            r0 = 5
            boolean r0 = zzm(r0)
            if (r0 == 0) goto L18
            if (r2 == 0) goto L11
            java.lang.String r1 = zzd(r1)
            zzk(r1, r2)
            return
        L11:
            java.lang.String r1 = zzd(r1)
            zzj(r1)
        L18:
            return
    }

    public static boolean zzm(int r1) {
            r0 = 5
            if (r1 >= r0) goto Le
            java.lang.String r0 = "Ads"
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto Lc
            goto Le
        Lc:
            r1 = 0
            return r1
        Le:
            r1 = 1
            return r1
    }
}
