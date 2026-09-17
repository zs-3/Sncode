package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public abstract class zzdc {
    private static final java.lang.Object zza = null;
    public static final /* synthetic */ int zzd = 0;
    private static volatile com.google.android.gms.internal.auth.zzda zze;
    private static volatile boolean zzf;
    private static final java.util.concurrent.atomic.AtomicReference zzg = null;
    private static final com.google.android.gms.internal.auth.zzde zzh = null;
    private static final java.util.concurrent.atomic.AtomicInteger zzi = null;
    final com.google.android.gms.internal.auth.zzcz zzb;
    final java.lang.String zzc;
    private final java.lang.Object zzj;
    private volatile int zzk;
    private volatile java.lang.Object zzl;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.internal.auth.zzdc.zza = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            com.google.android.gms.internal.auth.zzdc.zzg = r0
            com.google.android.gms.internal.auth.zzde r0 = new com.google.android.gms.internal.auth.zzde
            com.google.android.gms.internal.auth.zzcu r1 = com.google.android.gms.internal.auth.zzcu.zza
            r0.<init>(r1)
            com.google.android.gms.internal.auth.zzdc.zzh = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            com.google.android.gms.internal.auth.zzdc.zzi = r0
            return
    }

    /* synthetic */ zzdc(com.google.android.gms.internal.auth.zzcz r1, java.lang.String r2, java.lang.Object r3, boolean r4, com.google.android.gms.internal.auth.zzdb r5) {
            r0 = this;
            r0.<init>()
            r4 = -1
            r0.zzk = r4
            android.net.Uri r4 = r1.zza
            if (r4 == 0) goto L11
            r0.zzb = r1
            r0.zzc = r2
            r0.zzj = r3
            return
        L11:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Must pass a valid SharedPreferences file name or ContentProvider URI"
            r1.<init>(r2)
            throw r1
    }

    public static void zzc() {
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.auth.zzdc.zzi
            r0.incrementAndGet()
            return
    }

    public static void zzd(android.content.Context r3) {
            com.google.android.gms.internal.auth.zzda r0 = com.google.android.gms.internal.auth.zzdc.zze
            if (r0 != 0) goto L48
            if (r3 != 0) goto L7
            goto L48
        L7:
            java.lang.Object r0 = com.google.android.gms.internal.auth.zzdc.zza
            monitor-enter(r0)
            com.google.android.gms.internal.auth.zzda r1 = com.google.android.gms.internal.auth.zzdc.zze     // Catch: java.lang.Throwable -> L45
            if (r1 != 0) goto L43
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.auth.zzda r1 = com.google.android.gms.internal.auth.zzdc.zze     // Catch: java.lang.Throwable -> L40
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L18
            r3 = r2
        L18:
            if (r1 == 0) goto L20
            android.content.Context r1 = r1.zza()     // Catch: java.lang.Throwable -> L40
            if (r1 == r3) goto L3e
        L20:
            com.google.android.gms.internal.auth.zzcg.zzd()     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.internal.auth.zzdd.zzc()     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.internal.auth.zzco.zze()     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.internal.auth.zzct r1 = new com.google.android.gms.internal.auth.zzct     // Catch: java.lang.Throwable -> L40
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.internal.auth.zzdj r1 = com.google.android.gms.internal.auth.zzdo.zza(r1)     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.internal.auth.zzcd r2 = new com.google.android.gms.internal.auth.zzcd     // Catch: java.lang.Throwable -> L40
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.internal.auth.zzdc.zze = r2     // Catch: java.lang.Throwable -> L40
            java.util.concurrent.atomic.AtomicInteger r3 = com.google.android.gms.internal.auth.zzdc.zzi     // Catch: java.lang.Throwable -> L40
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L40
        L3e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            goto L43
        L40:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            throw r3     // Catch: java.lang.Throwable -> L45
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            return
        L45:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            throw r3
        L48:
            return
    }

    abstract java.lang.Object zza(java.lang.Object r1);

    public final java.lang.Object zzb() {
            r8 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.auth.zzdc.zzi
            int r0 = r0.get()
            int r1 = r8.zzk
            if (r1 >= r0) goto Lc8
            monitor-enter(r8)
            int r1 = r8.zzk     // Catch: java.lang.Throwable -> Lc5
            if (r1 >= r0) goto Lc3
            com.google.android.gms.internal.auth.zzda r1 = com.google.android.gms.internal.auth.zzdc.zze     // Catch: java.lang.Throwable -> Lc5
            com.google.android.gms.internal.auth.zzdh r2 = com.google.android.gms.internal.auth.zzdh.zzc()     // Catch: java.lang.Throwable -> Lc5
            r3 = 0
            if (r1 == 0) goto L3b
            com.google.android.gms.internal.auth.zzdj r2 = r1.zzb()     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r2 = r2.zza()     // Catch: java.lang.Throwable -> Lc5
            com.google.android.gms.internal.auth.zzdh r2 = (com.google.android.gms.internal.auth.zzdh) r2     // Catch: java.lang.Throwable -> Lc5
            boolean r4 = r2.zzb()     // Catch: java.lang.Throwable -> Lc5
            if (r4 == 0) goto L3b
            java.lang.Object r4 = r2.zza()     // Catch: java.lang.Throwable -> Lc5
            com.google.android.gms.internal.auth.zzci r4 = (com.google.android.gms.internal.auth.zzci) r4     // Catch: java.lang.Throwable -> Lc5
            com.google.android.gms.internal.auth.zzcz r5 = r8.zzb     // Catch: java.lang.Throwable -> Lc5
            android.net.Uri r6 = r5.zza     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r5 = r5.zzc     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r7 = r8.zzc     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r4 = r4.zza(r6, r3, r5, r7)     // Catch: java.lang.Throwable -> Lc5
            goto L3c
        L3b:
            r4 = r3
        L3c:
            java.lang.String r5 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto Lbd
            com.google.android.gms.internal.auth.zzcz r5 = r8.zzb     // Catch: java.lang.Throwable -> Lc5
            android.net.Uri r5 = r5.zza     // Catch: java.lang.Throwable -> Lc5
            if (r5 == 0) goto L65
            android.content.Context r6 = r1.zza()     // Catch: java.lang.Throwable -> Lc5
            boolean r5 = com.google.android.gms.internal.auth.zzcq.zza(r6, r5)     // Catch: java.lang.Throwable -> Lc5
            if (r5 == 0) goto L63
            android.content.Context r5 = r1.zza()     // Catch: java.lang.Throwable -> Lc5
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Throwable -> Lc5
            com.google.android.gms.internal.auth.zzcz r6 = r8.zzb     // Catch: java.lang.Throwable -> Lc5
            android.net.Uri r6 = r6.zza     // Catch: java.lang.Throwable -> Lc5
            com.google.android.gms.internal.auth.zzcs r7 = com.google.android.gms.internal.auth.zzcs.zza     // Catch: java.lang.Throwable -> Lc5
            com.google.android.gms.internal.auth.zzcg r5 = com.google.android.gms.internal.auth.zzcg.zza(r5, r6, r7)     // Catch: java.lang.Throwable -> Lc5
            goto L6f
        L63:
            r5 = r3
            goto L6f
        L65:
            android.content.Context r5 = r1.zza()     // Catch: java.lang.Throwable -> Lc5
            com.google.android.gms.internal.auth.zzcs r6 = com.google.android.gms.internal.auth.zzcs.zza     // Catch: java.lang.Throwable -> Lc5
            com.google.android.gms.internal.auth.zzdd r5 = com.google.android.gms.internal.auth.zzdd.zza(r5, r3, r6)     // Catch: java.lang.Throwable -> Lc5
        L6f:
            if (r5 == 0) goto L7e
            java.lang.String r6 = r8.zzc     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r5 = r5.zzb(r6)     // Catch: java.lang.Throwable -> Lc5
            if (r5 == 0) goto L7e
            java.lang.Object r5 = r8.zza(r5)     // Catch: java.lang.Throwable -> Lc5
            goto L7f
        L7e:
            r5 = r3
        L7f:
            if (r5 != 0) goto La9
            com.google.android.gms.internal.auth.zzcz r5 = r8.zzb     // Catch: java.lang.Throwable -> Lc5
            boolean r5 = r5.zzd     // Catch: java.lang.Throwable -> Lc5
            if (r5 != 0) goto La3
            android.content.Context r1 = r1.zza()     // Catch: java.lang.Throwable -> Lc5
            com.google.android.gms.internal.auth.zzco r1 = com.google.android.gms.internal.auth.zzco.zza(r1)     // Catch: java.lang.Throwable -> Lc5
            com.google.android.gms.internal.auth.zzcz r5 = r8.zzb     // Catch: java.lang.Throwable -> Lc5
            boolean r5 = r5.zzd     // Catch: java.lang.Throwable -> Lc5
            if (r5 == 0) goto L97
            r5 = r3
            goto L99
        L97:
            java.lang.String r5 = r8.zzc     // Catch: java.lang.Throwable -> Lc5
        L99:
            java.lang.String r1 = r1.zzc(r5)     // Catch: java.lang.Throwable -> Lc5
            if (r1 == 0) goto La3
            java.lang.Object r3 = r8.zza(r1)     // Catch: java.lang.Throwable -> Lc5
        La3:
            if (r3 != 0) goto La8
            java.lang.Object r5 = r8.zzj     // Catch: java.lang.Throwable -> Lc5
            goto La9
        La8:
            r5 = r3
        La9:
            boolean r1 = r2.zzb()     // Catch: java.lang.Throwable -> Lc5
            if (r1 == 0) goto Lb8
            if (r4 != 0) goto Lb4
            java.lang.Object r5 = r8.zzj     // Catch: java.lang.Throwable -> Lc5
            goto Lb8
        Lb4:
            java.lang.Object r5 = r8.zza(r4)     // Catch: java.lang.Throwable -> Lc5
        Lb8:
            r8.zzl = r5     // Catch: java.lang.Throwable -> Lc5
            r8.zzk = r0     // Catch: java.lang.Throwable -> Lc5
            goto Lc3
        Lbd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc5
            r0.<init>(r5)     // Catch: java.lang.Throwable -> Lc5
            throw r0     // Catch: java.lang.Throwable -> Lc5
        Lc3:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lc5
            goto Lc8
        Lc5:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lc5
            throw r0
        Lc8:
            java.lang.Object r0 = r8.zzl
            return r0
    }
}
