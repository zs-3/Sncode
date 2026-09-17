package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcah implements com.google.android.gms.internal.ads.zzazo {
    final com.google.android.gms.internal.ads.zzcae zza;
    final java.util.HashSet zzb;
    final java.util.HashSet zzc;
    private final java.lang.Object zzd;
    private final com.google.android.gms.ads.internal.util.zzg zze;
    private final com.google.android.gms.internal.ads.zzcaf zzf;
    private boolean zzg;

    public zzcah(java.lang.String r2, com.google.android.gms.ads.internal.util.zzg r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zzd = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.zzb = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.zzc = r0
            r0 = 0
            r1.zzg = r0
            com.google.android.gms.internal.ads.zzcae r0 = new com.google.android.gms.internal.ads.zzcae
            r0.<init>(r2, r3)
            r1.zza = r0
            r1.zze = r3
            com.google.android.gms.internal.ads.zzcaf r2 = new com.google.android.gms.internal.ads.zzcaf
            r2.<init>()
            r1.zzf = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzazo
    public final void zza(boolean r5) {
            r4 = this;
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()
            long r0 = r0.currentTimeMillis()
            if (r5 == 0) goto L39
            com.google.android.gms.ads.internal.util.zzg r5 = r4.zze
            long r2 = r5.zzd()
            long r0 = r0 - r2
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzaX
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r2.zza(r5)
            java.lang.Long r5 = (java.lang.Long) r5
            long r2 = r5.longValue()
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L2b
            com.google.android.gms.internal.ads.zzcae r5 = r4.zza
            r0 = -1
            r5.zzd = r0
            goto L35
        L2b:
            com.google.android.gms.internal.ads.zzcae r5 = r4.zza
            com.google.android.gms.ads.internal.util.zzg r0 = r4.zze
            int r0 = r0.zzc()
            r5.zzd = r0
        L35:
            r5 = 1
            r4.zzg = r5
            return
        L39:
            com.google.android.gms.ads.internal.util.zzg r5 = r4.zze
            r5.zzu(r0)
            com.google.android.gms.ads.internal.util.zzg r5 = r4.zze
            com.google.android.gms.internal.ads.zzcae r0 = r4.zza
            int r0 = r0.zzd
            r5.zzL(r0)
            return
    }

    public final int zzb() {
            r2 = this;
            java.lang.Object r0 = r2.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzcae r1 = r2.zza     // Catch: java.lang.Throwable -> Lb
            int r1 = r1.zza()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    public final com.google.android.gms.internal.ads.zzbzw zzc(com.google.android.gms.common.util.Clock r3, java.lang.String r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzcaf r0 = r2.zzf
            com.google.android.gms.internal.ads.zzbzw r1 = new com.google.android.gms.internal.ads.zzbzw
            java.lang.String r0 = r0.zza()
            r1.<init>(r3, r2, r0, r4)
            return r1
    }

    public final java.lang.String zzd() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcaf r0 = r1.zzf
            java.lang.String r0 = r0.zzb()
            return r0
    }

    public final void zze(com.google.android.gms.internal.ads.zzbzw r3) {
            r2 = this;
            java.lang.Object r0 = r2.zzd
            monitor-enter(r0)
            java.util.HashSet r1 = r2.zzb     // Catch: java.lang.Throwable -> La
            r1.add(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    public final void zzf() {
            r2 = this;
            java.lang.Object r0 = r2.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzcae r1 = r2.zza     // Catch: java.lang.Throwable -> La
            r1.zzc()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    public final void zzg() {
            r2 = this;
            java.lang.Object r0 = r2.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzcae r1 = r2.zza     // Catch: java.lang.Throwable -> La
            r1.zzd()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    public final void zzh() {
            r2 = this;
            java.lang.Object r0 = r2.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzcae r1 = r2.zza     // Catch: java.lang.Throwable -> La
            r1.zze()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    public final void zzi() {
            r2 = this;
            java.lang.Object r0 = r2.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzcae r1 = r2.zza     // Catch: java.lang.Throwable -> La
            r1.zzf()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    public final void zzj(com.google.android.gms.ads.internal.client.zzm r3, long r4) {
            r2 = this;
            java.lang.Object r0 = r2.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzcae r1 = r2.zza     // Catch: java.lang.Throwable -> La
            r1.zzg(r3, r4)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    public final void zzk() {
            r2 = this;
            java.lang.Object r0 = r2.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzcae r1 = r2.zza     // Catch: java.lang.Throwable -> La
            r1.zzh()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    public final void zzl(java.util.HashSet r3) {
            r2 = this;
            java.lang.Object r0 = r2.zzd
            monitor-enter(r0)
            java.util.HashSet r1 = r2.zzb     // Catch: java.lang.Throwable -> La
            r1.addAll(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    public final boolean zzm() {
            r1 = this;
            boolean r0 = r1.zzg
            return r0
    }

    public final android.os.Bundle zzn(android.content.Context r5, com.google.android.gms.internal.ads.zzfik r6) {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.lang.Object r1 = r4.zzd
            monitor-enter(r1)
            java.util.HashSet r2 = r4.zzb     // Catch: java.lang.Throwable -> L6d
            r0.addAll(r2)     // Catch: java.lang.Throwable -> L6d
            java.util.HashSet r2 = r4.zzb     // Catch: java.lang.Throwable -> L6d
            r2.clear()     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6d
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            com.google.android.gms.internal.ads.zzcae r2 = r4.zza
            com.google.android.gms.internal.ads.zzcaf r3 = r4.zzf
            java.lang.String r3 = r3.zzb()
            android.os.Bundle r5 = r2.zzb(r5, r3)
            java.lang.String r2 = "app"
            r1.putBundle(r2, r5)
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.util.HashSet r2 = r4.zzc
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L65
            java.lang.String r2 = "slots"
            r1.putBundle(r2, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r0.iterator()
        L48:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5c
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.ads.zzbzw r3 = (com.google.android.gms.internal.ads.zzbzw) r3
            android.os.Bundle r3 = r3.zza()
            r5.add(r3)
            goto L48
        L5c:
            java.lang.String r2 = "ads"
            r1.putParcelableArrayList(r2, r5)
            r6.zzc(r0)
            return r1
        L65:
            java.lang.Object r5 = r2.next()
            com.google.android.gms.internal.ads.zzcag r5 = (com.google.android.gms.internal.ads.zzcag) r5
            r5 = 0
            throw r5
        L6d:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6d
            throw r5
    }
}
