package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
abstract class zzgbt extends java.util.AbstractMap {
    private transient java.util.Set zza;
    private transient java.util.Set zzb;
    private transient java.util.Collection zzc;

    zzgbt() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
            r1 = this;
            java.util.Set r0 = r1.zza
            if (r0 != 0) goto La
            java.util.Set r0 = r1.zzb()
            r1.zza = r0
        La:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set keySet() {
            r1 = this;
            java.util.Set r0 = r1.zzb
            if (r0 != 0) goto La
            java.util.Set r0 = r1.zze()
            r1.zzb = r0
        La:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection values() {
            r1 = this;
            java.util.Collection r0 = r1.zzc
            if (r0 != 0) goto Lb
            com.google.android.gms.internal.ads.zzgbs r0 = new com.google.android.gms.internal.ads.zzgbs
            r0.<init>(r1)
            r1.zzc = r0
        Lb:
            return r0
    }

    abstract java.util.Set zzb();

    java.util.Set zze() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgbr r0 = new com.google.android.gms.internal.ads.zzgbr
            r0.<init>(r1)
            return r0
    }
}
