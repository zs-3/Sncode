package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public class zzhca {
    protected volatile com.google.android.gms.internal.ads.zzhcp zza;
    private volatile com.google.android.gms.internal.ads.zzgzs zzb;

    public zzhca() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzhca
            if (r0 != 0) goto La
            r3 = 0
            return r3
        La:
            com.google.android.gms.internal.ads.zzhca r3 = (com.google.android.gms.internal.ads.zzhca) r3
            com.google.android.gms.internal.ads.zzhcp r0 = r2.zza
            com.google.android.gms.internal.ads.zzhcp r1 = r3.zza
            if (r0 != 0) goto L22
            if (r1 == 0) goto L15
            goto L22
        L15:
            com.google.android.gms.internal.ads.zzgzs r0 = r2.zzb()
            com.google.android.gms.internal.ads.zzgzs r3 = r3.zzb()
            boolean r3 = r0.equals(r3)
            return r3
        L22:
            if (r0 == 0) goto L2c
            if (r1 != 0) goto L27
            goto L2c
        L27:
            boolean r3 = r0.equals(r1)
            return r3
        L2c:
            if (r0 == 0) goto L3c
            com.google.android.gms.internal.ads.zzhcp r1 = r0.zzbt()
            r3.zzd(r1)
            com.google.android.gms.internal.ads.zzhcp r3 = r3.zza
            boolean r3 = r0.equals(r3)
            return r3
        L3c:
            com.google.android.gms.internal.ads.zzhcp r3 = r1.zzbt()
            r2.zzd(r3)
            com.google.android.gms.internal.ads.zzhcp r3 = r2.zza
            boolean r3 = r3.equals(r1)
            return r3
    }

    public int hashCode() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final int zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgzs r0 = r1.zzb
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.ads.zzgzs r0 = r1.zzb
            com.google.android.gms.internal.ads.zzgzq r0 = (com.google.android.gms.internal.ads.zzgzq) r0
            byte[] r0 = r0.zza
            int r0 = r0.length
            return r0
        Lc:
            com.google.android.gms.internal.ads.zzhcp r0 = r1.zza
            if (r0 == 0) goto L17
            com.google.android.gms.internal.ads.zzhcp r0 = r1.zza
            int r0 = r0.zzaY()
            return r0
        L17:
            r0 = 0
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgzs zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgzs r0 = r1.zzb
            if (r0 == 0) goto L7
            com.google.android.gms.internal.ads.zzgzs r0 = r1.zzb
            return r0
        L7:
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzgzs r0 = r1.zzb     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L10
            com.google.android.gms.internal.ads.zzgzs r0 = r1.zzb     // Catch: java.lang.Throwable -> L25
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L25
            return r0
        L10:
            com.google.android.gms.internal.ads.zzhcp r0 = r1.zza     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L19
            com.google.android.gms.internal.ads.zzgzs r0 = com.google.android.gms.internal.ads.zzgzs.zzb     // Catch: java.lang.Throwable -> L25
            r1.zzb = r0     // Catch: java.lang.Throwable -> L25
            goto L21
        L19:
            com.google.android.gms.internal.ads.zzhcp r0 = r1.zza     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzgzs r0 = r0.zzaN()     // Catch: java.lang.Throwable -> L25
            r1.zzb = r0     // Catch: java.lang.Throwable -> L25
        L21:
            com.google.android.gms.internal.ads.zzgzs r0 = r1.zzb     // Catch: java.lang.Throwable -> L25
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L25
            return r0
        L25:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L25
            throw r0
    }

    public final com.google.android.gms.internal.ads.zzhcp zzc(com.google.android.gms.internal.ads.zzhcp r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzhcp r0 = r2.zza
            r1 = 0
            r2.zzb = r1
            r2.zza = r3
            return r0
    }

    protected final void zzd(com.google.android.gms.internal.ads.zzhcp r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzhcp r0 = r1.zza
            if (r0 == 0) goto L5
            return
        L5:
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzhcp r0 = r1.zza     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto Lc
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            return
        Lc:
            r1.zza = r2     // Catch: com.google.android.gms.internal.ads.zzhbt -> L13 java.lang.Throwable -> L1b
            com.google.android.gms.internal.ads.zzgzs r0 = com.google.android.gms.internal.ads.zzgzs.zzb     // Catch: com.google.android.gms.internal.ads.zzhbt -> L13 java.lang.Throwable -> L1b
            r1.zzb = r0     // Catch: com.google.android.gms.internal.ads.zzhbt -> L13 java.lang.Throwable -> L1b
            goto L19
        L13:
            r1.zza = r2     // Catch: java.lang.Throwable -> L1b
            com.google.android.gms.internal.ads.zzgzs r2 = com.google.android.gms.internal.ads.zzgzs.zzb     // Catch: java.lang.Throwable -> L1b
            r1.zzb = r2     // Catch: java.lang.Throwable -> L1b
        L19:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            throw r2
    }
}
