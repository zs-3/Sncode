package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzelg implements com.google.android.gms.internal.ads.zzdik {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdre zzb;
    private final com.google.android.gms.internal.ads.zzfhc zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;
    private final com.google.android.gms.internal.ads.zzfgh zze;
    private final com.google.common.util.concurrent.ListenableFuture zzf;
    private final com.google.android.gms.internal.ads.zzcfo zzg;
    private final com.google.android.gms.internal.ads.zzbjz zzh;
    private final boolean zzi;
    private final com.google.android.gms.internal.ads.zzefj zzj;
    private final com.google.android.gms.internal.ads.zzdty zzk;

    zzelg(android.content.Context r1, com.google.android.gms.internal.ads.zzdre r2, com.google.android.gms.internal.ads.zzfhc r3, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4, com.google.android.gms.internal.ads.zzfgh r5, com.google.common.util.concurrent.ListenableFuture r6, com.google.android.gms.internal.ads.zzcfo r7, com.google.android.gms.internal.ads.zzbjz r8, boolean r9, com.google.android.gms.internal.ads.zzefj r10, com.google.android.gms.internal.ads.zzdty r11) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            r0.zzh = r8
            r0.zzi = r9
            r0.zzj = r10
            r0.zzk = r11
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zza(boolean r22, android.content.Context r23, com.google.android.gms.internal.ads.zzcyn r24) {
            r21 = this;
            r1 = r21
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzf
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzgfo.zzq(r0)
            com.google.android.gms.internal.ads.zzdqj r0 = (com.google.android.gms.internal.ads.zzdqj) r0
            com.google.android.gms.internal.ads.zzfgh r2 = r1.zze     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            com.google.android.gms.internal.ads.zzcfo r3 = r1.zzg     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            boolean r3 = r3.zzaG()     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L1a
            com.google.android.gms.internal.ads.zzcfo r2 = r1.zzg     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
        L18:
            r11 = r2
            goto L85
        L1a:
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzaR     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            java.lang.Object r3 = r6.zza(r3)     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            boolean r3 = r3.booleanValue()     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            if (r3 != 0) goto L2f
            com.google.android.gms.internal.ads.zzcfo r2 = r1.zzg     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            goto L18
        L2f:
            com.google.android.gms.internal.ads.zzdre r3 = r1.zzb     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            com.google.android.gms.internal.ads.zzfhc r6 = r1.zzc     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            com.google.android.gms.ads.internal.client.zzs r6 = r6.zze     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            com.google.android.gms.internal.ads.zzcfo r3 = r3.zza(r6, r5, r5)     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            com.google.android.gms.internal.ads.zzdgj r6 = r0.zzg()     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            com.google.android.gms.internal.ads.zzbko.zzb(r3, r6)     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            com.google.android.gms.internal.ads.zzdri r6 = new com.google.android.gms.internal.ads.zzdri     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            r6.<init>()     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            android.content.Context r7 = r1.zza     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            android.view.View r8 = r3.zzF()     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            r6.zza(r7, r8)     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            com.google.android.gms.internal.ads.zzdrd r7 = r0.zzl()     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            boolean r8 = r1.zzi     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            if (r8 == 0) goto L59
            com.google.android.gms.internal.ads.zzbjz r8 = r1.zzh     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            goto L5a
        L59:
            r8 = r5
        L5a:
            com.google.android.gms.internal.ads.zzdty r9 = r1.zzk     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            android.os.Bundle r9 = r9.zza()     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            r7.zzi(r3, r4, r8, r9)     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            com.google.android.gms.internal.ads.zzchg r7 = r3.zzN()     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            com.google.android.gms.internal.ads.zzele r8 = new com.google.android.gms.internal.ads.zzele     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            r8.<init>(r6, r3)     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            r7.zzB(r8)     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            com.google.android.gms.internal.ads.zzchg r6 = r3.zzN()     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            com.google.android.gms.internal.ads.zzelf r7 = new com.google.android.gms.internal.ads.zzelf     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            r7.<init>(r3)     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            r6.zzH(r7)     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            com.google.android.gms.internal.ads.zzfgm r2 = r2.zzs     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            java.lang.String r6 = r2.zzb     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            java.lang.String r2 = r2.zza     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            r3.zzae(r6, r2, r5)     // Catch: com.google.android.gms.internal.ads.zzcga -> L10e
            r11 = r3
        L85:
            r11.zzaq(r4)
            boolean r2 = r1.zzi
            com.google.android.gms.ads.internal.zzk r3 = new com.google.android.gms.ads.internal.zzk
            r6 = 0
            if (r2 == 0) goto L97
            com.google.android.gms.internal.ads.zzbjz r2 = r1.zzh
            boolean r2 = r2.zze(r6)
            r13 = r2
            goto L98
        L97:
            r13 = 0
        L98:
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r2 = r1.zza
            boolean r7 = r1.zzi
            boolean r14 = com.google.android.gms.ads.internal.util.zzt.zzI(r2)
            if (r7 == 0) goto Lad
            com.google.android.gms.internal.ads.zzbjz r2 = r1.zzh
            boolean r2 = r2.zzd()
            r15 = r2
            goto Lae
        Lad:
            r15 = 0
        Lae:
            boolean r2 = r1.zzi
            if (r2 == 0) goto Lbb
            com.google.android.gms.internal.ads.zzbjz r2 = r1.zzh
            float r2 = r2.zza()
            r16 = r2
            goto Lbe
        Lbb:
            r2 = 0
            r16 = 0
        Lbe:
            com.google.android.gms.internal.ads.zzfgh r2 = r1.zze
            r17 = -1
            boolean r6 = r2.zzO
            boolean r2 = r2.zzP
            r12 = r3
            r18 = r22
            r19 = r6
            r20 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            if (r24 == 0) goto Ld5
            r24.zzf()
        Ld5:
            com.google.android.gms.ads.internal.zzu.zzi()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            com.google.android.gms.internal.ads.zzdhz r9 = r0.zzh()
            com.google.android.gms.internal.ads.zzfgh r0 = r1.zze
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r13 = r1.zzd
            int r12 = r0.zzQ
            java.lang.String r14 = r0.zzB
            com.google.android.gms.internal.ads.zzfgm r6 = r0.zzs
            java.lang.String r15 = r6.zzb
            java.lang.String r6 = r6.zza
            com.google.android.gms.internal.ads.zzfhc r7 = r1.zzc
            boolean r0 = r0.zzai
            if (r0 == 0) goto Lf4
            com.google.android.gms.internal.ads.zzefj r5 = r1.zzj
        Lf4:
            r20 = r5
            r8 = 0
            r10 = 0
            java.lang.String r0 = r7.zzf
            r7 = r2
            r5 = r15
            r15 = r3
            r16 = r5
            r17 = r6
            r18 = r0
            r19 = r24
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0 = r23
            com.google.android.gms.ads.internal.overlay.zzn.zza(r0, r2, r4)
            return
        L10e:
            r0 = move-exception
            java.lang.String r2 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r0)
            return
    }
}
