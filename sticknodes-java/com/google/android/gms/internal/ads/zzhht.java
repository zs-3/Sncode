package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public class zzhht implements java.util.Iterator, java.io.Closeable, com.google.android.gms.internal.ads.zzarq {
    private static final com.google.android.gms.internal.ads.zzarp zza = null;
    protected com.google.android.gms.internal.ads.zzarm zzb;
    protected com.google.android.gms.internal.ads.zzhhu zzc;
    com.google.android.gms.internal.ads.zzarp zzd;
    long zze;
    long zzf;
    private final java.util.List zzg;

    static {
            com.google.android.gms.internal.ads.zzhhs r0 = new com.google.android.gms.internal.ads.zzhhs
            java.lang.String r1 = "eof "
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzhht.zza = r0
            java.lang.Class<com.google.android.gms.internal.ads.zzhht> r0 = com.google.android.gms.internal.ads.zzhht.class
            com.google.android.gms.internal.ads.zzhia.zzb(r0)
            return
    }

    public zzhht() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zzd = r0
            r0 = 0
            r2.zze = r0
            r2.zzf = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.zzg = r0
            return
    }

    public void close() throws java.io.IOException {
            r0 = this;
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r3 = this;
            com.google.android.gms.internal.ads.zzarp r0 = r3.zzd
            com.google.android.gms.internal.ads.zzarp r1 = com.google.android.gms.internal.ads.zzhht.zza
            r2 = 0
            if (r0 != r1) goto L8
            return r2
        L8:
            r1 = 1
            if (r0 == 0) goto Lc
            return r1
        Lc:
            com.google.android.gms.internal.ads.zzarp r0 = r3.zzc()     // Catch: java.util.NoSuchElementException -> L13
            r3.zzd = r0     // Catch: java.util.NoSuchElementException -> L13
            return r1
        L13:
            com.google.android.gms.internal.ads.zzarp r0 = com.google.android.gms.internal.ads.zzhht.zza
            r3.zzd = r0
            return r2
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
            r1 = this;
            com.google.android.gms.internal.ads.zzarp r0 = r1.zzc()
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "["
            r0.append(r1)
            r1 = 0
        L16:
            java.util.List r2 = r3.zzg
            int r2 = r2.size()
            if (r1 >= r2) goto L37
            if (r1 <= 0) goto L25
            java.lang.String r2 = ";"
            r0.append(r2)
        L25:
            java.util.List r2 = r3.zzg
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.internal.ads.zzarp r2 = (com.google.android.gms.internal.ads.zzarp) r2
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            int r1 = r1 + 1
            goto L16
        L37:
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final com.google.android.gms.internal.ads.zzarp zzc() {
            r6 = this;
            com.google.android.gms.internal.ads.zzarp r0 = r6.zzd
            if (r0 == 0) goto Ld
            com.google.android.gms.internal.ads.zzarp r1 = com.google.android.gms.internal.ads.zzhht.zza
            if (r0 != r1) goto L9
            goto Ld
        L9:
            r1 = 0
            r6.zzd = r1
            return r0
        Ld:
            com.google.android.gms.internal.ads.zzhhu r0 = r6.zzc
            if (r0 == 0) goto L42
            long r1 = r6.zze
            long r3 = r6.zzf
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L42
            monitor-enter(r0)     // Catch: java.io.IOException -> L36 java.io.EOFException -> L3c
            com.google.android.gms.internal.ads.zzhhu r1 = r6.zzc     // Catch: java.lang.Throwable -> L33
            long r2 = r6.zze     // Catch: java.lang.Throwable -> L33
            r1.zze(r2)     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzarm r1 = r6.zzb     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzhhu r2 = r6.zzc     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzarp r1 = r1.zzb(r2, r6)     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzhhu r2 = r6.zzc     // Catch: java.lang.Throwable -> L33
            long r2 = r2.zzb()     // Catch: java.lang.Throwable -> L33
            r6.zze = r2     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return r1
        L33:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r1     // Catch: java.io.IOException -> L36 java.io.EOFException -> L3c
        L36:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L3c:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L42:
            com.google.android.gms.internal.ads.zzarp r0 = com.google.android.gms.internal.ads.zzhht.zza
            r6.zzd = r0
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    public final java.util.List zzd() {
            r2 = this;
            com.google.android.gms.internal.ads.zzhhu r0 = r2.zzc
            if (r0 == 0) goto L12
            com.google.android.gms.internal.ads.zzarp r0 = r2.zzd
            com.google.android.gms.internal.ads.zzarp r1 = com.google.android.gms.internal.ads.zzhht.zza
            if (r0 == r1) goto L12
            java.util.List r0 = r2.zzg
            com.google.android.gms.internal.ads.zzhhz r1 = new com.google.android.gms.internal.ads.zzhhz
            r1.<init>(r0, r2)
            return r1
        L12:
            java.util.List r0 = r2.zzg
            return r0
    }

    public final void zze(com.google.android.gms.internal.ads.zzhhu r3, long r4, com.google.android.gms.internal.ads.zzarm r6) throws java.io.IOException {
            r2 = this;
            r2.zzc = r3
            long r0 = r3.zzb()
            r2.zze = r0
            long r0 = r3.zzb()
            long r0 = r0 + r4
            r3.zze(r0)
            long r3 = r3.zzb()
            r2.zzf = r3
            r2.zzb = r6
            return
    }
}
