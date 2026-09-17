package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeke {
    private final com.google.android.gms.common.util.Clock zza;
    private final com.google.android.gms.internal.ads.zzekg zzb;
    private final com.google.android.gms.internal.ads.zzfng zzc;
    private final java.util.LinkedHashMap zzd;
    private final boolean zze;
    private final com.google.android.gms.internal.ads.zzegp zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;

    public zzeke(com.google.android.gms.common.util.Clock r2, com.google.android.gms.internal.ads.zzekg r3, com.google.android.gms.internal.ads.zzegp r4, com.google.android.gms.internal.ads.zzfng r5) {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.zzd = r0
            r1.zza = r2
            r1.zzb = r3
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzgD
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r1.zze = r2
            r1.zzf = r4
            r1.zzc = r5
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzegp zzb(com.google.android.gms.internal.ads.zzeke r0) {
            com.google.android.gms.internal.ads.zzegp r0 = r0.zzf
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzekg zzc(com.google.android.gms.internal.ads.zzeke r0) {
            com.google.android.gms.internal.ads.zzekg r0 = r0.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfng zzd(com.google.android.gms.internal.ads.zzeke r0) {
            com.google.android.gms.internal.ads.zzfng r0 = r0.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.util.Clock zze(com.google.android.gms.internal.ads.zzeke r0) {
            com.google.android.gms.common.util.Clock r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.LinkedHashMap zzh(com.google.android.gms.internal.ads.zzeke r0) {
            java.util.LinkedHashMap r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zzn(com.google.android.gms.internal.ads.zzeke r0) {
            boolean r0 = r0.zze
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zzo(com.google.android.gms.internal.ads.zzeke r0) {
            boolean r0 = r0.zzg
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zzp(com.google.android.gms.internal.ads.zzeke r0, com.google.android.gms.internal.ads.zzfgh r1) {
            boolean r0 = r0.zzq(r1)
            return r0
    }

    private final synchronized boolean zzq(com.google.android.gms.internal.ads.zzfgh r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.LinkedHashMap r0 = r2.zzd     // Catch: java.lang.Throwable -> L19
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L19
            com.google.android.gms.internal.ads.zzekd r3 = (com.google.android.gms.internal.ads.zzekd) r3     // Catch: java.lang.Throwable -> L19
            r0 = 0
            if (r3 != 0) goto Le
            monitor-exit(r2)
            return r0
        Le:
            int r3 = r3.zzc     // Catch: java.lang.Throwable -> L19
            r1 = 8
            if (r3 != r1) goto L17
            r3 = 1
            monitor-exit(r2)
            return r3
        L17:
            monitor-exit(r2)
            return r0
        L19:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final synchronized long zza() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.zzh     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    final synchronized com.google.common.util.concurrent.ListenableFuture zzf(com.google.android.gms.internal.ads.zzfgt r20, com.google.android.gms.internal.ads.zzfgh r21, com.google.common.util.concurrent.ListenableFuture r22, com.google.android.gms.internal.ads.zzfnc r23) {
            r19 = this;
            r10 = r19
            r0 = r21
            r11 = r22
            monitor-enter(r19)
            r9 = r20
            com.google.android.gms.internal.ads.zzfgs r1 = r9.zzb     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.internal.ads.zzfgk r5 = r1.zzb     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.common.util.Clock r1 = r10.zza     // Catch: java.lang.Throwable -> L40
            long r3 = r1.elapsedRealtime()     // Catch: java.lang.Throwable -> L40
            java.lang.String r7 = r0.zzw     // Catch: java.lang.Throwable -> L40
            if (r7 == 0) goto L3e
            java.util.LinkedHashMap r1 = r10.zzd     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.internal.ads.zzekd r2 = new com.google.android.gms.internal.ads.zzekd     // Catch: java.lang.Throwable -> L40
            java.lang.String r14 = r0.zzaf     // Catch: java.lang.Throwable -> L40
            r15 = 9
            r16 = 0
            r18 = 0
            r12 = r2
            r13 = r7
            r12.<init>(r13, r14, r15, r16, r18)     // Catch: java.lang.Throwable -> L40
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.internal.ads.zzekc r12 = new com.google.android.gms.internal.ads.zzekc     // Catch: java.lang.Throwable -> L40
            r1 = r12
            r2 = r19
            r6 = r21
            r8 = r23
            r9 = r20
            r1.<init>(r2, r3, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zzf     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.internal.ads.zzgfo.zzr(r11, r12, r0)     // Catch: java.lang.Throwable -> L40
        L3e:
            monitor-exit(r19)
            return r11
        L40:
            r0 = move-exception
            monitor-exit(r19)
            throw r0
    }

    public final synchronized java.lang.String zzg() {
            r5 = this;
            monitor-enter(r5)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L39
            r0.<init>()     // Catch: java.lang.Throwable -> L39
            java.util.LinkedHashMap r1 = r5.zzd     // Catch: java.lang.Throwable -> L39
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L39
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L39
        L10:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L39
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L39
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzekd r2 = (com.google.android.gms.internal.ads.zzekd) r2     // Catch: java.lang.Throwable -> L39
            int r3 = r2.zzc     // Catch: java.lang.Throwable -> L39
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r4) goto L10
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L39
            r0.add(r2)     // Catch: java.lang.Throwable -> L39
            goto L10
        L31:
            java.lang.String r1 = "_"
            java.lang.String r0 = android.text.TextUtils.join(r1, r0)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r5)
            return r0
        L39:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    public final synchronized void zzi(com.google.android.gms.internal.ads.zzfgh r5) {
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.common.util.Clock r0 = r4.zza     // Catch: java.lang.Throwable -> L18
            long r0 = r0.elapsedRealtime()     // Catch: java.lang.Throwable -> L18
            long r2 = r4.zzi     // Catch: java.lang.Throwable -> L18
            long r0 = r0 - r2
            r4.zzh = r0     // Catch: java.lang.Throwable -> L18
            if (r5 == 0) goto L13
            com.google.android.gms.internal.ads.zzegp r0 = r4.zzf     // Catch: java.lang.Throwable -> L18
            r0.zze(r5)     // Catch: java.lang.Throwable -> L18
        L13:
            r5 = 1
            r4.zzg = r5     // Catch: java.lang.Throwable -> L18
            monitor-exit(r4)
            return
        L18:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    public final synchronized void zzj() {
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.common.util.Clock r0 = r4.zza     // Catch: java.lang.Throwable -> Le
            long r0 = r0.elapsedRealtime()     // Catch: java.lang.Throwable -> Le
            long r2 = r4.zzi     // Catch: java.lang.Throwable -> Le
            long r0 = r0 - r2
            r4.zzh = r0     // Catch: java.lang.Throwable -> Le
            monitor-exit(r4)
            return
        Le:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    public final synchronized void zzk(java.util.List r11) {
            r10 = this;
            monitor-enter(r10)
            com.google.android.gms.common.util.Clock r0 = r10.zza     // Catch: java.lang.Throwable -> L39
            long r0 = r0.elapsedRealtime()     // Catch: java.lang.Throwable -> L39
            r10.zzi = r0     // Catch: java.lang.Throwable -> L39
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L39
        Ld:
            boolean r0 = r11.hasNext()     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L37
            java.lang.Object r0 = r11.next()     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzfgh r0 = (com.google.android.gms.internal.ads.zzfgh) r0     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = r0.zzw     // Catch: java.lang.Throwable -> L39
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L39
            if (r1 != 0) goto Ld
            java.util.LinkedHashMap r1 = r10.zzd     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzekd r9 = new com.google.android.gms.internal.ads.zzekd     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = r0.zzw     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = r0.zzaf     // Catch: java.lang.Throwable -> L39
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = 0
            r8 = 0
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L39
            r1.put(r0, r9)     // Catch: java.lang.Throwable -> L39
            goto Ld
        L37:
            monitor-exit(r10)
            return
        L39:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
    }

    public final synchronized void zzl() {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.common.util.Clock r0 = r2.zza     // Catch: java.lang.Throwable -> Lb
            long r0 = r0.elapsedRealtime()     // Catch: java.lang.Throwable -> Lb
            r2.zzi = r0     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final synchronized void zzm(com.google.android.gms.internal.ads.zzfgh r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.LinkedHashMap r0 = r1.zzd     // Catch: java.lang.Throwable -> L17
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.internal.ads.zzekd r2 = (com.google.android.gms.internal.ads.zzekd) r2     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L15
            boolean r0 = r1.zzg     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L15
            r0 = 8
            r2.zzc = r0     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            return
        L15:
            monitor-exit(r1)
            return
        L17:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
