package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzboz implements com.google.android.gms.internal.ads.zzgev {
    private final java.lang.String zza;
    private final com.google.common.util.concurrent.ListenableFuture zzb;

    zzboz(com.google.common.util.concurrent.ListenableFuture r1, java.lang.String r2, com.google.android.gms.internal.ads.zzbog r3, com.google.android.gms.internal.ads.zzbof r4) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            java.lang.String r1 = "google.afma.activeView.handleUpdate"
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgev
    public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object r1) throws java.lang.Exception {
            r0 = this;
            com.google.common.util.concurrent.ListenableFuture r1 = r0.zzb(r1)
            return r1
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(java.lang.Object r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbox r0 = new com.google.android.gms.internal.ads.zzbox
            r0.<init>(r2, r3)
            com.google.common.util.concurrent.ListenableFuture r3 = r2.zzb
            com.google.android.gms.internal.ads.zzgfz r1 = com.google.android.gms.internal.ads.zzcan.zzf
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.android.gms.internal.ads.zzgfo.zzn(r3, r0, r1)
            return r3
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(java.lang.Object r5, com.google.android.gms.internal.ads.zzboa r6) throws java.lang.Exception {
            r4 = this;
            com.google.android.gms.internal.ads.zzcas r0 = new com.google.android.gms.internal.ads.zzcas
            r0.<init>()
            com.google.android.gms.ads.internal.zzu.zzp()
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            com.google.android.gms.internal.ads.zzbkm r2 = com.google.android.gms.internal.ads.zzbjv.zzo
            com.google.android.gms.internal.ads.zzboy r3 = new com.google.android.gms.internal.ads.zzboy
            r3.<init>(r4, r0)
            r2.zzc(r1, r3)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "id"
            r2.put(r3, r1)
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            java.lang.String r1 = "args"
            r2.put(r1, r5)
            java.lang.String r5 = r4.zza
            r6.zzl(r5, r2)
            return r0
    }
}
