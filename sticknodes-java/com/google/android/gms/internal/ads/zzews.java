package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzews implements com.google.android.gms.internal.ads.zzexh {
    private final com.google.android.gms.internal.ads.zzbyz zza;
    private final com.google.android.gms.internal.ads.zzgfz zzb;
    private final android.content.Context zzc;

    public zzews(com.google.android.gms.internal.ads.zzbyz r1, com.google.android.gms.internal.ads.zzgfz r2, android.content.Context r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 34
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzewr r0 = new com.google.android.gms.internal.ads.zzewr
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzgfz r1 = r2.zzb
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzb(r0)
            return r0
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzewt zzc() throws java.lang.Exception {
            r8 = this;
            com.google.android.gms.internal.ads.zzbyz r0 = r8.zza
            android.content.Context r1 = r8.zzc
            boolean r0 = r0.zzp(r1)
            if (r0 != 0) goto L16
            com.google.android.gms.internal.ads.zzewt r0 = new com.google.android.gms.internal.ads.zzewt
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        L16:
            com.google.android.gms.internal.ads.zzbyz r0 = r8.zza
            android.content.Context r1 = r8.zzc
            java.lang.String r0 = r0.zzd(r1)
            java.lang.String r1 = ""
            if (r0 != 0) goto L24
            r3 = r1
            goto L25
        L24:
            r3 = r0
        L25:
            com.google.android.gms.internal.ads.zzbyz r0 = r8.zza
            android.content.Context r2 = r8.zzc
            java.lang.String r0 = r0.zzb(r2)
            if (r0 != 0) goto L31
            r4 = r1
            goto L32
        L31:
            r4 = r0
        L32:
            com.google.android.gms.internal.ads.zzbyz r0 = r8.zza
            android.content.Context r2 = r8.zzc
            java.lang.String r0 = r0.zza(r2)
            if (r0 != 0) goto L3e
            r5 = r1
            goto L3f
        L3e:
            r5 = r0
        L3f:
            r0 = 1
            com.google.android.gms.internal.ads.zzbyz r2 = r8.zza
            android.content.Context r6 = r8.zzc
            boolean r2 = r2.zzp(r6)
            r6 = 0
            if (r0 == r2) goto L4d
            r0 = r6
            goto L4f
        L4d:
            java.lang.String r0 = "fa"
        L4f:
            java.lang.String r2 = "TIME_OUT"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L65
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzan
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r6.zza(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            r7 = r2
            goto L66
        L65:
            r7 = r6
        L66:
            if (r0 != 0) goto L6a
            r6 = r1
            goto L6b
        L6a:
            r6 = r0
        L6b:
            com.google.android.gms.internal.ads.zzewt r0 = new com.google.android.gms.internal.ads.zzewt
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
    }
}
