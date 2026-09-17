package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfnc {
    private final com.google.android.gms.internal.ads.zzeke zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final android.content.Context zze;
    private final com.google.android.gms.internal.ads.zzfgu zzf;
    private final com.google.android.gms.internal.ads.zzfgv zzg;
    private final com.google.android.gms.common.util.Clock zzh;
    private final com.google.android.gms.internal.ads.zzavn zzi;

    public zzfnc(com.google.android.gms.internal.ads.zzeke r1, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2, java.lang.String r3, java.lang.String r4, android.content.Context r5, com.google.android.gms.internal.ads.zzfgu r6, com.google.android.gms.internal.ads.zzfgv r7, com.google.android.gms.common.util.Clock r8, com.google.android.gms.internal.ads.zzavn r9) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            java.lang.String r1 = r2.afmaVersion
            r0.zzb = r1
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            r0.zzh = r8
            r0.zzi = r9
            return
    }

    static /* synthetic */ java.lang.String zza(com.google.android.gms.internal.ads.zzfgu r0) {
            java.lang.String r0 = r0.zza
            java.lang.String r0 = zzi(r0)
            return r0
    }

    static /* synthetic */ java.lang.String zzb(com.google.android.gms.internal.ads.zzfgu r0) {
            java.lang.String r0 = r0.zzb
            java.lang.String r0 = zzi(r0)
            return r0
    }

    public static final java.util.List zzf(int r3, int r4, java.util.List r5) {
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r5 = r5.iterator()
        L9:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "2."
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "@gw_mpe@"
            java.lang.String r0 = zzj(r0, r2, r1)
            r3.add(r0)
            goto L9
        L30:
            return r3
    }

    public static final java.util.List zzg(java.util.List r3, java.lang.String r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "@gw_adnetstatus@"
            java.lang.String r1 = zzj(r1, r2, r4)
            r0.add(r1)
            goto L9
        L1f:
            return r0
    }

    public static final java.util.List zzh(java.util.List r4, long r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L9:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = 10
            java.lang.String r2 = java.lang.Long.toString(r5, r2)
            java.lang.String r3 = "@gw_ttr@"
            java.lang.String r1 = zzj(r1, r3, r2)
            r0.add(r1)
            goto L9
        L25:
            return r0
    }

    private static java.lang.String zzi(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L9
            java.lang.String r1 = ""
            return r1
        L9:
            boolean r0 = com.google.android.gms.ads.internal.util.client.zzl.zzk()
            if (r0 == 0) goto L11
            java.lang.String r1 = "fakeForAdDebugLog"
        L11:
            return r1
    }

    private static java.lang.String zzj(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 1
            if (r1 != r0) goto L9
            java.lang.String r4 = ""
        L9:
            java.lang.String r2 = r2.replaceAll(r3, r4)
            return r2
    }

    public final java.util.List zzc(com.google.android.gms.internal.ads.zzfgt r8, com.google.android.gms.internal.ads.zzfgh r9, java.util.List r10) {
            r7 = this;
            r3 = 0
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            r0 = r7
            r1 = r8
            r2 = r9
            r6 = r10
            java.util.List r8 = r0.zzd(r1, r2, r3, r4, r5, r6)
            return r8
    }

    public final java.util.List zzd(com.google.android.gms.internal.ads.zzfgt r7, com.google.android.gms.internal.ads.zzfgh r8, boolean r9, java.lang.String r10, java.lang.String r11, java.util.List r12) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r12 = r12.iterator()
        L9:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto Ldf
            r1 = 1
            if (r1 == r9) goto L15
            java.lang.String r2 = "0"
            goto L17
        L15:
            java.lang.String r2 = "1"
        L17:
            java.lang.Object r3 = r12.next()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.internal.ads.zzfgq r4 = r7.zza
            com.google.android.gms.internal.ads.zzfhc r4 = r4.zza
            java.lang.String r4 = r4.zzf
            java.lang.String r5 = "@gw_adlocid@"
            java.lang.String r3 = zzj(r3, r5, r4)
            java.lang.String r4 = "@gw_adnetrefresh@"
            java.lang.String r2 = zzj(r3, r4, r2)
            java.lang.String r3 = r6.zzb
            java.lang.String r4 = "@gw_sdkver@"
            java.lang.String r2 = zzj(r2, r4, r3)
            if (r8 == 0) goto L5b
            java.lang.String r3 = r8.zzy
            java.lang.String r4 = "@gw_qdata@"
            java.lang.String r2 = zzj(r2, r4, r3)
            java.lang.String r3 = r8.zzx
            java.lang.String r4 = "@gw_adnetid@"
            java.lang.String r2 = zzj(r2, r4, r3)
            java.lang.String r3 = r8.zzw
            java.lang.String r4 = "@gw_allocid@"
            java.lang.String r2 = zzj(r2, r4, r3)
            android.content.Context r3 = r6.zze
            java.util.Map r4 = r8.zzaw
            boolean r5 = r8.zzW
            java.lang.String r2 = com.google.android.gms.internal.ads.zzbzb.zzc(r2, r3, r5, r4)
        L5b:
            com.google.android.gms.internal.ads.zzeke r3 = r6.zza
            java.lang.String r3 = r3.zzg()
            java.lang.String r4 = "@gw_adnetstatus@"
            java.lang.String r2 = zzj(r2, r4, r3)
            com.google.android.gms.internal.ads.zzeke r3 = r6.zza
            long r3 = r3.zza()
            r5 = 10
            java.lang.String r3 = java.lang.Long.toString(r3, r5)
            java.lang.String r4 = "@gw_ttr@"
            java.lang.String r2 = zzj(r2, r4, r3)
            java.lang.String r3 = r6.zzc
            java.lang.String r4 = "@gw_seqnum@"
            java.lang.String r2 = zzj(r2, r4, r3)
            java.lang.String r3 = r6.zzd
            java.lang.String r4 = "@gw_sessid@"
            java.lang.String r2 = zzj(r2, r4, r3)
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzdw
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 0
            if (r3 == 0) goto La3
            boolean r3 = android.text.TextUtils.isEmpty(r10)
            if (r3 != 0) goto La3
            r4 = 1
        La3:
            boolean r3 = android.text.TextUtils.isEmpty(r11)
            r3 = r3 ^ r1
            if (r4 != 0) goto Lad
            if (r3 == 0) goto Lda
            goto Lae
        Lad:
            r1 = r3
        Lae:
            android.net.Uri r3 = android.net.Uri.parse(r2)
            com.google.android.gms.internal.ads.zzavn r5 = r6.zzi
            boolean r3 = r5.zzf(r3)
            if (r3 == 0) goto Lda
            android.net.Uri r2 = android.net.Uri.parse(r2)
            android.net.Uri$Builder r2 = r2.buildUpon()
            if (r4 == 0) goto Lca
            java.lang.String r3 = "ms"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r3, r10)
        Lca:
            if (r1 == 0) goto Ld2
            java.lang.String r1 = "attok"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r1, r11)
        Ld2:
            android.net.Uri r1 = r2.build()
            java.lang.String r2 = r1.toString()
        Lda:
            r0.add(r2)
            goto L9
        Ldf:
            return r0
    }

    public final java.util.List zze(com.google.android.gms.internal.ads.zzfgh r11, java.util.List r12, com.google.android.gms.internal.ads.zzbwm r13) {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.common.util.Clock r1 = r10.zzh
            long r1 = r1.currentTimeMillis()
            java.lang.String r3 = r13.zzc()     // Catch: android.os.RemoteException -> Lb0
            int r13 = r13.zzb()     // Catch: android.os.RemoteException -> Lb0
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch: android.os.RemoteException -> Lb0
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzdx
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L35
            com.google.android.gms.internal.ads.zzfgv r4 = r10.zzg
            if (r4 != 0) goto L32
            com.google.android.gms.internal.ads.zzfxx r4 = com.google.android.gms.internal.ads.zzfxx.zzc()
            goto L3b
        L32:
            com.google.android.gms.internal.ads.zzfgu r4 = r4.zza
            goto L37
        L35:
            com.google.android.gms.internal.ads.zzfgu r4 = r10.zzf
        L37:
            com.google.android.gms.internal.ads.zzfxx r4 = com.google.android.gms.internal.ads.zzfxx.zzd(r4)
        L3b:
            com.google.android.gms.internal.ads.zzfna r5 = new com.google.android.gms.internal.ads.zzfna
            r5.<init>()
            com.google.android.gms.internal.ads.zzfxx r5 = r4.zza(r5)
            java.lang.String r6 = ""
            java.lang.Object r5 = r5.zzb(r6)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzfnb r7 = new com.google.android.gms.internal.ads.zzfnb
            r7.<init>()
            com.google.android.gms.internal.ads.zzfxx r4 = r4.zza(r7)
            java.lang.Object r4 = r4.zzb(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Iterator r12 = r12.iterator()
        L5f:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto Laf
            java.lang.Object r6 = r12.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = android.net.Uri.encode(r5)
            java.lang.String r8 = "@gw_rwd_userid@"
            java.lang.String r6 = zzj(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r4)
            java.lang.String r8 = "@gw_rwd_custom_data@"
            java.lang.String r6 = zzj(r6, r8, r7)
            java.lang.String r7 = java.lang.Long.toString(r1)
            java.lang.String r8 = "@gw_tmstmp@"
            java.lang.String r6 = zzj(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r3)
            java.lang.String r8 = "@gw_rwd_itm@"
            java.lang.String r6 = zzj(r6, r8, r7)
            java.lang.String r7 = "@gw_rwd_amt@"
            java.lang.String r6 = zzj(r6, r7, r13)
            java.lang.String r7 = r10.zzb
            java.lang.String r8 = "@gw_sdkver@"
            java.lang.String r6 = zzj(r6, r8, r7)
            android.content.Context r7 = r10.zze
            boolean r8 = r11.zzW
            java.util.Map r9 = r11.zzaw
            java.lang.String r6 = com.google.android.gms.internal.ads.zzbzb.zzc(r6, r7, r8, r9)
            r0.add(r6)
            goto L5f
        Laf:
            return r0
        Lb0:
            r11 = move-exception
            java.lang.String r12 = "Unable to determine award type and amount."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r12, r11)
            return r0
    }
}
