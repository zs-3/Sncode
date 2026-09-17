package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzemi implements com.google.android.gms.internal.ads.zzegk {
    private final com.google.android.gms.internal.ads.zzbdq zza;
    private final com.google.android.gms.internal.ads.zzgfz zzb;
    private final com.google.android.gms.internal.ads.zzflg zzc;
    private final com.google.android.gms.internal.ads.zzemr zzd;

    public zzemi(com.google.android.gms.internal.ads.zzflg r1, com.google.android.gms.internal.ads.zzgfz r2, com.google.android.gms.internal.ads.zzbdq r3, com.google.android.gms.internal.ads.zzemr r4) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            r0.zzb = r2
            r0.zza = r3
            r0.zzd = r4
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzemr zzd(com.google.android.gms.internal.ads.zzemi r0) {
            com.google.android.gms.internal.ads.zzemr r0 = r0.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzfgt r10, com.google.android.gms.internal.ads.zzfgh r11) {
            r9 = this;
            com.google.android.gms.internal.ads.zzcas r6 = new com.google.android.gms.internal.ads.zzcas
            r6.<init>()
            com.google.android.gms.internal.ads.zzemn r7 = new com.google.android.gms.internal.ads.zzemn
            r7.<init>()
            com.google.android.gms.internal.ads.zzemh r8 = new com.google.android.gms.internal.ads.zzemh
            r0 = r8
            r1 = r9
            r2 = r6
            r3 = r10
            r4 = r11
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r7.zzd(r8)
            com.google.android.gms.internal.ads.zzbdl r10 = new com.google.android.gms.internal.ads.zzbdl
            com.google.android.gms.internal.ads.zzfgm r11 = r11.zzs
            java.lang.String r0 = r11.zzb
            java.lang.String r11 = r11.zza
            r10.<init>(r7, r0, r11)
            com.google.android.gms.internal.ads.zzfla r11 = com.google.android.gms.internal.ads.zzfla.zzt
            com.google.android.gms.internal.ads.zzemg r0 = new com.google.android.gms.internal.ads.zzemg
            r0.<init>(r9, r10)
            com.google.android.gms.internal.ads.zzflg r10 = r9.zzc
            com.google.android.gms.internal.ads.zzgfz r1 = r9.zzb
            com.google.android.gms.internal.ads.zzfkx r10 = com.google.android.gms.internal.ads.zzfkq.zzd(r0, r1, r11, r10)
            com.google.android.gms.internal.ads.zzfla r11 = com.google.android.gms.internal.ads.zzfla.zzu
            com.google.android.gms.internal.ads.zzfkx r10 = r10.zzb(r11)
            com.google.android.gms.internal.ads.zzfkx r10 = r10.zzd(r6)
            com.google.android.gms.internal.ads.zzfkl r10 = r10.zza()
            return r10
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final boolean zzb(com.google.android.gms.internal.ads.zzfgt r1, com.google.android.gms.internal.ads.zzfgh r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzbdq r1 = r0.zza
            if (r1 == 0) goto Le
            com.google.android.gms.internal.ads.zzfgm r1 = r2.zzs
            if (r1 == 0) goto Le
            java.lang.String r1 = r1.zza
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzbdl r2) throws java.lang.Exception {
            r1 = this;
            com.google.android.gms.internal.ads.zzbdq r0 = r1.zza
            r0.zze(r2)
            return
    }
}
