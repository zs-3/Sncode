package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdz {
    private final com.google.android.gms.internal.ads.zzdj zza;
    private final com.google.android.gms.internal.ads.zzdt zzb;
    private final com.google.android.gms.internal.ads.zzdx zzc;
    private final java.util.concurrent.CopyOnWriteArraySet zzd;
    private final java.util.ArrayDeque zze;
    private final java.util.ArrayDeque zzf;
    private final java.lang.Object zzg;
    private boolean zzh;
    private boolean zzi;

    public zzdz(android.os.Looper r7, com.google.android.gms.internal.ads.zzdj r8, com.google.android.gms.internal.ads.zzdx r9) {
            r6 = this;
            java.util.concurrent.CopyOnWriteArraySet r1 = new java.util.concurrent.CopyOnWriteArraySet
            r1.<init>()
            r5 = 1
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private zzdz(java.util.concurrent.CopyOnWriteArraySet r1, android.os.Looper r2, com.google.android.gms.internal.ads.zzdj r3, com.google.android.gms.internal.ads.zzdx r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r3
            r0.zzd = r1
            r0.zzc = r4
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.zzg = r1
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.zze = r1
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.zzf = r1
            com.google.android.gms.internal.ads.zzdu r1 = new com.google.android.gms.internal.ads.zzdu
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zzdt r1 = r3.zzd(r2, r1)
            r0.zzb = r1
            r0.zzi = r5
            return
    }

    public static /* synthetic */ boolean zzg(com.google.android.gms.internal.ads.zzdz r3, android.os.Message r4) {
            java.util.concurrent.CopyOnWriteArraySet r4 = r3.zzd
            java.util.Iterator r4 = r4.iterator()
        L6:
            boolean r0 = r4.hasNext()
            r1 = 1
            if (r0 == 0) goto L20
            java.lang.Object r0 = r4.next()
            com.google.android.gms.internal.ads.zzdy r0 = (com.google.android.gms.internal.ads.zzdy) r0
            com.google.android.gms.internal.ads.zzdx r2 = r3.zzc
            r0.zzb(r2)
            com.google.android.gms.internal.ads.zzdt r0 = r3.zzb
            boolean r0 = r0.zzg(r1)
            if (r0 == 0) goto L6
        L20:
            return r1
    }

    private final void zzh() {
            r2 = this;
            boolean r0 = r2.zzi
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.gms.internal.ads.zzdt r0 = r2.zzb
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            android.os.Looper r0 = r0.zza()
            java.lang.Thread r0 = r0.getThread()
            if (r1 != r0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            return
    }

    public final com.google.android.gms.internal.ads.zzdz zza(android.os.Looper r8, com.google.android.gms.internal.ads.zzdx r9) {
            r7 = this;
            com.google.android.gms.internal.ads.zzdz r6 = new com.google.android.gms.internal.ads.zzdz
            boolean r5 = r7.zzi
            java.util.concurrent.CopyOnWriteArraySet r1 = r7.zzd
            com.google.android.gms.internal.ads.zzdj r3 = r7.zza
            r0 = r6
            r2 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public final void zzb(java.lang.Object r4) {
            r3 = this;
            java.lang.Object r0 = r3.zzg
            monitor-enter(r0)
            boolean r1 = r3.zzh     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L9:
            java.util.concurrent.CopyOnWriteArraySet r1 = r3.zzd     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.internal.ads.zzdy r2 = new com.google.android.gms.internal.ads.zzdy     // Catch: java.lang.Throwable -> L15
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L15
            r1.add(r2)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r4
    }

    public final void zzc() {
            r3 = this;
            r3.zzh()
            java.util.ArrayDeque r0 = r3.zzf
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc
            goto L4c
        Lc:
            com.google.android.gms.internal.ads.zzdt r0 = r3.zzb
            r1 = 1
            boolean r0 = r0.zzg(r1)
            if (r0 != 0) goto L1e
            com.google.android.gms.internal.ads.zzdt r0 = r3.zzb
            com.google.android.gms.internal.ads.zzds r2 = r0.zzb(r1)
            r0.zzk(r2)
        L1e:
            java.util.ArrayDeque r0 = r3.zze
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r1
            java.util.ArrayDeque r1 = r3.zze
            java.util.ArrayDeque r2 = r3.zzf
            r1.addAll(r2)
            java.util.ArrayDeque r1 = r3.zzf
            r1.clear()
            if (r0 != 0) goto L4c
        L33:
            java.util.ArrayDeque r0 = r3.zze
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4c
            java.util.ArrayDeque r0 = r3.zze
            java.lang.Object r0 = r0.peekFirst()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            java.util.ArrayDeque r0 = r3.zze
            r0.removeFirst()
            goto L33
        L4c:
            return
    }

    public final void zzd(int r3, com.google.android.gms.internal.ads.zzdw r4) {
            r2 = this;
            r2.zzh()
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            java.util.concurrent.CopyOnWriteArraySet r1 = r2.zzd
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzdv r1 = new com.google.android.gms.internal.ads.zzdv
            r1.<init>(r0, r3, r4)
            java.util.ArrayDeque r3 = r2.zzf
            r3.add(r1)
            return
    }

    public final void zze() {
            r3 = this;
            r3.zzh()
            java.lang.Object r0 = r3.zzg
            monitor-enter(r0)
            r1 = 1
            r3.zzh = r1     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            java.util.concurrent.CopyOnWriteArraySet r0 = r3.zzd
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzdy r1 = (com.google.android.gms.internal.ads.zzdy) r1
            com.google.android.gms.internal.ads.zzdx r2 = r3.zzc
            r1.zzc(r2)
            goto L10
        L22:
            java.util.concurrent.CopyOnWriteArraySet r0 = r3.zzd
            r0.clear()
            return
        L28:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r1
    }

    public final void zzf(java.lang.Object r4) {
            r3 = this;
            r3.zzh()
            java.util.concurrent.CopyOnWriteArraySet r0 = r3.zzd
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzdy r1 = (com.google.android.gms.internal.ads.zzdy) r1
            java.lang.Object r2 = r1.zza
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L9
            com.google.android.gms.internal.ads.zzdx r2 = r3.zzc
            r1.zzc(r2)
            java.util.concurrent.CopyOnWriteArraySet r2 = r3.zzd
            r2.remove(r1)
            goto L9
        L28:
            return
    }
}
