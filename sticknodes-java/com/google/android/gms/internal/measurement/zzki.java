package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public abstract class zzki {
    public static final /* synthetic */ int zzc = 0;
    private static final java.lang.Object zzd = null;
    private static volatile com.google.android.gms.internal.measurement.zzkg zze;
    private static volatile boolean zzf;
    private static final java.util.concurrent.atomic.AtomicInteger zzg = null;
    final com.google.android.gms.internal.measurement.zzkf zza;
    final java.lang.String zzb;
    private java.lang.Object zzh;
    private volatile int zzi;
    private volatile java.lang.Object zzj;
    private volatile boolean zzk;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.internal.measurement.zzki.zzd = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            com.google.android.gms.internal.measurement.zzka r0 = new com.google.android.gms.internal.measurement.zzka
            r0.<init>()
            java.lang.String r1 = "BuildInfo must be non-null"
            com.google.common.base.Preconditions.checkNotNull(r0, r1)
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            com.google.android.gms.internal.measurement.zzki.zzg = r0
            return
    }

    /* synthetic */ zzki(com.google.android.gms.internal.measurement.zzkf r1, java.lang.String r2, java.lang.Object r3, boolean r4, com.google.android.gms.internal.measurement.zzkh r5) {
            r0 = this;
            r0.<init>()
            r4 = -1
            r0.zzi = r4
            android.net.Uri r4 = r1.zza
            if (r4 == 0) goto L14
            r0.zza = r1
            r0.zzb = r2
            r0.zzh = r3
            r1 = 0
            r0.zzk = r1
            return
        L14:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Must pass a valid SharedPreferences file name or ContentProvider URI"
            r1.<init>(r2)
            throw r1
    }

    public static void zzc() {
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.measurement.zzki.zzg
            r0.incrementAndGet()
            return
    }

    public static void zzd(android.content.Context r3) {
            com.google.android.gms.internal.measurement.zzkg r0 = com.google.android.gms.internal.measurement.zzki.zze
            if (r0 != 0) goto L4a
            if (r3 != 0) goto L7
            goto L4a
        L7:
            java.lang.Object r0 = com.google.android.gms.internal.measurement.zzki.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.zzkg r1 = com.google.android.gms.internal.measurement.zzki.zze     // Catch: java.lang.Throwable -> L47
            if (r1 != 0) goto L45
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.zzkg r1 = com.google.android.gms.internal.measurement.zzki.zze     // Catch: java.lang.Throwable -> L42
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L18
            r3 = r2
        L18:
            if (r1 == 0) goto L20
            android.content.Context r2 = r1.zza()     // Catch: java.lang.Throwable -> L42
            if (r2 == r3) goto L40
        L20:
            if (r1 == 0) goto L2b
            com.google.android.gms.internal.measurement.zzjm.zze()     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.measurement.zzkk.zzd()     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.measurement.zzju.zze()     // Catch: java.lang.Throwable -> L42
        L2b:
            com.google.android.gms.internal.measurement.zzjz r1 = new com.google.android.gms.internal.measurement.zzjz     // Catch: java.lang.Throwable -> L42
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L42
            com.google.common.base.Supplier r1 = com.google.common.base.Suppliers.memoize(r1)     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.measurement.zzjj r2 = new com.google.android.gms.internal.measurement.zzjj     // Catch: java.lang.Throwable -> L42
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.measurement.zzki.zze = r2     // Catch: java.lang.Throwable -> L42
            java.util.concurrent.atomic.AtomicInteger r3 = com.google.android.gms.internal.measurement.zzki.zzg     // Catch: java.lang.Throwable -> L42
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L42
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            goto L45
        L42:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            throw r3     // Catch: java.lang.Throwable -> L47
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            return
        L47:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            throw r3
        L4a:
            return
    }

    abstract java.lang.Object zza(java.lang.Object r1);

    public final java.lang.Object zzb() {
            r9 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.measurement.zzki.zzg
            int r0 = r0.get()
            int r1 = r9.zzi
            if (r1 >= r0) goto Ld2
            monitor-enter(r9)
            int r1 = r9.zzi     // Catch: java.lang.Throwable -> Lcf
            if (r1 >= r0) goto Lcd
            com.google.android.gms.internal.measurement.zzkg r1 = com.google.android.gms.internal.measurement.zzki.zze     // Catch: java.lang.Throwable -> Lcf
            com.google.common.base.Optional r2 = com.google.common.base.Optional.absent()     // Catch: java.lang.Throwable -> Lcf
            r3 = 0
            if (r1 == 0) goto L47
            com.google.common.base.Supplier r4 = r1.zzb()     // Catch: java.lang.Throwable -> Lcf
            if (r4 == 0) goto L47
            com.google.common.base.Supplier r2 = r1.zzb()     // Catch: java.lang.Throwable -> Lcf
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)     // Catch: java.lang.Throwable -> Lcf
            com.google.common.base.Supplier r2 = (com.google.common.base.Supplier) r2     // Catch: java.lang.Throwable -> Lcf
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> Lcf
            com.google.common.base.Optional r2 = (com.google.common.base.Optional) r2     // Catch: java.lang.Throwable -> Lcf
            boolean r4 = r2.isPresent()     // Catch: java.lang.Throwable -> Lcf
            if (r4 == 0) goto L47
            java.lang.Object r4 = r2.get()     // Catch: java.lang.Throwable -> Lcf
            com.google.android.gms.internal.measurement.zzjo r4 = (com.google.android.gms.internal.measurement.zzjo) r4     // Catch: java.lang.Throwable -> Lcf
            com.google.android.gms.internal.measurement.zzkf r5 = r9.zza     // Catch: java.lang.Throwable -> Lcf
            android.net.Uri r6 = r5.zza     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r5 = r5.zzc     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r7 = r9.zzb     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r4 = r4.zza(r6, r3, r5, r7)     // Catch: java.lang.Throwable -> Lcf
            goto L48
        L47:
            r4 = r3
        L48:
            if (r1 == 0) goto L4c
            r5 = 1
            goto L4d
        L4c:
            r5 = 0
        L4d:
            java.lang.String r6 = "Must call PhenotypeFlagInitializer.maybeInit() first"
            com.google.common.base.Preconditions.checkState(r5, r6)     // Catch: java.lang.Throwable -> Lcf
            com.google.android.gms.internal.measurement.zzkf r5 = r9.zza     // Catch: java.lang.Throwable -> Lcf
            android.net.Uri r6 = r5.zza     // Catch: java.lang.Throwable -> Lcf
            if (r6 == 0) goto L76
            android.content.Context r7 = r1.zza()     // Catch: java.lang.Throwable -> Lcf
            boolean r7 = com.google.android.gms.internal.measurement.zzjw.zza(r7, r6)     // Catch: java.lang.Throwable -> Lcf
            if (r7 == 0) goto L74
            android.content.Context r7 = r1.zza()     // Catch: java.lang.Throwable -> Lcf
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.Throwable -> Lcf
            com.google.android.gms.internal.measurement.zzjy r8 = new com.google.android.gms.internal.measurement.zzjy     // Catch: java.lang.Throwable -> Lcf
            r8.<init>()     // Catch: java.lang.Throwable -> Lcf
            com.google.android.gms.internal.measurement.zzjm r6 = com.google.android.gms.internal.measurement.zzjm.zza(r7, r6, r8)     // Catch: java.lang.Throwable -> Lcf
            goto L89
        L74:
            r6 = r3
            goto L89
        L76:
            android.content.Context r6 = r1.zza()     // Catch: java.lang.Throwable -> Lcf
            java.lang.Object r7 = com.google.common.base.Preconditions.checkNotNull(r3)     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> Lcf
            com.google.android.gms.internal.measurement.zzjy r8 = new com.google.android.gms.internal.measurement.zzjy     // Catch: java.lang.Throwable -> Lcf
            r8.<init>()     // Catch: java.lang.Throwable -> Lcf
            com.google.android.gms.internal.measurement.zzkk r6 = com.google.android.gms.internal.measurement.zzkk.zza(r6, r7, r8)     // Catch: java.lang.Throwable -> Lcf
        L89:
            if (r6 == 0) goto L98
            java.lang.String r7 = r9.zzb     // Catch: java.lang.Throwable -> Lcf
            java.lang.Object r6 = r6.zzb(r7)     // Catch: java.lang.Throwable -> Lcf
            if (r6 == 0) goto L98
            java.lang.Object r6 = r9.zza(r6)     // Catch: java.lang.Throwable -> Lcf
            goto L99
        L98:
            r6 = r3
        L99:
            if (r6 == 0) goto L9c
            goto Lba
        L9c:
            boolean r5 = r5.zzd     // Catch: java.lang.Throwable -> Lcf
            if (r5 != 0) goto Lb4
            android.content.Context r1 = r1.zza()     // Catch: java.lang.Throwable -> Lcf
            com.google.android.gms.internal.measurement.zzju r1 = com.google.android.gms.internal.measurement.zzju.zza(r1)     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r5 = r9.zzb     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r1 = r1.zzd(r5)     // Catch: java.lang.Throwable -> Lcf
            if (r1 == 0) goto Lb4
            java.lang.Object r3 = r9.zza(r1)     // Catch: java.lang.Throwable -> Lcf
        Lb4:
            if (r3 != 0) goto Lb9
            java.lang.Object r6 = r9.zzh     // Catch: java.lang.Throwable -> Lcf
            goto Lba
        Lb9:
            r6 = r3
        Lba:
            boolean r1 = r2.isPresent()     // Catch: java.lang.Throwable -> Lcf
            if (r1 == 0) goto Lc9
            if (r4 != 0) goto Lc5
            java.lang.Object r6 = r9.zzh     // Catch: java.lang.Throwable -> Lcf
            goto Lc9
        Lc5:
            java.lang.Object r6 = r9.zza(r4)     // Catch: java.lang.Throwable -> Lcf
        Lc9:
            r9.zzj = r6     // Catch: java.lang.Throwable -> Lcf
            r9.zzi = r0     // Catch: java.lang.Throwable -> Lcf
        Lcd:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lcf
            goto Ld2
        Lcf:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lcf
            throw r0
        Ld2:
            java.lang.Object r0 = r9.zzj
            return r0
    }
}
