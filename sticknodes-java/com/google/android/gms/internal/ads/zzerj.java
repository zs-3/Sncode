package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzerj implements com.google.android.gms.internal.ads.zzexh {
    private final com.google.android.gms.internal.ads.zzgfz zza;
    private final android.content.Context zzb;

    public zzerj(com.google.android.gms.internal.ads.zzgfz r1, android.content.Context r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 13
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzeri r0 = new com.google.android.gms.internal.ads.zzeri
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzgfz r1 = r2.zza
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzb(r0)
            return r0
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzerk zzc() throws java.lang.Exception {
            r12 = this;
            android.content.Context r0 = r12.zzb
            java.lang.String r1 = "audio"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            int r2 = r0.getMode()
            boolean r3 = r0.isMusicActive()
            boolean r4 = r0.isSpeakerphoneOn()
            r1 = 3
            int r5 = r0.getStreamVolume(r1)
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzkD
            com.google.android.gms.internal.ads.zzbct r7 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r6 = r7.zza(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r7 = -1
            if (r6 == 0) goto L3c
            com.google.android.gms.ads.internal.util.zzab r6 = com.google.android.gms.ads.internal.zzu.zzq()
            int r6 = r6.zzj(r0)
            int r1 = r0.getStreamMaxVolume(r1)
            r7 = r1
            goto L3d
        L3c:
            r6 = -1
        L3d:
            int r8 = r0.getRingerMode()
            r1 = 2
            int r9 = r0.getStreamVolume(r1)
            com.google.android.gms.ads.internal.util.zzac r0 = com.google.android.gms.ads.internal.zzu.zzr()
            float r10 = r0.zza()
            com.google.android.gms.ads.internal.util.zzac r0 = com.google.android.gms.ads.internal.zzu.zzr()
            boolean r11 = r0.zze()
            com.google.android.gms.internal.ads.zzerk r0 = new com.google.android.gms.internal.ads.zzerk
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
    }
}
