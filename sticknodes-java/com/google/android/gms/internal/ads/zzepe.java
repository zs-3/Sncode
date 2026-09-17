package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzepe implements com.google.android.gms.internal.ads.zzexh {
    private final com.google.android.gms.internal.ads.zzgfz zza;
    private final com.google.android.gms.internal.ads.zzgfz zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzfhc zzd;
    private final android.view.View zze;

    public zzepe(com.google.android.gms.internal.ads.zzgfz r1, com.google.android.gms.internal.ads.zzgfz r2, android.content.Context r3, com.google.android.gms.internal.ads.zzfhc r4, android.view.ViewGroup r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            return
    }

    private final java.util.List zze() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.view.View r1 = r6.zze
        L7:
            if (r1 == 0) goto L3f
            android.view.ViewParent r2 = r1.getParent()
            if (r2 != 0) goto L10
            goto L3f
        L10:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1c
            r3 = r2
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r1 = r3.indexOfChild(r1)
            goto L1d
        L1c:
            r1 = -1
        L1d:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.Class r4 = r2.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = "type"
            r3.putString(r5, r4)
            java.lang.String r4 = "index_of_child"
            r3.putInt(r4, r1)
            r0.add(r3)
            boolean r1 = r2 instanceof android.view.View
            if (r1 == 0) goto L3f
            r1 = r2
            android.view.View r1 = (android.view.View) r1
            goto L7
        L3f:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 3
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r2 = this;
            android.content.Context r0 = r2.zzc
            com.google.android.gms.internal.ads.zzbcv.zza(r0)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkI
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L23
            com.google.android.gms.internal.ads.zzgfz r0 = r2.zzb
            com.google.android.gms.internal.ads.zzepc r1 = new com.google.android.gms.internal.ads.zzepc
            r1.<init>(r2)
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zzb(r1)
            return r0
        L23:
            com.google.android.gms.internal.ads.zzgfz r0 = r2.zza
            com.google.android.gms.internal.ads.zzepd r1 = new com.google.android.gms.internal.ads.zzepd
            r1.<init>(r2)
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zzb(r1)
            return r0
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzepf zzc() throws java.lang.Exception {
            r4 = this;
            com.google.android.gms.internal.ads.zzepf r0 = new com.google.android.gms.internal.ads.zzepf
            com.google.android.gms.internal.ads.zzfhc r1 = r4.zzd
            android.content.Context r2 = r4.zzc
            com.google.android.gms.ads.internal.client.zzs r1 = r1.zze
            java.util.List r3 = r4.zze()
            r0.<init>(r2, r1, r3)
            return r0
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzepf zzd() throws java.lang.Exception {
            r4 = this;
            com.google.android.gms.internal.ads.zzepf r0 = new com.google.android.gms.internal.ads.zzepf
            com.google.android.gms.internal.ads.zzfhc r1 = r4.zzd
            android.content.Context r2 = r4.zzc
            com.google.android.gms.ads.internal.client.zzs r1 = r1.zze
            java.util.List r3 = r4.zze()
            r0.<init>(r2, r1, r3)
            return r0
    }
}
