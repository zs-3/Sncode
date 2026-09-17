package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbyv implements com.google.android.gms.internal.ads.zzayv {
    private final android.content.Context zza;
    private final java.lang.Object zzb;
    private final java.lang.String zzc;
    private boolean zzd;

    public zzbyv(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            android.content.Context r0 = r2.getApplicationContext()
            if (r0 == 0) goto Ld
            android.content.Context r2 = r2.getApplicationContext()
        Ld:
            r1.zza = r2
            r1.zzc = r3
            r2 = 0
            r1.zzd = r2
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.zzb = r2
            return
    }

    public final java.lang.String zza() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    public final void zzb(boolean r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzbyz r0 = com.google.android.gms.ads.internal.zzu.zzn()
            android.content.Context r1 = r3.zza
            boolean r0 = r0.zzp(r1)
            if (r0 != 0) goto Ld
            return
        Ld:
            java.lang.Object r0 = r3.zzb
            monitor-enter(r0)
            boolean r1 = r3.zzd     // Catch: java.lang.Throwable -> L3f
            if (r1 != r4) goto L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            return
        L16:
            r3.zzd = r4     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = r3.zzc     // Catch: java.lang.Throwable -> L3f
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L22
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            return
        L22:
            boolean r4 = r3.zzd     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L32
            com.google.android.gms.internal.ads.zzbyz r4 = com.google.android.gms.ads.internal.zzu.zzn()     // Catch: java.lang.Throwable -> L3f
            android.content.Context r1 = r3.zza     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = r3.zzc     // Catch: java.lang.Throwable -> L3f
            r4.zzf(r1, r2)     // Catch: java.lang.Throwable -> L3f
            goto L3d
        L32:
            com.google.android.gms.internal.ads.zzbyz r4 = com.google.android.gms.ads.internal.zzu.zzn()     // Catch: java.lang.Throwable -> L3f
            android.content.Context r1 = r3.zza     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = r3.zzc     // Catch: java.lang.Throwable -> L3f
            r4.zzg(r1, r2)     // Catch: java.lang.Throwable -> L3f
        L3d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            return
        L3f:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r4
    }

    @Override // com.google.android.gms.internal.ads.zzayv
    public final void zzdp(com.google.android.gms.internal.ads.zzayu r1) {
            r0 = this;
            boolean r1 = r1.zzj
            r0.zzb(r1)
            return
    }
}
