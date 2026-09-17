package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzhhp implements com.google.android.gms.internal.ads.zzarp {
    private static final com.google.android.gms.internal.ads.zzhia zzg = null;
    protected final java.lang.String zza;
    boolean zzb;
    boolean zzc;
    long zzd;
    long zze;
    com.google.android.gms.internal.ads.zzhhu zzf;
    private java.nio.ByteBuffer zzh;

    static {
            java.lang.Class<com.google.android.gms.internal.ads.zzhhp> r0 = com.google.android.gms.internal.ads.zzhhp.class
            com.google.android.gms.internal.ads.zzhia r0 = com.google.android.gms.internal.ads.zzhia.zzb(r0)
            com.google.android.gms.internal.ads.zzhhp.zzg = r0
            return
    }

    protected zzhhp(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.zze = r0
            r2.zza = r3
            r3 = 1
            r2.zzc = r3
            r2.zzb = r3
            return
    }

    private final synchronized void zzc() {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.zzc     // Catch: java.lang.Throwable -> L39
            if (r0 != 0) goto L37
            com.google.android.gms.internal.ads.zzhia r0 = com.google.android.gms.internal.ads.zzhhp.zzg     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L39
            java.lang.String r1 = "mem mapping "
            java.lang.String r2 = r5.zza     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L39
            int r3 = r2.length()     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L39
            if (r3 == 0) goto L16
            java.lang.String r1 = r1.concat(r2)     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L39
            goto L1c
        L16:
            java.lang.String r2 = new java.lang.String     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L39
            r2.<init>(r1)     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L39
            r1 = r2
        L1c:
            r0.zza(r1)     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzhhu r0 = r5.zzf     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L39
            long r1 = r5.zzd     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L39
            long r3 = r5.zze     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L39
            java.nio.ByteBuffer r0 = r0.zzd(r1, r3)     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L39
            r5.zzh = r0     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L39
            r0 = 1
            r5.zzc = r0     // Catch: java.lang.Throwable -> L39
            monitor-exit(r5)
            return
        L30:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L39
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L39
            throw r1     // Catch: java.lang.Throwable -> L39
        L37:
            monitor-exit(r5)
            return
        L39:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzarp
    public final java.lang.String zza() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzarp
    public final void zzb(com.google.android.gms.internal.ads.zzhhu r3, java.nio.ByteBuffer r4, long r5, com.google.android.gms.internal.ads.zzarm r7) throws java.io.IOException {
            r2 = this;
            long r0 = r3.zzb()
            r2.zzd = r0
            r4.remaining()
            r2.zze = r5
            r2.zzf = r3
            long r0 = r3.zzb()
            long r0 = r0 + r5
            r3.zze(r0)
            r3 = 0
            r2.zzc = r3
            r2.zzb = r3
            r2.zzf()
            return
    }

    protected abstract void zze(java.nio.ByteBuffer r1);

    public final synchronized void zzf() {
            r4 = this;
            monitor-enter(r4)
            r4.zzc()     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.ads.zzhia r0 = com.google.android.gms.internal.ads.zzhhp.zzg     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = "parsing details of "
            java.lang.String r2 = r4.zza     // Catch: java.lang.Throwable -> L3b
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L15
            java.lang.String r1 = r1.concat(r2)     // Catch: java.lang.Throwable -> L3b
            goto L1b
        L15:
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L3b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L3b
            r1 = r2
        L1b:
            r0.zza(r1)     // Catch: java.lang.Throwable -> L3b
            java.nio.ByteBuffer r0 = r4.zzh     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L39
            r1 = 1
            r4.zzb = r1     // Catch: java.lang.Throwable -> L3b
            r0.rewind()     // Catch: java.lang.Throwable -> L3b
            r4.zze(r0)     // Catch: java.lang.Throwable -> L3b
            int r1 = r0.remaining()     // Catch: java.lang.Throwable -> L3b
            if (r1 <= 0) goto L34
            r0.slice()     // Catch: java.lang.Throwable -> L3b
        L34:
            r0 = 0
            r4.zzh = r0     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r4)
            return
        L39:
            monitor-exit(r4)
            return
        L3b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }
}
