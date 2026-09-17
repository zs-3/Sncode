package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbny extends com.google.android.gms.internal.ads.zzcaz {
    private final java.lang.Object zza;
    private final com.google.android.gms.ads.internal.util.zzbd zzb;
    private boolean zzc;
    private int zzd;

    public zzbny(com.google.android.gms.ads.internal.util.zzbd r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zza = r0
            r1.zzb = r2
            r2 = 0
            r1.zzc = r2
            r1.zzd = r2
            return
    }

    public final com.google.android.gms.internal.ads.zzbnt zza() {
            r4 = this;
            com.google.android.gms.internal.ads.zzbnt r0 = new com.google.android.gms.internal.ads.zzbnt
            r0.<init>(r4)
            java.lang.String r1 = "createNewReference: Trying to acquire lock"
            com.google.android.gms.ads.internal.util.zze.zza(r1)
            java.lang.Object r1 = r4.zza
            monitor-enter(r1)
            java.lang.String r2 = "createNewReference: Lock acquired"
            com.google.android.gms.ads.internal.util.zze.zza(r2)     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.zzbnu r2 = new com.google.android.gms.internal.ads.zzbnu     // Catch: java.lang.Throwable -> L36
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.zzbnv r3 = new com.google.android.gms.internal.ads.zzbnv     // Catch: java.lang.Throwable -> L36
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> L36
            r4.zzj(r2, r3)     // Catch: java.lang.Throwable -> L36
            int r2 = r4.zzd     // Catch: java.lang.Throwable -> L36
            r3 = 1
            if (r2 < 0) goto L26
            r2 = 1
            goto L27
        L26:
            r2 = 0
        L27:
            com.google.android.gms.common.internal.Preconditions.checkState(r2)     // Catch: java.lang.Throwable -> L36
            int r2 = r4.zzd     // Catch: java.lang.Throwable -> L36
            int r2 = r2 + r3
            r4.zzd = r2     // Catch: java.lang.Throwable -> L36
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = "createNewReference: Lock released"
            com.google.android.gms.ads.internal.util.zze.zza(r1)
            return r0
        L36:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L36
            throw r0
    }

    public final void zzb() {
            r3 = this;
            java.lang.String r0 = "markAsDestroyable: Trying to acquire lock"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            java.lang.String r1 = "markAsDestroyable: Lock acquired"
            com.google.android.gms.ads.internal.util.zze.zza(r1)     // Catch: java.lang.Throwable -> L29
            int r1 = r3.zzd     // Catch: java.lang.Throwable -> L29
            r2 = 1
            if (r1 < 0) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            com.google.android.gms.common.internal.Preconditions.checkState(r1)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "Releasing root reference. JS Engine will be destroyed once other references are released."
            com.google.android.gms.ads.internal.util.zze.zza(r1)     // Catch: java.lang.Throwable -> L29
            r3.zzc = r2     // Catch: java.lang.Throwable -> L29
            r3.zzc()     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = "markAsDestroyable: Lock released"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            return
        L29:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r1
    }

    protected final void zzc() {
            r3 = this;
            java.lang.String r0 = "maybeDestroy: Trying to acquire lock"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            java.lang.String r1 = "maybeDestroy: Lock acquired"
            com.google.android.gms.ads.internal.util.zze.zza(r1)     // Catch: java.lang.Throwable -> L3e
            int r1 = r3.zzd     // Catch: java.lang.Throwable -> L3e
            if (r1 < 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            com.google.android.gms.common.internal.Preconditions.checkState(r1)     // Catch: java.lang.Throwable -> L3e
            boolean r1 = r3.zzc     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L32
            int r1 = r3.zzd     // Catch: java.lang.Throwable -> L3e
            if (r1 != 0) goto L32
            java.lang.String r1 = "No reference is left (including root). Cleaning up engine."
            com.google.android.gms.ads.internal.util.zze.zza(r1)     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.zzbnx r1 = new com.google.android.gms.internal.ads.zzbnx     // Catch: java.lang.Throwable -> L3e
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.zzcav r2 = new com.google.android.gms.internal.ads.zzcav     // Catch: java.lang.Throwable -> L3e
            r2.<init>()     // Catch: java.lang.Throwable -> L3e
            r3.zzj(r1, r2)     // Catch: java.lang.Throwable -> L3e
            goto L37
        L32:
            java.lang.String r1 = "There are still references to the engine. Not destroying."
            com.google.android.gms.ads.internal.util.zze.zza(r1)     // Catch: java.lang.Throwable -> L3e
        L37:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "maybeDestroy: Lock released"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            return
        L3e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r1
    }

    protected final void zzd() {
            r2 = this;
            java.lang.String r0 = "releaseOneReference: Trying to acquire lock"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            java.lang.String r1 = "releaseOneReference: Lock acquired"
            com.google.android.gms.ads.internal.util.zze.zza(r1)     // Catch: java.lang.Throwable -> L2c
            int r1 = r2.zzd     // Catch: java.lang.Throwable -> L2c
            if (r1 <= 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            com.google.android.gms.common.internal.Preconditions.checkState(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "Releasing 1 reference for JS Engine"
            com.google.android.gms.ads.internal.util.zze.zza(r1)     // Catch: java.lang.Throwable -> L2c
            int r1 = r2.zzd     // Catch: java.lang.Throwable -> L2c
            int r1 = r1 + (-1)
            r2.zzd = r1     // Catch: java.lang.Throwable -> L2c
            r2.zzc()     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = "releaseOneReference: Lock released"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            return
        L2c:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r1
    }
}
