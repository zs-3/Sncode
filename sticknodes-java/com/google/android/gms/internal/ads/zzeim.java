package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzeim implements com.google.android.gms.internal.ads.zzdik {
    private final android.content.Context zza;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzb;
    private final com.google.common.util.concurrent.ListenableFuture zzc;
    private final com.google.android.gms.internal.ads.zzfgh zzd;
    private final com.google.android.gms.internal.ads.zzcfo zze;
    private final com.google.android.gms.internal.ads.zzfhc zzf;
    private final com.google.android.gms.internal.ads.zzbjz zzg;
    private final boolean zzh;
    private final com.google.android.gms.internal.ads.zzefj zzi;

    zzeim(android.content.Context r1, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2, com.google.common.util.concurrent.ListenableFuture r3, com.google.android.gms.internal.ads.zzfgh r4, com.google.android.gms.internal.ads.zzcfo r5, com.google.android.gms.internal.ads.zzfhc r6, boolean r7, com.google.android.gms.internal.ads.zzbjz r8, com.google.android.gms.internal.ads.zzefj r9) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r8
            r0.zzh = r7
            r0.zzi = r9
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zza(boolean r19, android.content.Context r20, com.google.android.gms.internal.ads.zzcyn r21) {
            r18 = this;
            r0 = r18
            com.google.common.util.concurrent.ListenableFuture r1 = r0.zzc
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzgfo.zzq(r1)
            com.google.android.gms.internal.ads.zzdgz r1 = (com.google.android.gms.internal.ads.zzdgz) r1
            com.google.android.gms.internal.ads.zzcfo r2 = r0.zze
            r3 = 1
            r2.zzaq(r3)
            com.google.android.gms.ads.internal.zzk r2 = new com.google.android.gms.ads.internal.zzk
            boolean r4 = r0.zzh
            r5 = 0
            if (r4 == 0) goto L1f
            com.google.android.gms.internal.ads.zzbjz r4 = r0.zzg
            boolean r4 = r4.zze(r5)
            r6 = r4
            goto L20
        L1f:
            r6 = 0
        L20:
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r4 = r0.zza
            boolean r7 = r0.zzh
            boolean r8 = com.google.android.gms.ads.internal.util.zzt.zzI(r4)
            if (r7 == 0) goto L35
            com.google.android.gms.internal.ads.zzbjz r4 = r0.zzg
            boolean r4 = r4.zzd()
            r7 = r4
            goto L36
        L35:
            r7 = 0
        L36:
            boolean r4 = r0.zzh
            if (r4 == 0) goto L42
            com.google.android.gms.internal.ads.zzbjz r4 = r0.zzg
            float r4 = r4.zza()
            r9 = r4
            goto L44
        L42:
            r4 = 0
            r9 = 0
        L44:
            r10 = -1
            com.google.android.gms.internal.ads.zzfgh r4 = r0.zzd
            boolean r11 = r4.zzO
            r12 = 0
            r4 = r2
            r5 = r6
            r6 = r8
            r8 = r9
            r9 = r10
            r10 = r19
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r21 == 0) goto L59
            r21.zzf()
        L59:
            com.google.android.gms.ads.internal.zzu.zzi()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r15 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            com.google.android.gms.internal.ads.zzdhz r6 = r1.zzh()
            com.google.android.gms.internal.ads.zzcfo r8 = r0.zze
            com.google.android.gms.internal.ads.zzfgh r1 = r0.zzd
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r10 = r0.zzb
            int r9 = r1.zzQ
            java.lang.String r11 = r1.zzB
            com.google.android.gms.internal.ads.zzfgm r4 = r1.zzs
            java.lang.String r13 = r4.zzb
            java.lang.String r14 = r4.zza
            com.google.android.gms.internal.ads.zzfhc r4 = r0.zzf
            boolean r1 = r1.zzai
            if (r1 == 0) goto L7b
            com.google.android.gms.internal.ads.zzefj r1 = r0.zzi
            goto L7c
        L7b:
            r1 = 0
        L7c:
            r17 = r1
            r5 = 0
            r7 = 0
            java.lang.String r1 = r4.zzf
            r4 = r15
            r12 = r2
            r2 = r15
            r15 = r1
            r16 = r21
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r20
            com.google.android.gms.ads.internal.overlay.zzn.zza(r1, r2, r3)
            return
    }
}
