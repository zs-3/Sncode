package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcke implements com.google.android.gms.internal.ads.zzfcw {
    private final android.content.Context zza;
    private final com.google.android.gms.ads.internal.client.zzs zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.internal.ads.zzcjk zzd;
    private final com.google.android.gms.internal.ads.zzhir zze;
    private final com.google.android.gms.internal.ads.zzhir zzf;
    private final com.google.android.gms.internal.ads.zzhir zzg;
    private final com.google.android.gms.internal.ads.zzhir zzh;
    private final com.google.android.gms.internal.ads.zzhir zzi;
    private final com.google.android.gms.internal.ads.zzhir zzj;

    /* synthetic */ zzcke(com.google.android.gms.internal.ads.zzcjk r10, android.content.Context r11, java.lang.String r12, com.google.android.gms.ads.internal.client.zzs r13, com.google.android.gms.internal.ads.zzckd r14) {
            r9 = this;
            r9.<init>()
            r9.zzd = r10
            r9.zza = r11
            r9.zzb = r13
            r9.zzc = r12
            com.google.android.gms.internal.ads.zzhii r1 = com.google.android.gms.internal.ads.zzhij.zza(r11)
            r9.zze = r1
            com.google.android.gms.internal.ads.zzhii r3 = com.google.android.gms.internal.ads.zzhij.zza(r13)
            r9.zzf = r3
            com.google.android.gms.internal.ads.zzhir r11 = com.google.android.gms.internal.ads.zzcjk.zzX(r10)
            com.google.android.gms.internal.ads.zzeoc r12 = new com.google.android.gms.internal.ads.zzeoc
            r12.<init>(r11)
            com.google.android.gms.internal.ads.zzhir r5 = com.google.android.gms.internal.ads.zzhih.zzc(r12)
            r9.zzg = r5
            com.google.android.gms.internal.ads.zzeoh r11 = com.google.android.gms.internal.ads.zzeoh.zza()
            com.google.android.gms.internal.ads.zzhir r6 = com.google.android.gms.internal.ads.zzhih.zzc(r11)
            r9.zzh = r6
            com.google.android.gms.internal.ads.zzddb r11 = com.google.android.gms.internal.ads.zzddb.zza()
            com.google.android.gms.internal.ads.zzhir r8 = com.google.android.gms.internal.ads.zzhih.zzc(r11)
            r9.zzi = r8
            com.google.android.gms.internal.ads.zzhir r2 = com.google.android.gms.internal.ads.zzcjk.zzR(r10)
            com.google.android.gms.internal.ads.zzhir r4 = com.google.android.gms.internal.ads.zzcjk.zzM(r10)
            com.google.android.gms.internal.ads.zzfhe r7 = com.google.android.gms.internal.ads.zzfhe.zza()
            com.google.android.gms.internal.ads.zzfcu r10 = new com.google.android.gms.internal.ads.zzfcu
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            com.google.android.gms.internal.ads.zzhir r10 = com.google.android.gms.internal.ads.zzhih.zzc(r10)
            r9.zzj = r10
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfcw
    public final com.google.android.gms.internal.ads.zzenh zza() {
            r10 = this;
            com.google.android.gms.internal.ads.zzhir r0 = r10.zzj
            com.google.android.gms.internal.ads.zzenh r9 = new com.google.android.gms.internal.ads.zzenh
            java.lang.Object r0 = r0.zzb()
            r5 = r0
            com.google.android.gms.internal.ads.zzfct r5 = (com.google.android.gms.internal.ads.zzfct) r5
            com.google.android.gms.internal.ads.zzhir r0 = r10.zzg
            java.lang.Object r0 = r0.zzb()
            r6 = r0
            com.google.android.gms.internal.ads.zzeob r6 = (com.google.android.gms.internal.ads.zzeob) r6
            com.google.android.gms.internal.ads.zzcjk r0 = r10.zzd
            com.google.android.gms.internal.ads.zzchr r0 = com.google.android.gms.internal.ads.zzcjk.zzF(r0)
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r7 = com.google.android.gms.internal.ads.zzcih.zzc(r0)
            com.google.android.gms.internal.ads.zzcjk r0 = r10.zzd
            com.google.android.gms.internal.ads.zzhir r0 = com.google.android.gms.internal.ads.zzcjk.zzX(r0)
            java.lang.Object r0 = r0.zzb()
            r8 = r0
            com.google.android.gms.internal.ads.zzdud r8 = (com.google.android.gms.internal.ads.zzdud) r8
            android.content.Context r2 = r10.zza
            com.google.android.gms.ads.internal.client.zzs r3 = r10.zzb
            java.lang.String r4 = r10.zzc
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r9
    }
}
