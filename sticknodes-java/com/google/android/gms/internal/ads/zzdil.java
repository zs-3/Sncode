package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdil implements com.google.android.gms.internal.ads.zzczo, com.google.android.gms.ads.internal.overlay.zzr, com.google.android.gms.internal.ads.zzcyu {
    com.google.android.gms.internal.ads.zzegf zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzcfo zzc;
    private final com.google.android.gms.internal.ads.zzfgh zzd;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zze;
    private final com.google.android.gms.internal.ads.zzbcb.zza.EnumC0006zza zzf;
    private final com.google.android.gms.internal.ads.zzegd zzg;

    public zzdil(android.content.Context r1, com.google.android.gms.internal.ads.zzcfo r2, com.google.android.gms.internal.ads.zzfgh r3, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4, com.google.android.gms.internal.ads.zzbcb.zza.EnumC0006zza r5, com.google.android.gms.internal.ads.zzegd r6) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            r0.zzd = r3
            r0.zze = r4
            r0.zzf = r5
            r0.zzg = r6
            return
    }

    private final boolean zzg() {
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

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdH() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdk() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
            r3 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzfc
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L36
            com.google.android.gms.internal.ads.zzcfo r0 = r3.zzc
            if (r0 == 0) goto L36
            com.google.android.gms.internal.ads.zzegf r0 = r3.zza
            if (r0 != 0) goto L20
            boolean r0 = r3.zzg()
            if (r0 == 0) goto L36
        L20:
            com.google.android.gms.internal.ads.zzegf r0 = r3.zza
            if (r0 == 0) goto L31
            com.google.android.gms.internal.ads.zzcfo r0 = r3.zzc
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r2 = "onSdkImpression"
            r0.zzd(r2, r1)
            return
        L31:
            com.google.android.gms.internal.ads.zzegd r0 = r3.zzg
            r0.zzb()
        L36:
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdt() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdu(int r1) {
            r0 = this;
            r1 = 0
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final void zzr() {
            r3 = this;
            boolean r0 = r3.zzg()
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.ads.zzegd r0 = r3.zzg
            r0.zzb()
            return
        Lc:
            com.google.android.gms.internal.ads.zzegf r0 = r3.zza
            if (r0 == 0) goto L32
            com.google.android.gms.internal.ads.zzcfo r0 = r3.zzc
            if (r0 == 0) goto L32
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzfc
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L32
            com.google.android.gms.internal.ads.zzcfo r0 = r3.zzc
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r2 = "onSdkImpression"
            r0.zzd(r2, r1)
        L32:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzs() {
            r12 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzff
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L20
            com.google.android.gms.internal.ads.zzbcb$zza$zza r0 = r12.zzf
            com.google.android.gms.internal.ads.zzbcb$zza$zza r1 = com.google.android.gms.internal.ads.zzbcb.zza.EnumC0006zza.zzh
            if (r0 == r1) goto L20
            com.google.android.gms.internal.ads.zzbcb$zza$zza r1 = com.google.android.gms.internal.ads.zzbcb.zza.EnumC0006zza.zzd
            if (r0 == r1) goto L20
            com.google.android.gms.internal.ads.zzbcb$zza$zza r1 = com.google.android.gms.internal.ads.zzbcb.zza.EnumC0006zza.zzk
            if (r0 != r1) goto L106
        L20:
            com.google.android.gms.internal.ads.zzfgh r0 = r12.zzd
            boolean r0 = r0.zzT
            if (r0 == 0) goto L106
            com.google.android.gms.internal.ads.zzcfo r0 = r12.zzc
            if (r0 == 0) goto L106
            android.content.Context r0 = r12.zzb
            com.google.android.gms.internal.ads.zzega r1 = com.google.android.gms.ads.internal.zzu.zzA()
            boolean r0 = r1.zzl(r0)
            if (r0 == 0) goto L106
            boolean r0 = r12.zzg()
            if (r0 == 0) goto L42
            com.google.android.gms.internal.ads.zzegd r0 = r12.zzg
            r0.zzc()
            return
        L42:
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r12.zze
            int r1 = r0.buddyApkVersion
            int r0 = r0.clientJarVersion
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "."
            r2.append(r1)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            com.google.android.gms.internal.ads.zzfgh r0 = r12.zzd
            com.google.android.gms.internal.ads.zzfhf r0 = r0.zzV
            java.lang.String r8 = r0.zza()
            int r0 = r0.zzc()
            r1 = 1
            if (r0 != r1) goto L72
            com.google.android.gms.internal.ads.zzegb r0 = com.google.android.gms.internal.ads.zzegb.zzc
            com.google.android.gms.internal.ads.zzegc r1 = com.google.android.gms.internal.ads.zzegc.zzb
            r10 = r0
            r9 = r1
            goto L82
        L72:
            com.google.android.gms.internal.ads.zzfgh r0 = r12.zzd
            int r0 = r0.zzY
            r1 = 2
            if (r0 != r1) goto L7c
            com.google.android.gms.internal.ads.zzegc r0 = com.google.android.gms.internal.ads.zzegc.zzd
            goto L7e
        L7c:
            com.google.android.gms.internal.ads.zzegc r0 = com.google.android.gms.internal.ads.zzegc.zza
        L7e:
            com.google.android.gms.internal.ads.zzegb r1 = com.google.android.gms.internal.ads.zzegb.zza
            r9 = r0
            r10 = r1
        L82:
            com.google.android.gms.internal.ads.zzcfo r0 = r12.zzc
            com.google.android.gms.internal.ads.zzfgh r1 = r12.zzd
            com.google.android.gms.internal.ads.zzega r3 = com.google.android.gms.ads.internal.zzu.zzA()
            android.webkit.WebView r5 = r0.zzG()
            java.lang.String r11 = r1.zzal
            java.lang.String r6 = ""
            java.lang.String r7 = "javascript"
            com.google.android.gms.internal.ads.zzegf r0 = r3.zza(r4, r5, r6, r7, r8, r9, r10, r11)
            r12.zza = r0
            com.google.android.gms.internal.ads.zzcfo r0 = r12.zzc
            android.view.View r0 = r0.zzF()
            com.google.android.gms.internal.ads.zzegf r1 = r12.zza
            if (r1 == 0) goto L106
            com.google.android.gms.internal.ads.zzfoi r1 = r1.zza()
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzeW
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Le5
            com.google.android.gms.internal.ads.zzcfo r0 = r12.zzc
            com.google.android.gms.internal.ads.zzega r2 = com.google.android.gms.ads.internal.zzu.zzA()
            android.webkit.WebView r0 = r0.zzG()
            r2.zzj(r1, r0)
            com.google.android.gms.internal.ads.zzcfo r0 = r12.zzc
            java.util.List r0 = r0.zzV()
            java.util.Iterator r0 = r0.iterator()
        Ld1:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lec
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            com.google.android.gms.internal.ads.zzega r3 = com.google.android.gms.ads.internal.zzu.zzA()
            r3.zzg(r1, r2)
            goto Ld1
        Le5:
            com.google.android.gms.internal.ads.zzega r2 = com.google.android.gms.ads.internal.zzu.zzA()
            r2.zzj(r1, r0)
        Lec:
            com.google.android.gms.internal.ads.zzcfo r0 = r12.zzc
            com.google.android.gms.internal.ads.zzegf r2 = r12.zza
            r0.zzat(r2)
            com.google.android.gms.internal.ads.zzega r0 = com.google.android.gms.ads.internal.zzu.zzA()
            r0.zzk(r1)
            com.google.android.gms.internal.ads.zzcfo r0 = r12.zzc
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r2 = "onSdkLoaded"
            r0.zzd(r2, r1)
        L106:
            return
    }
}
