package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgat extends com.google.android.gms.internal.ads.zzfzr implements java.io.Serializable {
    final java.lang.Object zza;
    final java.lang.Object zzb;

    zzgat(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfzr, java.util.Map.Entry
    public final java.lang.Object getKey() {
            r1 = this;
            java.lang.Object r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfzr, java.util.Map.Entry
    public final java.lang.Object getValue() {
            r1 = this;
            java.lang.Object r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfzr, java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
