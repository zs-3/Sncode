package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcsr implements com.google.android.gms.internal.ads.zzczo, com.google.android.gms.internal.ads.zzcyu {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzcfo zzb;
    private final com.google.android.gms.internal.ads.zzfgh zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;
    private com.google.android.gms.internal.ads.zzegf zze;
    private boolean zzf;
    private final com.google.android.gms.internal.ads.zzegd zzg;

    public zzcsr(android.content.Context r1, com.google.android.gms.internal.ads.zzcfo r2, com.google.android.gms.internal.ads.zzfgh r3, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4, com.google.android.gms.internal.ads.zzegd r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zzg = r5
            return
    }

    private final synchronized void zza() {
            r12 = this;
            monitor-enter(r12)
            com.google.android.gms.internal.ads.zzfgh r0 = r12.zzc     // Catch: java.lang.Throwable -> Le2
            boolean r0 = r0.zzT     // Catch: java.lang.Throwable -> Le2
            if (r0 != 0) goto L9
            goto Le0
        L9:
            com.google.android.gms.internal.ads.zzcfo r0 = r12.zzb     // Catch: java.lang.Throwable -> Le2
            if (r0 == 0) goto Le0
            android.content.Context r0 = r12.zza     // Catch: java.lang.Throwable -> Le2
            com.google.android.gms.internal.ads.zzega r1 = com.google.android.gms.ads.internal.zzu.zzA()     // Catch: java.lang.Throwable -> Le2
            boolean r0 = r1.zzl(r0)     // Catch: java.lang.Throwable -> Le2
            if (r0 == 0) goto Le0
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r12.zzd     // Catch: java.lang.Throwable -> Le2
            int r1 = r0.buddyApkVersion     // Catch: java.lang.Throwable -> Le2
            int r0 = r0.clientJarVersion     // Catch: java.lang.Throwable -> Le2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le2
            r2.<init>()     // Catch: java.lang.Throwable -> Le2
            r2.append(r1)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r1 = "."
            r2.append(r1)     // Catch: java.lang.Throwable -> Le2
            r2.append(r0)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> Le2
            com.google.android.gms.internal.ads.zzfgh r0 = r12.zzc     // Catch: java.lang.Throwable -> Le2
            com.google.android.gms.internal.ads.zzfhf r0 = r0.zzV     // Catch: java.lang.Throwable -> Le2
            java.lang.String r8 = r0.zza()     // Catch: java.lang.Throwable -> Le2
            int r0 = r0.zzc()     // Catch: java.lang.Throwable -> Le2
            r1 = 1
            if (r0 != r1) goto L49
            com.google.android.gms.internal.ads.zzegb r0 = com.google.android.gms.internal.ads.zzegb.zzc     // Catch: java.lang.Throwable -> Le2
            com.google.android.gms.internal.ads.zzegc r2 = com.google.android.gms.internal.ads.zzegc.zzb     // Catch: java.lang.Throwable -> Le2
            r10 = r0
            r9 = r2
            goto L58
        L49:
            com.google.android.gms.internal.ads.zzfgh r0 = r12.zzc     // Catch: java.lang.Throwable -> Le2
            com.google.android.gms.internal.ads.zzegb r2 = com.google.android.gms.internal.ads.zzegb.zza     // Catch: java.lang.Throwable -> Le2
            int r0 = r0.zze     // Catch: java.lang.Throwable -> Le2
            if (r0 != r1) goto L54
            com.google.android.gms.internal.ads.zzegc r0 = com.google.android.gms.internal.ads.zzegc.zzc     // Catch: java.lang.Throwable -> Le2
            goto L56
        L54:
            com.google.android.gms.internal.ads.zzegc r0 = com.google.android.gms.internal.ads.zzegc.zza     // Catch: java.lang.Throwable -> Le2
        L56:
            r9 = r0
            r10 = r2
        L58:
            com.google.android.gms.internal.ads.zzcfo r0 = r12.zzb     // Catch: java.lang.Throwable -> Le2
            com.google.android.gms.internal.ads.zzfgh r2 = r12.zzc     // Catch: java.lang.Throwable -> Le2
            com.google.android.gms.internal.ads.zzega r3 = com.google.android.gms.ads.internal.zzu.zzA()     // Catch: java.lang.Throwable -> Le2
            android.webkit.WebView r5 = r0.zzG()     // Catch: java.lang.Throwable -> Le2
            java.lang.String r11 = r2.zzal     // Catch: java.lang.Throwable -> Le2
            java.lang.String r6 = ""
            java.lang.String r7 = "javascript"
            com.google.android.gms.internal.ads.zzegf r0 = r3.zza(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Le2
            r12.zze = r0     // Catch: java.lang.Throwable -> Le2
            com.google.android.gms.internal.ads.zzcfo r0 = r12.zzb     // Catch: java.lang.Throwable -> Le2
            android.view.View r0 = r0.zzF()     // Catch: java.lang.Throwable -> Le2
            com.google.android.gms.internal.ads.zzegf r2 = r12.zze     // Catch: java.lang.Throwable -> Le2
            if (r2 == 0) goto Le0
            com.google.android.gms.internal.ads.zzfoi r2 = r2.zza()     // Catch: java.lang.Throwable -> Le2
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzeW     // Catch: java.lang.Throwable -> Le2
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> Le2
            java.lang.Object r3 = r4.zza(r3)     // Catch: java.lang.Throwable -> Le2
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> Le2
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> Le2
            if (r3 == 0) goto Lbb
            com.google.android.gms.internal.ads.zzcfo r0 = r12.zzb     // Catch: java.lang.Throwable -> Le2
            com.google.android.gms.internal.ads.zzega r3 = com.google.android.gms.ads.internal.zzu.zzA()     // Catch: java.lang.Throwable -> Le2
            android.webkit.WebView r0 = r0.zzG()     // Catch: java.lang.Throwable -> Le2
            r3.zzj(r2, r0)     // Catch: java.lang.Throwable -> Le2
            com.google.android.gms.internal.ads.zzcfo r0 = r12.zzb     // Catch: java.lang.Throwable -> Le2
            java.util.List r0 = r0.zzV()     // Catch: java.lang.Throwable -> Le2
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Le2
        La7:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> Le2
            if (r3 == 0) goto Lc2
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> Le2
            android.view.View r3 = (android.view.View) r3     // Catch: java.lang.Throwable -> Le2
            com.google.android.gms.internal.ads.zzega r4 = com.google.android.gms.ads.internal.zzu.zzA()     // Catch: java.lang.Throwable -> Le2
            r4.zzg(r2, r3)     // Catch: java.lang.Throwable -> Le2
            goto La7
        Lbb:
            com.google.android.gms.internal.ads.zzega r3 = com.google.android.gms.ads.internal.zzu.zzA()     // Catch: java.lang.Throwable -> Le2
            r3.zzj(r2, r0)     // Catch: java.lang.Throwable -> Le2
        Lc2:
            com.google.android.gms.internal.ads.zzcfo r0 = r12.zzb     // Catch: java.lang.Throwable -> Le2
            com.google.android.gms.internal.ads.zzegf r3 = r12.zze     // Catch: java.lang.Throwable -> Le2
            r0.zzat(r3)     // Catch: java.lang.Throwable -> Le2
            com.google.android.gms.internal.ads.zzega r0 = com.google.android.gms.ads.internal.zzu.zzA()     // Catch: java.lang.Throwable -> Le2
            r0.zzk(r2)     // Catch: java.lang.Throwable -> Le2
            r12.zzf = r1     // Catch: java.lang.Throwable -> Le2
            com.google.android.gms.internal.ads.zzcfo r0 = r12.zzb     // Catch: java.lang.Throwable -> Le2
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap     // Catch: java.lang.Throwable -> Le2
            r1.<init>()     // Catch: java.lang.Throwable -> Le2
            java.lang.String r2 = "onSdkLoaded"
            r0.zzd(r2, r1)     // Catch: java.lang.Throwable -> Le2
            monitor-exit(r12)
            return
        Le0:
            monitor-exit(r12)
            return
        Le2:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
    }

    private final boolean zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeX
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1c
            com.google.android.gms.internal.ads.zzegd r0 = r2.zzg
            boolean r0 = r0.zzd()
            if (r0 == 0) goto L1c
            r0 = 1
            return r0
        L1c:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final synchronized void zzr() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzb()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto Le
            com.google.android.gms.internal.ads.zzegd r0 = r3.zzg     // Catch: java.lang.Throwable -> L31
            r0.zzb()     // Catch: java.lang.Throwable -> L31
            monitor-exit(r3)
            return
        Le:
            boolean r0 = r3.zzf     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L15
            r3.zza()     // Catch: java.lang.Throwable -> L31
        L15:
            com.google.android.gms.internal.ads.zzfgh r0 = r3.zzc     // Catch: java.lang.Throwable -> L31
            boolean r0 = r0.zzT     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2f
            com.google.android.gms.internal.ads.zzegf r0 = r3.zze     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2f
            com.google.android.gms.internal.ads.zzcfo r0 = r3.zzb     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2f
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap     // Catch: java.lang.Throwable -> L31
            r1.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = "onSdkImpression"
            r0.zzd(r2, r1)     // Catch: java.lang.Throwable -> L31
            monitor-exit(r3)
            return
        L2f:
            monitor-exit(r3)
            return
        L31:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final synchronized void zzs() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzb()     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto Le
            com.google.android.gms.internal.ads.zzegd r0 = r1.zzg     // Catch: java.lang.Throwable -> L19
            r0.zzc()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r1)
            return
        Le:
            boolean r0 = r1.zzf     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L14
            monitor-exit(r1)
            return
        L14:
            r1.zza()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r1)
            return
        L19:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
