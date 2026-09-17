package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhbo extends java.util.AbstractList {
    private final com.google.android.gms.internal.ads.zzhbm zza;
    private final com.google.android.gms.internal.ads.zzhbn zzb;

    public zzhbo(com.google.android.gms.internal.ads.zzhbm r1, com.google.android.gms.internal.ads.zzhbn r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzhbm r0 = r2.zza
            com.google.android.gms.internal.ads.zzhbn r1 = r2.zzb
            int r3 = r0.zzd(r3)
            java.lang.Object r3 = r1.zzb(r3)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            com.google.android.gms.internal.ads.zzhbm r0 = r1.zza
            int r0 = r0.size()
            return r0
    }
}
