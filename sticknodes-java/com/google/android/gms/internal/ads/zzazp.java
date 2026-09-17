package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzazp {
    private final java.lang.Object zza;
    private com.google.android.gms.internal.ads.zzazn zzb;
    private boolean zzc;

    public zzazp() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zza = r0
            r0 = 0
            r1.zzb = r0
            r0 = 0
            r1.zzc = r0
            return
    }

    public final android.app.Activity zza() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzazn r1 = r2.zzb     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto Ld
            android.app.Activity r1 = r1.zza()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return r1
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            r0 = 0
            return r0
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    public final android.content.Context zzb() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzazn r1 = r2.zzb     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto Ld
            android.content.Context r1 = r1.zzb()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return r1
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            r0 = 0
            return r0
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    public final void zzc(com.google.android.gms.internal.ads.zzazo r3) {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzazn r1 = r2.zzb     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto Le
            com.google.android.gms.internal.ads.zzazn r1 = new com.google.android.gms.internal.ads.zzazn     // Catch: java.lang.Throwable -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L15
            r2.zzb = r1     // Catch: java.lang.Throwable -> L15
        Le:
            com.google.android.gms.internal.ads.zzazn r1 = r2.zzb     // Catch: java.lang.Throwable -> L15
            r1.zzf(r3)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r3
    }

    public final void zzd(android.content.Context r4) {
            r3 = this;
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            boolean r1 = r3.zzc     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L32
            android.content.Context r1 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto Le
            r1 = r4
        Le:
            boolean r2 = r1 instanceof android.app.Application     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L15
            android.app.Application r1 = (android.app.Application) r1     // Catch: java.lang.Throwable -> L34
            goto L16
        L15:
            r1 = 0
        L16:
            if (r1 != 0) goto L1f
            java.lang.String r4 = "Can not cast Context to Application"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        L1f:
            com.google.android.gms.internal.ads.zzazn r2 = r3.zzb     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L2a
            com.google.android.gms.internal.ads.zzazn r2 = new com.google.android.gms.internal.ads.zzazn     // Catch: java.lang.Throwable -> L34
            r2.<init>()     // Catch: java.lang.Throwable -> L34
            r3.zzb = r2     // Catch: java.lang.Throwable -> L34
        L2a:
            com.google.android.gms.internal.ads.zzazn r2 = r3.zzb     // Catch: java.lang.Throwable -> L34
            r2.zzg(r1, r4)     // Catch: java.lang.Throwable -> L34
            r4 = 1
            r3.zzc = r4     // Catch: java.lang.Throwable -> L34
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r4
    }

    public final void zze(com.google.android.gms.internal.ads.zzazo r3) {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzazn r1 = r2.zzb     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        L9:
            r1.zzh(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
    }
}
