package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfxd {
    private final java.lang.String zza;

    public zzfxd(java.lang.String r5) {
            r4 = this;
            r4.<init>()
            int r0 = android.os.Process.myUid()
            int r1 = android.os.Process.myPid()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UID: ["
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "]  PID: ["
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "] "
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r5 = r0.concat(r5)
            r4.zza = r5
            return
    }

    private static java.lang.String zze(java.lang.String r3, java.lang.String r4, java.lang.Object... r5) {
            int r0 = r5.length
            if (r0 <= 0) goto L39
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.util.IllegalFormatException -> La
            java.lang.String r4 = java.lang.String.format(r0, r4, r5)     // Catch: java.util.IllegalFormatException -> La
            goto L39
        La:
            r0 = move-exception
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r2 = "Unable to format "
            java.lang.String r1 = r2.concat(r1)
            java.lang.String r2 = "PlayCore"
            android.util.Log.e(r2, r1, r0)
            java.lang.String r0 = ", "
            java.lang.String r5 = android.text.TextUtils.join(r0, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = " ["
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = "]"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        L39:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = " : "
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            return r3
    }

    public final int zza(java.lang.String r3, java.lang.Object... r4) {
            r2 = this;
            java.lang.String r0 = "PlayCore"
            r1 = 6
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto L14
            java.lang.String r1 = r2.zza
            java.lang.String r3 = zze(r1, r3, r4)
            int r3 = android.util.Log.e(r0, r3)
            return r3
        L14:
            r3 = 0
            return r3
    }

    public final int zzb(java.lang.Throwable r3, java.lang.String r4, java.lang.Object... r5) {
            r2 = this;
            java.lang.String r0 = "PlayCore"
            r1 = 6
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto L14
            java.lang.String r1 = r2.zza
            java.lang.String r4 = zze(r1, r4, r5)
            int r3 = android.util.Log.e(r0, r4, r3)
            return r3
        L14:
            r3 = 0
            return r3
    }

    public final int zzc(java.lang.String r3, java.lang.Object... r4) {
            r2 = this;
            java.lang.String r0 = "PlayCore"
            r1 = 4
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto L14
            java.lang.String r1 = r2.zza
            java.lang.String r3 = zze(r1, r3, r4)
            int r3 = android.util.Log.i(r0, r3)
            return r3
        L14:
            r3 = 0
            return r3
    }

    public final int zzd(java.lang.String r3, java.lang.Object... r4) {
            r2 = this;
            java.lang.String r0 = "PlayCore"
            r1 = 5
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto L14
            java.lang.String r1 = r2.zza
            java.lang.String r3 = zze(r1, r3, r4)
            int r3 = android.util.Log.w(r0, r3)
            return r3
        L14:
            r3 = 0
            return r3
    }
}
