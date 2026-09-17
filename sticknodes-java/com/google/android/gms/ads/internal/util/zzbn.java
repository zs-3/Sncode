package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbn extends com.google.android.gms.internal.ads.zzaqc {
    private final com.google.android.gms.internal.ads.zzcas zza;
    private final com.google.android.gms.ads.internal.util.client.zzl zzb;

    public zzbn(java.lang.String r2, java.util.Map r3, com.google.android.gms.internal.ads.zzcas r4) {
            r1 = this;
            com.google.android.gms.ads.internal.util.zzbm r3 = new com.google.android.gms.ads.internal.util.zzbm
            r3.<init>(r4)
            r0 = 0
            r1.<init>(r0, r2, r3)
            r1.zza = r4
            com.google.android.gms.ads.internal.util.client.zzl r3 = new com.google.android.gms.ads.internal.util.client.zzl
            r4 = 0
            r3.<init>(r4)
            r1.zzb = r3
            java.lang.String r0 = "GET"
            r3.zzd(r2, r0, r4, r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    protected final com.google.android.gms.internal.ads.zzaqi zzh(com.google.android.gms.internal.ads.zzapy r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzapl r0 = com.google.android.gms.internal.ads.zzaqz.zzb(r2)
            com.google.android.gms.internal.ads.zzaqi r2 = com.google.android.gms.internal.ads.zzaqi.zzb(r2, r0)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    protected final /* bridge */ /* synthetic */ void zzo(java.lang.Object r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzapy r4 = (com.google.android.gms.internal.ads.zzapy) r4
            java.util.Map r0 = r4.zzc
            int r1 = r4.zza
            com.google.android.gms.ads.internal.util.client.zzl r2 = r3.zzb
            r2.zzf(r0, r1)
            byte[] r0 = r4.zzb
            boolean r1 = com.google.android.gms.ads.internal.util.client.zzl.zzk()
            if (r1 != 0) goto L14
            goto L1b
        L14:
            if (r0 == 0) goto L1b
            com.google.android.gms.ads.internal.util.client.zzl r1 = r3.zzb
            r1.zzh(r0)
        L1b:
            com.google.android.gms.internal.ads.zzcas r0 = r3.zza
            r0.zzc(r4)
            return
    }
}
