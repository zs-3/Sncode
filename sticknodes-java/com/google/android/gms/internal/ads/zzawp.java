package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzawp {
    private long zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    public zzawp() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.zza = r0
            r2.zzb = r0
            r2.zzc = r0
            r2.zzd = r0
            r2.zze = r0
            r2.zzf = r0
            r2.zzg = r0
            r2.zzh = r0
            return
    }

    private static android.util.DisplayMetrics zzl(android.content.Context r1) {
            java.lang.String r0 = "window"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            android.view.Display r1 = r1.getDefaultDisplay()
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            r1.getRealMetrics(r0)     // Catch: java.lang.NoSuchMethodError -> L15
            goto L18
        L15:
            r1.getMetrics(r0)
        L18:
            return r0
    }

    private static boolean zzm(android.view.View r6) {
            r0 = 0
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Throwable -> L78
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L78
            java.lang.String r2 = "DebugGestureViewWrapper"
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L78
            if (r1 == 0) goto L17
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6     // Catch: java.lang.Throwable -> L78
            android.view.View r6 = r6.getChildAt(r0)     // Catch: java.lang.Throwable -> L78
        L17:
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Throwable -> L78
            java.lang.String r2 = "getAdConfiguration"
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L78
            java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L78
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L78
            java.lang.Object r6 = r1.invoke(r6, r2)     // Catch: java.lang.Throwable -> L78
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Throwable -> L78
            java.lang.String r2 = "adType"
            java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L78
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L78
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L78
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L78
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> L78
            java.lang.String r2 = "adTypeToString"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L78
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L78
            r4[r0] = r5     // Catch: java.lang.Throwable -> L78
            java.lang.reflect.Method r6 = r6.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L78
            r2 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L78
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L78
            r4[r0] = r1     // Catch: java.lang.Throwable -> L78
            java.lang.Object r6 = r6.invoke(r2, r4)     // Catch: java.lang.Throwable -> L78
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L78
            java.lang.String r1 = "INTERSTITIAL"
            boolean r1 = r6.contains(r1)     // Catch: java.lang.Throwable -> L78
            if (r1 != 0) goto L77
            java.lang.String r1 = "APP_OPEN"
            boolean r1 = r6.contains(r1)     // Catch: java.lang.Throwable -> L78
            if (r1 != 0) goto L77
            java.lang.String r1 = "REWARDED"
            boolean r6 = r6.contains(r1)     // Catch: java.lang.Throwable -> L78
            if (r6 == 0) goto L76
            goto L77
        L76:
            return r0
        L77:
            return r3
        L78:
            return r0
    }

    public final long zza() {
            r2 = this;
            long r0 = r2.zzg
            return r0
    }

    public final long zzb() {
            r2 = this;
            long r0 = r2.zze
            return r0
    }

    public final long zzc() {
            r2 = this;
            long r0 = r2.zza
            return r0
    }

    public final long zzd() {
            r2 = this;
            long r0 = r2.zzc
            return r0
    }

    public final long zze() {
            r2 = this;
            long r0 = r2.zzh
            return r0
    }

    public final long zzf() {
            r2 = this;
            long r0 = r2.zzf
            return r0
    }

    public final long zzg() {
            r2 = this;
            long r0 = r2.zzb
            return r0
    }

    public final long zzh() {
            r2 = this;
            long r0 = r2.zzd
            return r0
    }

    public final void zzi() {
            r2 = this;
            long r0 = r2.zzg
            r2.zzh = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r2.zzg = r0
            return
    }

    public final void zzj() {
            r2 = this;
            long r0 = r2.zza
            r2.zzb = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r2.zza = r0
            return
    }

    public final void zzk(android.content.Context r6, android.view.View r7) {
            r5 = this;
            long r0 = r5.zzc
            r5.zzd = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r5.zzc = r0
            long r0 = r5.zze
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L14
            r5.zzf = r0
        L14:
            android.util.DisplayMetrics r6 = zzl(r6)
            int r0 = r6.widthPixels
            int r1 = r6.heightPixels
            int r0 = r0 * r1
            if (r7 != 0) goto L21
            goto L49
        L21:
            int r1 = r7.getWidth()
            int r4 = r6.widthPixels
            int r1 = java.lang.Math.min(r1, r4)
            int r4 = r7.getHeight()
            int r6 = r6.heightPixels
            int r6 = java.lang.Math.min(r4, r6)
            int r1 = r1 * r6
            int r6 = r1 + r1
            if (r6 < r0) goto L3c
            goto L44
        L3c:
            if (r1 != 0) goto L49
            boolean r6 = zzm(r7)
            if (r6 == 0) goto L49
        L44:
            long r6 = r5.zzc
            r5.zze = r6
            return
        L49:
            r5.zze = r2
            return
    }
}
