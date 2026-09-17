package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzggd extends com.google.android.gms.internal.ads.zzgec.zzi implements java.lang.Runnable {
    private final java.lang.Runnable zza;

    public zzggd(java.lang.Runnable r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.zza = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            java.lang.Runnable r0 = r1.zza     // Catch: java.lang.Throwable -> L6
            r0.run()     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r0 = move-exception
            r1.zzd(r0)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzgec
    protected final java.lang.String zza() {
            r3 = this;
            java.lang.Runnable r0 = r3.zza
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "task=["
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
