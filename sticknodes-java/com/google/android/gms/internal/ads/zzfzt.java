package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
abstract class zzfzt implements com.google.android.gms.internal.ads.zzgbv {
    private transient java.util.Set zza;
    private transient java.util.Collection zzb;
    private transient java.util.Map zzc;

    zzfzt() {
            r0 = this;
            r0.<init>()
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            goto L9
        L4:
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.zzgbv
            if (r0 != 0) goto La
            r2 = 0
        L9:
            return r2
        La:
            com.google.android.gms.internal.ads.zzgbv r2 = (com.google.android.gms.internal.ads.zzgbv) r2
            java.util.Map r0 = r1.zzs()
            java.util.Map r2 = r2.zzs()
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.util.Map r0 = r1.zzs()
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.util.Map r0 = r1.zzs()
            java.lang.String r0 = r0.toString()
            return r0
    }

    abstract java.util.Collection zzf();

    java.util.Iterator zzg() {
            r1 = this;
            r0 = 0
            throw r0
    }

    abstract java.util.Map zzj();

    abstract java.util.Set zzl();

    @Override // com.google.android.gms.internal.ads.zzgbv
    public boolean zzq(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzgbv
    public final java.util.Collection zzr() {
            r1 = this;
            java.util.Collection r0 = r1.zzb
            if (r0 != 0) goto La
            java.util.Collection r0 = r1.zzf()
            r1.zzb = r0
        La:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgbv
    public final java.util.Map zzs() {
            r1 = this;
            java.util.Map r0 = r1.zzc
            if (r0 != 0) goto La
            java.util.Map r0 = r1.zzj()
            r1.zzc = r0
        La:
            return r0
    }

    public final java.util.Set zzt() {
            r1 = this;
            java.util.Set r0 = r1.zza
            if (r0 != 0) goto La
            java.util.Set r0 = r1.zzl()
            r1.zza = r0
        La:
            return r0
    }
}
